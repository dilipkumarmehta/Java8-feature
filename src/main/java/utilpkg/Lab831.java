package utilpkg;
import java.util.*;
public class Lab831 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	Map map=new HashMap();
	map.put("sid", "JLC-99");
	map.put("name", "Srinivas");
	Map map2=new HashMap();
	map2.put("MKR", "Mathikhere");
	map2.put("BTM", "BTM Layout");
	System.out.println(map);
	System.out.println(map2);
	map.putAll(map2);
	System.out.println(map);
	System.out.println(map2);
}
}
