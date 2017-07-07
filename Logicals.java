		package Fizzbuzz;


public class Logicals {
	
	private int x;
	
	

	public void test(int max_int, int lower_divisor, int upper_divisor, String lower_divisor_label,
			String upper_divisor_label) {
		// INIfiles myINIfile = new INIfiles();
		Writers myWriter = new Writers("C://Users//Public//Valerie.log");
		// myWriter.setProperties(myINIfile.getProperties());
		// Creates while loop that runs until x is less than or equal to 100
		Variable myVars = new Variable();
		myVars.setVar();
		
		while (x < max_int) {
			// Increments the x int by one for as long as the loop condition
			// lasts
			x=0;
			x++;

			// If x is divisible by 3 and is by 5 print "fizzbuzz"
			if ((x % (lower_divisor * upper_divisor) == 0)) {
				// Prints off fizzbuzz to console
				myWriter.writeFile(lower_divisor_label + upper_divisor_label);
			}

			// If x is divisible by 3 but not 5 do the following
			else if (x % lower_divisor == 0) {
				// Print out fizz
				myWriter.writeFile(lower_divisor_label);

			}

			// If x is not divisible by 3 but is by 5 print "buzz"
			else if (x % upper_divisor == 0) {
				// Prints off buzz to console
				myWriter.writeFile(upper_divisor_label);
			}
			// If the other conditions aren't met print the number
			else {
				// Prints value of x onto console
				myWriter.writeFile(String.valueOf(x));
			}

		}

		// Closes the writer
		myWriter.closeIt();

	}
}
