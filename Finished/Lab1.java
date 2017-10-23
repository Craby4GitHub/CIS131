
/********************************************************************************************************************
  * Lab1.java
  * Author: Will Crabtree
  * CIS 131: Programming and Problem Solving II
  * 
  * Asks for the arrival day and time of the customer. Then if they left the same day, and lastly the departure time.
  * Then calculate how much they owe.
  * 
  ********************************************************************************************************************/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab1 {
	private static boolean departureDay = false;
	private static Scanner keyboard = new Scanner(System.in);
	public static double rate;
	public static int minFee;
	public static int maxFee;
	private static int totalPrice;
	private static DecimalFormat df = new DecimalFormat("#.00");
	private static int departureTime;

	public static void main(String[] args) {
		// Get Arrival Day
		String arrivalDay = getDay("Please enter the day of the week (mon, tue, wed, thu, fri, sat, sun):");

		// Get Arrival Time
		int arrivalTime = getTime("Please enter the vehicle’s arrival time (HHMM)");

		// Figure out if they stay over a day
		departureDay = IR4.getYorN("Did the customer leave the same day they arrived?");
		if (departureDay) {
			do {
				departureTime = getTime("Please enter the vehicle’s departure time (HHMM):");
			} while (departureTime < arrivalTime);

		} else {
			departureTime = getTime("Please enter the vehicle’s departure time (HHMM):");
		}

		// Print out all the info
		System.out.printf("Day of week: " + arrivalDay + ", Parking duration in minutes: "
				+ (calcHourDiff(arrivalTime, departureTime)) * 15 + ", rate: $" + df.format(chargeRate(arrivalDay))
				+ ", amount charged: $" + df.format(totalPrice(arrivalDay, arrivalTime, departureTime)));
		keyboard.close();
	}

	// -----------------------------------------------------------------------------------------------------------------

	// Make sure time is between 0 and 2359. Note, time cannot be 2400. Also check for mins to be under 59
	public static int getTime(String userInputTime) {
		boolean userTimeSelection = false;
		int answer = 0;
		while (!userTimeSelection) {
			answer = IR4.getInteger(userInputTime);
			if (answer > 2359 || answer < 0) {
				System.out.println("The time " + answer + " is not between the proper range.");
			} else if (answer % 100 > 59) {
				System.out.println("Seems like you went over 59 mins, thats no good, try again");
			} else {
				userTimeSelection = true;
				break;
			}
		}
		return answer;
	}

	// Make sure user inputs the correct day input
	public static String getDay(String userInputDay) {
		String[] validDays = { "mon", "tue", "wed", "thu", "fri", "sat", "sun" };
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

	// All the math for getting the total time they stayed
	public static double calcHourDiff(int arrT, int depT) {
		int arrHourToMin = ((arrT / 100) * 60);
		int depHourToMin = ((depT / 100) * 60);
		double arrMin = (arrT % 100);
		double depMin = (depT % 100);

		if (departureDay) {
			return Math.ceil((((depHourToMin + depMin) - (arrHourToMin + arrMin)) / 15));
		} else {
			return Math.ceil((((1440 - (arrHourToMin + arrMin)) + (depHourToMin + depMin)) / 15));
		}

	}

	// All the math for getting the total price
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

	// Figure out the rate
	public static double chargeRate(String dayMatch) {
		if (dayMatch.matches("mon|tue|wed|thu|fri")) {
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