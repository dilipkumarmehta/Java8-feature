package thread;

public class Lab757 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("JLC");
		MyThread6 t1=new MyThread6(tg,"Hello");
		MyThread6 t2=new MyThread6(tg,"Hai");
		//t1.start();t2.start();
		}
		}
		class MyThread6 extends Thread{
			MyThread6(ThreadGroup tg,String tname){
				super(tg,tname);
				start();
			}
			@Override
			public void run() {
				Thread th=Thread.currentThread();
				ThreadGroup tg=th.getThreadGroup();
				System.out.println("Thread Name:"+th.getName());
				System.out.println("Thread Group Name:"+tg.getName());
			}
		}