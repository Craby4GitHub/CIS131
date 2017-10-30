/********************************************************************************************************************
 * Lab5.java 
 * Author: Will Crabtree 
 * CIS 131: Programming and Problem Solving II
 * 
 * No user input, yay! 
 * Generates random values for everything. Nothing should break...
 ********************************************************************************************************************/


public class Lab5 {
	
	
	static final double overtimeRate = 1.75;
	static final int overtimeHourAmount = 40;

	// Variable variables! 
	// Make sure the lower number is on the left. Im too lazy to test for that.
	static int[] variableEmpNo = {1000, 9999};
	static int[] variableHours = {30, 50};
	static int[] variablePay = {7, 20};
	static int maxNumOfEmp = 6;
	
	public static void main(String[] args) {

		// Setup those arrays!
		int[] empNo = new int[maxNumOfEmp];
		double[] payRate = new double[maxNumOfEmp];
		double[] hoursWorked = new double[maxNumOfEmp];
		double[] regularPay = new double[maxNumOfEmp];
		double[] overtimePay = new double[maxNumOfEmp];
		double[] totalPay = new double[maxNumOfEmp];
		
		
		// Get all that work done.
		generateRandomEmpNum(empNo);
		generateRandomPayRate(payRate);
		generateRandomnHoursWorked(hoursWorked);
		calcPay(payRate, hoursWorked, regularPay, totalPay, overtimePay);
		printAllTheThings(empNo, payRate, hoursWorked, regularPay, totalPay, overtimePay);
	}

	// -----------------------------------------------------------------------------------------------------------------
	
	// Make a random payrate, includes .00 and .50
	public static void generateRandomPayRate(double[] inputArray) {
		// 2 for halfs, 3 for thirds, 4 for fourths, ect...
		int decimalAmount = 2;
		for (int i = 0; i < maxNumOfEmp; i++) {
			inputArray[i] = Math.floor(IR4.getRandomDoubleNumber(variablePay[0], variablePay[1]) * decimalAmount) / decimalAmount;
		}
	}

	// Make a random number of hours worked
	public static void generateRandomnHoursWorked(double[] inputArray) {
		// // 2 for halfs, 3 for thirds, 4 for fourths, ect...
		int decimalAmount = 2;
		for (int i = 0; i < maxNumOfEmp; i++) {
			inputArray[i] = Math.floor(IR4.getRandomDoubleNumber(variableHours[0], variableHours[1]) * decimalAmount) / decimalAmount;
		}
	}

	// Makes a random emp number
	public static void generateRandomEmpNum(int[] inputArray) {
		for (int i = 0; i < maxNumOfEmp; i++) {
			int genEmpNum = IR4.getRandomNumber(variableEmpNo[0], variableEmpNo[1]);
			// Use this to make sure the dupe check works.
			// int genEmpNum = 0000;
			for (int index = 0; index < maxNumOfEmp; index++) {
				if (genEmpNum == inputArray[index]) {
					genEmpNum = IR4.getRandomNumber(variableEmpNo[0], variableEmpNo[1]);
					System.out.println("There was a dupe! What are the chances of that?!");
				} else {
				}
			}
			inputArray[i] = genEmpNum;
		}
	}

	// calculate the total pay
	public static void calcPay(double[] payRateArray, double[] hoursWorkedArray, double[] regularPayArray, double[] totalPayArray, double[] overtimePayArray) {
		for (int index = 0; index < maxNumOfEmp; index++) {
			
			// If they didnt work overtime...
			if (hoursWorkedArray[index] <= overtimeHourAmount) {
				regularPayArray[index] = hoursWorkedArray[index] * payRateArray[index];
				totalPayArray[index] = regularPayArray[index];
			} 
			
			// If they did work overtime...
			else if (hoursWorkedArray[index] >= overtimeHourAmount) {
				overtimePayArray[index] = (hoursWorkedArray[index] - overtimeHourAmount) * (payRateArray[index] * overtimeRate);
				regularPayArray[index] = overtimeHourAmount * payRateArray[index];
				totalPayArray[index] = overtimePayArray[index] + regularPayArray[index];
			} 
			
			// Dont break stuff, jeez...
			else {
				System.out.print("You broke it. Stop that.");
			}
		}
	}

	// Prints the stuff.
	public static void printAllTheThings(int[] empNoArray, double[] payRateArray, double[] hoursWorkedArray, double[] regularPayArray, double[] totalPayArray, double[] overtimePayArray){
		System.out.printf("%-15s", "Employee #");
		System.out.printf("%-15s", "Pay Rate");
		System.out.printf("%-14s", "Hours worked");
		System.out.printf("%-15s", "Regular pay");
		System.out.printf("%-15s", "Overtime pay");
		System.out.printf("%-10s", "Total pay\n");
	
		for (int i = 0; i < maxNumOfEmp; i++) {
			System.out.printf("%-15s$", empNoArray[i]);
			System.out.printf("%-14.2f", payRateArray[i]);
			System.out.printf("%-14.2f$", hoursWorkedArray[i]);
			System.out.printf("%-14.2f$", regularPayArray[i]);
			System.out.printf("%-14.2f$", overtimePayArray[i]);
			System.out.printf("%-14.2f\n", totalPayArray[i]);
		}
	}
}
