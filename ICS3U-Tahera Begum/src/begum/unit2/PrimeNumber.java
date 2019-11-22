package begum.unit2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner
		Scanner sc = new Scanner(System.in);

		//user enters a number
		System.out.println("Enter a number.");
		int num = sc.nextInt();

		int div = 2;
		int quo;
		boolean prime = true;

		//
		while ( div < num )
		{

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







