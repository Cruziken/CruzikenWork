package Fizzbuzz;

/**
 * 
 * This class contains the main method that starts the program. It also provides
 * the steps the application must go through
 *
 */
public class Exam6 {
	/**
	 * Method provides the steps to take throughout the program
	 */
	public static void start() {
		// Creates an instance of INI called phase1
		INIfiles myINI = new INIfiles();
		// Calls the readIt method on phase1
		// This will read the text in the INI file and write to log file
		myINI.readIt();
		// Creates an instance of Logic called phase2
		Logicals myLogic = new Logicals();
		// Calls the test method on phase2
		// Executes fizz buzz solution and prints to console and appends to log
		
		myLogic.test(0, 0, 0, null, null);
		// file

	}
	/**
	 * Method starts the program 
	 */
	public static void main(String[] args) {
		// This Starts the program
		start();
	}

}
