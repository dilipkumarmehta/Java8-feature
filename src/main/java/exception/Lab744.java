package exception;

public class Lab744 {
	
	public static void main(String[] args) {
		System.out.println("Main started");
		
		
try(JLCResource2 res1=new JLCResource2(1);JLCResource2 res2=new JLCResource2(2);) {
			
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Main ends");
	}
	}	
	class	JLCResource2 implements AutoCloseable{
			int id;
		JLCResource2(int id){
			this.id=id;
		}
		
		public void close(){
		System.out.println("JLCResource closed:"+id);	
		}
		}
