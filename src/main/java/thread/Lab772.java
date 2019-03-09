package thread;

public class Lab772 {
public static void main(String[] args) {
Service s=new Service();
s.start();
for(char ch='A';ch<='J';ch++){
	System.out.println("Main Running:"+ch);
	try {
		Thread.sleep(500);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
}
class Service extends Thread{
@Override
public void run() {
	for (int i = 0; i<=10; i++) {
		System.out.println("Service Running:"+i);
		System.out.println(Thread.activeCount());
		if(i==5){
			int x=10/0;
			System.out.println(x);
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}	
}