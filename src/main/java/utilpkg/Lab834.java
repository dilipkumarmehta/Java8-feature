package utilpkg;
import java.util.*;
public class Lab834 {
public static void main(String[] args) {
	System.out.println("--Using Genefricswith map--");
	Map<Integer,String> map=new LinkedHashMap<Integer,String>();
	map.put(1234,"Srinivas");
	map.put(8764,"Manish");
	map.put(6577,"Sudhir");
	map.put(9898,"Dande");
	Set<Map.Entry<Integer, String>> set=map.entrySet();
	Iterator<Map.Entry<Integer, String>>it=set.iterator();
	while(it.hasNext()){
		Map.Entry<Integer, String> entry=it.next();
		Integer key=entry.getKey();
		String val=entry.getValue();
		System.out.println(key+"\t"+val);
	}
	}
}

