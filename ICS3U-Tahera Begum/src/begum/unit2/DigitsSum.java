package begum.unit2;
/**
 * November 1, 2019
 * application that prompts the user for a non-negative integer and 
 * then displays the sum of the digits.
 * @author Tahera Begum
 */


import java.util.Scanner;

public class DigitsSum {

	public static void main(String[] args) {
		

		//scanner
		Scanner sc = new Scanner(System.in);
		
		//asks the user for a 3-digit, non-negative integer
		System.out.println("Enter a 3-digit, non-negative integer");
		
		//scans the 3 digit number entered by user
		int integer = sc.nextInt();

		//variables
		int mod = 1000;
		int div = 100;
		int number;
		int counter = 0;
		int sum = 0;

		//loops until displays the sum of all 3 digits
		do
		{
			//finds the value of the digit
			number = integer % mod / div;
			
			//changes the value of mod and div to find the value of the next digit
			mod = mod / 10;
			div = div / 10;
			
			//adds one to the counter each time it goes through the loop
			counter = counter + 1;
			
			//adds all the digits together
			sum = sum + number;
		
		//stops repeating after counter equals 3
		} while ( counter < 3  );
		
		//displays the sum of the digits
		System.out.println("The sum of the digits is: " + sum);

		sc.close();
	}


}


