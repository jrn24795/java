/*
 * Student Name: Jamal Nwaubani
 * Student ID: 022028146
 * Section: JAC444
 */
package assignments;

public class diamond
{
   public static void main(String[] args) {
    
	// size of rows
    int size = 9;

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