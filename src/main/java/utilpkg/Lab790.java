package utilpkg;

import java.util.*;

public class Lab790 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Sri");
	list.add("Nivas");
	list.add("Dande");
	System.out.println(list);
	list.set(1, "Java");
	System.out.println(list);
	System.out.println(list.get(2));
}
}
