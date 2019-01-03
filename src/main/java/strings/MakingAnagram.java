package strings;

import java.util.Arrays;

public class MakingAnagram {
    public static void main(String args[]){
        String a = "SILENT";
        String b = "LISTEN";
        int count = makeAnagram(sortString(a), sortString(b));
        System.out.println("Total Character count that needs to be deleted to make a anagram: " + count);
    }

    public static String sortString(String x){
        char[] tempStr = x.toCharArray();
        Arrays.sort(tempStr);
        return new String(tempStr);
    }

    public static int makeAnagram(String a, String b){
        System.out.println(a);
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        int k=0;
        for(int i=0, j=0; i<aArr.length && j<bArr.length; ){
            if(aArr[i]<bArr[j]){
                i++;
            }else if(bArr[j]<aArr[i]){
                j++;
            }else{
               k=k+2;//count matching characters
                i++;
                j++;
            }
        }
        return aArr.length + bArr.length - k;
    }
}
