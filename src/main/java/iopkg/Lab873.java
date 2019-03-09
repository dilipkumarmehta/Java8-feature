package iopkg;
import java.io.*;
public class Lab873 {
public static void main(String[] args) {
	try(
		FileInputStream fis=new FileInputStream("D:\\D1\\abc.txt");
		FileOutputStream fos=new FileOutputStream("D:\\D1\\xyz.txt");){
		while(true){
			int asc=fis.read();
			if(asc==-1)break;
			fos.write(asc);
		}
		System.out.println("Writing completed!");
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
