package begum.unit2;
/**
 * October 28, 2019
 * a number guessing game played between the computer and one player, 
 * but modified to allow the user to guess as many times as is necessary 
 * to guess the secret number
 * @author Tahera Begum
 * 
 */
import java.util.Scanner;
public class GuessingGame2 {

	public static void main(String[] args) {


		//Scanner
		Scanner sc = new Scanner(System.in);

		//player guesses a number
		System.out.println("Guess a number between 1 and 20:");
		int guessedNumber = sc.nextInt();

		//loop to make it repeat the guessing game
		while (guessedNumber > 0)
		{

			//computer generates random number
			int computerNumber = (int) (Math.random() * 20 + 1);

			//displays computer's number
			System.out.println("Computer's Number: "  + computerNumber);

			//displays player's number
			System.out.println("Player's Number: " + guessedNumber);

			//checks if player's number and computer's number is the same
			if (guessedNumber == computerNumber)
			{
				//if the players number matches the computer then the computer says the player won
				System.out.println("You won!");
			}
			else
			{
				//if the players number doesn't match the computer then the computer says the player lost
				System.out.println("Didn't match. Better luck next time.");
			}

			//changing the value of the variable before looping back
			System.out.println("Guess another number between 1 and 20:");
			guessedNumber = sc.nextInt();
		}
		sc.close();
	}

}
