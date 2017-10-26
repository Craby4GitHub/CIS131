/********************************************************************************************************************
 * Exercise 7_1.java 
 * Author: Will Crabtree 
 * CIS 131: Programming and Problem Solving II
 * 
 * write a program that reads student scores, gets the best score, and then assigns grades based on the following order
 * 	A if score is greater than or equal to best -10
 *	B if score is greater than or equal to best -20
 *	C if score is greater than or equal to best -30
 *	D if score is greater than or equal to best -40
 *	F otherwise
 *
 *promt the user to enter the total number of students, then promts the user to enter all the scores and concludes by displaying the grades
 ********************************************************************************************************************/
public class Exercise_6_7_1 {
	public static void main(String[] args) {

		int numOfStudents = IR4.getIntegerGTE("Enter number of students: ", 1);
		int[] scoreArray = new int[numOfStudents];

		System.out.println("Enter " + numOfStudents + " scores");
		for (int i = 0; i < scoreArray.length; i++) {
			scoreArray[i] = IR4.getIntegerGTE("Enter grade for student " + i, 0);
		}
		
		printGrades(scoreArray);
	}

	// -----------------------------------------------------------------------------------------------------------------
	public static char assignLetterGrade(int grade, int highestScore) {

		if (highestScore - grade <= 10)
			return 'A';
		else if (highestScore - grade > 10 && highestScore - grade <= 20)
			return 'B';
		else if (highestScore - grade > 20 && highestScore - grade <= 30)
			return 'C';
		else if (highestScore - grade > 30 && highestScore - grade <= 20)
			return 'D';
		else
			return 'F';
	}

	public static void printGrades(int[] array) {
		
		int highScore = getHighestScore(array);

		for (int i = 0; i < array.length; i++) {
			
				System.out.printf("Student " + i + " score is " +  array[i] + " and grade is " + assignLetterGrade(array[i], highScore) + "\n");
			
			
		}
	}

	public static int getHighestScore(int[] array) {

		int highestScore = array[0];

		for (int grade: array) {
			if (grade > highestScore)
				highestScore = grade;
		}
		return highestScore;
	}
}
