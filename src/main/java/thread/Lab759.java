package thread;

public class Lab759 {
@SuppressWarnings("unused")
public static void main(String[] args) {
	ThreadGroup tg=new ThreadGroup("JLC");
	MyThread8 t1=new MyThread8(tg);
	MyThread8 t2=new MyThread8(tg);
}
}
class MyThread8 implements Runnable{
	 MyThread8(ThreadGroup tg) {
	Thread t=new Thread(tg,this);
	t.start();
	}
	 @Override
	public void run() {
	Thread th=Thread.currentThread();
	ThreadGroup tg=th.getThreadGroup();
	System.out.println("Thread name:"+th.getName());
	System.out.println("Thread Group Name:"+tg.getName());
		
	}
}
