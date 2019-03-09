package iopkg;
import java.io.*;
public class Lab884 {
public static void main(String[] args)throws IOException {
	File f=new File("D:\\hello.txt");
	f.createNewFile();
	f.deleteOnExit();
	File f2=new File("hi.txt");
	f2.createNewFile();
	System.out.println("f2.isHidden()\t"+f2.isHidden());
	System.out.println("f2.delete()\t"+f2.delete());
	System.out.println("File created");
	File f3=new File("C:\\documents and Settings\\Default user");
	System.out.println("f3.isHidden()\t"+f3.isHidden());
}
}
