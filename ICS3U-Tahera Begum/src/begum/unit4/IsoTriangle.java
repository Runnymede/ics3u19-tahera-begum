package begum.unit4;
import java.util.Scanner;
/**
 * december 17, 2019
 * prompts the user for the size of an isosceles triangle and then displays the triangle with that many lines
 * @author Tahera Begum
 */
public class IsoTriangle {

	public static void main(String[] args) {

		//scanner
		Scanner sc = new Scanner(System.in);

		//asks the user for the size of the triangle
		System.out.println("How many lines of stars do you want in youyr isosceles triangle.");
		int lines = sc.nextInt();

		//displays all lines of stars in the triangle
		for (int i=1; i<=lines; i++)
		{
			//displays the spaces between stars
			drawSpaces(lines-i);
			//displays the stars
			drawStars(i*2-1);
			System.out.println();
			
		}

		//closes scanner
		sc.close();
	}

	/**
	 * 
	 * @param n
	 */
	public static void drawStars(int n) {

			for (int j=0; j<n; j++)
			{
				System.out.print("*");
			}
			

	}
	public static void drawSpaces(int m) {

			for (int j=0; j<m; j++)
			{
				System.out.print(" ");
			}

	}


}



