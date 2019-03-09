package utilpkg;
import java.util.*;
public class Lab786 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	Collection col=new ArrayList();
	col.add("JDBC");
	col.add("JSP");
	col.add("Java");
	col.add("Srinivas");
	col.add("Dande");
	System.out.println(col);
	Collection col2=new ArrayList();
	col2.add("Java");col2.add("JDBC");
	col2.add("JSP");
	System.out.println(col2);
	Collection col3=new ArrayList();
	col3.add("Java");col3.add("JDBC");
	col3.add("EJB");
	System.out.println(col3);
	System.out.println(col.containsAll(col2));
	System.out.println(col.containsAll(col3));
	}
}