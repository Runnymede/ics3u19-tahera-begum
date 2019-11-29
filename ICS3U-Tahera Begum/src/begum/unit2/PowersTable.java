package begum.unit2;
/**
 * November 11, 2019
 * displays a table of powers
 * @author Tahera Begum
 */
import java.util.Scanner;
public class PowersTable {

	public static void main(String[] args) {
		
		//displays the header
		System.out.format("%-5s %-5s %-5s %-5s %-1s", "x^1", "x^2", "x^3", "x^4", "x^5\n");
		
		//loops the program 6 times
		for (int x = 1; x < 7; x++)
		{
			//displays the table of powers up to base 6 and exponent 5
			System.out.format("%-5s %-5s %-5s %-5s %-1s\n", x, (int)Math.pow(x,2), (int)Math.pow(x,3), 
					(int)Math.pow(x,4), (int)Math.pow(x,5));
		}
		
		
		
		
		//Bonus:the user enters the two values, 
		//one for the highest exponent for the table 
		//and one for the highest base of the table.
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//asks the user for highest exponent
		System.out.println("Enter highest exponent for the table ");
		
		//names the highest exponent, expo
		int expo = sc.nextInt();
		
		//asks the user for highest base
		System.out.println("Enter highest base for the table ");
		
		//names the highest base, base
		int base = sc.nextInt();
		
		//loops until displays the header up to the highest exponent
		for (int h = 1; h <= expo; h++)
		{
			//displays the header up to the highest exponent
			System.out.format("%-8s", "x^" + h);
		}
        
		//prints a line
		System.out.println();
        
		//loops until displays the powers table up to the highest base
		for (int b = 1; b <= base; b++)
		{ 
			//loops until displays the powers table up to the highest exponent
			for (int e = 1; e <= expo; e++)
			{
				//displays the powers table 
				System.out.format("%-8s", (int)Math.pow(b,e));
			}
			
			//prints a line
			System.out.println();
		
		}
		
		sc.close();

	}

}
