package exception;

public class Lab746 {
public static void main(String[] args) {
	System.out.println("main started");
	try(JLCResource4 res1=new JLCResource4();)
	{
	@SuppressWarnings("unused")
	int x=10/0;	
	}
	System.out.println("main ends");
}
}
class JLCResource4 implements AutoCloseable{
	public void close(){
		System.out.println("resource closed");
	}
}
