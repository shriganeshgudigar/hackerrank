package amazon;

import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.LinkedList;

@Documented
@interface ClassPremeable{
    String author();
    String date();
}

@ClassPremeable(
        author = "Shriganesh",
        date = "08/12/2017"
)
interface StackInterface<T>{
    public void push(T data);
    public void pop();
    public boolean isEmpty();
    public boolean isFull();
    public int size();
    public void display();
}
@ClassPremeable(
        author = "Shriganesh",
        date = "08/12/2017"
)
class Stack <T> implements StackInterface<T>{
    int DEFAULT_SIZE;
    Stack(){
         DEFAULT_SIZE = 10;
    }

    Stack(int size){
        DEFAULT_SIZE = size;
    }

    ArrayList<T> list = new ArrayList<T>(DEFAULT_SIZE);
    int top = 0;
    public void push(T data){
        if(top < DEFAULT_SIZE) {
            list.add(data);
            top = top + 1;
        }else{
            System.out.println("***Stack is Full***");
        }
    }

    public void pop(){
        if(top == 0){
            System.out.println("***Stack is Empty***");
        }else{
            System.out.println("***Element popped*** " + list.get(top-1));
            list.remove(top-1);
            top--;
        }
    }

    public boolean isEmpty(){
        if(top==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(top == DEFAULT_SIZE){
            return true;
        }else{
            return false;
        }
    }

    public int size(){
        return top;
    }

    public void display(){
//        if(list)
    }
     public  T get(int index){
        return list.get(index);
     }

}

public class StackCall{
    public static void main(String args[]){
        Stack myStack =  new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push("Shriganesh");
        myStack.push("Sachin");
        myStack.push(9);
        int size = myStack.size();
        int itr = 0;
        while(itr < size){
            System.out.println("ELement is: " + myStack.get(itr));
            itr++;
        }
        while(!myStack.isEmpty()) {
            myStack.pop();
        }
        System.out.println("Stack size after pop operation: " + myStack.size());
    }
}


