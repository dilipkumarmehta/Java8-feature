package utilpkg;
import java.util.*;
public class Lab847 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Srinivas");

	list.add("Dande");

	list.add("Nivas");
	list.add("Kumar");
	list.add("Nivas");
	
	System.out.println(list);
	System.out.println("REPLACING NIVAS WITH JLC");
	Collections.replaceAll(list, "Nivas", "JLC");
	System.out.println(list);
	Object mx=Collections.max(list);
	System.out.println("MAX OBJ:"+mx);
	Object mn=Collections.min(list);
	System.out.println("MIN OBJ:"+mn);
	System.out.println("REPLACING ALL WITH JLC");
	Collections.fill(list, "JLC");
	System.out.println(list);
	
}
}
