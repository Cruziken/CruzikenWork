package Fizzbuzz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Properties;

/**
 * This class reads content from other files and writes it in desired file in
 * addition to printing the content to the console
 *
 */
public class Writers {
	// Creates an instance of fileWriter so we can mess with it
	private FileWriter fileWriter;
	private BufferedWriter buffWriter;
	private Properties props;

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
			buffWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void transfer() {

		setProperti(props);
		StringWriter writer = new StringWriter();
		System.out.println("Life please");
		try {
			this.props.store(writer, "");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String INIcontent = writer.getBuffer().toString();
		writeFile(INIcontent);

	}

	public void setProperti(Properties properties) {
		{
			this.props = properties;
		}

		{
			// TODO Auto-generated method stub

		}
	}
}
