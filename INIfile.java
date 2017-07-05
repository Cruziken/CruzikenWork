package Fizzbuzz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 
 * This class holds the methods that read a properties file and has its contents
 * written to the console and another file
 *
 */
public class INIfile {
	/**
	 * This method reads the INI file with a modified Properties class that
	 * writes the content of the file to another file and to the console in the
	 * natural order
	 */
	public void readIt() {
		// Creates an instance of Writer to access those methods and pass the
		// desired file name
		Writer writeif = new Writer("C://Users//Public//Valerie.log");
		// Creates an instance of Logical that accesses the methods within class
		// Logical that allows the passage of local variables from this class
		Logical myLogic = new Logical();
		// Creates an instance of SortProperties called p
		SortProperty p = new SortProperty();
		// We are trying to scan from file a to file b (file a may not exist)
		try {
			// Loads the keys and values from the character stream from the file
			p.load(new FileInputStream("C://Users//fz3//workspace//FizzBuzz//TheRun.ini"));
		}
		// Catches the exception in case the file does not exist
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Object that generates a series of elements from the file in the
		// natural order from the file
		Enumeration<Object> enuKeys = p.keys();
		// As long as there are enumeration objects
		while (enuKeys.hasMoreElements()) {
			// Gets the keys from the enumeration
			String keys = (String) enuKeys.nextElement();
			// Gets the respective values for the keys
			String value = p.getProperty(keys);
			//Get an array of keys and values
			// Writes the keys and values to the other file and the console
			writeif.writeFile(keys + "=" + value);
			writeif.saveVar(value);
			}
		}
		// Closes the writer
		writeif.closeIt();
	}
}
