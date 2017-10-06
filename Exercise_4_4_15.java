/********************************************************************************************************************
 * Exercise_4_4_15.java 
 * Author: Will Crabtree 
 * CIS 131: Programming and Problem Solving II
 * 
 * Prompt user to enter a letter, then display corresponding number.
 * 
 ********************************************************************************************************************/

public class Exercise_4_4_15 {

	public static void main(String[] args) {
		char userInput = IR4.getChar("Enter a letter: ");
		System.out.print(convertLetterToNumber(userInput));
	}

	//------------------------------------------------------------------
	// Im super lazy
	public static int convertLetterToNumber(char userLetter) {
		char[] firstLetters = { 'a', 'b', 'c', 'A', 'B', 'C' };
		char[] secondLetters = { 'd', 'e', 'f', 'D', 'E', 'F' };
		char[] thirdLetters = { 'g', 'h', 'i', 'G', 'H', 'H' };
		char[] fourthLetters = { 'j', 'k', 'l', 'J', 'K', 'L' };
		char[] fifthLetters = { 'm', 'n', 'o', 'M', 'N', 'O' };
		char[] sixthLetters = { 'p', 'q', 'r', 'P', 'Q', 'R' };
		char[] seventhLetters = { 's', 't', 'u', 'S', 'T', 'U' };
		char[] eighthLetters = { 'v', 'w', 'x', 'V', 'W', 'X' };
		char[] ninethLetters = { 'y', 'z', 'Y', 'Z' };

		for (char letter : firstLetters) {
			if (userLetter == letter) {
				return 1;
			}
		}
		for (char letter : secondLetters) {
			if (userLetter == letter) {
				return 2;
			}
		}
		for (char letter : thirdLetters) {
			if (userLetter == letter) {
				return 3;
			}
		}
		for (char letter : fourthLetters) {
			if (userLetter == letter) {
				return 4;
			}
		}
		for (char letter : fifthLetters) {
			if (userLetter == letter) {
				return 5;
			}
		}
		for (char letter : sixthLetters) {
			if (userLetter == letter) {
				return 6;
			}
		}for (char letter : seventhLetters) {
			if (userLetter == letter) {
				return 7;
			}
		}for (char letter : eighthLetters) {
			if (userLetter == letter) {
				return 8;
			}
		}for (char letter : ninethLetters) {
			if (userLetter == letter) {
				return 9;
			}
		}
		return 0;
	}
}


