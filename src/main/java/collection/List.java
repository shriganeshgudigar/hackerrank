package collection;

import java.util.*;

public class List {
	public static void main(String args[]){
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Shriganesh");
		arrayList.add("Hanumanth");
		arrayList.add("Kamal");
		LinkedList linkedList = new LinkedList();
		linkedList.add("Amit");
		linkedList.add("Raghnandana");
		linkedList.add(123);
		
		System.out.println("arrayList: " + arrayList);
		System.out.println("linkedList: " + linkedList);
		
	}
}
