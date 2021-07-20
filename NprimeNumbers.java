package Start;
import java.io.*;
import java.util.Scanner;

public class NprimeNumbers  {

	public static void main(String[] args) {
		int i,j,n;
		int flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number upto which prime number are to be printed:");
		n= sc.nextInt();
		System.out.println( "Printing Prime Numbers upto " +n);
		for(i=1;i<=n;i++)
		{
		   flag=1;
		   for(j=2;j<=(i/2);++j)
			{
			     if(i%j==0)
			      {  flag=0;
			    	  break;
			      }
			 }
		    if(flag==1)
			System.out.println(i);
		}
	}
}


