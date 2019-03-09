package iopkg;
import java.io.*;
public class Lab883 {
public static void main(String[] args)throws IOException {
	File far[]=File.listRoots();
	System.out.println(far.length);
	System.out.println("FileName:isDir:isFile:isAbsol:getPath");
	for(File ff:far){
		System.out.println(ff+"\t"+ff.isDirectory()+"\t"+ff.isFile()+"\t"+ff.isAbsolute()+"\t"+ff.getPath());			  
	}
	File f=new File("hi.txt");
	System.out.println(f.createNewFile());
}
}
