package june27;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;



class randomno implements Callable{

	@Override
	public Object call() throws InterruptedException {
		// TODO Auto-generated method stub
		Random rd = new Random();
		
		Integer number = rd.nextInt(100);
//		String type;
		Thread.sleep(3000);
		if(number >=0 && number%2 == 0) {
			return number + " is even and positive";
		}
		else if(number >0 && number%2 == 1) {
			return number + " is odd and positive";
		}else {
			return number + " is nagetive";
		}
		
	}
	
}

public class RandomNoUsingThreads {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		int n = 5;

		FutureTask[] generateNo = new FutureTask[n];
		
		for(int i=0; i<n; i++) {
			Callable c = new randomno();
			generateNo[i] = new FutureTask(c);
			Thread t = new Thread(generateNo[i]);
			t.start();
			Object o = generateNo[i].get();
			
			System.out.println(o);
			
		}
		
	}


}
