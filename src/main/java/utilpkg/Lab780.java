package utilpkg;

import java.util.*;


public class Lab780 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	Collection col=new ArrayList();
	System.out.println(col);
	System.out.println("Size:"+col.size());
	System.out.println("Empty:\n"+col.isEmpty());
	col.add("Sri");
	col.add("Nivas");
	col.add("Srini");
	col.add("SD");
	col.add("Dande");
	System.out.println(col);
	System.out.println("Size:"+col.size());
	System.out.println("Empty:"+col.isEmpty());
}
}
