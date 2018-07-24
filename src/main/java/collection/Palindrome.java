package collection;

public class Palindrome {
	public static void main(String args[]){
		SingleLinkedList list = new SingleLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(2);
		list.insert(1);
		list.insert(1);
		int[] arr = list.returnArray();
		Stack stack =  new Stack();
		for(int i = 0; i<arr.length; i++){
			stack.push(arr[i]);
		}
		Boolean bool = compare(list, stack);
		if(bool){
			System.out.println("list is a palindrome ");
			for(int i=0; i< arr.length; i++){
				System.out.println(arr[i]);
			}
		}else{
			System.out.println("list is not a palindrome ");
			for(int i=0; i< arr.length; i++){
				System.out.println(arr[i]);
			}
		}
	}
	
	public static Boolean compare(SingleLinkedList list, Stack stack){
		Node listNode = list.head;
		Nod stackNode =  stack.head;
		Boolean bool = false;
		while(stackNode != null){
			if(stackNode.data == listNode.data){
				listNode = listNode.next;
				stack.pop();
				stackNode = stack.head;
				bool = true;
			}else{
				bool = false;
				break;
			}
		}
		return bool;
	}
	
}
