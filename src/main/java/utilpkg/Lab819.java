package utilpkg;
import java.util.*;
public class Lab819 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {

	TreeSet ts=new TreeSet(new SnameComparator());
	ts.add(new Student5(88, "A"));
	ts.add(new Student5(44, "F"));
	ts.add(new Student5(22, "G"));
	ts.add(new Student5(22, "C"));
	ts.add(new Student5(77, "D"));
	Iterator it=ts.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}
class Student5{
	int sid;
	String name;
	 Student5(int sid,String name) {
		this.sid=sid;
		this.name=name;
	}
	 @Override
	public String toString() {
		
		return sid+"\t"+name;
	}
}

	class SnameComparator implements Comparator{
		@Override
		public int compare(Object ob1, Object ob2) {
			if(ob1 instanceof Student5 && ob2 instanceof Student5)
			{
				Student5 s1=(Student5)ob1;
				Student5 s2=(Student5)ob2;
				return s1.name.compareTo(s2.name);
			}
				return 0;
		}
	}
	
