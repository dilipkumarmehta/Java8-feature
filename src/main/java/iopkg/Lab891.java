package iopkg;
import java.io.*;
public class Lab891 {
public static void main(String[] args) {
	try(FileOutputStream fos=new FileOutputStream("D:\\info.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);){
		Address ad=new Address("33/1", "Mathikhere");
		Student3 st=new Student3(99, "Sri", 56799999, ad);
		Student3.count=9;
		System.out.println(st);
		oos.writeObject(st);
		System.out.println("Object Serialized");
	}catch(Exception e){
		e.printStackTrace();
	}
	
}
}
/*class Address implements Serializable{
	private static final long serialVersionUID = 1L;*/
class Address{
	String aid;
	String street;
	Address(){}
	 Address(String aid,String street) {
		this.aid=aid;
		this.street=street;
	}
	 @Override
	public String toString() {
		
		return aid+"\t"+street;
	}
}
class Student3 implements Serializable,Externalizable{
		private static final long serialVersionUID = 1L;
	int sid;
	transient String name="xxxxx";
	long phone=333333333;
	static int count=3;
	Address add;
	
	public Student3() {
	}
	Student3(int sid,String name,long phone,Address add) {
		this.sid=sid;
		this.name=name;
		this.phone=phone;
		this.add=add;
		
	}
	@Override
	public String toString() {
		
		return sid+"\t"+name+"\t"+phone+"\t"+count+"\t"+add;
	}
	
	public void writeExternal(ObjectOutput out)throws IOException{
		out.writeObject(add.aid);
		out.writeObject(add.street);
	}
	public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException{
		add=new Address();
		add.aid=in.readObject().toString();
		add.street=in.readObject().toString();
	}
	
}