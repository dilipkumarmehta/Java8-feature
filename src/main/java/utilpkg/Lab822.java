package utilpkg;
import java.util.*;
public class Lab822 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	TreeSet tset=new TreeSet(new SBComparator());
	tset.add(new StringBuilder("Manish"));
	tset.add(new StringBuilder("Sri"));
	tset.add(new StringBuilder("Nivash"));
	tset.add(new StringBuilder("Rahul"));
	tset.add(new StringBuilder("Dk"));
	Iterator it=tset.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}
@SuppressWarnings("rawtypes")
class SBComparator implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof StringBuilder && ob2 instanceof StringBuilder){
			String s1=ob1.toString();
			String s2=ob2.toString();
//			return s1.compareTo(s2);
			return s2.compareTo(s1);
		}
		return 0;
	}
}
