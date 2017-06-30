package Fizzbuzz;

public class Ex6 {
	public void start() throws Exception {
		// Creates an instance of INI called phase1
		INI myINI = new INI();
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

	public static void main(String[] args) throws Exception {
		// Creates an instance of Excersice6 called catalyst
		Ex6 myEx6 = new Excersice6();
		// Calls the start method on catalyst
		// This Starts the program
		myEx6.start();
	}

}
