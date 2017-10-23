package Finished;
import java.util.Arrays;

import IR4;

/********************************************************************************************************************
 * Lab4.java 
 * Author: Will Crabtree 
 * CIS 131: Programming and Problem Solving II
 * 
 * Generates x random numbers and displays them.
 * Shows the highest index and its value.
 * Shows the lowest index and its value.
 * Shows the sum and then the average.
 * Sorts the array and shows it
 * 
 * 
 ********************************************************************************************************************/

public class Lab4 {

	public static void main(String[] args) {

		// Step 1
		int maxArraySize = 10;
		int[] intArray = new int[maxArraySize];
		int indexHighest = 0;
		int indexLowest = 0;
		int arraySum;
		double arrayAverage;

		// Step 2
		genRanInts(intArray, maxArraySize);

		// Step 3
		System.out.println("Original Array order");
		printArray(intArray);

		// Step 4
		indexHighest = getHighestMethod(intArray);

		// Step 5
		indexLowest = getLowestMethod(intArray, indexLowest);

		// Step 6
		arraySum = getArraySumMethod(intArray);

		// Step 7
		arrayAverage = getArrayAverage(intArray, arraySum);

		// Step 8
		getDisplayMethod(intArray, indexHighest, indexLowest, arraySum, arrayAverage);

		// Step 9
		Arrays.sort(intArray);

		// Step 10
		printArray(intArray);

	}

	// -----------------------------------------------------------------------------------------------------------------

	// Puts Data into array
	public static void genRanInts(int[] array, int size) {
		for (int i = 0; i < size; i++) {
			array[i] = IR4.getRandomNumber(0, 300);
		}
	}

	// Displays all the elements in the array
	// Also dynamic spacing!
	public static void printArray(int[] array) {
		for (Object i : array) {
			int spacing = (String.valueOf(i).length() + 2);
			System.out.printf("%-" + spacing + "d", i);
		}
		System.out.println();
	}

	// Identifies and returns the index of the highest value in the array
	public static int getHighestMethod(int[] array) {
		int index = 0;
		int arrayHighestValue = 0;
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > arrayHighestValue) {
				arrayHighestValue = array[i];
				index = i;
			}
		}
		return index;
	}

	// Identifies and returns the index of the lowest value in the array
	public static int getLowestMethod(int[] array, int inputIndex) {
		int arrayLowestValue = array[0];
		int index = inputIndex;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < arrayLowestValue) {
				arrayLowestValue = array[i];
				index = i;
			}
		}
		return index;
	}

	// Defines a method that calculates the sum of the array elements
	public static int getArraySumMethod(int[] array) {
		int arraySum = 0;
		for (int i = 0; i < array.length; i++) {
			arraySum += array[i];
		}
		return arraySum;
	}

	// Calculates the average of the array elements
	public static double getArrayAverage(int[] array, int sum) {
		return (double) sum / array.length;
	}

	// Displays the results calculated by the methods
	private static void getDisplayMethod(int[] array, int highest, int lowest, int sum, double avg) {


		System.out.println("The index of the highest value is " + highest + " and its value is " + array[highest]);

		System.out.println("The index of the lowest value is " + lowest + " and its value is " + array[lowest]);

		System.out.println("The sum of the array elements is " + sum);

		System.out.printf("The average of the array elements is " + "%.2f\n", avg);

		System.out.println("Sorted Array");

	}
}
