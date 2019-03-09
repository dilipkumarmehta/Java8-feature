package utilpkg;

public class Check {
public static void main(String[] args) {
	int arr[]=new int[]{2,3,5,6,7};
	System.out.println("Forward direction");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	System.out.println("Backword direction");
	for (int i = arr.length; i >0; i--) {
		System.out.println(arr[i-1]);
	}
}}
