package iopkg;
import java.io.*;
public class Lab875 {
public static void main(String[] args) {
	try(
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	FileWriter fw=new FileWriter("D:\\D1\\stinfo.txt",false);
	BufferedWriter bwr=new BufferedWriter(fw);){
		char ch='y';
		do{
			System.out.println("Enter Id");
			String id=br.readLine();
			System.out.println("Enter Name");
			String nm=br.readLine();
			String info=id+"\t"+nm;
			bwr.write(info);
			bwr.newLine();
			System.out.println("Do you want to add more :[Y/N]");
			ch=(char)br.readLine().charAt(0);
		}while(ch=='y');
		bwr.close();
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
