package begum.unit2;
/**
 * November 11, 2019
 * prints hello 10 times
 * @author Tahera Begum
 */

public class LicenseToRide {

	public static void main(String[] args) {

		//variables
		int total;
		double counter = 0;
		double probability = 0;

		//loops the program 10000 times 
		//counter starts from 0
		//subtracts 1 to counter each time it goes through the loop 
		//when counter equals 0 then the loop stops 
		for (int num = 9999; num >= 0; num--)
		{
			//finds the thousands digit
			int thous;
			thous = num/1000;

			//finds the hundreds digit
			int huns;
			huns = num%1000/100;

			//finds the tens digit
			int tens;
			tens = num%100/10;

			//finds the ones digit
			int ones;
			ones = num%10;

			//adds all the digits together
			total = thous + huns + tens + ones;

			//checks if total is more or equal to 34 
			if (total >= 34)
			{
				//if total is more or equal to 34 it adds one to counter
				counter++;
			}

			//calculates probability by dividing counter by 10000
			//and then multiplies it by 100 to turn it into a percentage
			probability = counter / 10000 * 100;
		}

		//tells the user how many possibilities there are
		System.out.println("There are " + counter + " possibilities.");

		//tells the user the percentage of how many possibilities there are
		System.out.println("The probability is " + probability + " %.");

	}

}
