/********************************************************************************************************************
 * Lab5.java 
 * Author: Will Crabtree 
 * CIS 131: Programming and Problem Solving II
 * 
 * No user input, yay! 
 * Generates random values for everything. Nothing should break...
 ********************************************************************************************************************/

public class Lab5 {
	static int maxNumOfEmp = 6;
	static int[] empNo = new int[maxNumOfEmp];
	static double[] payRate = new double[maxNumOfEmp];
	static double[] hoursWorked = new double[maxNumOfEmp];
	static double[] regularPay = new double[maxNumOfEmp];
	static double[] overtimePay = new double[maxNumOfEmp];
	static double[] totalPay = new double[maxNumOfEmp];
	static double overtimeRate = 1.75;
	static int overtimeHourAmount = 40;

	// Variable variables! 
	// Make sure the lower number is on the left. Im too lazy to test for that.
	static int[] variableEmpNo = {1000, 9999};
	static int[] variableHours = {30, 50};
	static int[] variablePay = {7, 20};

	public static void main(String[] args) {
		generateRandomEmpNum();
		generateRandomPayRate();
		generateRandomnHoursWorked();
		calcPay();
		printAllTheThings();
	}

	// -----------------------------------------------------------------------------------------------------------------
	public static void generateRandomPayRate() {
		for (int i = 0; i < maxNumOfEmp; i++) {
			payRate[i] = Math.floor(IR4.getRandomDoubleNumber(variablePay[0], variablePay[1]) * 4) / 4;
		}
	}

	public static void generateRandomnHoursWorked() {
		for (int i = 0; i < maxNumOfEmp; i++) {
			hoursWorked[i] = Math.floor(IR4.getRandomDoubleNumber(variableHours[0], variableHours[1]) * 2) / 2;
		}
	}

	public static void generateRandomEmpNum() {
		for (int i = 0; i < maxNumOfEmp; i++) {
			int genEmpNum = IR4.getRandomNumber(variableEmpNo[0], variableEmpNo[1]);
			// Use this to make sure the dupe check works.
			// int genEmpNum = 0000;
			for (int index = 0; index < maxNumOfEmp; index++) {
				if (genEmpNum == empNo[index]) {
					genEmpNum = IR4.getRandomNumber(variableEmpNo[0], variableEmpNo[1]);
					System.out.println("There was a dupe! What are the chances of that?!");
				} else {
				}
			}
			empNo[i] = genEmpNum;
		}
	}

	public static void calcPay() {
		for (int index = 0; index < maxNumOfEmp; index++) {
			if (hoursWorked[index] <= overtimeHourAmount) {
				regularPay[index] = hoursWorked[index] * payRate[index];
				totalPay[index] = regularPay[index];
			} else if (hoursWorked[index] >= overtimeHourAmount) {
				overtimePay[index] = (hoursWorked[index] - overtimeHourAmount) * (payRate[index] * overtimeRate);
				regularPay[index] = overtimeHourAmount * payRate[index];
				totalPay[index] = overtimePay[index] + regularPay[index];
			} else {
				System.out.print("You broke it. Stop that.");
			}
		}
	}

	public static void printAllTheThings(){
		System.out.printf("%-15s", "Employee #");
		System.out.printf("%-15s", "Pay Rate");
		System.out.printf("%-14s", "Hours worked");
		System.out.printf("%-15s", "Regular pay");
		System.out.printf("%-15s", "Overtime pay");
		System.out.printf("%-10s", "Total pay\n");
	
		for (int i = 0; i < maxNumOfEmp; i++) {
			System.out.printf("%-15s$", empNo[i]);
			System.out.printf("%-14.2f", payRate[i]);
			System.out.printf("%-14.2f$", hoursWorked[i]);
			System.out.printf("%-14.2f$", regularPay[i]);
			System.out.printf("%-14.2f$", overtimePay[i]);
			System.out.printf("%-14.2f\n", totalPay[i]);
		}
	}
}
