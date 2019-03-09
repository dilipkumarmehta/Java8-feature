package utilpkg;
import java.util.*;
public class Lab792 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Sri");
	list.add("Nivas");
	list.add("Dande");
	list.add("Java");
	list.add("Nivas");
	list.add("JDBC");
	System.out.println(list);
	System.out.println(list.subList(1, 3));
}
}
