package exception;

public class Lab712 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			String data=args[0];
			int x=Integer.parseInt(data);
			int res=10/x;
			System.out.println("Result:"+res);
		}catch(Exception e){
			System.out.println("*Provide correct value");
		}
//		catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("*Provide one value as CLA");
//		}catch(NumberFormatException e){
//			System.out.println("*Provide int value as CLA");
//		}catch (ArithmeticException e) {
//			System.out.println("*Provide non Zero int value as CLA");
//		}
		System.out.println("Main completed");
}
}