package iopkg;
import java.io.*;
public class Lab888 {
public static void main(String[] args) {
	try(FileInputStream fis=new FileInputStream("D:\\info.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);){
		Object obj=ois.readObject();
		System.out.println(obj);
		System.out.println("Object Deserialized");
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
