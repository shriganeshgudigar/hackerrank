package array;

public class MySingleLinkedList {
	public static void main(String args[]){
		Employee emp1 = new Employee(123, "Shriganesh", "Amazon");
		Employee emp2 = new Employee(142, "Sachin", "Tracxn");
		Employee emp3 = new Employee(144, "Raghu", "Sapient");
		SingleLinkedList list =  new SingleLinkedList();
		list.insert(emp1);
		list.insert(emp2);
		list.insert(emp3);
//		list.insert(30);
//		list.insert(40);
//		list.insert(50);
		list.display();
		list.delete(4);
		list.display();
		list.reverseRecursively(list.head);
		list.display();
		list.reversePrint(list.head);
	}
}

class Employee{
	int id;
	String name;
	String company;
	Employee(int id, String name, String company){
		this.id = id;
		this.name =  name;
		this.company = company;
	}
}

class Node{
	Employee data;
	Node next;
}

class SingleLinkedList{
	Node head;
	
	SingleLinkedList(){
		head = null;
	}
	
	public void insert(Employee data){
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
	
	public void display(){
		if(head == null){
			System.out.println("List is empty");
		}else{
			Node temp = head;
			while(temp != null){
				System.out.println(" Data: " + temp.data.id + " " + temp.data.name + " " + temp.data.company);
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
		}else if(this.size() < position || position <= 0){
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
	
	public void reversePrint(Node node){
		if(node == null){
			return;
		}else{
			reversePrint(node.next);
			System.out.println(node.data.id + " " + node.data.name + " " + node.data.company);
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
