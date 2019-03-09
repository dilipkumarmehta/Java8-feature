package exception;

public class Lab709 {
public static void main(String[] args) {
	System.out.println("Main Started");
	String data=args[0];
	int x=Integer.parseInt(data);
	int res=10/x;
	System.out.println("Result:"+res);
	System.out.println("Main Ends");
}
}
