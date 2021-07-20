package applewatchsiri;

import java.text.SimpleDateFormat;  
import java.util.Date;  

public class DateAndTime {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println("Prinitng Date and Time:");
	    System.out.println((formatter.format(date)));
	     
	    

	}
}
