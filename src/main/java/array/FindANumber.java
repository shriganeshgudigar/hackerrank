package array;

import java.util.LinkedHashMap;

public class FindANumber{
    public static void main(String args[]){
//        int[] arr = oddNumbers(5, 9);
//        for(int i=0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }
        System.out.println(countHoles(87));
        System.out.println(mergeStrings("", "def"));
    }


    public static int[] oddNumbers(int l, int r){
        int[] arr=null;
        int k =0;
        if(l<=r){
            arr=new int[l-r];
          for(int i=l; i<=r; i++){
              if(i%2!=0){
                  arr[k] = i;
                  k++;
              }
          }
        }
        return arr;
    }


    static int countHoles(int num) {
        int count = 0;
        LinkedHashMap<Integer, Integer> intHole = new LinkedHashMap<Integer, Integer>();
        intHole.put(4, 1);
        intHole.put(6, 1);
        intHole.put(8, 2);
        intHole.put(9, 0);
        int last;
        while(num >0) {
            last = num % 10;
            if (intHole.containsKey(last)) {
                count = count + intHole.get(last);
            }
            num = num/10;
        }
        return count;
    }


    static String mergeStrings(String a, String b) {
        StringBuilder mergedStr = new StringBuilder();
        int la = a.length(), lb = b.length();
        int ia = 0, ib=0;
        while(ia<la && ib<lb){
            mergedStr.append(a.charAt(ia));
            ia++;
            mergedStr.append(b.charAt(ib));
            ib++;
        }
        if(ia<la){
            while(ia<la){
                mergedStr.append(a.charAt(ia));
                ia++;
            }
        }
        if(ib<lb){
            while(ib<lb){
                mergedStr.append(b.charAt(ib));
                ib++;
            }
        }
        return mergedStr.toString();
    }
}
