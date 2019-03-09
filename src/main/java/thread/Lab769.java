package thread;

import java.util.ArrayList;

public class Lab769 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	Hello5 h1=new Hello5();
	Hello5 h2=new Hello5();
	MyThread17 th1=new MyThread17(h1);
	MyThread17 th2=new MyThread17(h1);
	//MyThread17 th2=new MyThread17(h2);
	th1.start();
	th2.start();
	}
	}
	class MyThread17 extends Thread{
		Hello5 h=null;
		MyThread17(Hello5 h) {
			this.h=h;
		}
		
		@Override
		public void run() {
		h.show();
		}
	}
	class Hello5{
		@SuppressWarnings("unused")
		synchronized void show(){
		
			@SuppressWarnings("rawtypes")
			ArrayList al=new ArrayList();
			Thread th=Thread.currentThread();
			for (int i = 0; i <=5; i++) {
			System.out.println(th.getName()+"-show-"+"\t"+this);	
			try {
				wait(1000);
				//Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
	}
	}