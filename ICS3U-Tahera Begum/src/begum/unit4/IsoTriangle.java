package begum.unit4;
import java.util.Scanner;
/**
 * december 17, 2019
 * prompts the user for the size of an isosceles triangle and then displays the triangle with that many lines
 * @author Tahera Begum
 */
public class IsoTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many lines of stars do you want in youyr isosceles triangle.");
		int lines = sc.nextInt();


		for (int i=1; i<=lines; i++)
		{
			drawSpaces(lines-i);
			drawStars(i*2-1);
			System.out.println();
			
		}

		//closes scanner
		sc.close();
	}

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



