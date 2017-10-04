
/********************************************************************************************************************
  * Lab3.java
  * Author: Will Crabtree
  * CIS 131: Programming and Problem Solving II
  * 
  * Shows user the products they can buy and the possible discounts.
  * Then has user input corresponding product number and quantity.
  * Once done, it will print out the totals of everything.
  * 
  ********************************************************************************************************************/

public class Lab3 {
	private static double endingInterest;
	private static double startingInterest;
	private static double loanAmount;

	public static void main(String[] args) {
		loanAmount = IR4.getIntegerGT("Enter the loan amount : ", 0, "You must put a postive value");
		startingInterest = IR4.getDoubleGT("Enter the starting annual interest rate as a percent (n.nnn) : ", 0, "You must put a positive value");
		//endingInterest = IR4.getIntegerGT("Enter the ending annual interest rate as a percent (n.nnn) : ", 0, "You must put a positive value");
		int firstTerm = IR4.getIntegerGT("Enter the first term in years for calculating payments : ", 0, "You must put a positive value");
		//int lastTerm = IR4.getIntegerGT("Enter the last term in years for calculating payments : ", 0, "You must put a positive value");
		System.out.printf("%.2f", monthlyPayment(startingInterest, firstTerm));

	}
	// -----------------------------------------------------------------------------------------------------------------
	public static double convertToDouble(int percent) {
		return percent / 100;
	}
	public static double monthlyPayment(double interest, int term){
		double monthlyInterestRate = (interest / 100) / 12;
		int monthToPay = term *12;
		double numerator = monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, monthToPay));
		double denominator = (Math.pow(1 + monthlyInterestRate, monthToPay) - 1);
		double annuityFactor = numerator / denominator;
		return annuityFactor * loanAmount;
	}
}


