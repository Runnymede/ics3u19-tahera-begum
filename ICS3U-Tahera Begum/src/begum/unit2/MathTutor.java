package begum.unit2;
/**
 * October 24, 2019
 * an application that displays math problems by randomly generating two numbers, 
 * 1 through 10, and randomly generating an operator (+, -, *, /), and then 
 * prompts the user for an answer.
 * @author Tahera Begum
 */
import java.util.Scanner;
public class MathTutor {

	public static void main(String[] args) {

		//scanner
		Scanner sc = new Scanner(System.in);

		//randomly generating two numbers from 1 to 10
		int firstNumber = (int) (Math.random() * 10 + 1);
		int secondNumber = (int) (Math.random() * 10 + 1);

		//randomly generating a number from 1 to 4
		int operator = (int) (Math.random() * 4 + 1);

		//assigns operator to number 1
		if (operator==1)
		{
			//displays an addition expression
			System.out.println( "What is " + firstNumber + "+" + secondNumber + "?" );
			
			//user enters their answer
			int addition = sc.nextInt();

			//adds first number and second number
			int correctAddition = firstNumber + secondNumber;
			
			//checks to see if the user's answer equals the computer's answer
			if (addition == correctAddition)
			{
				//displays "correct" if user's answer equals the computer's answer
				System.out.println( "Correct!" );
			}
			else
			{
				//displays "wrong" if user's answer doesn't equal the computer's answer
				System.out.println( "Wrong!" );
			}
		}
		//assigns operator to number 2
		else if (operator==2)
		{
			//displays an subtraction expression
			System.out.println("What is " + firstNumber + "-" + secondNumber + "?");
			
			//user enters their answer
			int subtraction = sc.nextInt();

			//subtracts first number and second number
			int correctSubtraction = firstNumber - secondNumber;
			
			//checks to see if the user's answer equals the computer's answer
			if (subtraction == correctSubtraction)
			{
				//displays "correct" if user's answer equals the computer's answer
				System.out.println( "Correct!" );
			}
			else
			{
				//displays "wrong" if user's answer doesn't equal the computer's answer
				System.out.println( "Wrong!" );
			}
		}
		//assigns operator to number 3
		else if (operator==3)
		{

			//displays a multiplication expression
			System.out.println("What is " + firstNumber + "*" + secondNumber + "?");
			
			//user enters their answer
			int multiplication = sc.nextInt();


			//multiplies first number and second number
			int correctMultiplication = firstNumber * secondNumber;
			
			//checks to see if the user's answer equals the computer's answer
			if (multiplication == correctMultiplication)
			{
				//displays "correct" if user's answer equals the computer's answer
				System.out.println( "Correct!" );
			}
			else
			{
				//displays "wrong" if user's answer doesn't equal the computer's answer
				System.out.println( "Wrong!" );
			}
		}
		//assigns operator to number the remaining number (4)
		else 
		{
			//displays a division expression
			System.out.println("What is " + firstNumber + "/" + secondNumber + "?");
			
			//user enters their answer
			double division = sc.nextDouble();

			//divides first number and second number
			double correctDivision = firstNumber / secondNumber;
			
			//checks to see if the user's answer equals the computer's answer
			if (division == correctDivision)
			{
				//displays "correct" if user's answer equals the computer's answer
				System.out.println( "Correct!" );
			}
			else
			{
				//displays "wrong" if user's answer doesn't equal the computer's answer
				System.out.println( "Wrong!" );
			}
		}

		sc.close();
	}

}
