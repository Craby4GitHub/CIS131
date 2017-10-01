import java.util.ArrayList;
import java.util.List;


public class Lab2 {
	private static int[][] cart;
	private static double smallDiscount = .10;
	private static double mediumDiscount = .15;
	private static double largeDiscount = .20;
	private static int[] smallDiscountRange = {4, 6};
	private static int[] mediumDiscountRange = {7, 9};
	private static int[] largeDiscountRange = {10};
	private static int[] shippingCost = {5, 40};
	private static String[][] products = { { "Product Name", "Price", "Product #" }, { "Small Cap", "4.50", "1" },
			{ "Medium Cap", "7.00", "2" }, { "Large Cap", "9.00", "3" } };

	public static void main(String[] args) {
		
		
		//ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
		List<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
		//ArrayList<Integer> array = new ArrayList<Integer>();
		
		boolean buyMore;
		do {
			 //printProducts();
			 //printDiscounts();
			ArrayList<Integer> row = new ArrayList<Integer>();
			int productSelection = getProduct("Please select the Product #.");
			int capQuanity = IR4.getIntegerGT("How many would you like to purchase?", 0, "Please try again.");
			
			
			row.add(productSelection);
			row.add(capQuanity);
			
			
			System.out.println("Arraylist contains: " + array);
		

			
			buyMore = IR4.getYorN("Would you like to buy another product?");
			} while (buyMore);
	}

	// -----------------------------------------------------------------------------------------------------------------


	
	public static int getProduct(String productNumber) {
		boolean selectionError = false;
		int answer = 0;
		while (!selectionError) {
			answer = IR4.getInteger(productNumber);
			if (answer > products.length - 1) {
				System.out.println("That product number is not valid, try again.");
				System.out.println("--------------------------------------------");
			} else if (answer < 0) {
				System.out.println("That product number is not valid, try again.");
				System.out.println("--------------------------------------------");
			} else {
				selectionError = true;
			}

		}
		return answer;
	}

	public static boolean shipping(int finalPrice) {
		if (finalPrice < shippingCost[1]) {
			return true;
		} else {
			return false;
		}
	}

	private static void printProducts() {
		for (String[] row : products) {
			printRow(row);
		}
	}
	
	private static void printRow(String[] row) {
		for (String i : row) {
			System.out.printf("%-8s", i);
			System.out.print("\t");
		}
		System.out.println();
	}

	private static void printDiscounts() {
		System.out.println("Discounts available:");
		System.out.printf("%.0f", smallDiscount * 100);
		System.out.println("% for buying " + smallDiscountRange[0] + " to " + smallDiscountRange[1] + " caps.");
		System.out.printf("%.0f", mediumDiscount * 100);
		System.out.println("% for buying " + mediumDiscountRange[0] + " to " + mediumDiscountRange[1] + " caps.");
		System.out.printf("%.0f", largeDiscount * 100);
		System.out.println("% for buying " + largeDiscountRange[0] + " or more caps.");
		System.out.println("Discounts are applied for any combination of caps.");
	}
}