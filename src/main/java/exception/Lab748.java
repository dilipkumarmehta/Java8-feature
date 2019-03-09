package exception;

public class Lab748 {
	public static void main(String[] args) {
		System.out.println("main started");
		try(JLCResource6 res1=new JLCResource6();){
//		Lab748 ref=new Lab748();
//		Object obj=ref.clone();
		}
		System.out.println("main ends");
	}
	}
	class JLCResource6 implements AutoCloseable{
		public void close(){
			System.out.println("resource closed");
		}
	}
