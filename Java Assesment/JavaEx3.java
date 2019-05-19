
import java.util.*;
public class JavaEx3 {
	
 public static void main(String[] args)
    {
       // Create a default calendar
    	
        Calendar cal = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance();
       // Get and display information of current date from the calendar:
       int y =cal.get(Calendar.YEAR);
       int m =cal.get(Calendar.MONTH);
       int d =cal.get(Calendar.DATE);
       System.out.println(cal);

        cal1.set(2000, 11, 25);
        
        if(cal1.get(Calendar.MONTH)>cal.get(Calendar.MONTH) && cal1.get(Calendar.DATE)>cal.get(Calendar.DATE))
        {
        	y=y-1;
        	m=m+12-1;
        	d=d+30;
         y =y-cal1.get(Calendar.YEAR);
		 m = m-cal1.get(Calendar.MONTH);
         d = d-cal1.get(Calendar.DATE);
        }
        else if(cal1.get(Calendar.MONTH)>cal.get(Calendar.MONTH)){
        	y=y-1;
        	m=m+12;
         y =y-cal1.get(Calendar.YEAR);
		 m = m-cal1.get(Calendar.MONTH);
         d = d-cal1.get(Calendar.DATE);
        }
        else if (cal1.get(Calendar.DATE)>cal.get(Calendar.DATE)) {
        	m=m-1;
        	d=d+30;
        	 y =y-cal1.get(Calendar.YEAR);
		 m = m-cal1.get(Calendar.MONTH);
         d = d-cal1.get(Calendar.DATE);
        }
        else
        {
        	 y =y-cal1.get(Calendar.YEAR);
		 m = m-cal1.get(Calendar.MONTH);
         d = d-cal1.get(Calendar.DATE);
        }
        
        System.out.println("Year: " + y);
        System.out.println("Month: " + m);
        System.out.println("Day: " + d);



    }
   }