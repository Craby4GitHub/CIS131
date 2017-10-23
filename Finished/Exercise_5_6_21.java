
/********************************************************************************************************************
 * Lab2.java Author: Will Crabtree CIS 131: Programming and Problem Solving II
 * 
 * write a method that returns a number, given an uppercase letter
 * 
 * write a test program that prompts the user to enter a phone number as a
 * string. The input number may contain letters. the program translates a
 * letter(upper or lower) to a digit and leaves all other characters intact.
 * 
 * numbers like 
 * 	1-800-flowers = 1-800-3569377
 *  1800flowers = 18003569377
 ********************************************************************************************************************/

public class Exercise_5_6_21 {

	public static void main(String[] args) {
		// User input, yay
		String userString = IR4.getString("Enter a string: ");
		
		// Loopy loop
		for (int i = 0; i < userString.length(); i++) {
			
			// check to see if the current iteration is a letter and if it is call getNumber to get its stuff
			if (Character.isLetter(userString.charAt(i)))
				System.out.print(getNumber(Character.toUpperCase(userString.charAt(i))));
			else
				
				// else just print out the character
				System.out.print(userString.charAt(i));
		}
		
	}
	
	// Converts character to a letter
	public static int getNumber(char uppercaseLetter) {

		if (uppercaseLetter >= 'W')
			return 9;
		else if (uppercaseLetter >= 'T')
			return 8;
		else if (uppercaseLetter >= 'P')
			return 7;
		else if (uppercaseLetter >= 'M')
			return 6;
		else if (uppercaseLetter >= 'J')
			return 5;
		else if (uppercaseLetter >= 'G')
			return 4;
		else if (uppercaseLetter >= 'D')
			return 3;
		else 
			return 2;
	}
}
