import java.util.Arrays;

/********************************************************************************************************************
 * Lab4.java 
 * Author: Will Crabtree 
 * CIS 131: Programming and Problem Solving II
 * 
 * 
 * 
 ********************************************************************************************************************/

public class Lab4 {
	static int maxArraySize = 10;
	static int[] intArray = new int[maxArraySize];
	static int indexHighest;
	static int arrayHighestValue;
	static int indexLowest;
	static int arrayLowestValue;
	static double arraySum;
	static double arrayAverage;

	public static void main(String[] args) {

		genRanInts();
			
		
		getDisplayMethod();
	}

	// -----------------------------------------------------------------------------------------------------------------
	
	// Puts Data into array
	public static void genRanInts() {
		for(int i = 0;i < maxArraySize;i++){
			intArray[i] = IR4.getRandomNumber(0,300);
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
	public static void getIndexHighestMethod() {
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > arrayHighestValue) {
				arrayHighestValue = intArray[i];
				indexHighest = i;
				}
		}
	}

	// Identifies and returns the index of the lowest value in the array
	public static void getIndexLowestMethod() {
		arrayLowestValue = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] < arrayLowestValue) {
				arrayLowestValue = intArray[i];
				indexLowest = i;
				}
		}
	}


	// Defines a method that calculates the sum of the array elements
	public static void getArraySumMethod() {
		for (int i = 0; i < intArray.length; i++) {
			arraySum += intArray[i];
		}
	}

	// Calculates the average of the array elements
	public static void getArrayAverage() {
		arrayAverage = arraySum / intArray.length;
	}

	// Displays the results calculated by the methods
	private static void getDisplayMethod() {

		System.out.println("Original Array order");
		printArray(intArray);


		getIndexHighestMethod();
		System.out.println("The index of the highest value is " + indexHighest + " and its value is " + arrayHighestValue);

		getIndexLowestMethod();
		System.out.println("The index of the lowest value is " + indexLowest + " and its value is " + arrayLowestValue);

		getArraySumMethod();
		System.out.printf("The sum of the array elements is " + "%.0f\n", arraySum);

		getArrayAverage();
		System.out.printf("The average of the array elements is " + "%.2f\n", arrayAverage);
		
		System.out.println("Sorted Array");
		Arrays.sort(intArray);
		printArray(intArray);

	}
}
