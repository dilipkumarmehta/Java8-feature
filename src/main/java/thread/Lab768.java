package thread;

public class Lab768 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	Hello4 h1=new Hello4();
	Hello4 h2=new Hello4();
	MyThread16 th1=new MyThread16(h1);
	MyThread16 th2=new MyThread16(h1);
	//MyThread16 th2=new MyThread16(h2);
//	th1.setPriority(9);
//	th2.setPriority(9);
	th1.start();
	th2.start();
	}
	}
	class MyThread16 extends Thread{
		Hello4 h=null;
		MyThread16(Hello4 h) {
			this.h=h;
		}
		
		@Override
		public void run() {
		h.show();
		}
	}
	class Hello4{
		synchronized void show(){
			Thread th=Thread.currentThread();
			
			for (int i = 0; i <=5; i++) {
			System.out.println(th.getName()+"-show-"+"\t"+i);	
			try {
				wait(100);
//				Thread.sleep(5);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
	}
	}
	