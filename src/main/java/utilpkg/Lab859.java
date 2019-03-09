package utilpkg;
import java.text.SimpleDateFormat;
import java.util.*;
public class Lab859 {
public static void main(String[] args)throws Exception {
	SimpleDateFormat fmt=new SimpleDateFormat("dd-MM-YYYY");
	String res=fmt.format(new Date());
	System.out.println(res);
	SimpleDateFormat fmt1=new SimpleDateFormat("YYYY-MM-dd-HH:mm:ss");
	String res1=fmt1.format(new Date());
	System.out.println(res1);
	Date date=fmt.parse("2013-10-25");
	System.out.println(date);
}
}
