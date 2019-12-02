package begum.unit3;

import java.util.Scanner;
public class GuessingAnimals {

	public static void main(String[] args) {

		String [] animals = {"fish", "dolphine", "elephant", "dog", "rat", "cat", "frog", "snake", "giraffe", 
				"racoon", "duck", "turkey", "chicken", "bear", "cow", "gease", "sheep", "rabit", "pigs", "lion"};

		//Scanner
		Scanner sc = new Scanner(System.in);

		//player guesses a number
		System.out.println("Hi. Let's play a game! Think of an animal and I'll try to guess it.");



		for (int i=0; i<20; i++)
		{
			//computer generates random number
			int num = (int) (Math.random() * 19);
			
			String chosen = animals[num];
			System.out.println("Is it a " + chosen + "? Yes or no?");
			String answer = sc.next();
			if (answer.equalsIgnoreCase("Yes"))
			{
				System.out.println("I won!");
				break;
			}
		}




		sc.close();


	}

}
