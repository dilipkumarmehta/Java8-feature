package utilpkg;
import java.util.*;
public class Lab865 {
public static void main(String[] args) {
	String str="Hi This is JLC.";
	Scanner sc=new Scanner(str);
	while(sc.hasNext()){
		String st=sc.next();
		System.out.println(st);
	}
	sc.close();
	System.out.println("**********************");
	String str2="Hi This is JLC.Java Training Center.No 1 in java Training";
	Scanner sc2=new Scanner(str2);
	sc2.useDelimiter("\\.");
	while(sc2.hasNext()){
		String st2=sc2.next();
		System.out.println(st2);
	}
	sc2.close();
}
}
