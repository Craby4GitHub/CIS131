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
		
		int numOfStudents = IR4.getIntegerGT("Enter number of students: ", 1, "Nope, try again");
		int[] scoreArray = new int[numOfStudents];
		
		System.out.println("Enter all the scores");
	}

}
