package begum.unit4;
/**
 * January,07, 2019
 * creating methods
 * @author Tahera Begum
 */

import java.util.Arrays;
import java.util.Scanner;

public class MathPlus {

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
		//declares the return from min method as small and sends the integers array
		int small= min(integers);

		//prints the smallest integer from the min method 
		System.out.println("The smallest number in the array is in index " + small);


		//declares the return from max as big and sends the integers array
		int big= max(integers);

		//prints the biggest integer from the max method 
		System.out.println("The biggest number in the array is in index " + big);


		//declares the return from sum as all and sends the integers array
		int all= sum(integers);

		//prints the sum from the sum method 
		System.out.println("The sum of all the integers is " + all);


		//declares the return from average as ave and sends the integers array
		double ave= average(integers);

		//prints the average from the average method 
		System.out.println("The average of all the integers is " + ave);

		//declares the return from average as ave and sends the integers array
		double med = median(integers2);

		//prints the median from the median method 
		System.out.println("The median of all the integers is " + med);



	}


	/**
	 * method finds the index with smallest number
	 * @param arr
	 * @return
	 */
	public static int min(int[] arr) {

		int smallestIndex = 0;

		//loops as many times as the length of the array
		for (int i = 0; i < arr.length; i++)
		{
			//if array with index i is less than array with smallest index
			if(arr[i] < arr[smallestIndex]) {
				//then array with index i is the new smallest index
				smallestIndex = i;
			}

		}
		//sends smallest index to main method
		return smallestIndex;

	}


	/**
	 * method finds the index with biggest number
	 * @param arr
	 * @return
	 */
	public static int max(int[] arr) {

		int biggestIndex = 0;

		//loops as many times as the length of the array
		for (int i = 0; i < arr.length; i++)
		{
			//if array with index i is greater than array with smallest index
			if(arr[i] > arr[biggestIndex]) {
				//then array with index i is the new biggest index
				biggestIndex = i;
			}

		}
		//sends biggest index to main method
		return biggestIndex;

	}


	/**
	 * method finds the sum
	 * @param arr
	 * @return
	 */
	public static int sum(int[] arr) {

		int sum = arr[0];

		//i starts at 1 and as long as its less than the length it loops
		for (int i = 1; i < arr.length; i++)
		{
			//sum is all the numbers in the array added together
			//in the loop the integers are added one at a time
			sum = sum + arr[i];

		}
		//sends sum to main method
		return sum;

	}


	/**
	 * method finds the average
	 * @param arr
	 * @return
	 */
	public static double average(int [] arr) {

		int sum = arr[0];

		//i starts at 1 and as long as its less than the length it loops
		for (int i = 1; i < arr.length; i++)
		{
			//sum is all the numbers in the array added together
			//in the loop the integers are added one at a time
			sum = sum + arr[i];

		}

		//average is sum divided by the length of the array
		double average = sum / arr.length;

		//sends average to main method
		return average;

	}


	/**
	 * method finds the index with smallest number
	 * @param arr
	 * @return
	 */
	public static int min(double[] arr) {

		int smallestIndex = 0;

		//loops as many times as the length of the array
		for (int i = 0; i < arr.length; i++)
		{
			//if array with index i is less than array with smallest index
			if(arr[i] < arr[smallestIndex]) {
				//then array with index i is the new smallest index
				smallestIndex = i;
			}

		}

		//sends smallest index to main method
		return smallestIndex;

	}


	/**
	 * method finds the index with biggest number
	 * @param arr
	 * @return
	 */
	public static int max(double[] arr) {

		int biggestIndex = 0;

		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] > arr[biggestIndex]) {
				biggestIndex = i;
			}

		}

		return biggestIndex;

	}


	/**
	 * method finds the sum
	 * @param arr
	 * @return
	 */
	public static double sum(double[] arr) {

		double sum = arr[0];

		for (int i = 1; i < arr.length; i++)
		{
			sum = sum + arr[i];

		}

		return sum;

	}


	/**
	 * method finds the average
	 * @param arr
	 * @return
	 */
	public static double average(double [] arr) {

		double sum = arr[0];

		for (int i = 1; i < arr.length; i++)
		{
			sum = sum + arr[i];

		}

		double average = sum / arr.length;

		return average;

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
	public static double median(double [] arr) {
	
		int total;
		int [] counter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		//if total equals 2
		if (total == 2)
		{
			//then adds one to the counter at the index of 0
			counter [0]++;
		}

		//if total equals 3
		else if (total == 3)
		{
			//then adds one to the counter at the index of 1
			counter [1]++;
		}

		//if total equals 4
		else if (total == 4)
		{
			//then adds one to the counter at the index of 2
			counter [2]++;
		}

		//if total equals 5
		else if (total == 5)
		{
			//then adds one to the counter at the index of 3
			counter [3]++;
		}

		//if total equals 6
		else if (total == 6)
		{
			//then adds one to the counter at the index of 4
			counter [4]++;
		}

		//if total equals 7
		else if (total == 7)
		{
			//then adds one to the counter at the index of 5
			counter [5]++;
		}

		//if total equals 8
		else if (total == 8)
		{
			//then adds one to the counter at the index of 6
			counter [6]++;
		}

		//if total equals 9
		else if (total == 9)
		{
			//then adds one to the counter at the index of 7
			counter [7]++;
		}

		//if total equals 10
		else if (total == 10)
		{
			//then adds one to the counter at the index of 8
			counter [8]++;
		}

		//if total equals 11
		else if (total == 11)
		{
			//then adds one to the counter at the index of 9
			counter [9]++;
		}

		//if total equals 12
		else if (total == 12)
		{
			//then adds one to the counter at the index of 10
			counter [10]++;
		}

	}
}

