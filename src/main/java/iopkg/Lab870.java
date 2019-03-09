package iopkg;
import java.io.*;
public class Lab870 {
public static void main(String[] args) {
	try(
			//FileInputStream fis=new FileInputStream("D:\\D1\\abc.txt");
			FileReader fis=new FileReader("D:\\D1\\abc.txt");){
		//	BufferedInputStream bis=new BufferedInputStream(fis);){
		while(true){
			int asc=fis.read();
			if(asc==-1) break;
			char ch=(char)asc;
			System.out.println(ch);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
