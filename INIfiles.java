package Fizzbuzz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * This class holds the methods that read a properties file and has its contents
 * written to the console and another file
 *
 */
public class INIfiles {
	/**
	 * This method reads the INI file with a modified Properties class that
	 * writes the content of the file to another file and to the console in the
	 * natural order
	 */
	// Creates a private Property variable named myProps
	private Properties myProps;
	// Getter method for myProps

	/*
	 * public void setProperties(Properties myPropies) { this.myProps=
	 * myPropies;}
	 */
	public Properties getProperties() {
		return myProps;
	}
	// Setter method for Properties
	// public void setProperties(Properties props){this.myProps= props;}

	public void readIt() {
		Writers myWriter = new Writers("C://Users//Public//Valerie.log");
		Variable myVariables = new Variable();
		// Creates an instance of Writer to access those methods and pass the
		// desired file name
		// Writer writeif = new Writer("C://Users//Public//Valerie.log");
		//
		myProps = new Properties();
		// We are trying to scan from file a to file b (file a may not exist)
		try {
			// Loads the keys and values from the character stream from the file
			myProps.load(new FileInputStream("C://Users//fz3//workspace//FizzBuzz//TheRun.ini"));
			myWriter.setProperti(myProps);
			myVariables.setLogic(myProps);
		}
		// Catches the exception in case the file does not exist
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// myWriter.setProperties(myProps);
		myWriter.transfer();
		myVariables.setVar();
		myWriter.closeIt();
		
	}
}
