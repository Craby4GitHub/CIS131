/********************************************************************************************************************
 * Exercise 7_15.java 
 * Author: Will Crabtree 
 * CIS 131: Programming and Problem Solving II
 * 
 * write a method that returns a new array by eliminating the duplicate values in the array
 * write a test program that reads in ten ints, invokes the mthod and displays the result
 ********************************************************************************************************************/
public class Exercise_6_7_15 {
	
	static int arraySize = 10;
	
	public static void main(String[] args) {

		int[] numberArray = new int[arraySize];

		for (int i = 0; i < numberArray.length; i++)
			numberArray[i] = IR4.getInteger("Enter a number: ");
		
		int[] uniqueNumbers = eliminateDuplicates(numberArray);

		printArray(uniqueNumbers);
		

	}
	// -----------------------------------------------------------------------------------------------------------------

	public static int[] eliminateDuplicates(int[] array) {
		
		int[] uniqueList = new int[array.length];
		int i = 0;
		for (int e : array) {
			if (search(uniqueList, e) == -1) {
				uniqueList[i] = e;
				i++;
			}
		}
		return uniqueList;
	}

	public static int search(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
		return -1;
	}
	public static void printArray(int[] array) {
		
		System.out.print("The unique numbers are:");
        for (int i = 0; i < array.length; i++) {
        	if(array[i] != 0){
        		System.out.print(array[i] + " ");
        	}
        	
        }
}

}
