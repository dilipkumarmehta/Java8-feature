package utilpkg;
import java.util.*;
public class Lab844 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Srinivas");
	list.add("Dande");
	list.add("Anand");
	list.add("Kumar");
	List list2=new ArrayList();
	list2.add("Java");
	list2.add("Jdbc");
	list2.add("Servlet");
	list2.add("Jsp");
	System.out.println("List2:"+list2);
	Collections.copy(list2, list);
	System.out.println("List2:"+list2);
	
}
}
