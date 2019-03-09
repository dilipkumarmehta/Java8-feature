package utilpkg;
import java.util.*;
public class Lab852 {
public static void main(String[] args) {
	int arr[]=new int[]{10,43,23,89,45};
	System.out.println("Natural Orde");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	System.out.println("Sorted Order");
	Arrays.sort(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(i+"\t"+arr[i]);
}
	System.out.println("Binary Search:47");
	int indx=Arrays.binarySearch(arr, 47);
	System.out.println(indx);
	System.out.println("Binary Search:23");
	int indx1=Arrays.binarySearch(arr, 23);
	System.out.println(indx1);
	System.out.println("equals(int[],int[])");
	int values[]=new int[]{43,23,45,89,10};
	System.out.println(Arrays.equals(arr, values));
}
}

