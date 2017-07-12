package Fizzbuzz;

import java.util.Properties;

/**
 * This class controls the logic for FizzBuzz and sends the output to the
 * console and to a file
 * 
 *
 */
public class LogicController {
	// Creates an integer called max_int
	private int max_int;
	// Creates a integer called lower_divisor
	private int lower_divisor;
	// Creates a integer called upper_divisor
	private int upper_divisor;
	// Creates a String called lower_divisor_label
	private String lower_divisor_label;
	// Creates a String integer called upper_divisor_label
	private String upper_divisor_label;
	// Creates a Variables instance called variables
	private Variables variables;

	/**
	 * Method that gets the variable name values from the Variables class in
	 * order to run the FizzBuzz problem
	 * 
	 */
	public void setVariables(Variables variables) {
		// Assigns the Variables instance passed through equal to this
		// particular instance of variables
		this.variables = variables;
		// Assigns max_int equal to the what is was assigned in Variables; In
		// this case 100
		max_int = variables.getMax_Int();
		// Assigns lower_divisor equal to what it was assigned in Variables; In
		// this case 3
		lower_divisor = variables.getLower_Divisor();
		// Assigns upper_divisor equal to what it was assigned in Variables; In
		// this case 5
		upper_divisor = variables.getUpper_Divisor();
		// Assigns lower_divisor_label equal to what it was assigned in
		// Variables; In this case fizz
		lower_divisor_label = variables.getLower_Divisor_Label();
		// Assigns upper_divisor equal to what it was assigned in Variables; In
		// this case buzz
		upper_divisor_label = variables.getUpper_Divisor_Label();

	}

	/**
	 * Method that runs the logic necessary to solve the FizzBuzz Problem and
	 * passes the content through the Writer class's writeFile method
	 * 
	 */
	public void run() {
		// Creates an instance of Writer to access those methods and pass the
		// desired file name
		Writer myWriter = new Writer("C://Users//Public//Valerie.log");

		// Run the loop starting at zero, ending less than max_int, and
		// incrementing by one in subsequent run through
		for (int x = 1; x <= max_int; x++) {

			// If x is divisible by 3 and is by 5 print "fizzbuzz"
			if ((x % (lower_divisor * upper_divisor) == 0)) {
				// Prints off fizzbuzz to console
				myWriter.log(lower_divisor_label + upper_divisor_label);
			}

			// If x is divisible by 3 but not 5 do the following
			else if (x % lower_divisor == 0) {
				// Print out fizz
				myWriter.log(lower_divisor_label);

			}

			// If x is not divisible by 3 but is by 5 print "buzz"
			else if (x % upper_divisor == 0) {
				// Prints off buzz to console
				myWriter.log(upper_divisor_label);
			}
			// If the other conditions aren't met print the number
			else {
				// Prints value of x onto console
				myWriter.log(String.valueOf(x));
			}

		}

		// Closes the writer
		myWriter.closeIt();

	}

}

