/**
Student Name: Jamal Nwaubani

Student ID: 022028146

Section: JAC444S1Q
 */

package assignments;

import java.util.Scanner;

public class divisible {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create Scanner object

		// Prompt user to an integer
		System.out.print("Enter an integer: ");
		int num = input.nextInt(); 

		// Determine whether it is divisible by 5 and 6
		// Display results
		System.out.println("Is " + num + " divisible by 5 and 6? " +
			((num % 5 == 0) && (num % 6 == 0)));
		System.out.println("Is " + num + " divisible by 5 or 6? " +
			((num % 5 == 0) || (num % 6 == 0)));
		System.out.println("Is " + num + " divisible by 5 of 6, but not both? " +
			((num % 5 == 0) ^ (num % 6 == 0)));
	}
}