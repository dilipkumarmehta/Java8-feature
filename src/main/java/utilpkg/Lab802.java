package utilpkg;
import java.util.*;
public class Lab802 {
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
	System.out.println("---:Forward Order:---");
	while(lit.hasNext()){
		int index=lit.nextIndex();
		Object obj=lit.next();
		System.out.println(index+"\t"+obj);
	}
	System.out.println("---:Reverse Order:---");
	while(lit.hasPrevious()){
		int index=lit.previousIndex();
		Object obj=lit.previous();
		System.out.println(index+"\t"+obj);	
	}
}
}