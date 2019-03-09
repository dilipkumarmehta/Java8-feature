package exception;

public class Lab749 {
public static void main(String[] args) {
	Student arr[]=new Student[500];
	try {
		for(int i=0;i<arr.length;i++){
			arr[i]=new Student();
			System.out.println((i+1)+":Object created");
		}
	} catch (Error e) {
		System.out.println("Error occured:"+e);
	}
	System.out.println("After Handling");
	Student st=new Student();
	System.out.println(st);
}
}
class Student{
	long arr[]=new long[215833];
}
