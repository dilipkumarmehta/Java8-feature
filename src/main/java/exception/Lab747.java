package exception;

public class Lab747 {
	public static void main(String[] args) {
		System.out.println("main started");
//		try(){
//		@SuppressWarnings("unused")
//		int x=10/0;	
//		}
		System.out.println("main ends");
	}
	}
	class JLCResource5 implements AutoCloseable{
		public void close(){
			System.out.println("resource closed");
		}
	}
