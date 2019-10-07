package begum.unit1;
/**
 * September 30, 2019
 * @author Tahera Begum
 * Displays the hundreds, tens, and ones of a 3 digit number.
 */
import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
		//scans the 3 digit number entered by user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three-digit number.");
		int n = sc.nextInt();
		
		//displays the hundreds digit
		int h;
		h = n/100;
		System.out.println("Hundreds: " + h );
		
		//displays the tens digit 
		int t;
		t = n%100/10;
		System.out.println("Tens: " + t );
		
		//displays the ones digits
		int o;
		o = n%10;
		System.out.println("Ones: " + o );
		
		
		

	}

}
