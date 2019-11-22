package begum.unit2;


/**
 * October 8, 2019
 * @author Tahera Begum
 * a Printing application that prompts the user for the number of copies 
 * to print and then displays the price per copy and the total price for the job.
 * 
 * 
 */
import java.util.Scanner;
public class StringThings {
	public static void main(String[] args) {



		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//scans the word entered by the user
		System.out.println("Enter a word that is at least 7 characters long.");
		String word = sc.nextLine();
		
		//displays the word
		System.out.println(word);

		//displays the word in upper case
		String upper = word.toUpperCase();
		System.out.println(upper);
		
		//displays the word in lower case
		String lower = word.toLowerCase();
		System.out.println(lower);
		
		//displays the word's length
		int length = word.length();
		System.out.println(length);

		//displays the word's character at index 6
		char character = word.charAt(6);
		System.out.println(character);

		//displays the word's character at user's preferred index
		System.out.println("enter which index to print the character");
		int index = sc.nextInt();
		char  secondcharacter = word.charAt(index);
		System.out.println(secondcharacter);




		//scans user's first word
		System.out.println("Enter your first word.");
		String wordone = sc.next();

		//scans user's second word
		System.out.println("Enter your second word.");
		String wordtwo = sc.next();

		//compares first word and second to see if they're equal
		if (wordone.equals(wordtwo))
		{
			System.out.println(wordone + " is the same as "+ wordtwo);
		}
		else
		{
			System.out.println(wordone + " is not the same as "+ wordtwo);
		}

		//displays if fist word comes before, after, or if it is the 
		//same as the second word 
		if (wordone.compareTo(wordtwo)<0)
		{
			System.out.println(wordone + " comes before "+ wordtwo);
		}
		else if (wordone.compareTo(wordtwo)>0)
		{
			System.out.println(wordone + " comes after "+ wordtwo);
		}
		else
		{
			System.out.println(wordone + " is the same as "+ wordtwo);
		}




		//username and password for my program 
		String username = "cake";
		String password = "icecream";
		
		//user enters the username
		System.out.println("Enter username.");
		String theirusername = sc.next();
		
		//user enters the password
		System.out.println("Enter password.");
		String theirpassword = sc.next();

		//compares username and password to see if they're equal to what the user entered
		if (username.equals(theirusername) && password.equals(theirpassword))
		{
			System.out.println("Welcome.");
		}
		else
		{
			System.out.println("Your password or username is incorrect! Please try again.");
		}

		sc.close();
	}

}

