import java.util.Random;

/********************************************************************************************************************
 * Lab4.java Author: Will Crabtree CIS 131: Programming and Problem Solving II
 * 
 * Shows user the products they can buy and the possible discounts. Then has
 * user input corresponding product number and quantity. Once done, it will
 * print out the totals of everything.
 * 
 ********************************************************************************************************************/

public class Lab4 {

	private static final int[] intArray = new int[10];

	public static void main(String[] args) {

		int indexHighest;
		int indexLowest;
		int arraySum;
		double arrayAverage;
		randomNumber();
		System.out.println("Orginal order");
		printArray();

	}

	// -----------------------------------------------------------------------------------------------------------------

	// Assigns a random value from 1 to 300 to each array element
	public static void randomNumber() {
		int max = 300;
		int min = 1;
		Random rand = new Random();
		for (int i = 0; i < intArray.length; i++){
			int value = rand.nextInt((max - min) + 1) + min;
			intArray[(int) i] = value;
		}
	}

	// Displays all the elements in the array
	public static void printArray() {
		for (Object i: intArray) {
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
	public static void indexHighestMethod() {
		int highestIndexValue = intArray[0];
		for (int i = 0; i < highestIndexValue; i++){
			//ADD STUFF
		}
	}

	// Identifies and returns the index of the lowest value in the array
	public static void indexLowestMethod() {
		// DO THIS
	}

	// Defines a method that calculates the sum of the array elements
	public static void arraySumMethod() {
		// DO THIS
	}

	// Calculates the average of the array elements
	public static void arrayAverageMethod() {
		// DO THIS
	}

	// Displays the results calculated by the methods described in items 5 through 8.
	public static void displayMethod(){
			//DO THIS
	}
}
