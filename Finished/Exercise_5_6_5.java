
/********************************************************************************************************************
 * Lab2.java 
 * Author: Will Crabtree 
 * CIS 131: Programming and Problem Solving II
 * 
 * write a method with the following header to display three numbers in
 * increasing order
 * 
 * Write a test program that prompts the user to enter three numbers and invokes
 * the method to display them in increasing order
 ********************************************************************************************************************/

public class Exercise_5_6_5 {
	public static void main(String[] args) {

		// Setup constant for array
		int numberOfInputs = 3;
		
		// Get dat array
		double[] userDoubles = new double[numberOfInputs];

		// Dat user input loop, much wow
		for (int i = 0; i < numberOfInputs; i++) {
			userDoubles[i] = IR4.getDouble("Enter a number: ");
		}

		// You see dis method? Impressive!
		displaySortedNumbers(userDoubles[0], userDoubles[1], userDoubles[2]);

	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		// Place holder
		double temp;
		if (num2 < num1 && num2 < num3) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		} else if (num3 < num1 && num3 < num2) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}
