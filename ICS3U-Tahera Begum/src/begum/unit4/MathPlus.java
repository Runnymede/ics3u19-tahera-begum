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
		int num = sc.nextInt();

		//arrays for the list of integers that will be entered by the user
		int [] integers = new int [num];
		double [] integers2 = new double [num];

		//tells the user to enter the integers
		System.out.println("Enter the integers one by one");

		//loops until the user enters all integers
		for (int i = 0; i < num; i++)
		{
			//scans the integers, puts it in the array
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

		//closes scanner
		sc.close();


	}


	/**
	 * method finds the index with smallest number
	 * @param arr
	 * @return
	 */
	public static int min(int[] arr) {

		//smallest index starts with index 0
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

		//biggestIndex starts with index 0
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
	 * @return smallestIndex
	 */
	public static int min(double[] arr) {

		//smallest index starts with index 0
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

		//biggestIndex starts with index 0
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
	public static double sum(double[] arr) {

		double sum = arr[0];

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
	public static double average(double [] arr) {

		double sum = arr[0];

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


}

