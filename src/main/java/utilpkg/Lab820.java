package utilpkg;
import java.util.*;
public class Lab820 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	TreeSet ts=new TreeSet(new NameComparator());
	ts.add(new Student6(88, "Manish"));
	ts.add(new Student6(44, "Sri"));
	ts.add(new Student6(22, "Nivas"));
	ts.add(new Student6(99, "Rahul"));
	ts.add(new Student6(77, "Skk"));
	Iterator it=ts.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}
class Student6{
	int sid;
	String name;
	 Student6(int sid,String name) {
		this.sid=sid;
		this.name=name;
	}
	 @Override
	public String toString() {
		
		return sid+"\t"+name;
	}
}
@SuppressWarnings("rawtypes")
class NameComparator implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof Student6 && ob2 instanceof Student6)
		{
			Student6 s1=(Student6)ob1;
			Student6 s2=(Student6)ob2;
			return s1.name.compareTo(s2.name);
		}
			return 0;
	}
}
