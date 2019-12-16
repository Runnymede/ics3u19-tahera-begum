package begum.unit3;
/**
 * November 24, 2019
 * prints the list of names entered by the user in order it was originally entered in and in reverse
 * @author Tahera Begum
 */
import java.util.Scanner;
public class NamesArray {

	public static void main(String[] args) {

		//Scanner
		Scanner sc = new Scanner(System.in);

		//asks the user for a list of names
		System.out.println("Enter the number of names you would like in your list.");
		
		//scans the number entered by the user and declares it as num
		int num = sc.nextInt();
		
		//an array for the list of names that will be entered by the user
		String [] names = new String [num];
		
		//tells the user to enter the names one by one
		System.out.println("Enter the names one by one");
		
		//loops the number of times the number of names
		for (int i = 0; i < num; i++)
		{
			//scans the name puts it in the array
			names [i] = sc.next();
			 	
		}
		
		//loops the number of times the number of names
		for (int i = 0; i < num; i++)
		{
			//displays the the list of names in order
			System.out.println(names [i]);
			
		}
		
		//loops the number of times the number of names
		for (int i = num - 1; i >= 0; i--)
		{
			//displays the the list of names in reverse order
			System.out.println(names [i]);
			
		}
		//closes scanner
		sc.close();
		

	}

}
