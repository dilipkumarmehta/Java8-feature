package thread;

public class Lab762 {
	public static void main(String[] args)throws Exception {
		MyThread11 th=new MyThread11();
		Thread t=new Thread(th);
		System.out.println(th.getState());
		t.start();
		
		Thread.sleep(500);
		System.out.println(t.getState());
		Thread.sleep(5000);
		System.out.println(t.getState());
	}

}

class MyThread11 extends Thread {
@Override
public void run() {
	Thread th=Thread.currentThread();
	for (int i = 0; i <=10; i++)
	{
	System.out.println(th.getName()+"-vlue is:"+i+"\t"+th.getState());	
	try {
		Thread.sleep(500);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
}
}