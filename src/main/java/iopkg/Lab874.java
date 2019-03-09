package iopkg;
import java.io.*;
public class Lab874 {
	public static void main(String[] args) {
		try(
//			FileReader fr=new FileReader("D:\\D1\\abc.txt");
//			BufferedReader br=new BufferedReader(fr);
//			FileWriter fw=new FileWriter("D:\\D1\\xyz.txt");
//			BufferedWriter bwr=new BufferedWriter(fw);
				
			FileInputStream fis=new FileInputStream("D:\\D1\\abc.txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(fis));
			FileOutputStream fos=new FileOutputStream("D:\\D1\\xyz.txt");
			BufferedWriter bwr=new BufferedWriter(new OutputStreamWriter(fos));
				){
			while(true){
				String st=br.readLine();
				if(st==null)break;
				bwr.write(st);
				bwr.newLine();
			}
			System.out.println("Writing completed!");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
