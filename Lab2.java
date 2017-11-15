

/********************************************************************************************************************
  * Lab2.java
  * Author: Will Crabtree
  * CIS 131: Programming and Problem Solving II
  * 
  * Shows user the products they can buy and the possible discounts.
  * Then has user input corresponding product number and quantity.
  * Once done, it will print out the totals of everything.
  * 
  ********************************************************************************************************************/

import java.util.ArrayList;
import java.util.List;

public class Lab2 {
	

	static List<Integer> cartProduct = new ArrayList<Integer>();
	static List<Integer> cartQuanity = new ArrayList<Integer>();
	private static double smallDiscount = .10;
	private static double mediumDiscount = .15;
	private static double largeDiscount = .20;
	private static int[] smallDiscountRange = { 4, 6 };
	private static int[] mediumDiscountRange = { 7, 9 };
	private static int[] largeDiscountRange = { 10 };
	private static int[] shippingCost = { 5, 40 };
	private static Object[][] productList = { 
			{ "Product Name", "Price", "Product #" }, 
			{ "Small Cap", 4.50, 1 },
			{ "Medium Cap", 7.00, 2 }, 
			{ "Large Cap", 9.00, 3 } };

	public static void main(String[] args) {
		// Loop to user can input multiple items
		boolean buyMore;
		do {

			printmultiDimensionalArray(productList);
			printDiscounts();

			// Get product that user wants to buy
			int productSelection = getProduct("Please select the Product #.");

			// Get quantity of product that user wants to buy
			int productQuanity = IR4.getIntegerGT("How many would you like to purchase?", 0, "Invalid number of items. Please enter a number greater than zero.");

			// Put those values into an array
			cartProduct.add(productSelection);
			cartQuanity.add(productQuanity);

			// Ask if they want to buy more
			buyMore = IR4.getYorN("Would you like to buy another product?");
			
		} while (buyMore);

		printTotals();
	}

	// -----------------------------------------------------------------------------------------------------------------


	// Figure out of there are any discounts the user gets
	public static double discountCalc() {

		int result = 0;
		for (int i = 0; i < cartQuanity.size(); i++) {
			result += cartQuanity.get(i);
		}
		if ((result <= smallDiscountRange[1]) && (result >= smallDiscountRange[0])) {
			return smallDiscount * getPriceOfProducts();
		} else if ((result <= mediumDiscountRange[1]) && (result >= mediumDiscountRange[0])) {
			return mediumDiscount * getPriceOfProducts();
		} else if (result >= largeDiscountRange[0]) {
			return largeDiscount * getPriceOfProducts();
		} else {
			return 0;
		}
	}

	// Get the total price of the users cart
	public static double getPriceOfProducts() {
		double result = 0;
		for (int i = 0; i < cartProduct.size(); i++) {
			result += getTotal(i);
		}
		return result;
	}

	// Get the total price of a hat times quantity
	public static double getTotal(int c) {
		double price = (Double) productList[cartProduct.get(c)][1] * cartQuanity.get(c);
		return price;
	}

	// Get product number from user, with validation
	public static int getProduct(String productNumber) {
		boolean selectionError = false;
		int answer = 0;
		while (!selectionError) {
			answer = IR4.getInteger(productNumber);
			if (answer > productList.length - 1) {
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

	// Figure out if they get a shipping discount
	public static int getShippingCost(double netPrice) {
		if (netPrice < shippingCost[1]) {
			return shippingCost[0];
		} else {
			return 0;
		}
	}

	/*
	*	All the display methods
	*/

	// Print the totals of all the things
	public static void printTotals() {

		for (int i = 0; i < cartProduct.size(); i++) {
			System.out.printf("Product " + cartProduct.get(i) + ": " + productList[cartProduct.get(i)][0]);
			System.out.printf(" Unit price: $" + "%.2f", productList[cartProduct.get(i)][1]);
			System.out.printf(" Quantity: " + cartQuanity.get(i));
			System.out.printf(" Total price: $" + "%.2f", getTotal(i));
			System.out.println();
		}

		double priceOfProducts = getPriceOfProducts();
		double discount = discountCalc();
		double netPurchaseAmount = getPriceOfProducts() - discountCalc();
		double shippingCost = getShippingCost(getPriceOfProducts() - discountCalc());
		double totalCost = netPurchaseAmount + shippingCost;

		System.out.printf("Product Total: " + "%.2f", priceOfProducts);
		System.out.println();
		System.out.printf("Discount: " + "%.2f", discount);
		System.out.println();
		System.out.printf("Net Amount: " + "%.2f", netPurchaseAmount);
		System.out.println();
		System.out.printf("Shipping Cost: " + "%.2f", shippingCost);
		System.out.println();
		System.out.printf("Total Cost: " + "%.2f", totalCost);
	}
	
	// Print multiDimensional array
	private static void printmultiDimensionalArray(Object[][] array) {
		for (Object[] row : array) {
			printSingleArray(row);
		}
	}

	// Print single array
	private static void printSingleArray(Object[] row) {
		for (Object i : row) {
			System.out.print(i);
			System.out.print("\t");
		}
		System.out.println();
	}

	// Print all the discounts
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