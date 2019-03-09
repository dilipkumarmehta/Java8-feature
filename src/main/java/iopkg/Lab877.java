package iopkg;
import java.io.*;
public class Lab877 {
public static void main(String[] args) {
	File drivers[]=File.listRoots();
	for (File f:drivers) {
		long total=f.getTotalSpace();
		total=total/1024/1024/1024;
		long usable=f.getUsableSpace();
		usable=usable/1024/1024/1024;
		System.out.println("Drive\ttotal\tfree");
		System.out.println(f+"\t"+total+"GB\t"+usable+"GB");
		//System.out.println(f);
	}
}
}

