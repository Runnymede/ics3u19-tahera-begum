package begum.unit3;
/**
 * November 25, 2019
 * plays a animal guessing game with the the user
 * @author Tahera Begum
 */
import java.util.Scanner;
public class GuessingAnimals {

	public static void main(String[] args) {

		//an array of 20 different animals
		String [] animals = {"fish", "dolphine", "elephant", "dog", "rat", "cat", "frog", "snake", "giraffe", 
				"racoon", "duck", "turkey", "chicken", "bear", "cow", "gease", "sheep", "rabit", "pigs", "lion"};

		//Scanner
		Scanner sc = new Scanner(System.in);

		//tells the player to think of an animal and that it will try to guess what it is 
		System.out.println("Hi. Let's play a game! Think of an animal and I'll try to guess it. Give me 20 tries.");


		//loops 20 times
		for (int i=0; i<20; i++)
		{
			//computer generates random number
			int num = (int) (Math.random() * 19);
			
			//the variable chosen equals an animal with the index of the random number
			String chosen = animals[num];
			
			//asks if chosen (the animal with the index of the random number) is the animal they thought of
			System.out.println("Is it a " + chosen + "? Yes or no?");
			
			//scans there answer, declares the variable as answer
			String answer = sc.next();
			
			//if the players answer is yes
			if (answer.equalsIgnoreCase("Yes"))
			{
				//then it tells the player it won
				System.out.println("I won!");
				
				//then breaks out of the loop and ends the game
				break;
			}
		}

		//closes scanner
		sc.close();


	}

}
