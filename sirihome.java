package Start;
import java.io.*;
import java.util.Scanner;


class SmartHome
{
	void Battery()
	{
		System.out.println("Home inverter battery charged");
	}
}

class LivingRoom extends SmartHome
{  LivingRoom(){
	System.out.println("From Living-Room");
}
	void Battery()
	
	{ 
		System.out.println("TV status: Online");
	}
}

class WorkRoom extends SmartHome
{   WorkRoom(){
	System.out.println("From Work-Room");
}
	void Battery()
	{
		System.out.println("Mackbook battery is charged");
	}
	void Battery(int amt)
	{
		System.out.println("Macbook battery should last for "+amt +" hours ");
	}
}

public class sirihome extends WorkRoom {

	public static void main(String[] args) {
		System.out.println("Macbook or Apple TV?");
		String ch;
		Scanner sc = new Scanner(System.in);
		ch= sc.nextLine();
		if(ch.equalsIgnoreCase("Mackbook"))
		{WorkRoom obj= new WorkRoom();
		obj.Battery();
        obj.Battery(4);
		}
		else if(ch.equalsIgnoreCase("tv")||ch.equalsIgnoreCase("Apple tv"))
		{
			 LivingRoom ob=new LivingRoom();
			 ob.Battery();
	    }
		else {
			System.out.println("Device Not found");
		}
}
}
