package utilpkg;
import java.util.*;
public class Lab832 {
public static void main(String[] args) {
	System.out.println("--Using Genefricswith List--");
	List<String> list=new ArrayList<String>();
	list.add("Srinivas");
	list.add("Manish");
	list.add("Sudhir");
	list.add("Dande");
	//list.add(12);
	Iterator<String> it=list.iterator();
	while(it.hasNext()){
		String str=it.next();
		System.out.println(str);
	}
}
}
