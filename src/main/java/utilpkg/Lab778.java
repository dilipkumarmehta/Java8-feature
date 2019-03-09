package utilpkg;
import java.util.Enumeration;
import java.util.Vector;
public class Lab778 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	Vector v=new Vector();
	v.addElement("Sri");
	v.addElement("Nivas");
	v.addElement("Dande");
	System.out.println(v);
	Enumeration en=v.elements();
	while(en.hasMoreElements()){
		Object st=en.nextElement();
		System.out.println(st);
	}
}
}
