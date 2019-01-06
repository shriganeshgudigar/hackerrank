package strings;

import java.util.*;

public class ShrlockAndTheValidString {

    public static void main(String args[]){

        System.out.println(validString(sortString("aabbccddeefghi")));
    }

    public static String sortString(String x){
        char[] tempStr = x.toCharArray();
        Arrays.sort(tempStr);
        return new String(tempStr);
    }

//aabbcccdef
    private static String validString(String a){
        int frequency = 0;
        char prev = a.toCharArray()[0];
        Set<Integer> frequencies = new LinkedHashSet<Integer>();
        for(int i=0; i<a.length(); i++){
            if(prev == a.toCharArray()[i] ){
                frequency = frequency + 1;
            }else if(!frequencies.contains(frequency)){
                frequencies.add(frequency);
                frequency = 1;
                prev = a.toCharArray()[i];
                if(frequencies.size()>2){
                   return "NO";
                }
            }else{
                prev = a.toCharArray()[i];
                frequency = 1;
            }
        }
        return "YES";
    }

}
