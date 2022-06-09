/**
Student Name: Jamal Nwaubani

Student ID: 022028146

Section: JAC444S1Q
 */

package assignments;

public class printout {
	/** Main Method */
	public static void main(String[] args) {
		// Print ten characters per line from 1 to z
		final int NUMBER_OF_CHARS_PER_LINE = 10; // Number of characters per line
		char ch1 = '1';	// Start of range
		char ch2 = 'Z';	// End of range

		System.out.println("\nCharacters per 1 to Z");
		printChars(ch1, ch2, NUMBER_OF_CHARS_PER_LINE);
		System.out.println();
	}
 
    // Prints characters ch1 and ch2 per line                                                 
	public static void printChars(char ch1, char ch2, int
	numberPerLine) {
		for (char c = ch1, count = 1; c <= ch2; c++, count++) {
			if (count % numberPerLine == 0)
				System.out.println(c);
			else
				System.out.print(c + " ");
		}
	}
}