package thread;

public class Lab773 {
public static void main(String[] args)throws Exception {
Greetings g=new Greetings();
g.start();
g.join();
System.out.println("Greetings form JLC");
}
}
class Greetings extends Thread{
	@Override
	public void run() {
		for (int i =5; i>=1; i--) {
			try {
				System.out.println(i);
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}