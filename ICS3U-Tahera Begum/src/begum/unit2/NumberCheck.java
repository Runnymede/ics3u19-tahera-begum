package begum.unit2;
/**
 * October 2, 2019
 * @author Tahera Begum
 * Checks if number is positive or negative and if it's divisible by 7 or not.
 */
import java.util.Scanner;
public class NumberCheck {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer.");
		int integer = sc.nextInt();

		//determines if integer is negative or positive
		if (integer < 0)
		{
			System.out.println("Your integer is negative.");
		}
		else
		{
			System.out.println("Your integer is positive.");
		}
		int remainder;
		remainder = integer%7;

		//determines if integer is divisible by 7 or not
		if ( remainder== 0)
		{
			System.out.println("Your integer is divisible by 7.");
		}
		else
		{
			System.out.println("Your integer is not divisible by 7.");
		}

		sc.close();
	}

}
