package thread;

public class Lab755 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyThread4 t1=new MyThread4("Hello");
		MyThread4 t2=new MyThread4("Hai");
//		t1.start();
//		t2.start();
		}
		}
		class MyThread4 extends Thread{
			MyThread4(String tname){
				super(tname);
			//	start();
			}
			@Override
			public void run() {
				Thread th=Thread.currentThread();
				ThreadGroup tg=th.getThreadGroup();
				System.out.println("Thread Name:"+th.getName());
				System.out.println("Thread Group Name:"+tg.getName());
			}
		}