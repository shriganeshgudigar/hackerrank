package test;

import java.util.ArrayList;

public class StaticClosure{
    public static ArrayList<String> arryList;

    public static void main(String args[]){
        System.out.println("in Main");
    }

    static{
        arryList = new ArrayList<String>();
        arryList.add("Shriganesh");
        arryList.add("sdfs");
        System.out.println("dsfdfddsdf");
    }
}


