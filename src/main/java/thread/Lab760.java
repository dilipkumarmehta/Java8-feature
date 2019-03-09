package thread;

public class Lab760 {
public static void main(String[] args) {
	MyThread9 t1=new MyThread9();
	MyThread9 t2=new MyThread9();
	t1.setName("Hello");
	t2.setName("Hai");
	t1.start();
	t2.start();
}
}

class MyThread9 extends Thread{
	@Override
	public void run() {
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		System.out.println("Thread name:"+th.getName());
		System.out.println("Thread Group Name:"+tg.getName());	
	}
}