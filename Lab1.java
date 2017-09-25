
/********************************************************************************************************************
  * GarageCalc.java
  * Author: Will Crabtree
  * CIS 131: Programming and Problem Solving II
  ********************************************************************************************************************/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab1 {
	static Scanner keyboard = new Scanner(System.in);
	public static double rate;
	private static int minFee;
	private static int maxFee;
	private static int totalPrice;
	static DecimalFormat df = new DecimalFormat("#.00");

	public static void main(String[] args) {
		String arrivalDay = getDay("Please enter the day of the week (mon, tue, wed, thu, fri, sat, sun):");
		int arrivalTime = getTime("Please enter the vehicle’s arrival time (HHMM)");
		int departureTime = getTime("Please enter the vehicle’s departure time (HHMM):");
		System.out.printf("Day of week: " + arrivalDay + ", Parking duration in minutes: "
				+ (calcHourDiff(arrivalTime, departureTime)) * 15 + ", rate: $" + df.format(chargeRate(arrivalDay))
				+ ", amount charged: $" + df.format(totalPrice(arrivalDay, arrivalTime, departureTime)));
		keyboard.close();
	}

	// -----------------------------------------------------------------------------------------------------------------
	public static int getTime(String userInputTime) {
		boolean userTimeSelection = false;
		int answer = 0;
		while (!userTimeSelection) {
			answer = IR4.getInteger(userInputTime);
			if (answer > 2359 || answer < 0) {
				System.out.println("The time " + answer + " is not between the proper range.");
			} else {
				userTimeSelection = true;
				break;
			}
		}
		return answer;
	}

	public static String getDay(String userInputDay) {
		String[] validDays = { "mon", "tue", "wed", "thr", "fri", "sat", "sun" };
		boolean userDaySelection = false;
		String answer = "";
		while (!userDaySelection) {
			answer = IR4.getString(userInputDay);
			for (int c = 0; c < validDays.length; c++) {
				if (!validDays[c].equals(answer)) {
				} else {
					userDaySelection = true;
					break;
				}
			}
		}
		return answer;
	}

	public static double calcHourDiff(int arrT, int depT) {
		int arrHourToMin = ((arrT / 100) * 60);
		int depHourToMin = ((depT / 100) * 60);
		double arrMin = (arrT % 100);
		double depMin = (depT % 100);
		return Math.round((((depHourToMin + depMin) - (arrHourToMin + arrMin)) / 15));

	}

	public static double totalPrice(String aDay, int aT, int dT) {

		chargeRate(aDay);
		double ratedPrice = (calcHourDiff(aT, dT) * rate);
		if (ratedPrice <= minFee) {
			totalPrice = minFee;
			return totalPrice;
		} else if (ratedPrice >= maxFee) {
			totalPrice = maxFee;
			return totalPrice;
		} else {
			return ratedPrice;
		}
	}

	public static double chargeRate(String dayMatch) {
		if (dayMatch.matches("mon|tue|wed|thr|fri")) {
			rate = 1.25;
			minFee = 3;
			maxFee = 20;
			return rate;
		} else {
			rate = .5;
			minFee = 2;
			maxFee = 15;
			return rate;
		}
	}
}