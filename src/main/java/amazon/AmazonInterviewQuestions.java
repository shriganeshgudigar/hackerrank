package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


class AmazonInterviewQuestions{
    public static void main(String args[]){
        Amazon amzon =  new Amazon();
        char ch = amzon.getFirstNonRepeatingChar("shriganesh");
        System.out.println("First Non repeating Charcter: " + ch);


        amzon.songCountForBand("Lady Gaga","song1");
        amzon.songCountForBand("Lady Gaga","song2");
        amzon.songCountForBand("Lady Gaga","song3");
        amzon.songCountForBand("Lady Gaga","song4");
        amzon.songCountForBand("Bruno Mars","song1");
        amzon.songCountForBand("Bruno Mars","song2M");
        String topSong = amzon.topSongPlayedForBand();
        System.out.println("TopSong Played: " + topSong);


        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,4,55,76));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(0,2,33,44,79));
        ArrayList<Integer> list = new ArrayList<Integer>();
             list =   amzon.mergeList(list1,list2);
        Iterator itrList = list.iterator();
        while(itrList.hasNext()){
            System.out.println(itrList.next());
        }
    }
}
class Amazon{
    public LinkedHashMap getCharacterCountMap(String str){
        LinkedHashMap<Character, Integer>  map =  new LinkedHashMap<Character, Integer>();
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println("arrayCount: " + map);
        return map;
    }

    public char getFirstNonRepeatingChar(String str){
        LinkedHashMap<Character, Integer> map = getCharacterCountMap(str);
        char expectedChar='0';
        for(Map.Entry<Character, Integer> map1: map.entrySet()){
            if(map1.getValue()== 1){
                expectedChar = map1.getKey();
                break;
            };
        }
        return expectedChar;
    }
    HashMap<String, HashMap<String, Integer>> mapOfMap = new HashMap<String, HashMap<String, Integer>>();
    public void songCountForBand(String bandName, String songName){
        if(mapOfMap.containsKey(bandName)){
            if(mapOfMap.get(bandName).containsKey(songName)){
                mapOfMap.get(bandName).put(songName, mapOfMap.get(bandName).get(songName) + 1);
            }else {
                mapOfMap.get(bandName).put(songName, 1);
            }
        }else{
            HashMap<String, Integer> tempMap =  new HashMap<String, Integer>();
            tempMap.put(songName,1);
            mapOfMap.put(bandName, tempMap);
        }
    }
     public String topSongPlayedForBand(){
         String  topSong = "";
         Integer topCount = 1;
         System.out.println("MapOfMap: " + mapOfMap);
         for(Map.Entry<String, HashMap<String, Integer>> map: mapOfMap.entrySet()){
             System.out.println("band Played: " + map.getKey());
             for(Map.Entry<String, Integer> subMap: map.getValue().entrySet()){
                 if(subMap.getValue() > topCount){
                     topSong = subMap.getKey();
                     topCount = subMap.getValue();
                 }
             }
         }
         return topSong;
     }


    public ArrayList<Integer> mergeList(ArrayList<Integer> list1, ArrayList<Integer> list2){
         ArrayList<Integer> mergedList = new ArrayList<Integer>(list1.size() + list2.size());
         int i, j = 0;
         for(i=0, j=0; i<list1.size() && j <list2.size(); ){
             if(list1.get(i)< list2.get(j)){
                 mergedList.add(list1.get(i));
                 i++;
             }else if(list1.get(i) > list2.get(j)){
                 mergedList.add(list2.get(j));
                 j++;
             }else{
                 mergedList.add(list1.get(i));
                 i++;
                 j++;
             }
        }
        if(i < list1.size()) {
            while (i < list1.size()) {
                mergedList.add(list1.get(i));
                i++;
            }
        }else if(j<list2.size()){
             while(j<list2.size()){
                 mergedList.add(list2.get(j));
                 j++;
             }
        }
        return mergedList;
    }

}
