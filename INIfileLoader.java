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
	 * This method reads the INI file, sends its content to methods in other
	 * classes that need the information, and then calls those methods
	 */
	public void readIt() {
		// Creates an instance of Writer to access those methods and pass the
		// desired file name
		Writer myWriter = new Writer("C://Users//Public//Valerie.log");
		// Creates an instance of Variables to access those methods
		SetVariables myVariables = new SetVariables();
		// Creates an instance of Properties named myProps
		myProps = new Properties();

		// Attempting to scan from file a to file b (file a may not exist)
		try {
			// Loads the keys and values from the character stream from the file
			myProps.load(new FileInputStream("C://Users//fz3//workspace//FizzBuzz//TheRun.ini"));
			// Passes the keys and values of myProps to the setProperties
			// method.
			// This methods passes the content to the Writer class.
			myWriter.setProperties(myProps);
			// Passes the keys and values of myProps to the setProperti method.
			// This methods passes the content to the Variables class.
			myVariables.setLogic(myProps);
		}
		// Catches the exception in case the file does not exist
		catch (IOException e) {
			// TODO Auto-generated catch block; Throws NullPointerException
			e.printStackTrace();
		}

		// Calls the method in the Writer class that appends the content of the
		// INI file to another
		// file and prints out to console
		myWriter.transfer();
		// Calls the method that sets some of the content in the INI file equal
		// to variables and passes these variable values to the LogicController
		// Class
		myVariables.setVars();
		// Calls the method that closes the BufferedReader
		myWriter.closeIt();
	}
}
