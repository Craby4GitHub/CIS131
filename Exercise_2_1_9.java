/*
 * Will Crabtree
 * CIS131
 * Exercise 1_9
 */

public class Exercise1_9 {
	public static void main(String[] args) {
		boolean continueCalc = true;
		do {
			double userInputWidth;
			double userInputHeight;
			
			//Get Input with some lazy validation
			do{userInputWidth = IR4.getDouble("Enter Width: ");}
			while(userInputWidth < 0);
			
			do{userInputHeight = IR4.getDouble("Enter Height: ");}
			while(userInputHeight < 0);

			
			//Do the math
			double calcArea = userInputWidth * userInputHeight;
			double calcPerimeter = (userInputWidth + userInputHeight) * 2;
			
			//Print out the result
			System.out.println("The Area is " + calcArea + " and the Perimeter is " + calcPerimeter);
			
			//Loop to add more data
			if (IR4.getYorN("Do you want to enter another value?")) {

			} else {
				continueCalc = false;
			}

		} while (continueCalc);
	}
}
