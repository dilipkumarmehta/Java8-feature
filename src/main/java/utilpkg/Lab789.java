package utilpkg;
import java.util.*;
public class Lab789 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
List list=new ArrayList();
list.add("Sri");
list.add("Nivas");
list.add("Dande");
System.out.println(list);
list.add(1,"java");
System.out.println(list);
list.remove(2);
System.out.println(list);
}
}
