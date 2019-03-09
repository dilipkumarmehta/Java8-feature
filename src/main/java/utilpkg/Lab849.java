package utilpkg;
import java.util.*;
public class Lab849 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Srinivas");
	list.add("Dande");
	list.add("Abhi");
	list.add("Kumar");
	list.add("Nivas");
	System.out.println("Sorting in ASSENDING");
	Collections.sort(list);
	System.out.println(list);
	System.out.println("Sorting in DECENDING");
	Collections.sort(list,new StringDescComp());
	System.out.println(list);
}
}
@SuppressWarnings("rawtypes")
class StringDescComp implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
}
