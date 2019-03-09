package utilpkg;
import java.util.*;
public class Lab866 {
public static void main(String[] args) {
	Formatter fmt=new Formatter();
	String res=fmt.format("Sum of %d and %d is: %d",10,20,(20+10)).toString();
	System.out.println(res);
	fmt.close();
}
}
