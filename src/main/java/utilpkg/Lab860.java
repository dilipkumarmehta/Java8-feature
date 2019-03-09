package utilpkg;
import java.util.*;
public class Lab860 {
public static void main(String[] args) {
	String str="Hi This is JLC, Java Learning Center";
	StringTokenizer tok=new StringTokenizer(str);
	System.out.println("Count:"+tok.countTokens());
	while(tok.hasMoreTokens()){
		String data=tok.nextToken();
		System.out.println(data);
	}
	
	System.out.println("Count:"+tok.countTokens());
	System.out.println("\n***with , delimeter***");
	String data="99,Srinivas,Sri@jlc.com,6599999,";
	StringTokenizer toks=new StringTokenizer(data,",");
	while(toks.hasMoreTokens()){
		String strs=toks.nextToken();
		System.out.println(strs);
	}
	
}
}
