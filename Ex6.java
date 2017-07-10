package Fizzbuzz;

/**
 * 
 * This class contains the main method that starts the program. 
 *
 */
public class EX6 {
	/**
	 * Method provides the steps to take throughout the program
	 */
	public static void start() {
		// Creates an instance of INI called phase1
		INIfileLoader myINI = new INIfileLoader();
		// Calls the readIt method on phase1
		// This will read the text in the INI file and sends the information to
		// other methods that copy the content to another file and the console, as well as sending the content to the Variables
		// class to access some of the keys to set equal to variables in order to solve the FizzBuzz problem
		myINI.readIt();

	}

	/**
	 * Method starts the program
	 */
	public static void main(String[] args) {
		// This Starts the program
		start();
	}

}
