

/********************************************************************************************************************
 * Exercise_4_5_1.java Author: Will Crabtree CIS 131: Programming and Problem
 * Solving II
 * 
 * Count positive and negative numbers and compute the avg of numbers 
 * Display number of positive numbers
 * Display number of negative numbers
 * Display total
 * Exclude 0 from the math
 * 
 ********************************************************************************************************************/

public class Exercise_4_5_1 {

	static int numOfPos = 0;
	static int numOfNeg = 0;
	static int runningTotal = 0;

	public static void main(String[] args) {

		doStuff();
		printStuff();

	}
	// End Main
	// ------------------------------------------------------------------

	public static void printStuff() {
		System.out.println("The number of positive numbers is: " + numOfPos);
		System.out.println("The number of negative numbers is: " + numOfNeg);
		System.out.println("The total is: " + runningTotal);
	}

	public static void doStuff() {
		int userInput;

		do {
			userInput = IR4.getInteger("Enter an Integer, the input ends if a zero is entered");
			runningTotal = runningTotal + userInput;
			if (userInput == 0) {
				break;
			} else if (userInput > 0) {
				numOfPos++;
			} else {
				numOfNeg++;
			}

		} while (userInput != 0);
		// End Do-While
	}

}
// End class
