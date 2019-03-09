package utilpkg;
import java.util.*;
public class Lab841 {
public static void main(String[] args) {
	int[] values={1,5,3,7,6,9,8};
	int len1=values.length;
	PriorityQueue<Integer> pq1=new PriorityQueue<>();
	for(int x:values)
	{
		pq1.offer(x);
	}
	System.out.println(pq1);
	
	for(int i=0;i<len1;i++)
		System.out.println(pq1.poll()+"");
	System.out.println("*********STRING**********");
	String[] nms={"Sri","Nivas","Kumar","Dande"};
	int len2=nms.length;
	PriorityQueue<String> pq2=new PriorityQueue<>();
	for(String x:nms)
	{
		pq2.offer(x);
	}
	System.out.println(pq2);
	for(int  i=0;i<len2;i++)
		System.out.println(pq2.poll());
}
}
