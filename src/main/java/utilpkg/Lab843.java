package utilpkg;
import java.util.*;
public class Lab843 {
public static void main(String[] args) {
	Queue<String> que=new PriorityQueue<>();
	que.add("Srinivas");
	que.add("Manish");
	que.add("Kumar");
	que.add("Dande");
	que.add("Ranjan");
	System.out.println(que);
	int len=que.size();
	for(int i=0;i<len;i++){
		System.out.println(que.poll());
	}
	System.out.println("*************");
	Queue<String> que1=new PriorityQueue<String>(10,new PSort());
	que1.add("Srinivas");
	que1.add("Manish");
	que1.add("Kumar");
	que1.add("Dande");
	que1.add("Ranjan");
	System.out.println(que1);
	int len2=que1.size();
	for(int i=0;i<len2;i++){
		System.out.println(que1.poll());
}
}
}
class PSort implements Comparator<String>{
	@Override
	public int compare(String in1, String in2) {
		return in2.compareTo(in1);
	}
}
