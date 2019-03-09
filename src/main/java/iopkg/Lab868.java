package iopkg;
import java.io.*;
public class Lab868 {
public static void main(String[] args)throws IOException {
	JlcReader rd=new JlcReader();
	System.out.println("Enter Sid");
	String sid=rd.readLine();
	System.out.println("Enter Name");
	String nm=rd.readLine();
	System.out.println("Enter Phone");
	String phn=rd.readLine();
	System.out.println("Enter Fee");
	String fee=rd.readLine();
	System.out.println(sid+"\t"+nm+"\t"+phn+"\t"+fee);
	
}
}
class JlcReader{
	public String readLine()throws IOException{
	StringBuffer val=new StringBuffer();
	while(true){
		int asc=System.in.read();
		if(asc==13);
		else if(asc==10)
			break;
		else{
			char ch=(char)asc;
			val.append(ch);
		}
	}
	return val.toString();
}	
}
