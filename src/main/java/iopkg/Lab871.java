package iopkg;
import java.io.*;
public class Lab871 {
public static void main(String[] args) {
	try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
		System.out.println("Enter Id");
		String id=br.readLine();
		System.out.println("Enter Name");
		String nm=br.readLine();
		System.out.println(id+"\t"+nm);
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
