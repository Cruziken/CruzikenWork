package Fizzbuzz;

public class Excersice6 {
	public void start() throws Exception {
		// Creates an instance of INI called phase1
		INI phase1 = new INI();
		// Calls the readIt method on phase1
		// This will read the text in the INI file and write to log file
		phase1.readIt();
		// Creates an instance of Logic called phase2
		Logic phase2 = new Logic();
		// Calls the test method on phase2
		// Executes fizz buzz solution and prints to console and appends to log
		// file
		phase2.test();

	}

	public static void main(String[] args) throws Exception {
		// Creates an instance of Excersice6 called catalyst
		Excersice6 catalyst = new Excersice6();
		// Calls the start method on catalyst
		// This Starts the program
		catalyst.start();
	}

}
