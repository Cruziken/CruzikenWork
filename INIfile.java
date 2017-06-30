package Fizzbuzz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class INIfile {
	
	public void readIt() {
		Writer writeif = new Writer("C://Users//Public//Valerie.log");
		// We are trying to scan from file a to file b (file a may not exist)
		try {
			// Creates an instance of properties called p
			Properties properties = new Properties();
			
			properties.load(new FileInputStream("C://Users//fz3//workspace//MidiPlayer//LetsGO.ini"));
			Enumeration enuKeys = properties.keys();
			while (enuKeys.hasMoreElements()){
				String key = (String) enuKeys.nextElement();
				String value = properties.getProperty(key);
				
				writeif.writeFile(key + "=" + value);
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