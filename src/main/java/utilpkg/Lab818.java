package utilpkg;
import java.util.*;
public class Lab818 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(new Student4(99, "Sri"));
}
}
class Student4{
	int sid;
	String name;
	 Student4(int sid,String name) {
		this.sid=sid;
		this.name=name;
	}
	 @Override
	public String toString() {
		
		return sid+"\t"+name;
	}
}
