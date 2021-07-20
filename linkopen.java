package internet;

import java.awt.Desktop;
import java.net.URL;
import java.util.Scanner;

class NewThread {
	Thread t;
	NewThread()
	{
		t=new Thread("Dummy");
		System.out.println("Redirecting");
		t.start();
	}
	public void run(NewThread N) {
		Desktop d= Desktop.getDesktop();
		try {
			Thread.sleep(1000);
		}
	   catch(InterruptedException e) {
		   Thread.currentThread().interrupt();
	   }
	
 }
}
public class linkopen {
	public static void main(String[] args) {
        try{
            
            Desktop.getDesktop().browse(new URL("https://www.youtube.com/").toURI());
        }
        catch(Exception E){
            System.err.println("Exp : "+E.getMessage());
        }
        
    }
}
