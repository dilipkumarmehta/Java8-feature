package utilpkg;

import java.util.Enumeration;
import java.util.Properties;

public class Lab779 {
@SuppressWarnings("rawtypes")
public static void main(String[] args) {
	Properties p=new Properties();
	p.put("JLC-99", "Sri");
	p.put("JLC-88", "Nivas");
	p.put("JLC-77", "Dande");
	System.out.println(p);
	Enumeration en=p.propertyNames();
	while(en.hasMoreElements()){
	String pnm=(String)en.nextElement();
	String val=p.getProperty(pnm);
	System.out.println(pnm+"\t"+val);
	}
}
}
