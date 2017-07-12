package Fizzbuzz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * This class holds the method that reads a properties file and has its contents
 * shipped to other methods that need the content and then calls those methods
 * to complete the program
 *
 */
public class INIfileLoader {
	// Creates a private Property variable named myProps
	private Properties myProps;

	/**
	 * This method reads the INI file and returns an instance of Properties
	 * named myProps as a result
	 * 
	 * @return
	 */

	public Properties readIt() {
		// Creates an instance of Writer to access those methods and pass the
		// desired file name
		// Writer myWriter = new Writer("C://Users//Public//Valerie.log");
		// Creates an instance of Variables to access those methods
		// Variables myVariables = new Variables();
		// Creates an instance of Properties named myProps
		myProps = new Properties();

		// Attempting to scan from file a to file b (file a may not exist)
		try {
			// Loads the keys and values from the character stream from the file
			myProps.load(new FileInputStream("C://Users//fz3//workspace//FizzBuzz//TheRun.ini"));
			
		}
		// Catches the exception in case the file does not exist
		catch (IOException e) {
			// TODO Auto-generated catch block; Throws NullPointerException
			e.printStackTrace();
		}
		// Whenever this method is called myProps will be the result
		return myProps;

	}
}
