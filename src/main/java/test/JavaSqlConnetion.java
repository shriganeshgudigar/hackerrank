package test;

import java.sql.*;

public class JavaSqlConnetion {
    static Connection conn;
    public static void main(String args[]){
        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@172.31.42.186:1529/atg_novtstc_srv.emea.kuoni.int", "APP_FIT_ATG_LPM_A", "fitlpmac");
            method1();
        }catch(SQLException ex){
            System.out.println("Exception Message " + ex.getMessage());
        }
    }
    public static void method1(){
        try {
            Statement stmt = conn.createStatement();
            ResultSet rst = stmt.executeQuery("select count from fit_dcs_product");
            while(rst.next()){
               System.out.println(rst.getString(1));
            }
        }catch(SQLException ex){
            System.out.println("Exception Message " + ex.getMessage());
        }

    }
}
