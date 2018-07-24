package test;

import org.apache.poi.ss.formula.functions.T;

import java.util.*;

public class Test123 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(34);
        list.add(2);
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println("Element " + itr.next());
        }
        Collections.sort(list, new ListComparator());
        System.out.println("\n");
        Iterator itr2 = list.iterator();
        while(itr2.hasNext()){
            System.out.println("Element " + itr2.next());
        }
    }
}
class ListComparator <T> implements Comparator<T>{
    public int compare(T obj1, T obj2){
        if(Integer.parseInt(obj1.toString())==Integer.parseInt(obj2.toString())){
            return 0;
        }else if(Integer.parseInt(obj1.toString()) > Integer.parseInt(obj2.toString())){
            return 1;
        }else
            return -1;
    }
}