package iopkg;
import java.io.*;
public class Lab880 {
public static void main(String[] args) {
	File file=new File("D:\\D1\\JAVA\\JLC");
	System.out.println("Dir found:"+file.exists());
	file.mkdirs();
	System.out.println("Dir found:"+file.exists());
}
}
