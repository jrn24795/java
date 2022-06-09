/*
 * Student Name: Jamal Nwaubani
 * Student ID: 022028146
 * Section: JAC444
 */

package assignments;

import java.util.Scanner;

public class diamondv2
{
   @SuppressWarnings("resource")
public static void main(String[] args) {
	   
	   Scanner input = new Scanner(System.in);

		// Prompt user to input a int
		System.out.print("Enter a odd number between 1 to 9: ");
		int size = input.nextInt();

    // nested for loop fill in rows wit * for top half
    for (int i = 1; i < size; i += 2) {
    	
        for (int k = size; k >= i; k -= 2) {
            System.out.print(" ");
        }
        
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        
        System.out.println();
    }

    // nested for loop fill in rows with * for bottom half
    for (int i = 1; i <= size; i += 2) {
    	
        for (int k = 1; k <= i; k += 2) {
            System.out.print(" ");
        }
        
        for (int j = size; j >= i; j--) {
            System.out.print("*");
        }
        System.out.println();
    }

  }
}