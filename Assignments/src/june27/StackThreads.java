package june27;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{

	private String type;
	Stack s;
	int ele;
	public WorkerThread(Stack s, String op) {
		this.type = op;
		this.s = s;
	}
	public WorkerThread(Stack s, String op, int ele) {
		this.type = op;
		this.s = s;
		this.ele = ele;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			
			System.out.println("Thread started ---");
			if(type == "pop") {
				s.pop();
			}else if(type == "push") {
				 s.push(ele);
			}
			System.out.println("current stack : " + s);
			System.out.println("Thread enede ...");
			
		}
		
	}
//	declared one thread
	
	
}

public class StackThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ExecutorService exe = Executors.newFixedThreadPool(1);
		
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		
		System.out.println("1.push \t2.pop");
		int ch=-1;
		int ele;
		String type;
		while(ch!=0) {
			
			switch(ch) {
			case 1:{
				System.out.println("element to be pushed : ");
				ele = sc.nextInt();
				Runnable push = new WorkerThread(st, "push", ele);
				exe.execute(push);
				break;
			}
			case 2:{
				ele = 0;
				Runnable pop = new WorkerThread(st, "pop", ele);
				exe.execute(pop);
				break;
			}
			
			
			default :
				System.out.println("invalid choiece.");
				break;
			}
			
			System.out.println("choose : ");
			ch = sc.nextInt();
//			if (ch==1) {
//				type = "push";
//			}
//			else if(ch==2) {
//				type = "pop";
//			}
			
		};

		
		
	}

}
