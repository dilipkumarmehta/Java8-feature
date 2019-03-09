package thread;

public class Test {
public static void main(String[] args) {
	B a=new B();
	a.msg1();
}
}

class A{
	static void msg1(){
		System.out.println("msg1");
	}
}

class B extends A{
	static void msg1(){
		System.out.println("msg2");
}
} 