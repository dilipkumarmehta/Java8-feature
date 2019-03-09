package utilpkg;

import java.util.*;

public class Lab800{
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Sri");
	list.add("Nivas");
	list.add("Dande");
	list.add("Java");
	list.add("JDBC");
	list.add("JSP");
	ListIterator lit=list.listIterator();
	while(lit.hasNext())
		System.out.println(lit.next());
	
}
}