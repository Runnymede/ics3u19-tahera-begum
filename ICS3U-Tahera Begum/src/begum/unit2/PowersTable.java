package begum.unit2;
/**
 * November 11, 2019
 * displays a table of powers
 * @author Tahera Begum
 */
import java.util.Scanner;
public class PowersTable {

	public static void main(String[] args) {
		
		System.out.format("%-5s %-5s %-5s %-5s %-1s", "x^1", "x^2", "x^3", "x^4", "x^5\n");
		
		for (int x = 1; x < 7; x++)
		{
			System.out.format("%-5s %-5s %-5s %-5s %-1s\n", x, (int)Math.pow(x,2), (int)Math.pow(x,3), 
					(int)Math.pow(x,4), (int)Math.pow(x,5));
		}
		
		
		
		
		
		//Bonus:the user enter the two values, 
		//one for the highest exponent for the table 
		//and one for the highest base of the table.
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.format("Enter highest exponent for the table ");
		
		//names the highest exponent, expo
		int expo = sc.nextInt();
		
		System.out.format("Enter highest base for the table ");
		
		//names the highest base, base
		int base = sc.nextInt();
		
		//
		for (int h = 1; h <= expo; h++)
		{
			System.out.format("%-8s", "x^" + h);
		}
        
		System.out.println();
        
		for (int b = 1; b <= base; b++)
		{ 
			
			for (int e = 1; e <= expo; e++)
			{
				
				System.out.format("%-8s", (int)Math.pow(b,e));
				
				
	
			}
			System.out.println();
		
		}
		
		sc.close();

	}

}
