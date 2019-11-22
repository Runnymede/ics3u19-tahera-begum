package begum.unit2;
/**
 * 
 * October 22, 2019
 * a number guessing game played between the computer and one player
 * @author Tahera Begum
 */
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {


		//Scanner
		Scanner sc = new Scanner(System.in);

		//player guesses a number
		System.out.println("Guess a number between 1 and 20:");
		
		////scans the number guessed by user
		int guessedNumber = sc.nextInt();

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
		sc.close();
	}

}
