package utilpkg;
import java.util.*;
public class Lab829 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	System.out.println("*LinkedHashMap*");
	Map map=new LinkedHashMap();
	map.put("sid", "JLC-99");
	map.put("name", "Sri");
	map.put("email", "sri@jlc.com");
	map.put("phone", "65799999");
	map.put("add", "Mathikhere");
	Set set=map.entrySet();
	Iterator it=set.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}
