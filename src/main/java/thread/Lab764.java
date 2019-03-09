package thread;

public class Lab764 {
@SuppressWarnings("unused")
public static void main(String[] args) {
Hello h1=new Hello();
Hello h2=new Hello();
MyThread12 th1=new MyThread12(h1);
MyThread12 th2=new MyThread12(h2);
//MyThread12 th2=new MyThread12(h2);
th1.start();
th2.start();
}
}
class MyThread12 extends Thread{
	Hello h=null;
	MyThread12(Hello h) {
		this.h=h;
	}
	@Override
	public void run() {
	h.show();
	}
}
class Hello{
	synchronized void show(){
		Thread th=Thread.currentThread();
		for (int i = 0; i <=5; i++) {
		System.out.println(th.getName()+"-show-"+"\t"+this);	
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
}