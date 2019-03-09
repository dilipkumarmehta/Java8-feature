package utilpkg;
import java.util.*;
public class Lab845 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Srinivas");
	list.add("Dande");
	list.add("Anand");
	list.add("Kumar");
	System.out.println(list);
	System.out.println("**LIST TO ENUMURATION**");
	Enumeration enm=Collections.enumeration(list);
	while(enm.hasMoreElements())
		System.out.println(enm.nextElement());
	Vector v=new Vector();
	v.add(99);
	v.addElement("Sri");
	v.add("Sri@jlc.com");
	System.out.println("**ENUMURATION TO LIST**");
	Enumeration enu=v.elements();
	List info=Collections.list(enu);
	System.out.println(info);
	
}
}
