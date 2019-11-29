package begum.unit2;
/**
 * November 07, 2019
 * this program continues to add the 2 one's digits until 
 * returns to the numbers entered by user.
 * @author Tahera Begum
 */

import java.util.Scanner;

public class NecklaceProblem {

	public static void main(String[] args) {

		//Scanner
		Scanner sc = new Scanner(System.in);

		//asks the user for first single digit number
		System.out.println("Enter a single digit number");
		
		//scans the first number entered by user
		int input1 = sc.nextInt();

		//asks the user for second single digit number
		System.out.println("Enter another single digit number");
		
		//scans the second number entered by user
		int input2 = sc.nextInt();

		//variables
		int num1 = input1;
		int num2 = input2;
		int num3;

		//loops until returns to the same 2 numbers entered by the user
		do
		{
			
			//adds the 2 numbers entered by the user and find the one's digit
			num3 = ( num1 + num2 ) % 10;
			
			//displays the third number
			System.out.println(num3);
			
			//the first number becomes the second number
			num1 = num2;
			
			//the second number becomes the third number
			num2 = num3;

		//stops the loop when returns to the same 2 numbers entered by the user
		}while ( num1 != input1 || num2 != input2 );
		
		//closes scanner
		sc.close();
	}

}
