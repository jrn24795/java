/**
Student Name: Jamal Nwaubani

Student ID: 022028146

Section: JAC444S1Q
 */

package assignments;

import java.util.Scanner;

public class numorg {
	/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] distinctNumbers = new int[7]; // Array of length 7;
		int num; 				// User input
		int count = 0;			// Number of distinct numbers

		// Prompt the user to enter ten numbers
		System.out.println("You can only input 7 numbers!");
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < 7; i++) {
			num = input.nextInt();

			// Test if num is distinct
			if (isDistinct(distinctNumbers, num)) {
				distinctNumbers[count] = num;
				count++;	// Increment count
			}
		}

		// Displays the number of distinct numbers and the  
		// distinct numbers separated by exactly one space
		System.out.println("Number of distinct numbers: " + count);
		System.out.print("Numbers: ");
		for (int i = 0; i < distinctNumbers.length; i++) {
			if (distinctNumbers[i] > 0)
				System.out.print(" " + distinctNumbers[i]);
		}
		System.out.println();
	}

	/** Method isDistinct returns true if number is not in array false otherwise */
	public static boolean isDistinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
	}
}