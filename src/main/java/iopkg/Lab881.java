package iopkg;
import java.io.*;
public class Lab881 {
	public static void main(String[] args)throws IOException {
		File file=new File("D:\\D1\\Hello.java");
		System.out.println("File found:"+file.exists());
		file.createNewFile();
		System.out.println("File found:"+file.exists());
	}
}
