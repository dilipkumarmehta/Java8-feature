package thread;

public class Lab761 {
@SuppressWarnings("static-access")
public static void main(String[] args) {
	MyThread10 t1=new MyThread10();
	t1.setPriority(10);
//	t1.setPriority(0);
//	t1.setPriority(11);
	System.out.println(t1);
	System.out.println("Max:"+t1.MAX_PRIORITY);
	System.out.println("Normal:"+t1.NORM_PRIORITY);
	System.out.println("Min:"+t1.MIN_PRIORITY);
	System.out.println(t1.getState());
	System.out.println(t1.isAlive());
}
}
class MyThread10 extends Thread{}