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
		
		//formats the prices
		DecimalFormat money = new DecimalFormat("#00.00");
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//asks the user how many copies they want to print
		System.out.println("How many copies do you want to print?");

		//variables
		int copies = sc.nextInt();
		double price = 0;
		double totalprice = 0;


		//assign price based on number of copies
		//if less than 100
		if (copies < 100)
		{
			//the price of one copy is $0.30
			price = 0.30;
			//the total price is $0.30 times how many copies they want
			totalprice = 0.30*copies;
		}
		//if less than 500
		else if (copies < 500)
		{
			//the price of one copy is $0.28
			price = 0.28;
			//the total price is $0.28 times how many copies they want
			totalprice = 0.28*copies;
		}
		//if less than 750
		else if (copies < 750)
		{
			//the price of one copy is $0.27
			price = 0.27;
			//the total price is $0.27 times how many copies they want
			totalprice = 0.27*copies;
		}
		//if less than 1001
		else if (copies < 1001)
		{
			//the price of one copy is $0.26
			price = 0.26;
			//the total price is $0.26 times how many copies they want
			totalprice = 0.26*copies;
		}
		//if greater than 1000
		else if (copies > 1000)
		{
			//the price of one copy is $0.25
			price = 0.25;
			//the total price is $0.25 times how many copies they want
			totalprice = 0.25*copies;
		}

		//tells the user the price one copy
		System.out.println("Price per copy is: $" + money.format(price));
		
		//tells the user the total cost of all copies
		System.out.println("Total cost is: $" + money.format(totalprice));

		//closes scanner
		sc.close();
	}

}
