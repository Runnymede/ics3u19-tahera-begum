package begum.unit2;
/**
 * October 15, 2019
 * @author Tahera Begum
 * application that prompts the user for the weight of a package and its dimensions.
 */
import java.util.Scanner;
public class PackageCheck {

	public static void main(String[] args) {

		//scanner
		Scanner sc = new Scanner(System.in);
		
		//asks the user for the package weight in kilograms
		System.out.println("Enter the package weight in kilograms.");
		
		//scans the weight entered by user
		int weight = sc.nextInt();
		
		//asks the user for package length in centimeters
		System.out.println("Enter package length in centimeters.");
		
		//scans the length entered by user
		int length = sc.nextInt();
		
		//asks the user for package width in centimeters
		System.out.println("Enter package width in centimeters.");
		
		//scans width entered by user
		int width = sc.nextInt();
		
		//asks the user for package height in centimeters
		System.out.println("Enter package height in centimeters.");
		
		//scans height entered by user
		int height = sc.nextInt();

		//variable
		double volume;
		
		//calculates the volume
		volume = length*width*height;

		//checks to see if  package is accepted
		if (weight < 28 && volume < 100001)
		{
			//tells the user that their package is accepted
			System.out.println("Accepted");
		}
		//checks to see if  package is too heavy
		else if (weight > 27 && volume < 100001)
		{
			//tells the user that their package is too heavy
			System.out.println("Too heavy");
		}
		//checks to see if  package is too large
		else if (weight < 28 && volume > 100000)
		{
			//tells the user that their package is too large
			System.out.println("Too large");
		}
		//checks to see if  package is too heavy and too large
		else 
		{
			//tells the user that their package is too heavy and too large
			System.out.println("Too heavy and too large");
		}

		//closes the scanner
		sc.close();
	}

}
