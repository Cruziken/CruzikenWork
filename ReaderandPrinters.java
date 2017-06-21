import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReaderandPrinters  {
	private Scanner scanner;
	//Creates a Scanner named scanner
	public void ReadandScan() {
	 scanner = new Scanner(System.in);
	//Creates an instance of Scanner named scanner.
	System.out.print("Enter a file name by listing it's absolute path: ");
	//Prompts the user for a file name (absolute path).
	//Either have the file in Cruziken folder or C://Users//fz3//....filename.txt
	final String filename = scanner.nextLine();
	//Stores variable filename as the user input requested.
	File file = new File(filename);
	//Changes the variable named filename into a File instance.
	try {
		//Exception is thrown to alert the compiler of what to do if it doesn't find the file.
	Scanner input = new Scanner(file);
		//Creates an instance of Scanner named input.
		while (input.hasNext()) {
			String num = input.nextLine();
			//Creates a string out of Text found within file.
			System.out.print(num);
			//Prints num string from past line
		}
	}
catch(FileNotFoundException e){
	//Alerts the compiler of what to do in case of the exception.
	System.err.format("File does not exist\n");
	//Prints off if FileNotFoundException is true.
}
}
}
