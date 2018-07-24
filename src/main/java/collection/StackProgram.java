package collection;


public class StackProgram {
	public static void main(String args[]){
		Stack stack1 =  new Stack();
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		stack1.push(6);
		stack1.display();
		stack1.pop();
		stack1.pop();
		stack1.pop();
		stack1.display();
	}
}

class Nod{
	int data;
	Nod next;
}

class Stack{
	Nod head = null;
	
	public void push(int data){
		Nod newNode = new Nod();
		newNode.data = data;
		newNode.next =  null;
		if(head == null){
			head =  newNode;
		}else{
			Nod tempNode = head;
			head = newNode;
			newNode.next =  tempNode;
		}
	}
	
	public void pop(){
		if(head == null){
			System.out.println("Stack is Empty");
		}else{
			Nod currentNode =  head.next;
			System.out.println("popped Out element is " + head.data);
			head =  currentNode;
		}
	}
	
	public void display(){
		if(head == null){
			System.out.println("Stack is Empty");
		}else{
			Nod currentNode =  head;
			while(currentNode != null){
				System.out.println(currentNode.data);
				currentNode =  currentNode.next;
			}
		}
	}
}
