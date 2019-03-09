package thread;

import java.util.ArrayList;

public class Lab770 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	hello6 h1=new hello6();
	hello6 h2=new hello6();
	MyThread18 th1=new MyThread18(h1);
	MyThread18 th2=new MyThread18(h1);
	//MyThread18 th2=new MyThread18(h2);
	th1.start();
	th2.start();
	}
	}
	class MyThread18 extends Thread{
		hello6 h=null;
		MyThread18(hello6 h) {
			this.h=h;
		}
		
		@Override
		public void run() {
		h.show();
		}
	}
	class hello6{
		 @SuppressWarnings("rawtypes")
		void show(){
			ArrayList al=new ArrayList();
			Thread th=Thread.currentThread();
			synchronized(al){
			for (int i = 0; i <=5; i++) {
			System.out.println(th.getName()+"-show-"+"\t"+i);	
			try {
				al.wait(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
	}}
	}