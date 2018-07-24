package regrex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringContainNumber {

    public static void main(String args[]){
        String str =  "erer1233ef 1233 341 ldsf948 1234567891 shriganes@gmail.com purush@hotmail.net xyz@yahoo.co.in";
        if(str.matches("\\w+\\d+\\w+")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        Pattern pattern = Pattern.compile("\\w+\\@(gmail|hotmail|yahoo)\\.(com|net|(co\\.in))");
        Matcher matches = pattern.matcher(str);
        while(matches.find()){
            System.out.println("Matching group: " + matches.group());
        }

    }
}
