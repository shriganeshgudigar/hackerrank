package regrex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexIPAddress {

    /**
     *  125.16.91.5
     *  0-255.0-255.0-255.0-255
     *  each part may be of min 2 digit or max 3 digit
     * @param args
     */
    public static void main(String args []){
        ipAddressValidator("125.16.91.5"
                );
    }

    private static boolean ipAddressValidator(String str){
        Pattern pattern = Pattern.compile("(([012][0-5][0-5]|[012][0-4][0-9]|[0-9][0-9]|[0-9])(\\.|$)){4}");
        Matcher match = pattern.matcher(str);
        Boolean flag = false;
        while(match.find()){
            System.out.println("Match found: " + match.group());
            flag = true;
        }
        return flag;
    }
}
