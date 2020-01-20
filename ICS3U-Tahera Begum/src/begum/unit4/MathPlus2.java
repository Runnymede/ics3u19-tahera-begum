package begum.unit4;

import java.util.Arrays;
import java.util.Scanner;

public class MathPlus2 {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);

		//asks the user for a list of integers
		System.out.println("Enter the number of integers you would like in your list.");
		int num = sc.nextInt();

		//arrays for the list of integers that will be entered by the user
		int [] integers = new int [num];
		double [] integers2 = new double [num];

		//tells the user to enter the integers
		System.out.println("Enter the integers one by one");

		//loops the number of times the number of integers
		for (int i = 0; i < num; i++)
		{
			//scans the name, puts it in the array
			integers [i] = sc.nextInt();
			integers2 [i] = integers [i];

		}




		//declares the return from median as med and sends the integers array
		double med = median(integers2);
		//prints the median from the median method 
		System.out.println("The median of all the integers is " + med);

		//declares the return from mode as mod and sends the integers array
		double mod = mode(integers2);
		//prints the mode from the mode method 
		System.out.println("The mode of all the integers is " + mod);

		//asks the user for a number for prime
		System.out.println("Enter a number you would like to find out if it's prime or not.");
		int num2 = sc.nextInt();
		
		//declares the return from prime as pri and sends the num2
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

		//asks the user for a number for factorial
		System.out.println("Enter a number to find its factorial.");
		int num3 = sc.nextInt();
		
		//declares the return from factorial as fact and sends the num3
		long fact = factorial(num3);
		//prints the factorial from the factorial method 
		System.out.println("The factorial of " + num3 + " is " + fact);

		//asks the user for a number for number of factors
		System.out.println("Enter a number you would like to find the number of factors and factors for.");
		int num4 = sc.nextInt();
		
		//declares the return from numOfFactors as numFactors and sends the num4
		int numFactors = numOfFactors(num4);
		//prints the number of factors from the method 
		System.out.println("There are " + numFactors + " factors.");
		
		//declares the return from factors as facts and sends the num4
		int [] facts = factors(num4);
		//prints the mode from the mode method 
		
		//prints all factors
		System.out.println("The factors are " );
		for (int i=0; i< facts.length; i++)
		{
		System.out.print(facts[i] + ", " );
		}

	}

	/**
	 * finds the median
	 * @param arr
	 * @return
	 */
	public static double median(double [] arr) {

		//sorts the array from least to greatest
		Arrays.sort(arr);

		//divides length of the array by 2
		int middleIndex = arr.length / 2;

		//finds the modulus by dividing length of the array by 2
		int modulus = arr.length % 2;

		//if it's not 0
		if (modulus != 0)
		{
			//median is the number in middle index
			double median = arr [middleIndex];
			return median;
		} 
		//if 0
		else
		{
			//
			int middleIndex2 = middleIndex - 1;
			double middleNumber1 = arr[middleIndex];
			double middleNumber2 = arr[middleIndex2];
			double median = (middleNumber1 + middleNumber2)/2;
			return median;
		}
	}

	public static double mode(double [] arr) {

		int counter2=0;
		double bigNum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			int counter1 = 0;
			for(int j = 0; j < i; j++)
			{

				if(arr[i]==arr[j])
				{
					counter1++;
					bigNum=arr[i];

				}
				counter2=counter1;
				if(counter1>counter2)
				{
					bigNum=arr[i];
				}
			}

		}
		return bigNum;
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

	public static long factorial(int num3) {
		long factorial = num3;
		//i starts at 1 and as long as its less than the length it loops
		for (int i = num3 - 1; i > 0; i--)
		{
			//sum is all the numbers in the array added together
			//in the loop the integers are added one at a time

			factorial = factorial * i;

		}
		return factorial;

	}
	public static int numOfFactors(int num4) {

		int count = 0;
		double stop = num4;
		double round = Math.rint(stop);
		for (int i = 1; i <= round; i = i + 1)
		{
			double factor = num4 % i;
			if (factor==0)
			{
				count= count + 1;
			}
		}
		return count;
	}

	public static int [] factors(int num4) {

		int count = 0;
		int count2 = 0;
		double stop = num4;
		double round = Math.rint(stop);
		for (int i = 1; i <= round; i = i + 1)
		{
			double mod = num4 % i;
			if (mod==0)
			{
				count= count + 1;
			}
		}

		int [] factors = new int [count];
		
		for (int i = 1; i <= round; i = i + 1)
		{
			double factor = num4 % i;
			if (factor==0)
			{
				factors[count2] = i;
				count2 = count2 + 1;
			}
		}
		return factors;
	}

}
