package utilpkg;
import java.util.*;
public class Lab801 {
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
	System.out.println(list);
	while(lit.hasNext()){
		Object obj=lit.next();
		System.out.println(obj);
		if(obj.equals("Nivas"))
			lit.remove();
		else if(obj.equals("Java"))
			lit.set("Core Java");
		else if(obj.equals("JSP"))
			lit.add("Servlets");
	}
	System.out.println(list);
}
}
