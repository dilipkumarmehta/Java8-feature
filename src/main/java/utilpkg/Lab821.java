package utilpkg;
import java.util.*;
public class Lab821 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	TreeSet tset=new TreeSet(new StringDescComparator());
	tset.add("Manish");
	tset.add("Sri");
	tset.add("Nivash");
	tset.add("Rahul");
	tset.add("Dk");
	System.out.println(tset);
	Iterator it=tset.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}
@SuppressWarnings("rawtypes")
class StringDescComparator implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof String && ob2 instanceof String){
			String s1=(String)ob1;
			String s2=(String)ob2;
//			return s1.compareTo(s2);
			return s2.compareTo(s1);
		}
		return 0;
	}
}
