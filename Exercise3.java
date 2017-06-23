import java.io.*;
import java.util.Scanner;
public class Exercise3 {
	
	private void deClare(){
		//The line directly above prints the phrase "Hello World!"
		System.out.print("Hello World! ");
	}
	private void scanNprompt(){
		//Creates an instance of Scanner named scanner.
		Scanner scanner = new Scanner(System.in);
		//Prompts the user for a file name (absolute path).
		System.out.print("Enter a file name: ");
		//Stores variable filename as the user input requested.
		String filename = scanner.nextLine();
		//Changes the variable named filename into a File instance.
		File file = new File(filename);
		//Exception is thrown to alert the compiler of what to do if it doesn't find the file.
			try {
			//Creates an instance of Scanner named input.
			Scanner input = new Scanner(file);
				while (input.hasNext()) {
					//Creates a string out of Text found within file.
					String num = input.nextLine();
					//Prints num string from past line
					System.out.println(num);
				}
			}
			//Alerts the compiler of what to do in case of the exception.
			catch(FileNotFoundException e){
			//Prints off if FileNotFoundException is true.
			System.err.format("File does not exist\n");
		}
	}

public static void main(String[] args){
	//Creates an instance of Exercise3 called beGin
	Exercise3 beGin = new Exercise3();
	//Calls the deClare method on beGin
	beGin.deClare();
	//Calls the scanNprompt method on beGin
	beGin.scanNprompt();

}
}

