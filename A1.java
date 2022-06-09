/*
 * Student Name: Jamal Nwaubani
 * Student ID: 022028146
 * Section: JAC444
 */

package assignments;
import java.util.*; 

public class A1 {
 @SuppressWarnings("resource")
 
// main 
public static void main(String[] args)
 {
        Scanner in = new Scanner(System.in);	
        System.out.print("Input a positive integer: ");
        int n = in.nextInt(); //scans for user input
        System.out.printf("Square root of %d is: ",n);
		System.out.println(sqrt(n)); 
    }
    
private static int sqrt(int num) {
	//checks if the value of num is either 1 or 0
        if (num == 0 || num == 1) {
			return num;
		}
        
        // declaring of values a & b
		int a = 0; 
		int b = num;
		
		//finding the square root of the number
		while (a <= b) {
			int mid = (a + b) >> 1;
		
			if (num / mid < mid) {
				b = mid - 1;
			}
			else {
				if (num / (mid + 1) <= mid) {
					return mid;
				}
				a = mid + 1;
			}
		}
		return a;
	}
}
