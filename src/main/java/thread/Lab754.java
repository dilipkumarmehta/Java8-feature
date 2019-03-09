package thread;

public class Lab754 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		MyThread3 t1=new MyThread3();
		MyThread3 t2=new MyThread3();
		}
		}
		class MyThread3 implements Runnable{
			MyThread3(){
				//start();
				Thread t=new Thread(this);
				t.start();
			}
			@Override
			public void run() {
				Thread th=Thread.currentThread();
				ThreadGroup tg=th.getThreadGroup();
				System.out.println("Thread Name:"+th.getName());
				System.out.println("Thread Group Name:"+tg.getName());
			}
		}