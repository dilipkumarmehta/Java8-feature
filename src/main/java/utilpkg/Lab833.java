package utilpkg;
import java.util.*;
public class Lab833 {
public static void main(String[] args) {
	System.out.println("--Using Genefricswith Set--");
	Set<String> set=new HashSet<String>();
	set.add("Srinivas");
	set.add("Manish");
	set.add("Sudhir");
	set.add("Dande");
	//set.add(12);
	Iterator<String> it=set.iterator();
	while(it.hasNext()){
		String str=it.next();
		System.out.println(str);
	}
}
}
