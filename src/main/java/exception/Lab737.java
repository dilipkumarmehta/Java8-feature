package exception;

public class Lab737 {
public static void main(String[] args) {
	System.out.println("Main started");
	String nm="";
	try {
		StudentService serv=new StudentService();
//		nm=serv.getNameBySid(null);
//		nm=serv.getNameBySid("");
		nm=serv.getNameBySid("JLC-088");
//		nm=serv.getNameBySid("JLC-099");
		System.out.println("Name:"+nm);
	} catch (Exception e) {
		System.out.println("catch bolck strted");
		e.printStackTrace();
	}
	System.out.println("Main completed");
}
}
class StudentService{
	String getNameBySid(String sid){
		if (sid==null)
			throw new NullPointerException("Don't provide null");
		else if(sid.isEmpty())
			throw new EmptySidExeption();
		else if(sid.equals("JLC-099"))
			return "Srinivas";
		else
			throw new StudentNotFoundException(sid);
	}
}
@SuppressWarnings("serial")
class StudentNotFoundException extends RuntimeException{
StudentNotFoundException(String sid){
	super(sid);
}
}
@SuppressWarnings("serial")
class EmptySidExeption extends RuntimeException{}

