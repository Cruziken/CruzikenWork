import java.util.Scanner;

public interface Interfacer {
	// Creates an instance of scanner 
	// Scans user input from console
	static Scanner scanner = new Scanner(System.in);
	// Creates a filename variable that stores the user input
	String filename = scanner.nextLine();
	

}
