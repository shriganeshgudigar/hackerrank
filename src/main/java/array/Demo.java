package array;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import advancedJava.MyTree;
import advancedJava.Node;


public class Demo {
	public static void main(String[] args) {
		int i = 0;
		int arr[] ={1,3,4};
		Boolean flag = null;
		System.out.println("hello " + i + flag);

		MyTree myTree =  new MyTree();
		Node headNode = null;

		headNode = myTree.insertNode(10, headNode);
		headNode = myTree.insertNode(8, headNode);
		headNode = myTree.insertNode(12, headNode);
		headNode = myTree.insertNode(7, headNode);
		headNode = myTree.insertNode(9, headNode);
		headNode = myTree.insertNode(11, headNode);
		headNode = myTree.insertNode(15, headNode);
		myTree.postOrderDisplay(headNode);
		System.out.println("\n\n" + myTree.findMax(headNode) + " " + myTree.findMin(headNode));



		System.out.println(arr.hashCode());
		int[] returnedArr = test1(arr);
		System.out.println("Returned Array: hashcode " + returnedArr.hashCode()  );
		for(int ele:returnedArr){
			System.out.println("Elements: " + ele);
		}
		LinkedHashMap<String, String> m =new LinkedHashMap<String, String>();
		m.put("12", "12");
		m.put("34", "34");
		LinkedHashMap<String, String> n =new LinkedHashMap<String, String>();
		n.put("12", "678");
		m.putAll(n);
		for(Map.Entry k:m.entrySet()){
			System.out.println("Key: " + k.getKey() + " Value " + k.getValue());
		}

		LinkedList<LinkedHashMap<String, String>> listofMap = new LinkedList<LinkedHashMap<String, String>>();
		m.put("12", "12");
		m.put("34", "34");
		listofMap.add(m);
		for(Map<String, String> map:listofMap){
			for(Map.Entry<String, String> entry:map.entrySet()){
				System.out.println("Key: " + entry.getKey());
				System.out.println("Value: " + entry.getValue());
			}
		}
		String s1 = "sdf";
		String s2 = "sdft";
		System.out.println(s1 =s2);
		StringBuilder str =  new StringBuilder();
		str.append("Str1");
		str.append("Str2");
		System.out.println(str.toString());
	}

	public static int[] test1(int[] arr){
		System.out.println("HashCode: " + arr.hashCode());
		arr[2] = 10;
		return arr;
	}
}
