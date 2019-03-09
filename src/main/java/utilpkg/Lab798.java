package utilpkg;

import java.util.*;

public class Lab798 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Sri");
	list.add("Nivas");
	list.add("Dande");
	list.add("skk");
	list.add("sss");
	System.out.println(list);
//	list.remove("Sri");
//	System.out.println(list);
	Iterator it=list.iterator();
	int size=list.size();
//	list.remove(2);
	for(int i=0;i<size;i++)
		System.out.println(it.next());
}
}