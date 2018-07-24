package collection;

import java.util.*;


public class Set {
	/**
	 * @param args
	 * hashSet vs linkedhashset
	 * hashSet does not maintain insertion order, but linkedhashset does.
	 */
	public static void main(String[] args){
		HashSet hashSet = new HashSet();
		hashSet.add("Shriganesh");
		hashSet.add("Suresh");
		hashSet.add("Rohit");
		System.out.println("HashSet: " + hashSet);
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add("Shriganesh");
		linkedHashSet.add("Suresh");
		linkedHashSet.add("Rohit");
		System.out.println("linkedHashSet: " + linkedHashSet);
	}
}
