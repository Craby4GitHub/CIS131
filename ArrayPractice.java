/***********************************************************************************************
 * This program creates a 3 x 3 matrix and determines which row and column
 * contains the most 1s.
 * 
 * To Do: 
 * 1. Read what you are supposed to do with the program. 
 * 2. Read the program to see how it works. Compile it. Run it. Don't change it (yet). 
 * 3. Write down the order of the steps you will do to make the required changes to this program. 
 * 4. Show your plan to the instructor. 
 * 5. If the plan is acceptable, change the program as described below.
 * 
 * Change the program to: 
 * 1. Change the program to randomly seed the matrix with numbers from 0 to 9 instead of 0 to 1. 
 * 2. Create a Module named checkRows to check the rows for the row with the most 1s. 
 * 3. Create a Module named checkColumns to check the columns for the row with the most 1s. 
 * 4. Create a Module named generateMatrix to generate and print the matrix. 
 * 5. Create a Module named printMatrix that uses the Foreach loop format to print the matrix. Call the printMatrix module last in main(). 
 * 6. Create global constants to hold the MAX_ROWS and MAX_COLUMNS values and use in the program to create and process a 5 x 7 matrix.
 * 
 * Other considerations: 
 * a. Only the minimum amount of code should be in main().(6 statements) 
 * b. The definition of the array matrix should remain in main().
 * c. By changing the size constants, the program should work with other arrays of other sizes also, such as 3 x 8, 9 x 4, etc.
 ***********************************************************************************************/
public class ArrayPractice {
	static int MAX_ROWS = 5;
	static int MAX_COLUMNS = 7;
	static int columnIndex = 0;
	static int rowIndex = 0;

	public static void main(String[] args) {
		int[][] matrix = new int[MAX_ROWS][MAX_COLUMNS];
		generateMatrix(matrix);
		checkColumns(matrix);
		checkRows(matrix);
		printStuff();
		printMatrix(matrix);
	}// end main

	// -----------------------------------------------------------------------------
	
	public static void printStuff(){
		System.out.println("The largest row index:    " + rowIndex);
		System.out.println("The largest column index: " + columnIndex);
	}

	public static void generateMatrix(int[][] array) {

		// create and print matrix
		for (int i = 0; i < MAX_ROWS; i++) {
			for (int j = 0; j < MAX_COLUMNS; j++) {
				array[i][j] = (int) (Math.random() * 10);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printMatrix(int[][] array) {
		for (int[] row : array) {
			for (int i : row) {
				System.out.print(i);
				System.out.print("\t");
			}
			System.out.println();
			;
		}
	}

	
	public static void checkColumns(int[][] array) {
		// check each column's total
		int columnSum = sumColumn(array, 0);

		for (int j = 1; j < MAX_COLUMNS; j++) {
			if (columnSum < sumColumn(array, j)) {
				columnSum = sumColumn(array, j);
				columnIndex = j;
			}
		}

	}

	public static void checkRows(int[][] matrix) {
		// check each row's total
		int rowSum = sumRow(matrix[0]);

		for (int i = 1; i < MAX_ROWS; i++) {
			if (rowSum < sumRow(matrix[i])) {
				rowSum = sumRow(matrix[i]);
				rowIndex = i;
			}
		}

	}

	public static int sumRow(int row[]) {
		int sum = 0;
		for (int i = 0; i < row.length; i++)
			sum += row[i];
		return sum;
	}

	public static int sumColumn(int matrix[][], int column) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++)
			sum += matrix[i][column];
		return sum;
	}

}// end of class