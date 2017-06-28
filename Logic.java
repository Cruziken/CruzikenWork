package Fizzbuzz;

import java.io.IOException;

public class Logic {
	// Creates a static integer called max_int and assigns it a value
	private static int max_int = 100;
	// Creates a integer called lower_divisor and assigns it a value
	private int lower_divisor = 3;
	// Creates a integer called upper_divisor and assigns it a value
	private int upper_divisor = 5;
	// Creates a String called lower_divisor_label and assigns it a value and 
	private String lower_divisor_label = "fizz";
	// Creates a String integer called upper_divisor_label and assigns it a
	// value
	private String upper_divisor_label = "buzz";
	// Creates a static integer called x and assigns it a value
	private static int x = 0;

	public void test() throws IOException {
		Initializer writer = new Initializer("C://Users//fz3//workspace//Files//Valerie.log");
		// Creates while loop that runs until x is less than or equal to 100
		while (x < max_int) {
			// Increments the x int by one for as long as the loop condition
			// lasts
			x++;
			// If x is not divisible by 3 or 5 print the integer value of x
			if ((x % lower_divisor != 0) && (x % upper_divisor != 0)) {
				// Prints value of x onto console
				writer.writeFile(String.valueOf(x));

			}

			// If x is divisible by 3 but not 5 do the following
			else if ((x % lower_divisor == 0) && (x % upper_divisor != 0)) {
				// Print out fizz
				writer.writeFile(lower_divisor_label);

			}

			// If x is not divisible by 3 but is by 5 print "buzz"
			else if ((x % lower_divisor != 0) && (x % upper_divisor == 0)) {
				// Prints off buzz to console
				writer.writeFile(upper_divisor_label);

			}

			// If x is divisible by 3 and is by 5 print "fizzbuzz"
			else if ((x % lower_divisor == 0) && (x % upper_divisor == 0)) {
				// Prints off fizzbuzz to console
				writer.writeFile(lower_divisor_label + upper_divisor_label);

			}

		}
		writer.closeIt();
	}
}