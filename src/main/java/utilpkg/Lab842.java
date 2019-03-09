package utilpkg;
import java.util.*;
public class Lab842 {
public static void main(String[] args) {
	Queue<String> que=new PriorityQueue<>();
	que.add("Srinivas");
	que.add("Manish");
	que.add("Kumar");
	que.add("Dande");
	que.add("Srinivas");
	que.add("Ranjan");
	System.out.println(que);
	System.out.println("Size:="+que.size());
	System.out.println("Peek:="+que.peek());
	System.out.println("Size:="+que.size());
	System.out.println("Element:="+que.element());
	System.out.println("Size:="+que.size());
	System.out.println("Pool:="+que.poll());
	System.out.println("Size:="+que.size());
	System.out.println(que);
	
}
}
