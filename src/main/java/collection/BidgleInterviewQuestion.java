package collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class BidgleInterviewQuestion{

    public static void main(String args[]){
        String[] str = {"Dog", "Cat", "Donkey", "Buffalo", "Cow", "Snake", "Lion", "Tiger", "Leopard", "Cheetah"};

        HashMap<Integer, LinkedList<String>> map = new HashMap<Integer, LinkedList<String>>();
        for(String estr:str){
            if(map.keySet().contains(estr.length())){
                map.get(estr.length()).add(estr);
            }else{
                LinkedList<String> list =  new LinkedList<String>();
                list.add(estr);
                map.put(estr.length(), list);
            }
        }
        System.out.println(map.values());
        for(Map.Entry<Integer, LinkedList<String>> map1:map.entrySet()){
            System.out.println("Count:  " + map1.getKey());
            System.out.println("Values: " + map1.getValue());
        }
    }
}
