import java.io.*;
import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args){
		System.out.print("Hello World! ");
		//The line directly above prints the phrase "Hello World!"
			Scanner scanner = new Scanner(System.in);
			//Creates an instance of Scanner named scanner.
			System.out.print("Enter a file name: ");
			//Prompts the user for a file name (absolute path).
			String filename = scanner.nextLine();
			//Stores variable filename as the user input requested
			File file = new File(filename);
			//Changes the variable named filename into a file instance.
			try {
			//Exception is thrown to alert the compiler of what to do if it doesn't find the file.
			Scanner input = new Scanner(file);
			//Creates an instance of Scanner named input.
				while (input.hasNext()) {
					String num = input.nextLine();
					//Creates a string out of Text found within file.
					System.out.println(num);
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
	
