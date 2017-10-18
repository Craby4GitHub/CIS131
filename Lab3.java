
/********************************************************************************************************************
  * Lab3.java
  * Author: Will Crabtree
  * CIS 131: Programming and Problem Solving II
  * 
  * GEt input from user asking for loan amount, starting/ending interest and the number of years
  * 
  ********************************************************************************************************************/

public class Lab3 {
	private static int firstTerm = 0;
	private static int lastTerm = 0;
	private static double endingInterest;
	private static double startingInterest;
	private static double loanAmount;

	public static void main(String[] args) {
		
		
		///*
		//Quick testing
		loanAmount = IR4.getRandomNumber(0, 10000000);
		startingInterest = 3.00;
		endingInterest = 4.00;
		firstTerm = IR4.getRandomNumber(1,50);
		lastTerm = IR4.getRandomNumber(1,50);
		//*/
		
		/*
		loanAmount = IR4.getIntegerGT("Enter the loan amount : ", 0, "You must put a postive value");
		startingInterest = IR4.getDoubleGT("Enter the starting annual interest rate as a percent (n.nnn) : ", 0, "You must put a value above 0.");
		endingInterest = IR4.getDoubleGT("Enter the ending annual interest rate as a percent (n.nnn) : ", 0, "You must put a positive value");
		firstTerm = IR4.getIntegerGT("Enter the first term in years for calculating payments : ", 0, "You must put a positive value");
		lastTerm = IR4.getIntegerGT("Enter the last term in years for calculating payments : ", 0, "You must put a positive value");
		*/
		printEverything();
	}
	// -----------------------------------------------------------------------------------------------------------------
	
	public static void printEverything(){
		double lowerInterestFirst;
		double higherInterestLast;
		int lowerYearFirst = 0;
		int higherYearLast = 0;
		int yearIncrement = 5;
		double interestIncrement = .25;
		
		// Make lower interest first
		if (startingInterest <  endingInterest){
			lowerInterestFirst = startingInterest;
			higherInterestLast = endingInterest;
			
		}else{
			lowerInterestFirst = endingInterest;
			higherInterestLast = startingInterest;
		}
		
		// Make lower term first
		if (firstTerm <  lastTerm){
			lowerYearFirst = firstTerm;
			higherYearLast = lastTerm;
			
		}else{
			lowerYearFirst = lastTerm;
			higherYearLast = firstTerm;
		}
		
		// Print out the headers
		System.out.printf("%-8s", "Rate");
		int year;
		for (year = lowerYearFirst; year < (higherYearLast + yearIncrement); year += yearIncrement){
			System.out.printf("%-11s", year + " years");
			
		}
		System.out.println();
		
		for (year = lowerYearFirst; year <= (higherYearLast + yearIncrement); year += yearIncrement){
			for (double rate = lowerInterestFirst; rate < (higherInterestLast + interestIncrement);rate += interestIncrement){
				System.out.printf("%-8.2f",rate);
				
				for (year = lowerYearFirst; year < (higherYearLast + yearIncrement); year += yearIncrement){
					System.out.printf("%-11.2f",monthlyPayment(rate, year));
				}
				System.out.println();
			}
		}
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


