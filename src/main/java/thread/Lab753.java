package thread;

public class Lab753 {
@SuppressWarnings("unused")
public static void main(String[] args) {
MyThread2 t1=new MyThread2();
MyThread2 t2=new MyThread2();
//t1.start();t2.start();
}
}
class MyThread2 extends Thread{
	MyThread2()
	{
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