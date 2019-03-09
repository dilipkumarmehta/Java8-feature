package thread;

public class Lab776 {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	Runnable r=new Runnable(){
		public void run() {
		Thread th=new Thread();
		for (int i = 0; i <=10; i++) {
			System.out.println(th.getName()+"\t"+i);
		}
		}
	};
	Thread t1=new Thread(r);
	Thread t2=new Thread(r);
	t1.start();
	t2.start();
}
}

