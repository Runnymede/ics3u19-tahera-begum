package begum.unit2;
/**
 * October 4, 2019
 * checks to see if the number enter by the user is prime
 * @author Tahera Begum
 */

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		

		//Scanner
		Scanner sc = new Scanner(System.in);

		//tells the user to enter a number
		System.out.println("Enter a number.");
		
		//scans the number entered by the user
		int num = sc.nextInt();

		//variables
		int div = 2;
		int quo;
		boolean prime = true;

		//divides the number entered by the user by every number from 2 to the actual number
		while ( div < num )
		{
			//
			quo = num % div;
			div = div + 1;
			if (quo == 0)
			{
				prime = false;
				break;
			}

		} 

		if (!prime)
		{
			System.out.println("Not prime.");
		}
		else
		{
			System.out.println("Prime.");
		}


		
		sc.close();
	}

}







