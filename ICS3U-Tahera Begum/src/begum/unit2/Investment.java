package begum.unit2;
/**
 * 
 * October 28, 2019
 * calculates how many years it will take for a $2,500 investment to be 
 * worth at least $5,000 if compounded annually at 7.5%.
 * @author Tahera Begum
 */
public class Investment {

	public static void main(String[] args)  {

		//variables
		double money = 2500;
		double year = 0;
		
		//loops until money reaches $5,000
		do
		{
			//adds 7.5% money to the investment
			money = money * 1.075;
			
			//adds 1 to the year each time it goes through the loop
			year = year + 1;
			
		
		} while ( money < 5000);
		
		//prints how many years it will take for the $2,500 investment to be worth at least $5,000
		System.out.println(year);




	}

}
