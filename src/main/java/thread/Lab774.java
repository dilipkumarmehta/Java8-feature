package thread;

public class Lab774 {
public static void main(String[] args) {
	Thread th1=Thread.currentThread();
	MyThread19 th2=new MyThread19();
	//th2.setDaemon(true);
	th2.start();
	for(char ch='A';ch<='J';ch++){
		System.out.println(th1.getName()+"\t"+ch+"\t"+th1.isDaemon());
	}
	System.out.println("main completed");
}
}
class MyThread19 extends Thread{
	@Override
	public void run() {
		for (int i=0; i<=10; i++) {
			System.out.println(getName()+"\t"+i+"\t"+isDaemon());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}