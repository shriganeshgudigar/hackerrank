package amazon;

import java.util.*;

public class AmazonInterviewQuestions1{
    public static void main(String args[]){

        /**
         * Implement a datastructure with the following APIs
         * void add(int) - 3,12,5,6,1
         * int getMin() - 1,3,5,6,12
         *
         */
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        treeMap.put(3, null);
        treeMap.put(12, null);
        treeMap.put(5, null);
        treeMap.put(6, null);
        treeMap.put(1, null);

        for(Map.Entry entry:treeMap.entrySet()){
            System.out.println("Key: " + entry.getKey());
        }
    }

    /**
     * Max no. that can be formed from the integers.
     */
    public static int maxNumber(int arr[]){
        int number=0;

        return number;
    }

}






