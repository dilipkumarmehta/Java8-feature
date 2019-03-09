package exception;

public class Lab740 {
	public static void main(String[] args)throws StudentNotFoundException3{
		System.out.println("Main started");
		StudentService3 serv=new StudentService3();
		serv.getNameBySid(null);
		System.out.println("Main completed");
	}	
	}
	class StudentService3{
		String getNameBySid(String sid) throws StudentNotFoundException3{
			if (sid==null ||sid.isEmpty()|| !sid.equals("JLC-099"))
				throw new StudentNotFoundException(sid);
			else 
				return "Srinivas";
		}
	}
	@SuppressWarnings("serial")
	class StudentNotFoundException3 extends Exception{
	StudentNotFoundException3(String sid){
		super(sid);
	}
	}