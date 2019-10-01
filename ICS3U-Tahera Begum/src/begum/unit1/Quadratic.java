package begum.unit1;
/**
 * Sept.30, 2019
 * @author Tahera Begum
 * Prints out the two roots of a quadratic function given a, b and c
 *
 * @author Tahera Begum
 * 
 */
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value for a:");
		int a = sc.nextInt();
		System.out.println("Please enter a value for b:");
		int b = sc.nextInt();
		System.out.println("Please enter a value for c:");
		int c = sc.nextInt();
		double r1;
		r1 = (-b + Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		double r2;
		r2 = (-b - Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		System.out.println("The two roots are: " + r1+ ", " + r2);

	}

}
