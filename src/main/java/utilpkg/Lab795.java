package utilpkg;
import java.util.Enumeration;
import java.util.Vector;
public class Lab795 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	Vector v=new Vector();
	v.addElement("Sri");
	v.addElement("Nivas");
	v.addElement("Dande");
	v.addElement("SD");
	Enumeration enu=v.elements();
	while(enu.hasMoreElements()){
	System.out.println(enu.nextElement());
	System.out.println("Main Comleted");

}
}
}
