package Start;
import java.util.Random;

public class RollAdie {

	 public static void main( String args[] ) {
	      Random rand = new Random(); 
	      int int_random = rand.nextInt(7)+1; 	      
	      System.out.println("DIE ROLLED: "+int_random);
	 }
}
