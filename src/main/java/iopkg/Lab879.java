package iopkg;
import java.io.*;
public class Lab879 {
public static void main(String[] args) {
	File file=new File("D:");
	File javaFiles[]=file.listFiles(new ExtFilter(".txt"));
	System.out.println("**Java files**");
	if(javaFiles!=null)
	for(File f:javaFiles)
		System.out.println(f);
	else
		System.out.println("No java files found");
	}
}
class ExtFilter implements FileFilter{
	String ext;
	ExtFilter(String ext){
		this.ext=ext;
	}
	@Override
	public boolean accept(File f) {
		
		return f.getName().endsWith(ext);
	}
}