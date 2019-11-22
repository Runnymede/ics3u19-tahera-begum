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

		Scanner sc = new Scanner(System.in);


		//randomly generating two numbers
		int firstNumber = (int) (Math.random() * 10 + 1);
		int secondNumber = (int) (Math.random() * 10 + 1);

		//randomly generating operator
		int operator = (int) (Math.random() * 4 + 1);

		//assigns operator to the numbers
		if (operator==1)
		{
			//displays an addition expression
			System.out.println( "What is " + firstNumber + "+" + secondNumber + "?" );
			int addition = sc.nextInt();


			//checks to see if the user's answer is correct
			int correctAddition = firstNumber + secondNumber;
			if (addition == correctAddition)
			{
				System.out.println( "Correct!" );
			}
			else
			{
				System.out.println( "Wrong!" );
			}
		}
		else if (operator==2)
		{
			//displays an subtraction expression
			System.out.println("What is " + firstNumber + "-" + secondNumber + "?");
			int subtraction = sc.nextInt();


			//checks to see if the user's answer is correct
			int correctSubtraction = firstNumber - secondNumber;
			if (subtraction == correctSubtraction)
			{
				System.out.println( "Correct!" );
			}
			else
			{
				System.out.println( "Wrong!" );
			}
		}
		else if (operator==3)
		{

			//displays an multiplication expression
			System.out.println("What is " + firstNumber + "*" + secondNumber + "?");
			int multiplication = sc.nextInt();


			//checks to see if the user's answer is correct
			int correctMultiplication = firstNumber * secondNumber;
			if (multiplication == correctMultiplication)
			{
				System.out.println( "Correct!" );
			}
			else
			{
				System.out.println( "Wrong!" );
			}
		}
		else 
		{
			//displays an division expression
			System.out.println("What is " + firstNumber + "/" + secondNumber + "?");
			double division = sc.nextDouble();


			//checks to see if the user's answer is correct
			double correctDivision = firstNumber / secondNumber;
			if (division == correctDivision)
			{
				System.out.println( "Correct!" );
			}
			else
			{
				System.out.println( "Wrong!" );
			}
		}

		sc.close();
	}

}
