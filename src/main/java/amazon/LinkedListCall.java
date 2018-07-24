package amazon;


interface ListInterface<T>{
    public void add(T data);
    public boolean removeAt(int index);
    public boolean insertAt(int index, T data)throws IllegalIndexException;
    public void remove();
    public boolean isEmpty();
    public T getAt(int index) throws IllegalIndexException;
}

interface Data<T>{
}

class Node <T> implements Data<T>{
    Node prevNode;
    Node nextNode;
    T data;
    Node(T data){
        this.data = data;
        prevNode = null;
        nextNode = null;
    }
}

class List <T> implements ListInterface<T>{
    Node head;
    int size;
    List(){
       head = null;
       size = 0;
    }
    public void add(T data){
        Node node =  new Node(data);
        if(head == null){
            head = node;
            size = size + 1;
        }else{
            Node tempNode = head;
            while(tempNode.nextNode!=null){
                tempNode = tempNode.nextNode;
            }
            tempNode.nextNode = node;
            node.prevNode = tempNode;
            size = size + 1;
        }
    }

    public int size(){
        Node node = head;
        int len = 0;
        while(node != null){
            node = node.nextNode;
            len = len + 1;
        }
        return len;
    }

    public boolean removeAt(int index){
        boolean flag;
        Node node = head;
        if(index < this.size && index != 0){
            flag = true;
            int itr  = 1;
            while(itr < index){
                node = node.nextNode;
                itr = itr + 1;
            }
            node.nextNode = node.nextNode.nextNode;
            size = size-1;
            flag = true;
        }else if(index < this.size && index == 0){
            head = node.nextNode;
            size = size -1;
            flag =  true;
        }else{
            flag = false;
        }
        return flag;
    }

    public boolean insertAt(int index, T data) throws IllegalIndexException{
        boolean flag = true;
        Node node = head;
        if(index != 0 && index < this.size){
          int pos = 1;
          while(pos < index){
              pos = pos + 1;
              node = node.nextNode;
          }
          Node newNode = new Node(data);
          newNode.nextNode = node.nextNode;
          node.prevNode = newNode;
          node.nextNode = newNode;
          newNode.prevNode = node;
          size = size + 1;
        }else if(index == this.size){
            while(node.nextNode != null){
                node = node.nextNode;
            }
            Node newNode = new Node(data);
            newNode.prevNode = node;
            node.nextNode = newNode;
            size = size + 1;
        }else if(index == 0){
            Node newNode = new Node(data);
            newNode.prevNode = null;
//            newNode.nextNode = node;
            newNode.nextNode = node;
            node.prevNode = newNode;
            head = newNode;
            size = size + 1;
        }else{
            flag = false;
            throw new IllegalIndexException();
        }
        return flag;
    }

    public void remove(){
        if(!this.isEmpty()) {
            if(this.size != 1) {
                Node node = head;
                while (node.nextNode != null) {
                    node = node.nextNode;
                }
                Node lastButOneNode = node.prevNode;
                lastButOneNode.nextNode = null;
            }else if (this.size == 1) {
                head = null;
            }
            size = size - 1;
        }
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }

    public T getAt(int index) throws IllegalIndexException{
        Node node = head;
        if(index < size){
            int itr = 0;
            while(itr < index ){
                node = node.nextNode;
                itr = itr + 1;
            }
        }else{
            throw new IllegalIndexException();
        }
        return ((T)node.data);
    }
}

class IllegalIndexException extends Exception{
    String message;
    IllegalIndexException(String message){
        super(message);
        this.message = message;
    }

    IllegalIndexException(){}

    public String getMessage(){
        String str = "Index provided, does not exists";
        if(message.length()==0){
            message = str;
        }
        return message;
    }
}

class Student{
    String name;
    int age;
    String city;
    Student(String name, String city, int age){
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
public class LinkedListCall {
    public static void main(String args[]){
            try{
                List list =  new List();
                Student st1 = new Student("Shriganesh", "Banglore", 28);
                Student st2 = new Student("Raghunandana", "Shimoga", 28);
                Student st3 = new Student("Chetan", "Raichur", 28);
                Student st4 = new Student("Kumar", "Hanagi", 28);
                list.add(st1);
                list.add(st2);
                list.add(st3);
                list.insertAt(1, st4);
                list.remove();
                list.remove();
                list.remove();
                list.remove();
                list.removeAt(0);
                System.out.println("List size: " + list.size);
                int itr = 0;
                int len = list.size;
                while(itr < len){
                    Student st = ((Student)list.getAt(itr));
                    System.out.println("Student name " + st.name);
                    System.out.println("Student age " + st.age);
                    System.out.println("Student city " + st.city);
                    itr  =itr + 1;
                    System.out.println("\n");
                }
            }catch(Exception e){
                e.getMessage();
                e.printStackTrace();
            }
    }
}
