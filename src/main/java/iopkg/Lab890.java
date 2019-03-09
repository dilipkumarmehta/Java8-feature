package iopkg;
import java.io.*;
public class Lab890 {
public static void main(String[] args) {
	try(FileOutputStream fos=new FileOutputStream("D:\\info.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);){
		Student2 st=new Student2(88, "kumar", 77777777);
		Student2.count=9;
		System.out.println(st);
		oos.writeObject(st);
		System.out.println("Object Serialized");
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
class Student2 implements Serializable{
	private static final long serialVersionUID = 1L;
	int sid;
	transient String name="xxxxx";
	long phone=33333;
	static int count=3;
	Student2(int sid,String name,long phone){
		this.sid=sid;
		this.name=name;
		this.phone=phone;
	}
	@Override
	public String toString() {
		
		return sid+"\t"+name+"\t"+phone+"\t"+count;
	}
}