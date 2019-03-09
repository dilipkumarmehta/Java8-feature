package exception;

public class Lab727 {
	public static void main(String[] args) {
		System.out.println("Main() Started");
		int r=new Hello4().show();
		System.out.println("main:"+r);
		System.out.println("Main() Completed");
		}
	}
	class Hello4{
		
		int show(){
			int a=0;
			try {
				System.out.println("try block begins:"+a);
				a=10/4;
				System.out.println("try block ends:"+a);
				return a;
			} catch (ArithmeticException e) {
				a=20;
				System.out.println("catch block:"+a);
				return a;
			}finally{
			System.out.println("finally block:"+a);
			//@SuppressWarnings("unused")
			int arr[]=new int[-1];
			}
		}
	}