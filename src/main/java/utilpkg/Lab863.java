package utilpkg;
import java.util.*;
public class Lab863 {
public static void main(String[] args) {
	System.out.println("About to schedule task.");
	new Reminder(5);
	System.out.println("Task is Scheduled.");
}
}
class Reminder{
	Timer timer;
	public Reminder(int second){
		timer=new Timer();
		timer.schedule(new RemindTask(), second*1000);
	}
	class RemindTask extends TimerTask{
		public void run(){
		System.out.println("Time is UP!");	
		timer.cancel();
		}
	}
}
