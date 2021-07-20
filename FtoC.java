package Start;
import java.io.*;
import java.util.Scanner;
interface ferntocelci
{
	void convert();
}
class converter implements ferntocelci
{
    public void convert() {
	Scanner sc = new Scanner(System.in);
	double fer;
	fer= sc.nextDouble();
	float farenhiet=(float)fer;
	float celcius;
	celcius=(float)((farenhiet-32)*(0.5556));
	System.out.println(farenhiet+ " degree fahrenheit is " +celcius+" degree Celcius");
}
}
public class FtoC{
	public static void main(String[] args) {
		System.out.println("Please Enter temperature in fernhiet");
		converter ob= new converter();
		ob.convert();
	}

}
