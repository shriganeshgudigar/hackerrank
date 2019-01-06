package test;

public class QueueArrayImplementation {

    public static void main(String args[]){
        Integer[] a = new Integer[5];
        Queue q =  new Queue(a , 5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.dequeue();
        q.enqueue(6);
        q.display();
        q.enqueue(6);
        q.display();
    }

}

class Queue<T>{

    T[] array = null;
    int size = 0;
    int front = -1;
    int rear = -1;

    Queue(T[] array, int length){
        this.array = array;
        this.size = length;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            if(front<=rear){
                int index = front;
                for(index=front; index<=rear; index++)
                    System.out.println(array[index]);
            }else if(rear==front){
                System.out.println(array[front]);
            }else{
                int index = front;
                for(index=front; index<size; index++)
                    System.out.println(array[index]);
                for(index=0; index<=rear; index++)
                    System.out.println(array[index]);
            }
        }
    }

    public void enqueue(T data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }else if(isEmpty()){
            rear=0;
            front=0;
        }else{
            rear = (rear+1)%size;
        }
        array[rear] = data;
    }

    public boolean isFull(){
        if((rear+1)%size==front){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(front==-1 && rear==-1){
            return true;
        }else{
            return false;
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }else if(rear==front) {
            rear = -1;
            front = -1;
        }else{
            front = (front+1)%size;
        }
    }

    public T getFront(){
        if(front==-1 || front== rear)
            return array[front];
        else
            return array[front];
    }

}


