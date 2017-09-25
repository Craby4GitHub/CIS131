
public class Lab2 {
	private static double smallDiscount = .10;
	private static double mediumDiscount = .15;
	private static double largeDiscount = .20;
	private static int[] smallDiscountRange = {4, 6};
	private static int[] mediumDiscountRange = {7, 9};
	private static int[] largeDiscountRange = {10};
	private static int[] shippingCost = {5, 40};
	private static String[][] products = { 
			{ "Product Name", "Price", "Product #"},
			{ "Small Cap", "4.50", "1"},
			{ "Medium Cap", "7.00", "2"}, 
			{ "Large Cap", "9.00", "3"} };

	public static void main(String[] args) {

		for (String[] row : products) {
			printRow(row);
		}
		printDiscounts();
		String purchaseSelection = IR4.getString("Please select the Product # in which you would like to pruchase.");
		int capQuanity = IR4.getIntegerGT("How many would you like to purchase?", 1, "That doesn't seem right, please try again.");
		boolean buyMore = IR4.getYorN("Would you like to buy another product?");

	}

	public static boolean shipping(int finalPrice){
		if (finalPrice < shippingCost[1]){
			return true;
		}
		else{
			return false;
		}
	}

	public static void printRow(String[] row) {
		for (String i : row) {
			System.out.printf("%-8s", i);
			System.out.print("\t");
		}
		System.out.println();
	}

	public static void printDiscounts() {
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