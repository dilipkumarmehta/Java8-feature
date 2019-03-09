package utilpkg;
import java.util.*;
public class Lab848 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Srinivas");
	list.add("Dande");
	list.add("Abhi");
	list.add("Kumar");
	list.add("Nivas");
	System.out.println(list);
	System.out.println("REVERSE");
	Collections.reverse(list);
	System.out.println(list);
	System.out.println("ROTATE(2)");
	Collections.rotate(list, 2);
	System.out.println(list);
	System.out.println("ROTATE(-3)");
	Collections.rotate(list, -3);
	System.out.println(list);
	System.out.println("SHUFFLE");
	for (int i = 0; i < 5; i++) {
		Collections.shuffle(list);
		System.out.println(list);
	}
}
}
