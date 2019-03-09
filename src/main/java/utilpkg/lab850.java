package utilpkg;
import java.util.*;
public class lab850 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	List list=new ArrayList();
	list.add(new StringBuilder("Srinivas"));
	list.add(new StringBuilder("Dande"));
	list.add(new StringBuilder("Abhi"));
	list.add(new StringBuilder("Kumar"));
	list.add(new StringBuilder("Nivas"));
	System.out.println(list);
//	Collections.sort(list);
	System.out.println("Sorting StringBufilder");
	Collections.sort(list,new StringBuilderComp());
	System.out.println(list);
}
}
@SuppressWarnings("rawtypes")
class StringBuilderComp implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
}