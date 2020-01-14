package begum.unit4;

import java.util.Arrays;
import java.util.Scanner;

public class MathPlus2 {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);

		//asks the user for a list of integers
		System.out.println("Enter the number of integers you would like in your list.");

		//scans the number entered by the user and declares it as num
		int num = sc.nextInt();

		//an array for the list of integers that will be entered by the user
		int [] integers = new int [num];
		double [] integers2 = new double [num];

		//tells the user to enter the integers one by one
		System.out.println("Enter the integers one by one");

		//loops the number of times the number of integers
		for (int i = 0; i < num; i++)
		{
			//scans the name puts it in the array
			integers [i] = sc.nextInt();
			integers2 [i] = integers [i];

		}

		//asks the user for a list of integers
		System.out.println("Enter a number you would like to find out if it's prime or not.");
		//scans the number entered by the user and declares it as num
		int num2 = sc.nextInt();



		//declares the return from average as ave and sends the integers array
		double med = median(integers2);

		//prints the median from the median method 
		System.out.println("The median of all the integers is " + med);

		//declares the return from average as ave and sends the integers array
		boolean pri = prime(num2);

		//if prime was labeled as false 
		if (!pri)
		{
			//then it tells the user the number is not prime
			System.out.println(num2 +" is not prime.");
		}
		//if prime was not labeled as false
		else
		{
			//then it tells the user the number is prime
			System.out.println(num2 +" is prime.");
		}

	}

	public static double median(double [] arr) {

		Arrays.sort(arr);


		int middleIndex = arr.length / 2;

		int modulus = arr.length % 2;

		if (modulus != 0)
		{
			double median = arr [middleIndex];
			return median;
		} 
		else
		{
			int middleIndex2 = middleIndex - 1;
			double middleNumber1 = arr[middleIndex];
			double middleNumber2 = arr[middleIndex2];
			double median = (middleNumber1 + middleNumber2)/2;
			return median;
		}
	}
	
	public static double mode(double [] arr) {

		int bigNum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			int counter1 = 0;
			for(int j = 0; j < i; j++)
			{
				
			}
		}
	}

	public static boolean prime(int num2) {


		int div = 2;
		int quo;
		boolean prime = true;

		//divides the number entered by the user by every number from 2 to the number entered by user
		while ( div < num2 )
		{
			//divides the number by every number from 2 to the number entered by user, then finds the modulus
			quo = num2 % div;

			//adds one to the divisor each time it goes through the loop
			div = div + 1;

			//if the modulus of the number entered by user divided by the divisor is 0, then it breaks the loop
			if (quo == 0)
			{
				//labels prime as false
				prime = false;
				break;

			}	
		} 
		return prime;
	}

}
