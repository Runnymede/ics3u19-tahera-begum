package begum.unit4;

import java.util.Scanner;

public class MathPlus {

	public static void main(String[] args) {
		
		//Scanner
		Scanner sc = new Scanner(System.in);

		//asks the user for a list of names
		System.out.println("Enter the number of integers you would like in your list.");

		//scans the number entered by the user and declares it as num
		int num = sc.nextInt();

		//an array for the list of names that will be entered by the user
		String [] integers = new String [num];

		//tells the user to enter the names one by one
		System.out.println("Enter the integers one by one");

		//loops the number of times the number of names
		for (int i = 0; i < num; i++)
		{
			//scans the name puts it in the array
			integers [i] = sc.next();

		}
		
		public static int min() {
			
			System.out.println("");
		}

	}

}
