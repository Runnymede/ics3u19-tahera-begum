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

		//divides the number entered by the user by every number from 2 to the number entered by user
		while ( div < num )
		{
			//divides the number by every number from 2 to the number entered by user, then finds the modulus
			quo = num % div;

			//adds one to the divisor each time it goes through the loop
			div = div + 1;

			//if the modulus of the number entered by user divided by the divisor is 0, then it breaks the loop
			if (quo == 0)
			{
				//labels prime as false
				prime = false;
				break;
			}

		} 

		//if prime was labeled as false 
		if (!prime)
		{
			//then it tells the user the number is not prime
			System.out.println("Not prime.");
		}
		//if prime was not labeled as false
		else
		{
			//then it tells the user the number is prime
			System.out.println("Prime.");
		}


		//closes scanner
		sc.close();
	}

}







