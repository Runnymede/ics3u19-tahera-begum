package begum.unit4;

import java.util.Scanner;

public class MathPlus {

	public static void main(String[] args) {

		//Scanner
		Scanner sc = new Scanner(System.in);

		//asks the user for a list of integers
		System.out.println("Enter the number of integers you would like in your list.");

		//scans the number entered by the user and declares it as num
		int num = sc.nextInt();

		//an array for the list of integers that will be entered by the user
		String [] integers = new String [num];

		//tells the user to enter the integers one by one
		System.out.println("Enter the integers one by one");

		//loops the number of times the number of integers
		for (int i = 0; i < num; i++)
		{
			//scans the name puts it in the array
			integers [i] = sc.next();

		}
		min(String [] integers);

	}

	public static int min(String [] integers) {

		System.out.println("");
	}
}
