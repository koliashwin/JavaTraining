package june24;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class t extends Thread{

	private String greeting;
	
	public t(String s){
		this.greeting = s;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread started...");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " "+ Thread.currentThread().getPriority() + " : " + greeting);
		
	}
	
}

public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService ex = Executors.newFixedThreadPool(4);
		
		Runnable t1 = new t("Good morning");
		Runnable t2 = new t("Good afternoon");
		Runnable t3 = new t("Good evening");
		Runnable t4 = new t("Good night");
		
		
		
		ex.execute(t1);
		ex.execute(t2);
		ex.execute(t3);
		ex.execute(t4);
		ex.shutdown();
		

	}

}
