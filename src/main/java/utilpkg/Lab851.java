package utilpkg;
import java.util.*;
public class Lab851 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Srinivas");
	list.add("Dande");
	list.add("Abhi");
	list.add("Kumar");
	list.add("Nivas");
	List synList=Collections.synchronizedList(list);
	System.out.println("Synch\t"+synList);
	System.out.println("List\t"+list);
	List unModi=Collections.unmodifiableList(list);
	System.out.println("UnModi\t"+unModi);
	System.out.println("MODIFYING LIST");
	list.add("Manish");
	System.out.println("List\t"+list);
	System.out.println("UnModi\t"+unModi);
	//unModi.add("INDIA");
}
}
