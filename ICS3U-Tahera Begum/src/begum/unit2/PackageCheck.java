package begum.unit2;
/**
 * October 15, 2019
 * @author Tahera Begum
 * application that prompts the user for the weight of a package and its dimensions.
 */
import java.util.Scanner;
public class PackageCheck {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		//scans the weight entered by user
		System.out.println("Enter the package weight in kilograms.");
		int weight = sc.nextInt();
		
		//scans the length entered by user
		System.out.println("Enter package length in centimeters.");
		int length = sc.nextInt();
		
		//scans width entered by user
		System.out.println("Enter package width in centimeters.");
		int width = sc.nextInt();
		
		//scans height entered by user
		System.out.println("Enter package height in centimeters.");
		int height = sc.nextInt();

		//calculates the volume
		double volume;
		volume = length*width*height;

		//checks to see if  package is too heavy, too large, 
		//too heavy and too large, or if accepted
		if (weight < 28 && volume < 100001)
		{
			System.out.println("Accepted");
		}
		else if (weight > 27 && volume < 100001)
		{
			System.out.println("Too heavy");
		}
		else if (weight < 28 && volume > 100000)
		{
			System.out.println("Too large");
		}
		else 
		{
			System.out.println("Too heavy and too large");
		}

		sc.close();
	}

}
