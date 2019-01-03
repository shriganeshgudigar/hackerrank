package strings;

import java.io.IOException;
import java.util.Arrays;

public class CompareStringArrays {

    public static void compare(String[] ar1, String ar2[]){
        for(int i=0; i<ar2.length; i++)
        if(!Arrays.asList(ar1).contains(ar2[i])){
            System.out.println(ar2[i]);
        }
    }

    public static void method1()throws   ArrayIndexOutOfBoundsException{
        int[] a = {1,2,3};
        System.out.println("A: " + a[0]);
    }

    public static void main(String args[]){
//        try{
            method1();
//        }catch(Exception e){
//            System.out.println("Ex: " + e.getMessage());
//        }
        String s1 = "Shri";
        String s2 ="Shri";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
