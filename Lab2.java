
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

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Lab2 {
	private static DecimalFormat df = new DecimalFormat("#.00");
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
		boolean buyMore;
		do {
			printProducts(productList);
			printDiscounts();

			int productSelection = getProduct("Please select the Product #.");
			int productQuanity = IR4.getIntegerGT("How many would you like to purchase?", 0, "Invalid number of items. Please enter a number greater than zero.");

			cartProduct.add(productSelection);
			cartQuanity.add(productQuanity);

			buyMore = IR4.getYorN("Would you like to buy another product?");
		} while (buyMore);

		printTotals();
	}

	// -----------------------------------------------------------------------------------------------------------------
	public static void printTotals() {
		for (int i = 0; i < cartProduct.size(); i++) {
			System.out.println("Product " + cartProduct.get(i) + ": " + productList[cartProduct.get(i)][0]
					+ " unit price: $" + df.format(productList[cartProduct.get(i)][1]) + " - quantity: "
					+ cartQuanity.get(i) + " - Total price: $" + df.format(getTotal(i)));
		}

		double priceOfProducts = priceOfProducts();
		double discount = discountCalc();
		double netPurchaseAmount = priceOfProducts() - discountCalc();
		int shippingCost = shipping(priceOfProducts() - discountCalc());
		double totalCost = netPurchaseAmount + shippingCost;

		Object[][] test = { 
				{ "Product Total: ", df.format(priceOfProducts) }, 
				{ "Discount: ", df.format(discount) },
				{ "Net Amount: ", df.format(netPurchaseAmount) }, 
				{ "Shipping Cost: ", df.format(shippingCost) },
				{ "Total Cost: ", df.format(totalCost) }, };
		printProducts(test);
	}

	public static double discountCalc() {

		int result = 0;
		for (int i = 0; i < cartQuanity.size(); i++) {
			result += cartQuanity.get(i);
		}
		if ((result <= smallDiscountRange[1]) && (result >= smallDiscountRange[0])) {
			return smallDiscount * priceOfProducts();
		} else if ((result <= mediumDiscountRange[1]) && (result >= mediumDiscountRange[0])) {
			return mediumDiscount * priceOfProducts();
		} else if (result >= largeDiscountRange[0]) {
			return largeDiscount * priceOfProducts();
		} else {
			return 1 * priceOfProducts();
		}
	}

	public static double priceOfProducts() {
		double result = 0;
		for (int i = 0; i < cartProduct.size(); i++) {
			result += getTotal(i);
		}
		return result;
	}

	public static double getTotal(int c) {
		double price = (Double) productList[cartProduct.get(c)][1] * cartQuanity.get(c);
		return price;
	}

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

	public static int shipping(double netPrice) {
		if (netPrice < shippingCost[1]) {
			return shippingCost[0];
		} else {
			return 0;
		}
	}

	private static void printProducts(Object[][] array) {
		for (Object[] row : array) {
			printRow(row);
		}
	}

	private static void printRow(Object[] row) {
		for (Object i : row) {
			System.out.print(i);
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