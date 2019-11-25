package begum.unit3;

import java.util.Scanner;
public class NamesArray {

	public static void main(String[] args) {

		//Scanner
		Scanner sc = new Scanner(System.in);

		//asks the user for a list of names
		System.out.println("Enter the number of names you would like in your list.");
		
		int num = sc.nextInt();
		
		String [] names = new String [num];
		
		System.out.println("Enter the " + " names one by one");
		
		for (int i = 0; i < num; i++)
		{
			
			names [i] = sc.next();
			 	
		}
		
		for (int i = 0; i < num; i++)
		{
			
			System.out.println(names [i]);
			
		}
		
		
		for (int i = num - 1; i >= 0; i--)
		{
			
			System.out.println(names [i]);
			
		}
		sc.close();
		

	}

}
