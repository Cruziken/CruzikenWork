package Fizzbuzz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class INI {

	public void readIt() throws IOException {
		Initializer writeif = new Initializer("C://Users//fz3//workspace//Files//Valerie.log");
		// We are trying to scan from file a to file b (file a may not exist)
		try {
			// Creates an instance of properties called p
			Properties p = new Properties();
			// calls the load method on p to get keys and values the data from
			// TheRun.ini
			p.load(new FileInputStream("C://Users//fz3//workspace//FizzBuzz//TheRun.ini"));
			// Properties allows you to get access to the values of the keys
			// within the file
			// Creates a string named val1 that is equal to "max_int = 100"
			String val1 = "max_int = " + p.getProperty("max_int");
			// Creates a string named val2 that is equal to "lower_divisor = 3"
			String val2 = "lower_divisor = " + p.getProperty("lower_divisor");
			// Creates a string named val3 that is equal to "upper_divisor = 5"
			String val3 = "upper_divisor = " + p.getProperty("upper_divisor");
			// Creates a string named val4 that is equal to "lower_divisor_label
			// = fizz"
			String val4 = "lower_divisor_label = " + p.getProperty("lower_divisor_label");
			// Creates a string named val5 that is equal to "upper_divisor_label
			// = buzz"
			String val5 = "upper_divisor_label = " + p.getProperty("upper_divisor_label");
			// Creates an array called myValues out of text from INI file
			String[] myValues = { val1, val2, val3, val4, val5 };
			// Creates a loop that starts at zero, increments by 1, and stops at
			// 4
			for (int i = 0; i < myValues.length; i++) {
				// Prints off each value in array to the console
				writeif.writeFile(myValues[i]);
				// Prints off each value to desired file

			}
			// Closes the file writer
			writeif.closeIt();
		}
		// close the try
		catch (IOException e) {
			// If exception holds true prints off File does not exist
			e.printStackTrace();
		}
	}

}