package begum.unit2;
/**
 * November 18, 2019
 * prompts the user for a string and then dispalys a count of the number of vowel in the string
 * @author Tahera Begum
 */

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {

		//scans the time entered by user
		Scanner sc = new Scanner(System.in);
		
		//tells the user to enter a word
		System.out.println("Enter a word.");
		
		//names the word variable, word
		String word = sc.nextLine();

		//finds the length of the word
		int length = word.length();
		
		//variable index starts at zero
		int index = 0;

		//variable counter starts at zero
		int counter = 0;
		
		//the loop repeats until it reaches the length of the string
		for (int h = 0; h < length; h++)
		{
			
			//finds the char at each index
			char character = word.charAt(index);
			
			//checks if the char is a vowel (a, o, u, e, i)
			if (String.valueOf(character).equalsIgnoreCase("a") 
					|| String.valueOf(character).equalsIgnoreCase("o") 
					|| String.valueOf(character).equalsIgnoreCase("u") 
					|| String.valueOf(character).equalsIgnoreCase("e") 
					|| String.valueOf(character).equalsIgnoreCase("i"))
			{
				//if the char is a vowel it adds one to the counter
				counter++;
			}
			
			//at the end of each loop it adds one to the index 
			//so it changes which index we're trying to find the char at
			index++;
		}
		
		//checks if counter equals one
		if (counter==1)
		{
			//displays in singular form
			System.out.println("There is " + counter + " vowel.");
		}
		else
		{
			//displays in plural form
			System.out.println("There are " + counter + " vowels.");
		}
		
		sc.close();

	}

}
