
/**
 * Chapter 12 Exercise 15:
 *
 * (Write/read data) Write a program to create a file named Exercise12_15.txt if
 * it does not exist. Write 100 integers created randomly into the file using
 * text I/O. Integers are separated by spaces in the file. Read the data back
 * from the file and display the data in increasing order.
 *
 */

import java.util.*;
import java.io.*;

public class Exercise_11_12_15 {

	public static void main(String[] args) throws Exception {

		File file = new File("Exercise12_15.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}

		try (

				PrintWriter output = new PrintWriter(file);) {

			for (int i = 0; i < 100; i++) {
				output.print(((int) (Math.random() * 500) + 1));
				output.print(" ");
			}
		}

		ArrayList<Integer> list = new ArrayList<>();

		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				list.add(input.nextInt());
			}
		}

		Collections.sort(list);

		System.out.print(list.toString());
		System.out.println();
	}
}