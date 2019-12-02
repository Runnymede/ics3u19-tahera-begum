package begum.unit2;
/**
 * October 8, 2019
 * @author Tahera Begum
 * a Printing application that prompts the user for the number of copies 
 * to print and then displays the price per copy and the total price for the job.
 */
import java.util.Scanner;
public class StringThings {
	public static void main(String[] args) {



		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//asks the user to enter a word that is at least 7 characters long
		System.out.println("Enter a word that is at least 7 characters long.");
		
		//scans the word entered by the user
		String word = sc.nextLine();
		//displays the word
		System.out.println(word);

		//puts the word in upper case, declares the variable as upper
		String upper = word.toUpperCase();
		//displays the word in upper case
		System.out.println(upper);
		
		//puts the word in lower case, declares the variable as lower
		String lower = word.toLowerCase();
		//displays the word in lower case
		System.out.println(lower);
		
		//find the words length, declares the variable as length
		int length = word.length();
		//displays the word's length
		System.out.println(length);

		//finds the word's character at index 6, declares the variable as character
		char character = word.charAt(6);
		//displays the word's character at index 6
		System.out.println(character);

		//tells the user to enter which index to find the character
		System.out.println("Enter which index to find the character.");
		//declares the index number entered by user as index
		int index = sc.nextInt();
		//finds the word's character at preferred index by the user, declares the variable as preferred
		char  preferred = word.charAt(index);
		//displays the word's character at user's preferred index
		System.out.println(preferred);




		//asks the user for the first word
		System.out.println("Enter your first word.");
		//scans user's first word, declares it as word1
		String word1 = sc.next();

		//asks the user for the second word
		System.out.println("Enter your second word.");
		//scans user's second word, declares it as word2
		String word2 = sc.next();

		//compares first word and second to see if they're equal
		if (word1.equals(word2))
		{
			//if first word and second is the same, tells the user it is the same
			System.out.println(word1 + " is the same as "+ word2);
		}
		else
		{
			//if first word and second is not the same, tells the user it is not the same
			System.out.println(word1 + " is not the same as "+ word2);
		}

		//displays if fist word comes before, after, or if it is the same as the second word 
		if (word1.compareTo(word2)<0)
		{
			//says if word one comes before the second
			System.out.println(word1 + " comes before "+ word2);
		}
		else if (word1.compareTo(word2)>0)
		{
			//says if word two comes before one
			System.out.println(word1 + " comes after "+ word2);
		}
		else
		{
			//says if word one and second is the same
			System.out.println(word1 + " is the same as "+ word2);
		}




		//the correct username 
		String username = "cake";
		
		//the correct password
		String password = "icecream";
		
		//user enters the username
		System.out.println("Enter username.");
		//scans the username entered by user, declares the variable as theirusername
		String theirusername = sc.next();
		
		//user enters the password
		System.out.println("Enter password.");
		//scans the password entered by user, declares the variable as theirpassword
		String theirpassword = sc.next();

		//compares the correct username and password to see if they're equal to what the user entered
		if (username.equals(theirusername) && password.equals(theirpassword))
		{
			//if it's equal then it displays "welcome"
			System.out.println("Welcome.");
		}
		else
		{
			//if it's not equal then it says that it's incorrect and that they should try again
			System.out.println("Your password or username is incorrect! Please try again.");
		}

		//closes scanner
		sc.close();
	}

}

