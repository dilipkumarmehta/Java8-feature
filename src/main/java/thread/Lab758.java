package thread;

public class Lab758 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("JLC");
		MyThread7 t1=new MyThread7(tg,"Hello");
		MyThread7 t2=new MyThread7(tg,"Hai");
		}
		}
		class MyThread7 implements Runnable{
			MyThread7(ThreadGroup tg,String tname){
				//start();
				Thread t=new Thread(tg,this,tname);
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