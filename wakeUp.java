package Start;
import java.util.*;
import internet.*;


class greeting{
	protected String name;
	 greeting() {
		name="";
	}
	 void greet() {
		 System.out.println("Hello there!");
			System.out.println("I am your beta virtual assistant,Siri");
	 }
	void sayhello() {
		System.out.println("I hope you are doing well.");
		System.out.println("Please tell me your name ");
	}
	void askforname() {
		this.sayhello();
	}
}
class askname extends greeting{
	Scanner sc= new Scanner(System.in);
	askname(){
		super();
		name=sc.nextLine();
		System.out.println("Nice to meet you "+name+".");
	}
}

public class wakeUp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String check="Hey Siri";
		String c=sc.nextLine();
	    String choice;
	    String getch;
		char w='t';
		if(check.equalsIgnoreCase(c))
		{
			greeting g= new greeting();
			g.greet();
			g.askforname();
			askname a= new askname();
			
			System.out.println("Here's a list of things I can do for now:");
			
			System.out.println("Tell me, what can I do for you?(Press the number corresponding to the task)");
			while(w=='t') {
				System.out.println("\n1: open calculator\n2: Print Date and Time from watch\n"
						+ "3: Roll a fair die\n4: Convert Fahrenheit to Celcius"
						+ "\n5: Print 'N' prime numbers\n6: Check Palindrome\n"
						+ "7: Your SiriHome device status\n8: Open YouTube\n"
						+ "9: Contact Developers\n" 
						+ "E: to exit siri");
			
			choice=sc.nextLine();
			switch(choice)
			{
			case "1": 				    
				     Calculator.main(args);
				     getch=sc.nextLine();
			         break;
			case "2": 
			         dateandtimeFROMapplewatch.main(args);
			         getch=sc.nextLine();
			         break;
			case "3": 
			         RollAdie.main(args);
			         getch=sc.nextLine();
			         break;
			case "4": 
			         FtoC.main(args);
			         getch=sc.nextLine();
			         break;
			case "5": 
			         NprimeNumbers.main(args);
			         getch=sc.nextLine();
			         break;
			case "6":  
			         Palindrome.main(args);
			         getch=sc.nextLine();
			         break;
			case "7":sirihome.main(args);
					 getch=sc.nextLine();
			         break;
			case "8": linkopen.main(args);
			          getch=sc.nextLine();
			          break;		             
			case "9": 
				      serviceContact.main(args);
			          getch=sc.nextLine();
			          break;
			case "e":
				      System.out.println("See you Soon, Bye");
			          w='f';
			          getch=sc.nextLine();
			          break;
			case "E":
				      System.out.println("See you Soon, Bye");
	                  w='f';
	                  getch=sc.nextLine();
	                  break;
			
		    default: System.out.println("Not a valid choice");
			
			}
		  }
		}
		else
			System.out.println("Sorry, I couldn't hear you.");
		

	}

}
