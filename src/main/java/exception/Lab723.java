package exception;

public class Lab723 {

	public static void main(String[] args) {
	System.out.println("Main() Started");
	int r=new Hello().show();
	System.out.println("main:"+r);
	System.out.println("Main() Completed");
	}
}
class Hello{
	int show(){
		int a=0;
		try {
			System.out.println("try block begins:"+a);
			a=10/4;
			System.out.println("try block ends:"+a);
			return a;
		} catch (ArithmeticException e) {
			System.out.println("catch");
			a=20;
			System.out.println("catch block:"+a);
			return a;
		}
		finally
		{
		a=30;
		System.out.println("finally block:"+a);
		}
	}
}
