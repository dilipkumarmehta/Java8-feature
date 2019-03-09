package utilpkg;
import java.util.*;
public class Lab857 {
public static void main(String[] args) {
	Calendar cal=Calendar.getInstance();
	System.out.println(cal);
	Date dt=cal.getTime();
	System.out.println(dt);
	System.out.println("Day:"+cal.get(Calendar.DATE));
	System.out.println("Day:"+cal.get(Calendar.DAY_OF_MONTH));
	System.out.println("Month:"+cal.get(Calendar.MONTH));
	System.out.println("Month+1:"+(cal.get(Calendar.MONTH)+1));
	System.out.println("Year:"+cal.get(Calendar.YEAR));
	System.out.println("Hour:"+cal.get(Calendar.HOUR));
	System.out.println("Hour of Day:"+cal.get(Calendar.HOUR_OF_DAY));
	System.out.println("Minut:"+cal.get(Calendar.MINUTE));
	System.out.println("Second"+cal.get(Calendar.SECOND));
	System.out.println("AM-PM:"+cal.get(Calendar.AM_PM));
	System.out.println("Adding 7 Days");
	cal.add(Calendar.DATE, 7);
	System.out.println(cal.getTime());
	System.out.println("Set Month as march");
	cal.set(Calendar.MONTH, Calendar.MARCH);
	System.out.println(cal.getTime());
	
}
}
