package utilpkg;
import java.util.*;
public class Lab817 {

@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	System.out.println("STUDENT INFO");
	TreeSet set=new TreeSet();
	set.add(new Student3(87, "Sri"));
	set.add(new Student3(99, "Dande"));
	set.add(new Student3(12, "SD"));
	set.add(new Student3(45, "Nivas"));
	Iterator it=set.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}
@SuppressWarnings("rawtypes")
class Student3 implements Comparable{
	int sid;
	String name;
	Student3(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Student3){
			Student3 st=(Student3)obj;
			return this.name.compareTo(st.name);
		}
		return 0;
	}
	@Override
	public String toString() {
		return sid+"\t"+name;
	}
}