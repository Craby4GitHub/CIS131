/********************************************************************************************************************
 * Lab5.java 
 * Author: Will Crabtree 
 * CIS 131: Programming and Problem Solving II
 * 
 * 
 * 
 ********************************************************************************************************************/

public class Lab5 {
	static int maxNumOfEmp = 6;
	static int[] empNo = new int[maxNumOfEmp];
	static double[] payRate = new double[maxNumOfEmp];
	static double[] hoursWorked = new double[maxNumOfEmp];
	static double[] regularPay;
	static double[] overtimePay;
	static double[] totalPay;
	
	
	public static void main(String[] args) {
		generateRandomEmpNum();
		generateRandomPayRate();
		generateRandomnHoursWorked();
		
		for(int i = 0;i < maxNumOfEmp;i++){
			System.out.print("Employee number: " + empNo[i]);
			System.out.print(" Hours worked: " + hoursWorked[i]);
			System.out.println(" Pay Rate: " + payRate[i]);
		}
	}
	
	public static void generateRandomPayRate(){
		for(int i = 0;i < maxNumOfEmp;i++){
			payRate[i] = IR4.getRandomNumber(7, 20);
		}
	}
	public static void generateRandomnHoursWorked(){
		for(int i = 0;i < maxNumOfEmp;i++){
			hoursWorked[i] = IR4.getRandomNumber(30, 50);
		}
	}
	
	public static void generateRandomEmpNum(){
		for(int i = 0;i < maxNumOfEmp;i++){
			empNo[i] = IR4.getRandomNumber(1000, 9999);
		}
	}
	
	public static void calcPayRate(int index, double hours){
		if(hours < 40){
			regularPay[index] = hoursWorked[index] * payRate[index];
		}else{
			overtimePay[index] = (hoursWorked[index] - 40) * payRate[index];
			regularPay[index] = 40 * payRate[index];
		}
	}
	
	public static void calcTotalPay(int index){
		totalPay[index] = regularPay[index] + overtimePay[index];
	}
		
}
