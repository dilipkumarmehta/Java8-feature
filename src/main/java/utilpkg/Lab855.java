package utilpkg;
import java.util.*;
public class Lab855 {
public static void main(String[] args) {
	int arr[]={12,32,34};
	System.out.println("Len:"+arr.length);
	System.out.println(Arrays.toString(arr));
	arr=Arrays.copyOf(arr, 5);
	System.out.println("Len:"+arr.length);
	System.out.println(Arrays.toString(arr));
}
}
