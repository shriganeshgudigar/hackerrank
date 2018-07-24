package thread;

import java.util.LinkedHashSet;
import java.util.Set;

public class ThreadExampleOne extends Thread{
	public void run(){
		for(int i=0; i<5; i++){
//			try{
////				Thread.sleep(0);
//			}catch(InterruptedException e){
//				System.out.println("Error Message " + e.getMessage());
//			}
			System.out.println("thread is running " +  i);
		}
	}
	
	public static void main(String args[]){
		ThreadExampleOne t1 = new ThreadExampleOne();
		ThreadExampleOne t2 = new ThreadExampleOne();
		t1.start();
//		System.out.println("Initiated second thread");
		t2.start();

		Set<String> w = new LinkedHashSet<String>();
		w.add("Shri");
		if(w.contains("(?i)shri")){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		String str = "Shri";

	}
}
