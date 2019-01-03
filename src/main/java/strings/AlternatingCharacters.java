package strings;

import java.util.ArrayList;

public class AlternatingCharacters {

    public static void main(String args[]){
        String str = "AAABBBBBA";
        int initialLength = str.length();
        String str1 = alternatingCharacters(str);
        int minCharacterNeedstoBeDeleted = initialLength - str1.length();
        System.out.println(minCharacterNeedstoBeDeleted);
    }

    private static String alternatingCharacters(String a){
        char[] tempa = a.toCharArray();
        int initialLength = a.length();
        StringBuilder x = new StringBuilder();
        for(int i=0; i<tempa.length-1; i++){
            if(tempa[i]==tempa[i+1]){
                continue;
            }else{
                x.append(tempa[i]);
            }
        }
        x.append(tempa[tempa.length-1]);
        int minCharacterNeedstoBeDeleted = initialLength - x.length();
        return new String(x);
    }
}
