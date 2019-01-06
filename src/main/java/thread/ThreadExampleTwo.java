package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExampleTwo {

    public static void main(String args[]){
        System.out.println("Main thread started");
        Printer printerInstance = new Printer();

//        PrintController childThreadOne =
//        PrintController childThreadTwo = new PrintController(15, "Ganesh", printerInstance);
        Runnable printController = new PrintController(15, "Shri", printerInstance);
//        childThreadOne.start();
//        childThreadTwo.start();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(printController);

        System.out.println("Main thread terminated");
    }
}

class Printer{
    public void printDocuments(int count, String name){
        for(int i=0; i<count; i++)
            System.out.println(" Printing document: " + name );
    }


}

class PrintController implements  Runnable{

    int count;
    String name;
    Printer printer;

    public PrintController( int count, String name, Printer printer){
        this.name = name;
        this.count = count;
        this.printer = printer;
    }
//    @Override
    public void run(){
        printer.printDocuments(count, name);
    }
}