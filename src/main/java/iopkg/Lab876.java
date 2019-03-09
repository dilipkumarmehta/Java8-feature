package iopkg;
import java.io.*;
public class Lab876 {
public static void main(String[] args)throws Exception {
	PrintWriter pw=new PrintWriter("welcome.txt");
	pw.write(97);
	pw.write(98);
	pw.println(10.0);
	pw.println(true);
	pw.println("JLC");
	pw.write("skk");
	pw.close();
	System.out.println("writing completed!");
}
}
