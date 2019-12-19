package begum.unit4;
/**
 * december 17, 2019
 * will convert temperatures between Fahrenheit and Celsius
 * @author Tahera Begum
 */
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Do you want to convert your fahrenheit or celcius.");
		String option = sc.next();

		if (option.equalsIgnoreCase("fahrenheit"))
		{
			System.out.println("Enter your temperature in fahrenheit to convert it to celcius.");
			double f = sc.nextDouble();
			double c= fahrenheitToCelsius(f);
			System.out.println(c);
		}
		else
		{
			System.out.println("Enter your temperature in celcius to convert it to fahrenheit.");
			int c = sc.nextInt();
			double f = celsiusToFahrenheit(c);
			System.out.println(f);
		}
		
		//closes scanner
		sc.close();
	}

	public static double fahrenheitToCelsius(double toC) {

		double temp =( toC - 32) * 5 / 9;
		return temp;



	}
	public static double celsiusToFahrenheit(double toF) {

		double temp = toF * 9 / 5 + 32;
		return temp;

	}


}
