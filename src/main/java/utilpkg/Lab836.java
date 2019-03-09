package utilpkg;
import java.util.*;
public class Lab836 {
public static void main(String[] args) {
	ArrayList<Integer> ali=new ArrayList<Integer>();
	ali.add(1234);
	ali.add(4567);
	ali.add(8910);
	showElement(ali);
	ArrayList<Float> alf=new ArrayList<Float>();
	alf.add(123.456F);
	alf.add(456.74F);
	alf.add(789.456F);
	showElement(alf);
}
static void showElement(List<? extends Number> list){
	for(Number num:list){
		System.out.println(num+",");
	}
	System.out.println("\n");
}
}

