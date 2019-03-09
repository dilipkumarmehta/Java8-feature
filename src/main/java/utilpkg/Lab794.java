package utilpkg;
import java.util.Enumeration;
import java.util.Vector;
public class Lab794 {
@SuppressWarnings("rawtypes")
public static void main(String[] args) {
	Vector v=new Vector();
	Enumeration enu=v.elements();
	if(enu.hasMoreElements())
	System.out.println(enu.nextElement());
	System.out.println("Main Comleted");

}
}
