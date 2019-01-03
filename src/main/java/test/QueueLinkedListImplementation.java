package test;

public class QueueLinkedListImplementation {

    public static void main(String args[]){
        QueueL q = new QueueL();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
    }

    public int dequeue(int arr[]){
        int max = 0;
        if(arr.length<=3){
            return max;
        }else{
            QueueL q = new QueueL();
            int i = 0;
            int subLen =0;
            while(i<arr.length) {
                if(i<3) {
                    q.enqueue(arr[i]);
                }else{
                    int[] temp = q.getArray();
                    int tempMax = 0;
                    int prev = temp[0];
                    for(int k:temp){
                        if(prev == k){
                            tempMax++;
                        }
                    }
                    q.dequeue();
                    q.enqueue(arr[i]);
                }
                i++;
            }
        }
        return max;
    }

}


class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}

class QueueL{

    private Node front = null;
    private Node rear = null;

    public void enqueue(int data){
        Node temp = new Node(data);
        if(front==null && rear==null){
            front = temp;
            rear = temp;
            return;
        }else{
            rear.next = temp;
            rear = temp;
        }
    }

    public void dequeue(){
        if(front==null && rear==null){
            System.out.println("Queue is empty");
        }else if(front==rear){
            front = null;
            rear = null;
        }else{
            front = front.next;
        }
    }

    public Integer getFront(){
        if(front==null){
            return null;
        }else {
            return front.data;
        }
    }

    public void display(){
        if(front == null){
            System.out.println("Queue is empty");
        }else{
            Node temp = front;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public int[] getArray(){
        Node temp = front;
        int[] arr = null;
        int i = 0;
        while(temp != null){
            arr[i] = temp.data;
            temp = temp.next;
            i++;
        }
        return arr;
    }
}
