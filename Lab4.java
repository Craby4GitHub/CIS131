/********************************************************************************************************************
 * Lab4.java 
 * Author: Will Crabtree 
 * CIS 131: Programming and Problem Solving II
 * 
 * 
 * 
 ********************************************************************************************************************/

public class Lab4 {

	static int[] intArray = new int[10];
	static int indexHighest;
	static int arrayHighestValue;
	static int indexLowest;
	static int arrayLowestValue;
	static int arraySum = 0;
	static double arrayAverage;

	public static void main(String[] args) {

		
		IR4.getRandomNumber(0,300);

		getDisplayMethod();
	}

	// -----------------------------------------------------------------------------------------------------------------

	// Displays all the elements in the array
	public static void printArray(int[] array) {
		for (Object i : array) {
			System.out.print(i);
			System.out.print("\t");
		}
		System.out.println();
	}

	// Sorts the array using the insertion technique
	public static void sortArray() {
		// DO THIS
	}

	// Identifies and returns the index of the highest value in the array
	public static void getIndexHighestMethod() {
		for (int i = 0; i < intArray.length; i++) {
			if (arrayHighestValue < intArray[i]) {
				indexHighest = i;
				arrayHighestValue = intArray[i];
			}
		}
	}

	// Identifies and returns the index of the lowest value in the array
	public static void getIndexLowestMethod() {
		for (int i = 0; i < intArray.length; i++) {
			// arrayLowestValue = intArray[0];
			if (intArray[i] < arrayLowestValue) {
				indexLowest = i;
				arrayLowestValue = intArray[i];
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

		System.out.println("Orginal order");
		printArray(intArray);

		getIndexHighestMethod();
		System.out.println("Highest index is " + indexHighest + " and its value is " + arrayHighestValue);

		getIndexLowestMethod();
		System.out.println("Lowest index is " + indexLowest + " and its value is " + arrayLowestValue);

		getArraySumMethod();
		System.out.println("Sum value is " + arraySum);

		getArrayAverage();
		System.out.println("Average value is " + arrayAverage);
	}
}
