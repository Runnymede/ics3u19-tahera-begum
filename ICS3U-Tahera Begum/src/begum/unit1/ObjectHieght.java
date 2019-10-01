package begum.unit1;
/*
*
* September 23, 2019
* @author Tahera Begum
* Calculating the height of an object at any given time dropped from a starting height of 100 
* meters is given by the equations h = 100 - 2.9 * t^2 where t is the time in seconds.
*
*/
import java.util.Scanner;
public class ObjectHieght {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a time less than 4.5 seconds");
		double t = sc.nextDouble();
		double h;
		h = 100 - 2.9 * t*t;
		System.out.println("The height of the object is " + h + " meters");
	
		

	}

}
