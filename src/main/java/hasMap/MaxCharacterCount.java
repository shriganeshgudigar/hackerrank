package hasMap;

import java.util.HashMap;

public class MaxCharacterCount {

   public static void main(String[] args){
       String str =  "Shriganeshsss";

       HashMap<Character, Integer>  charCount =  new HashMap<Character, Integer>();
       for(int i =0 ; i < str.length(); i++){
           int count = 1;
           if(charCount.containsKey(str.charAt(i))){
               count = charCount.get(str.charAt(i)) + 1;
               charCount.put(str.charAt(i), count);
           }else {
               charCount.put(str.charAt(i), count);
           }
       }
       for(Character chr:charCount.keySet()){
           System.out.println("Character: " + chr + " count: " + charCount.get(chr));
       }
   }
}
