/*
 * Student Name: Jamal Nwaubani
 * Student ID: 022028146
 * Section: JAC444
 */

package assignments;

import java.util.Scanner;

public class PascalTriangle{
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //scanner class
		System.out.print("Enter the number of rows: ");
		int num = input.nextInt(); //scans for user input
		printPT.triangle(num); //send user input to java file printPT
	}
}