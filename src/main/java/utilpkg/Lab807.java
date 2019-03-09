
package utilpkg;
import java.util.*;
public class Lab807{
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	TreeSet set=new TreeSet();
	set.add("Shri");
	set.add("Nivas");
	//set.add(99);
	//ClassCastException bcz of diff. obj.
	set.add("Dk");
	set.add("Manish");
	System.out.println(set);
}
}
