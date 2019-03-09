package exception;

public class Lab745 {
	
	public static void main(String[] args) {
		System.out.println("Main started");
		
		
		
//		try(JLCResource3 res1=new JLCResource3(1);JLCResource3 res2=new JLCResource3(2);) {
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		System.out.println("Main ends");
	}
	}	
	class	JLCResource3 {
			int id;
		JLCResource3(int id){
			this.id=id;
		}
		
		public void close(){
		System.out.println("JLCResource closed:"+id);	
		}
		}