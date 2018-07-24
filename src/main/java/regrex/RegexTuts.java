package regrex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTuts {

    public static void main(String args[]){
        String phoneNumber =  "1234567890";
        if(phoneNumber.matches("\\d{10}")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        String testStr =  "feihf erero434 l1234567890efrfr1234567890";
        Pattern phonePattern =  Pattern.compile("(\\d{10})");
        Matcher matches  =  phonePattern.matcher(testStr);
        while(matches.find()){
            System.out.println(matches.group());
        }

    }
}
