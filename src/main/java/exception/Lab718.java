package exception;

public class Lab718 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			String data=args[0];
			int x=Integer.parseInt(data);
			int res=10/x;
			System.out.println("Result:"+res);
		}catch(ArrayIndexOutOfBoundsException| ArithmeticException e){
			System.out.println("*Enter a non zero value");
		}
		System.out.println("Main completed");
	}
	}