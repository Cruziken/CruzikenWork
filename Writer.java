package Fizzbuzz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * This class reads content from other files and writes it in desired file in
 * addition to printing the content to the console
 *
 */
public class Writer {
	// Creates an instance of fileWriter so we can mess with it
	private FileWriter fileWriter;
	private BufferedWriter buffWriter;
	
	
	/**
	 * Method allows the passing of filenames from other classes
	 * 
	 * @param filename
	 */
	public Writer(String filename) {
		// Creates (or gets access to ) a file from this absolute path
		File file = new File(filename);
		// Creates a new FileWriter for that file.
		// Without the true you write over it. With it, you append
		try {
			fileWriter = new FileWriter(file, true);
			buffWriter = new BufferedWriter(fileWriter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Method allows content to be passed into it when accessed by other classes
	 * 
	 * @param content
	 */
	public void writeFile(String content) {
		// Filewriter writes content to file passed from other classes
		try {
			buffWriter.write(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Adds a new line to the file for each variable it takes
		try {
			buffWriter.write(content);
			buffWriter.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Prints out the content that other classes pass through the message
		System.out.println(content);
	}

		/*
		 * ArrayList<String[]> data = new ArrayList<String[]>(); data.add(vars);
		 * 
		 * for (String[] arrayValu : data) {
		 * 
		 * String max_int = arrayValu[0]; String lower_divisor = arrayValu[0];
		 * String upper_divisor = arrayValu[0]; String lower_divisor_label =
		 * arrayValu[0]; String upper_divisor_label = arrayValu[0];
		 * 
		 * }
		 */

	

	/**
	 * Method closes any implementation of the fileWriter
	 */
	public void closeIt() {
		// Closes the fileWriter
		try {
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public void transfer() {
		Writer myWriter = new Writer("C://Users//Public//Valerie.log");
		INIfile myINI = new INIfile();
		myINI.readIt();
		myWriter.setProperties(myINI.getProperties());
		
		/*// Object that stores values that can't be equal to each other
		LinkedHashMap map = new LinkedHashMap();
				// As long as there are enumeration objects
				for (final String key: property.stringPropertyNames())
					
				map.put(key, property.getProperty(key));
				
				Set set = map.entrySet();
				
				Iterator i = set.iterator();
				
				while(i.hasNext()){
					Map.Entry me = (Map.Entry)i.next();
					writeFile((String) me.getKey());
				}
					*/
				} 
	
		
	

	private void setProperties(Properties properties) {
		{myProps= properties;}
		
	}




	{
		// TODO Auto-generated method stub
		
	}
		
	}

