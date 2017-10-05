
/*************************************************************************
  *  Compilation:  javac Template.java
  *  Author: David Freitag
  *  Date: 9/3/2015
  *  Purpose: This is a template for developing new java programs.
  *************************************************************************/
import java.util.Scanner;

public class ModulesCodingPractice {
	private static double purchaseAmt = 0;
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		// #1 problem
		// ---------------------------------------------------------------------------
		// Create 3 function calls to generic function that gets 1 grade at a
		// time
		int grade1, grade2, grade3;
		/*
		 * System.out.println("Please enter the first grade."); grade1 =
		 * keyboard.nextInt ( ); System.out.println(
		 * "Please enter the second grade."); grade2 = keyboard.nextInt ( );
		 * System.out.println("Please enter the third grade."); grade3 =
		 * keyboard.nextInt ( );
		 */

		grade1 = getInteger("Please enter the first grade.");
		grade2 = getInteger("Please enter the first grade.");
		grade3 = getInteger("Please enter the first grade.");

		System.out.println("The average grade is: " + ((grade1 + grade2 + grade3) / 3.0));

		// #2 problem
		// ---------------------------------------------------------------------------
		// Create a generalized function that is called twice to calculate state
		// and county tax
		System.out.println("\nPlease enter the purchase amount");
		purchaseAmt = keyboard.nextInt();
		// int purchaseAmt = keyboard.nextInt ( );
		double stateTaxAmt = getTotalTax(0.06);
		// double stateTaxAmt = purchaseAmt * 0.06;
		double countyTaxAmt = getTotalTax(0.02);
		// double countyTaxAmt = purchaseAmt * 0.02;
		System.out.println("The total purchase amount is: " + (purchaseAmt + stateTaxAmt + countyTaxAmt));

		// #3 problem
		// ---------------------------------------------------------------------------
		// Ask the user to enter a number between two numbers.
		// The two numbers are randomly generated using the getRandomNumber
		// function below.
		// The first random number is the lower boundry should be between 0 and
		// 50.
		// The second random number should be beween the first number and 100.
		// Ask the user to enter a number between the two random numbers.
		// Validate the input without changing the getInteger function.
		// Tell the user the number they entered is x above the first number and
		// y below the second.

		int firstNumber = getRandomNumber(0, 50);
		int secondNumber = getRandomNumber(0, 100);
		int userInputedInt;
		if (firstNumber < secondNumber) {

			do {
				userInputedInt = getInteger("Enter a number between " + firstNumber + " and " + secondNumber);
			} while (((userInputedInt < firstNumber) || (userInputedInt > secondNumber)));
			if (userInputedInt < firstNumber) {
				System.out.println(userInputedInt + "is less that " + firstNumber);
				if (userInputedInt > secondNumber) {
					System.out.println(userInputedInt + "is greater than " + secondNumber);
				} else {
					if (userInputedInt > firstNumber) {
						System.out.println(userInputedInt + "is less that " + firstNumber);
						if (userInputedInt < secondNumber) {
							System.out.println(userInputedInt + "is greater than " + secondNumber);
						}
					}
				}
			}

		} else {
			do {

				userInputedInt = getInteger("Enter a number between " + secondNumber + " and " + firstNumber);
			} while (((userInputedInt < firstNumber) || (userInputedInt > secondNumber)));
			if (userInputedInt < secondNumber) {
				System.out.println(userInputedInt + "is less that " + secondNumber);
				if (userInputedInt > firstNumber) {
					System.out.println(userInputedInt + "is greater than " + firstNumber);
				}
			}
		}

	}// end main

	public static double getTotalTax(double tax) {
		return purchaseAmt * tax;
	}

	public static int getInteger(String msg) {
		System.out.println(msg);
		while (!keyboard.hasNextInt()) {
			keyboard.nextLine();
			System.err.println("Invalid integer. Try again.");
		}
		int number = keyboard.nextInt();
		keyboard.nextLine(); // flushes the buffer
		return number;
	}

	public static int getRandomNumber(int low, int high) {
		return (int) (Math.random() * ((high + 1) - low)) + low;
	}

}// end of class