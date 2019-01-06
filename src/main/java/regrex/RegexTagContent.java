package regrex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTagContent {

    public static void main(String args []){
        tagContent("<a href=\"http://www.hackerrank.com\">HackerRank is good for code improvization</a>");
        tagHref("<a href=\"http://www.hackerrank.com\">HackerRank is good for code improvization</a>");
    }

    private static boolean tagContent(String str){
        Pattern pattern = Pattern.compile("<[^<>]*>([0-9A-Za-z\\s]+)<[^<>]*>");

        Matcher match = pattern.matcher(str);
        Boolean flag = false;
        while(match.find()){
            System.out.println("Match found:" + match.group(1));
            flag = true;
        }
        return flag;
    }

    private static boolean tagHref(String str){
        Pattern pattern = Pattern.compile("<a href=\"([^\"]*)");

        Matcher match = pattern.matcher(str);
        Boolean flag = false;
        while(match.find()){
            System.out.println("Match found:" + match.group(1));
            flag = true;
        }
        return flag;
    }
}
