package begum.unit2;
/**
 * November 11, 2019
 * prints all the even numbers from 1 to 100
 * @author Tahera Begum
 */

public class EvenNumbers {

	public static void main(String[] args) {
		
		//loops the program 100 times
		//counter starts from 2
		//and adds 2 each time it goes through the loop
		//when counter equals 100 the the loop stops 
		for (int counter = 2; counter <= 100; counter = counter + 2)
		{
			//displays an even number each time it goes through the loop starting from 2 to 100
			System.out.println(counter);
		}
	}

}
