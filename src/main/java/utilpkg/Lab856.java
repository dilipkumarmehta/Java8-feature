package utilpkg;
import java.util.*;
public class Lab856 {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	Date dt=new Date();
	System.out.println(dt);
	System.out.println("Date\t\t"+dt.getDate());
	System.out.println("Month\t\t"+dt.getMonth());
	System.out.println("Month+1\t\t"+(dt.getMonth()+1));
	System.out.println("Year\t\t"+dt.getYear());
	System.out.println("Year+1900\t"+(dt.getYear()+1900));
	System.out.println("Hour\t\t"+dt.getHours());
	System.out.println("Minut\t\t"+dt.getMinutes());
	System.out.println("Second\t\t"+dt.getSeconds());
	System.out.println("Storing Date");
	dt.setDate(9);
	dt.setMonth(2);
	dt.setYear(108);
	System.out.println(dt);
}
}
