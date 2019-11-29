package begum.unit3;

import java.util.Scanner;
public class GuessingAnimals {

	public static void main(String[] args) {

		String [] animals = {"fish", "dolphine", "elephant", "dog", "rat", "cat", "frog", "snake", "giraffe", 
				"racoon", "duck", "turkey", "chicken", "bear", "cow", "gease", "sheep", "rabit", "pigs", "lion"};

		//Scanner
		Scanner sc = new Scanner(System.in);

		//player guesses a number
		System.out.println("Hi. Let's play a game! Geuss the animal I'm thinking of.");

		////scans the number guessed by user
		String guess = sc.next();

		//computer generates random number
		int num = (int) (Math.random() * 19);

		for (int i=0; i<20; i++)
		if (num==i)
		{
			System.out.println(animals[i]);
		}



		sc.close();


	}

}
