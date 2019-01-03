package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExampleThree {

    public static void main(String args[]){
        System.out.println("Main thread started");


        System.out.println("Main thread terminated");
    }
}

class Printer1 extends Thread{

    public void printDocument(){
        for(int i=0; i<5; i++) {
            System.out.println("Print document " + i);
        }
    }
}
