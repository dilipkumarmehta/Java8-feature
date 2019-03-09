package thread;

public class Lab766 {
	
	public static void main(String[] args) {
	Hello2 h1=new Hello2();
	Hello2 h2=new Hello2();
	MyThread14 th1=new MyThread14(h1);
	//MyThread14 th2=new MyThread14(h1);
	MyThread14 th2=new MyThread14(h2);
	th1.start();
	th2.start();
	}
	}
	class MyThread14 extends Thread{
		Hello2 h=null;
		MyThread14(Hello2 h) {
			this.h=h;
		}
		@SuppressWarnings("static-access")
		@Override
		public void run() {
		h.show();
		}
	}
	class Hello2{
		synchronized static void show(){
		
			Thread th=Thread.currentThread();
			for (int i = 0; i <=5; i++) {
			System.out.println(th.getName()+"-show-"+"\t"+i);	
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
	}
	}
