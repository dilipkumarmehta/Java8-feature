package utilpkg;
import java.util.*;
public class Lab862 {
@SuppressWarnings("rawtypes")
public static void main(String[] args)throws Exception {
	
	String languageCode="";
	System.out.println("H-> HINDI,E-> ENGLISH");
	System.out.println("Enter your choice");
	int asc=System.in.read();
	char ch=(char)asc;
	ch=Character.toUpperCase(ch);
	
	if(ch=='H'){
		System.out.println("You have selected HINDI");
		languageCode="hi";
	}else if(ch=='E'){
		System.out.println("You have selected ENGLISH");
		languageCode="en";
	}else{
		System.out.println("Invalid Input,Using default Language");
	}
	
	Locale loc=new Locale(languageCode);
	ResourceBundle rbRef=ResourceBundle.getBundle("messages", loc);
	Enumeration en=rbRef.getKeys();
	while(en.hasMoreElements()){
		String key=en.nextElement().toString();
		String val=rbRef.getString(key);
		System.out.println(key+"\t"+val);
	}
}
}
