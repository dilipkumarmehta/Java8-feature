package utilpkg;
import java.util.*;
public class Lab788 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	Collection col=new ArrayList();
	col.add("JDBC");
	//col.add(null);
	col.add("Sri");
	col.add("JSP");
	col.add("Srinivas");
	col.add("Java");
	col.add("Dande");
	Collection col2=new ArrayList();
	col2.add("Java");col2.add("JDBC");
	col2.add("JSP");
	System.out.println(col);
	System.out.println(col2);
	System.out.println(col.retainAll(col2));
	System.out.println(col);
	System.out.println(col2);
}
}



