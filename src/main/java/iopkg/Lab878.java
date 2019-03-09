package iopkg;
import java.io.*;
public class Lab878 {
public static void main(String[] args) {
	File file=new File("D:\\");
	File files[]=file.listFiles();
	for(File f:files){
		System.out.println(f+"->isFile:"+f.isFile()+",isDir:"+f.isDirectory());
	}
}
}
