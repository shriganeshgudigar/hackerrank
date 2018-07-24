package array_geeks;



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

class Stack{
	
	int top = 0;
	int arr[] = new int[5];
	
	public void push(int data){
		if(top==arr.length){
			System.out.println("Stack is full, data " + data + " cannot be pushed");
		}else{
			arr[top] = data;
			top = top + 1;
		}
	}
	
	public void pop(){
		if(top == 0){
			System.out.println("Stack is empty");
		}else{
			top = top - 1;
			System.out.println("Popping out " + arr[top]);
		}
	}
	public void display(){
		if(top == 0){
			System.out.println("Stack is empty");
		}
		for(int i=top-1; i>=0; i--){
			System.out.println(arr[i]);
		}
	}
}