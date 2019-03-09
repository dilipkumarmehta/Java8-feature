package exception;

public class Lab738 {
	public static void main(String[] args) {
		System.out.println("Main started");
		try {
			StudentService1 serv=new StudentService1();
			serv.getNameBySid(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main completed");
	}	
	}
	class StudentService1{
		String getNameBySid(String sid){
			if (sid==null ||sid.isEmpty()|| !sid.equals("JLC-099"))
				throw new StudentNotFoundException1(sid);
			else 
				return "Srinivas";
		}
	}
	@SuppressWarnings("serial")
	class StudentNotFoundException1 extends RuntimeException{
	StudentNotFoundException1(String sid){
		super(sid);
	}
	}
