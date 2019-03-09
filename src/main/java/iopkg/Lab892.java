package iopkg;
import java.io.*;
public class Lab892 {
	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("D:\\info.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);){
			Address2 ad=new Address2("33/1", "Mathikhere");
			Student4 st=new Student4(99, "Sri", 56799999, ad);
			//Student4.count=9;
			//System.out.println(st);
			//oos.writeExternal(st);
			System.out.println("Object Serialized");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	}
	class Address2{
		String aid;
		String street;
		 Address2(){}
		 Address2(String aid,String street) {
			this.aid=aid;
			this.street=street;
		}
		 @Override
		public String toString() {
			
			return aid+"\t"+street;
		}
	}
	class Student4 implements Externalizable{
		
		int sid;
		transient String name="xxxxx";
		long phone=333333333;
		static int count=3;
		Address2 add;
		public Student4(){}
		Student4(int sid,String name,long phone,Address2 add) {
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
			out.writeInt(count);
			out.writeObject(name);
			out.writeObject(add.aid);
			out.writeObject(add.street);
		}
		public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException{
			count=in.readInt();
			name=in.readObject().toString();
			add=new Address2();
			add.aid=in.readObject().toString();
			add.street=in.readObject().toString();
		}
}
