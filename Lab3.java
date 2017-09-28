
public class Lab3 {
	private static int endingInterest;
	private static int startingInterest;

	public static void main(String[] args) {
		int loanAmount = IR4.getIntegerGT("Enter the loan amount : ", 0, "You must put a postive value");
		startingInterest = IR4.getIntegerGT("Enter the starting annual interest rate as a percent (n.nnn) : ", 0, "You must put a postive value");
		doubleGreaterThan(IR4.getIntegerGT("Enter the ending annual interest rate as a percent (n.nnn) : ", 0, "You must put a postive value"));
		int firstTerm = IR4.getIntegerGT("Enter the first term in years for calculating payments : ", 0,
				"You must put a postive value");
		int lastTerm = IR4.getIntegerGT("Enter the last term in years for calculating payments : ", 0,
				"You must put a postive value");

	}

	public static double convertToDouble(int percent) {
		return percent / 100;
	}

	public static void doubleGreaterThan(int doubleCheck) {
		//endingInterest = IR4.getIntegerGT("Enter the ending annual interest rate as a percent (n.nnn) : ", 0, "You must put a postive value");
		if (doubleCheck < startingInterest){
			System.out.println("Please enter a rate higher than " + startingInterest);
			endingInterest = IR4.getIntegerGT("Enter the ending annual interest rate as a percent (n.nnn) : ", 0, "You must put a postive value");
		}else{
			
		}

	}
}
