package thread;

public class Lab775 {
	public static void main(String[] args) {
		Thread th1=Thread.currentThread();
		
		//th1.setDaemon(true);
		
		MyThread20 th2=new MyThread20();
		th2.setDaemon(true);
		th2.start();
		
		for(char ch='A';ch<='L';ch++){
			System.out.println(th1.getName()+"\t"+ch+"\t"+th1.isDaemon());
		}
	}
	}
	class MyThread20 extends Thread{
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