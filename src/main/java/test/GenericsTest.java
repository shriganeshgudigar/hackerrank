package test;

import org.apache.poi.ss.formula.functions.T;

public class GenericsTest {

    public static void main(String args[]){
        Integer[] iarra = {1,2,3,4,5};
        Character[] carray = {'a', 'q', 'w', 'e'};
        Generic<T> instance = new Generic<T>();
        instance.printMe(iarra);
        instance.printMe(carray);
//        printme(iarra);
//        printme(carray);
    }

    private static <T> void printme(T[] array){
        for(T i:array){
            System.out.print(i);
        }
        System.out.println();
    }
}

class Generic<T>{
    public <T> void printMe(T[] arr){
        for(T i:arr){
            System.out.println("T: " + i);
        }
    }
}
