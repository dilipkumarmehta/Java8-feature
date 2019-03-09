package iopkg;
import java.io.*;
public class Lab887 {
public static void main(String[] args)throws Exception {
	try(FileOutputStream fos=new FileOutputStream("D:\\info.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);){
		Student st=new Student(99, "skk", 657999999);
		Student.count=9;
		System.out.println(st);
		oos.writeObject(st);
		System.out.println("Object Serialized");
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	int sid;
	String name;
	long phone;
	static int count=3;
	Student(int sid,String name,long phone) {
		this.sid=sid;
		this.name=name;
		this.phone=phone;
	}
	@Override
	public String toString() {
		
		return sid+"\t"+name+"\t"+phone+"\t"+count;
	}
}
