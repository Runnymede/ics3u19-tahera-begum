package begum.unit2;
import java.text.DecimalFormat;
/**
 * October 3, 2019
 * @author Tahera Begum
 * Printing application that prompts the user for the number of copies 
 * to print and then displays the price per copy and the total price for the job. 
 * 
 */
import java.util.Scanner;
public class Printing {

	public static void main(String[] args) {
		
		DecimalFormat money = new DecimalFormat("#00.00");
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("How many copies do you want to print?");

		//variables
		int copies = sc.nextInt();
		double price = 0;
		double totalprice = 0;


		//assign price based on number of copies
		if (copies < 100)
		{
			price = 0.30;
			totalprice = 0.30*copies;
		}
		else if (copies < 500)
		{
			price = 0.28;
			totalprice = 0.28*copies;
		}
		else if (copies < 750)
		{
			price = 0.27;
			totalprice = 0.27*copies;
		}
		else if (copies < 1001)
		{
			price = 0.26;
			totalprice = 0.26*copies;
		}
		else if (copies > 1000)
		{
			price = 0.25;
			totalprice = 0.25*copies;
		}

		System.out.println("Price per copy is: $" + money.format(price));
		
		System.out.println("Total cost is: $" + money.format(totalprice));

		sc.close();
	}

}
