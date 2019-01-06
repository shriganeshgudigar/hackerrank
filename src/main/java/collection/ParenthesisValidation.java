package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class ParenthesisValidation {

    public static void main(String args[]){
        String str = "((([)[[[{({](}]";
        if(parenthesisValidator(str)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    private static boolean parenthesisValidator(String s){
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('{','}');
        map.put('(',')');
        map.put('[', ']');
        boolean flag = true;
        ArrayStack stack = new ArrayStack();
        for(int i=0; i<s.length(); i++){
            if(map.keySet().contains(s.charAt(i))){
                stack.push(s.charAt(i));
            }else if(stack.top==-1){
                flag = false;
            }else{
                if(map.get(stack.getTop())== s.charAt(i)){
                    stack.pop();
                    continue;
                }else{
                    flag = false;
                    break;
                }

            }
        }
        if(stack.top>=0){
            flag = false;
        }
        return flag;
    }
}

class ArrayStack<T>{
    int top = -1;
    int DEFAULT_SIZE = 10;
    ArrayList<T> arrayList = new ArrayList<T>(DEFAULT_SIZE);
    public void push(T element){
        if(top==DEFAULT_SIZE-1){
            System.out.println("Stack is full");
        }else{
            top++;
            arrayList.add(element);
        }
    }

    public T getTop(){
        return arrayList.get(top);
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            arrayList.remove(top);
            top--;
        }
    }

    public void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            for(T i:arrayList) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
