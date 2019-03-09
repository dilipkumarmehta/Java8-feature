package utilpkg;
import java.util.*;
public class Lab803 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Sri");
	list.add("Nivas");
	list.add("Dande");
	list.add("Java");
	list.add("JDBC");
	list.add("JSP");
	ListIterator lit=list.listIterator(2);
	System.out.println(list);
	do{
	int index=lit.nextIndex();
	Object obj=lit.next();
	System.out.println(index+"\t"+obj);
	}while(lit.hasNext());
	System.out.println();
	lit=list.listIterator(5);
	do{
		int index=lit.previousIndex();
		Object obj=lit.previous();
		System.out.println(index+"\t"+obj);
		}while(lit.hasPrevious());
			
}
}