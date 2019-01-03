package regrex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDuplicateWordsValidator {

    public static void main(String args []){
        ipAddressValidator("Helllo Helllo abc");
    }
//
//    (\b\S+)(?:\s+\1\b)+
    private static void ipAddressValidator(String str){
        Pattern pattern = Pattern.compile("(\\b\\S+)(?:\\s+\\1\\b)+", Pattern.CASE_INSENSITIVE);

        Matcher match = pattern.matcher(str);
        StringBuilder builder =  new StringBuilder();
        String s = null;
        while(match.find()){
            s = match.group().toString().trim();
            System.out.println("s:"+s);
            str = str.replaceAll(s,s.split("\\s+")[0]);
        }
//        System.out.println(str);
//        System.out.println(str.replaceAll("", ""));
//        Boolean flag = false;
//        while(match.find()){
//            System.out.println("Match found: " + match.group());
//            flag = true;
//        }
//        return flag;
    }

    public static void replaceAll(String str){
        Pattern pattern = Pattern.compile("ada");
        Matcher matches =  pattern.matcher(str);
//        matches.find();
//        System.out.println(matches.group());
        System.out.println(matches.replaceAll(""));
//        return str.replaceAll(matches.group(), "");
    }


}
