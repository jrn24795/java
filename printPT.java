/*
 * Student Name: Jamal Nwaubani
 * Student ID: 022028146
 * Section: JAC444
 */

package assignments;

public class printPT {
	public static void triangle(int rows) {
		for (int i = 0; i < rows; i++) {
			
			int number = 1;
			System.out.printf("%" + (rows - i) * 2 + "s", ""); //arranges the numbers to form a triangle
			
			for (int j = 0; j <= i; j++) {
			System.out.printf("%4d", number); // prints numbers
			number = number * (i-j)/(j+1); //add each number side by side to get the total
		}
		System.out.println();
		}
	}
}
