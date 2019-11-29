package begum.unit2;
/**
 * October 2, 2019
 * @author Tahera Begum
 * Checks if number is positive or negative and if it's divisible by 7 or not.
 */
import java.util.Scanner;
public class NumberCheck {

	public static void main(String[] args) {


		//scanner
		Scanner sc = new Scanner(System.in);
		
		//asks the user to enter an integer
		System.out.println("Enter an integer.");
		
		//scans the integer entered by user
		int integer = sc.nextInt();

		//determines if integer is negative or positive
		//if less than 0 then it's negative
		if (integer < 0)
		{
			//tells the user it's integer is negative
			System.out.println("Your integer is negative.");
		}
		//if not less than 0 then it's not negative
		else
		{
			//tells the user it's integer is positive
			System.out.println("Your integer is positive.");
		}
		
		//variable 
		int remainder;
		
		//finds the remainder of the integer after it's divided by 7
		remainder = integer%7;

		//determines if integer is divisible by 7 or not
		//if the remainder is 0 than it is divisible by 7
		if ( remainder== 0)
		{
			//tells the user that their integer is divisible by 7
			System.out.println("Your integer is divisible by 7.");
		}
		//if the remainder is not 0 than it is not divisible by 7
		else
		{
			//tells the user that their integer is not divisible by 7
			System.out.println("Your integer is not divisible by 7.");
		}

		//closes scanner
		sc.close();
	}

}
