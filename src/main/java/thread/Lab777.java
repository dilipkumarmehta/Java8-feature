package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab777 {
public static void main(String[] args) {
	MyThread21 th=new MyThread21();
	ExecutorService ser=Executors.newFixedThreadPool(5);
	for (int i = 0; i <3; i++) {
	ser.execute(th);
	}
}
}
class MyThread21 implements Runnable{
	@Override
	public void run() {
		Thread th=Thread.currentThread();
		for (int i = 0; i<3; i++) {
		System.out.println(th.getName()+"\t"+i);	
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			
		}
		System.out.println(th.getName()+"\t"+"task complete");
		}
	}
}