/*
 * Will Crabtree
 * CIS131
 * Exercise 2_3
 */

public class Exercise2_3 {
	public static void main(String[] args) {
		boolean continueCalc = true;
		do {
			//Get Input
			double userInput = IR4.getDouble("Enter the amount of feet: ");
			
			//Do the math
			double calcMeters = userInput * .305;
			
			//Print out the result
			System.out.println(userInput + " feet is " + calcMeters + " meters.");
			
			//Loop to add more data
			if (IR4.getYorN("Do you want to enter another value?")) {

			} else {
				continueCalc = false;
			}

		} while (continueCalc);
	}
}
