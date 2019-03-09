package exception;

public class Lab731 {
public static void main(String[] args) {
	System.out.println("Main Started");
	try {
		new Hello7().show();
	} catch (Exception e) {
		System.out.println("\ncath block");
		System.out.println("Ex:"+e);
		System.out.println("Message:"+e.getMessage());
		System.out.println("Cause:"+e.getCause());
		System.out.println();
		e.printStackTrace();
	}
	System.out.println("Main completed");
}
}
class Hello7{
	void show(){
		System.out.println("show begins");
		new A().m1();
		System.out.println("show ends");
	}
}
class A{
	void m1(){
		System.out.println("A->m1 begis");
		new B().m2();
		System.out.println("A->m1 ends");
	}
}
class B{
	void m2(){
		System.out.println("B m2 begins");
		new C().m3();
		System.out.println("B m2 ends");
	}
}
class C{
	void m3(){
		System.out.println("C->m3 begins");
		int x=10/0;
		System.out.println("C->m3 ends"+x);
	}
}