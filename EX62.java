package Fizzbuzz;

public class EX62 {
	public static void start() {
		// Creates an instance of INI called phase1
		INIfile myINI = new INIfile();
		// Calls the readIt method on phase1
		// This will read the text in the INI file and write to log file
		myINI.readIt();
		// Creates an instance of Logic called phase2
		Logic myLogic = new Logic();
		// Calls the test method on phase2
		// Executes fizz buzz solution and prints to console and appends to log
		// file
		myLogic.test();

	}

	public static void main(String[] args) {
		// This Starts the program
		start();
	}

}