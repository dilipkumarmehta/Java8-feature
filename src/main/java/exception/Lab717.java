package exception;

public class Lab717 {
public static void main(String[] args) {
	System.out.println("Main Started");
	String str=null;
	try {
		str=args[0];
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("*Provide one value as CLA");
	}
	int x=0;
	try {
		x=Integer.parseInt(str);
	} catch (NumberFormatException e) {
		System.out.println("*Provide int value as CLA");
	}
	try {
		int res=10/x;
		System.out.println("Result:"+res);
	} catch (ArithmeticException e) {
		System.out.println("*Provide non zero int value as CLA");
	}
	System.out.println("Mina Completed");
}
}
