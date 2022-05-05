import java.util.Scanner;
import java.util.Calendar;

public class Time {

	public Time() {
		Scanner input = new Scanner(System.in);  
		Calendar calendar = Calendar.getInstance();  
		
		calendar.add(Calendar.DATE, +6);  
		System.out.println("Our next avaliable date for service: "+ calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DATE) + "-" + calendar.get(Calendar.YEAR));  
		   
		System.out.println("What time works best for you on " + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DATE) + "-" + calendar.get(Calendar.YEAR) + "?");
		System.out.println("1 pm? 2pm? 3pm? or 4pm?");
		int time= input.nextInt();
		   
		System.out.println("\nWe cannot wait to see you on " + 
		calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DATE) + 
		"-" + calendar.get(Calendar.YEAR) + " at " 
		+ time + " pm.");
	}
}