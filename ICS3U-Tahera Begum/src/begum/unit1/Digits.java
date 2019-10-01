package begum.unit1;
/**
 * Sept.30, 2019
 * @author Tahera Begum
 * Displays the hundreds, tens, and ones of a 3 digit number.
 */
import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three-digit number.");
		int n = sc.nextInt();
		int h;
		h = n/100;
		System.out.println("Hundreds: " + h );
		int t;
		t = n%100/10;
		System.out.println("Tens: " + t );
		int o;
		o = n%10;
		System.out.println("Ones: " + o );
		
		
		

	}

}
