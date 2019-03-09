package utilpkg;

import java.util.*;

public class Lab799{
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Sri");
	list.add("Nivas");
	list.add("Dande");
	list.add("Java");
	list.add("JDBC");
	list.add("JSP");
	Iterator it=list.iterator();
	while(it.hasNext())
		System.out.println(it.next());
	
}
}
