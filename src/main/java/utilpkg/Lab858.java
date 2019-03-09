package utilpkg;
import java.util.*;
public class Lab858 {
public static void main(String[] args) {
	Calendar today=Calendar.getInstance();
	Calendar cal=Calendar.getInstance();
	cal.set(Calendar.DATE, 13);
	cal.set(Calendar.MONTH, 5);
	cal.set(Calendar.YEAR, 2014);
	Date d=cal.getTime();
	System.out.println(d);
	System.out.println("After Today;"+today.after(cal));
	System.out.println("Befor Today:"+today.before(cal));
	System.out.println("CompareTo:"+today.compareTo(cal));
}
}
