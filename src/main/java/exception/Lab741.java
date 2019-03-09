package exception;


class Hello9{
	@SuppressWarnings("unused")
	void m1()throws ArithmeticException,ArrayIndexOutOfBoundsException{
		try {
			m2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("m1-ok");
			if(1==2){
				throw new ArrayIndexOutOfBoundsException();
			}
			else{
				throw new ArithmeticException("don't do this");
			}
		}
	}
	void m2()throws ArrayIndexOutOfBoundsException{
		m3();
	}
	void m3()throws ArrayIndexOutOfBoundsException{
		try {
			m4();
		} catch (ArithmeticException e) {
		System.out.println("m3-ok");
		}
	}
	void m4()throws ArithmeticException{
		m5();
	}
	void  m5()throws ArithmeticException{
		@SuppressWarnings("unused")
		int x=10/0;
	}
}
public class Lab741 {
	public static void main(String[] args) {
		try {
			Hello9 h=new Hello9();
			h.m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

