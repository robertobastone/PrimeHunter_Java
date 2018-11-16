/*
 * author: Roberto Bastone
 */

import java.util.Scanner;

public class PrimeHunter_Java{


	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);             
		System.out.println("Welcome to the prime Hunter");
		System.out.print("Type an integer, the hunter will tell whether it is a prime number: ");

		int div = 2;
		int num = scan.nextInt();
		while (num % div != 0)
		{
			++div;
		}
		if ( num == div)
		{
			System.out.print("The Hunter says that "+ num+  " is prime");
		}
		else 
		{
			System.out.print("The Hunter says that "+ (div) + " is the divisor of " + num);
		}
		scan.close();
	}
}
