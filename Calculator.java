package Start;
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args)
	{           
				double num1, num2;
				Scanner sc = new Scanner(System.in);
				System.out.println("Please Enter the question as: a_operator_b");
				num1 = sc.nextDouble();
				char op = sc.next().charAt(0);
				num2 = sc.nextDouble();
				double o = 0;
				switch (op) {
				case '+':

					o = num1 + num2;

					break;

				case '-':

					o = num1 - num2;

					break;

				case '*':

					o = num1 * num2;

					break;

				case '/':

					o = num1 / num2;

					break;

				default:

					System.out.println("Please check your Input");

					break;
				}

				System.out.println("Result: "+o);

		}


}
