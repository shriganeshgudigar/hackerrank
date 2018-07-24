package collection;




public class MergeLinkedList {
	
	public static void main(String args[]){
		SingleLinkedList list1 = new SingleLinkedList();
		SingleLinkedList list2 =  new SingleLinkedList();
		list1.insert(21);
		list1.insert(22);
		list1.insert(27);
		list1.insert(31);
		
		list2.insert(26);
		list2.insert(28);
		list2.insert(30);
		
		Merge merge  = new Merge();
		Node node3 = merge.mergeList(list1.head, list2.head);
		merge.display(node3);
	}

}

class Node{
	int data;
	Node next;
}

class Merge{
	public Node mergeList(Node list1, Node list2){
		Node mergedNode =  null;
		if(list1 != null && list2 != null){
			if(list1.data < list2.data){
				mergedNode =  list1;
				list1 =  list1.next;
			}else{
				mergedNode =  list2;
				list2 =  list2.next;
			}
			mergedNode.next = null;
		}
		Node head =  mergedNode;
		
		while(list1 != null && list2 != null){
			if(list1.data < list2.data){
				Node tempNode = list1;
				list1 =  list1.next;
				tempNode.next =  null;
				mergedNode.next =  tempNode;
			}else{
				Node tempNode =  list2;
				list2 =  list2.next;
				tempNode.next =  null;
				mergedNode.next =  tempNode;
			}
			mergedNode =  mergedNode.next;
		}
		
		if(list1 == null){
			mergedNode.next = list2;
		}else{
			mergedNode.next =  list1;
		}
		
		return head;
	}
	
	public void display(Node head){
		if(head == null){
			System.out.println("List is empty");
		}else{
			Node temp = head;
			while(temp != null){
				System.out.println(" Data: " + temp.data);
				temp = temp.next;
			}
		}
	}
}


class SingleLinkedList{
	Node head;
	
	SingleLinkedList(){
		head = null;
	}
	
	public void insert(int data){
		Node temp  = head;
		if(head == null){
			Node node =  new Node();
			node.data =  data;
			node.next =  null;
			head =  node;
		}else{
			while(temp.next != null){
				temp =  temp.next;
			}
			Node node = new Node();
			node.data =  data;
			node.next =  null;
			temp.next =  node;
		}
	}
	
	public int[] returnArray(){
		int[] arr = new int[this.size()];
		Node tempNode = head;
		int i = 0;
		while(tempNode != null){
			arr[i] =  tempNode.data;
			tempNode = tempNode.next;
			i = i + 1;
		}
		return arr;
	}
	
	public void display(){
		if(head == null){
			System.out.println("List is empty");
		}else{
			Node temp = head;
			while(temp != null){
				System.out.println(" Data: " + temp.data);
				temp = temp.next;
			}
		}
	}
	
	public int size(){
		int len = 0;
		Node node = head;
		if(node == null){
			len = 0;
		}else{
			while(node != null){
				node =  node.next;
				len =  len + 1;
			}
		}
		return len;
	}
	/**
	 * valid positions 1,2,3,4,5...list.size()
	 */
	public void delete(int position){
		Node temp =  head;
		if(head == null){
			System.out.println("List is empty");
		}else if( position > this.size() || position <= 0){
			System.out.println("invalid position " + position );
		}else{
			if(position == 1){
				System.out.println(temp.data + " element at position " + position + "deleted successfully");
				head =  temp.next;
			}else{
				int itr = 1;
				while(itr < position - 1){
					temp =  temp.next;
					itr =  itr + 1;
				}
				System.out.println(temp.next.data + " element at position " + position + "deleted successfully");
				Node nextNode =  temp.next.next;
				temp.next =  nextNode;
			}
		}
	}	
	
	public void reverseSingleLinkedList(){
		Node prev = null;
		Node current =  head;
		Node nextNode;
		while(current != null){
			nextNode = current.next;
			current.next =  prev;
			prev =  current;
			current =  nextNode;
			head  = prev;
		}
	}

	/**
	 * @param node
	 */
	public void reversePrint(Node node){
		if(node == null){
			return;
		}else{
			reversePrint(node.next);
			System.out.println(node.data);
		}
	}
	
	public void reverseRecursively(Node node){
		if(node.next == null){
			head =  node;
			return;
		}else{
			reverseRecursively(node.next);
			Node nextNode =  node.next;
			nextNode.next = node;
			node.next =  null;
		}
	}
}
