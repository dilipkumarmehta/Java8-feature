package utilpkg;
import java.util.*;

public class Lab785 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	Collection col=new ArrayList();
	col.add("Sri");col.add("Srinivas");
	col.add("Dande");
	System.out.println(col+"\t"+col.size());
	Collection col2=new ArrayList();
	col2.add("Java");col2.add("JDBC");
	col2.add("JSP");
	System.out.println(col2+"\t"+col2.size());
	col.addAll(col2);
	System.out.println(col+"\t"+col.size());
	}
}
