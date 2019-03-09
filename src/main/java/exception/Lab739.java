package exception;

public class Lab739 {
	public static void main(String[] args) {
		System.out.println("Main started");
		try {
			StudentService2 serv=new StudentService2();
			serv.getNameBySid(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main completed");
	}	
	}
	class StudentService2{
		String getNameBySid(String sid)throws StudentNotFoundException2 {
			if (sid==null ||sid.isEmpty()|| !sid.equals("JLC-099"))
				throw new StudentNotFoundException2(sid);
			else 
				return "Srinivas";
		}
	}
	@SuppressWarnings("serial")
	class StudentNotFoundException2 extends Exception{
	StudentNotFoundException2(String sid){
		super(sid);
	}
	}