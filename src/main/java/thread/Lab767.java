package thread;

public class Lab767 {

	public static void main(String[] args) {
	Hello3 h1=new Hello3();
	Hello3 h2=new Hello3();
	MyThread15 th1=new MyThread15(h1);
	MyThread15 th2=new MyThread15(h1);
	//MyThread15 th2=new MyThread15(h2);
	th1.start();
	th2.start();
	}
	}
	class MyThread15 extends Thread{
		Hello3 h=null;
		MyThread15(Hello3 h) {
			this.h=h;
		}
		@SuppressWarnings("static-access")
		@Override
		public void run() {
		h.show();
		}
	}
	class Hello3{
		  void show(){
			Thread th=Thread.currentThread();
			System.out.println(th.getName());
			synchronized(Hello3.class){
			for (int i = 0; i <=5; i++) {
			System.out.println(th.getName()+"-show-"+"\t"+i);	
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
	}
	System.out.println(th.getName());
	}
	}

