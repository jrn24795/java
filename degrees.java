/**
Student Name: Jamal Nwaubani

Student ID: 022028146

Section: JAC444S1Q
 */

package assignments;

import java.util.Scanner;

public class degrees {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Create new Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user to input a double
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();

		// Convert Fahrenheit to Celsius
		double celsius = (fahrenheit - 32) * 5 / 9.0;

		// Display results
		System.out.println(fahrenheit + " Fahrenheit is " + celsius
			+ " Celsius"); 
	}
}