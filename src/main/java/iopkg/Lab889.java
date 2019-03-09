package iopkg;
import java.io.*;
public class Lab889 {
public static void main(String[] args) {
	try(FileOutputStream fos=new FileOutputStream("D:\\info.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);){
		Student1 st=new Student1(99, "Sri", 65788888);
		Student1.count=9;
		System.out.println(st);
		oos.writeObject(st);
		System.out.println("Object is Serialized");
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
//class Person implements Serializable{
	class Person{
	private static final long serialVersionUID = 1L;
	
	String name="xxxx";
	long phone=33333;
}
class Student1 extends Person implements Serializable{
	private static final long serialVersionUID = 1L;
	int sid;
	static int count=3;
	 Student1(int sid,String name,long phone) {
		this.sid=sid;
		this.name=name; //Inherited property
		this.phone=phone;//Inherited property
	}
	 @Override
	public String toString() {
		return sid+"\t"+name+"\t"+phone+"\t"+count;
	}
}
