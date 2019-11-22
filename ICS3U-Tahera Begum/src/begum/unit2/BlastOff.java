package begum.unit2;
/**
 * November 11, 2019
 * counts down from 10 to 1
 * @author Tahera Begum
 */

public class BlastOff {

	public static void main(String[] args) 
		throws InterruptedException {
		
		//the loop starts at 10 and stops at 1 
		for (int d = 10; d > 0; d = d - 1)
		{
			//prints one number counting down from 10 to 1 each time it goes through the loop
			System.out.println(d);
			
			//wait one second to print the next number
			Thread.sleep(1000);
		}
		
		// prints BLAST OFF after counting down to one
		System.out.println("BLAST OFF!");

	}

}
