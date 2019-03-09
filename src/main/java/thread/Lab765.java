package thread;

public class Lab765 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	Hello1 h1=new Hello1();
	Hello1 h2=new Hello1();
	MyThread13 th1=new MyThread13(h1);
	MyThread13 th2=new MyThread13(h1);
	//MyThread13 th2=new MyThread13(h2);
	th1.start();
	th2.start();
	}
	}
	class MyThread13 extends Thread{
		Hello1 h=null;
		MyThread13(Hello1 h) {
			this.h=h;
		}
		@Override
		public void run() {
		h.show();
		}
	}
	class Hello1{
		void show(){
		
			Thread th=Thread.currentThread();
			synchronized(this){
			for (int i = 0; i <=5; i++) {
			System.out.println(th.getName()+"-show-"+"\t"+this);	
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		}
	}
	}