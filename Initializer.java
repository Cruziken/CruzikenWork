package Fizzbuzz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Initializer {
	// Creates an instance of fileWriter so we can mess with it
	private FileWriter fileWriter = null;

	// Method allows the passing of filenames from other classes
	public Initializer(String filename) throws IOException {
		// Creates (or gets access to ) a file from this absolute path
		File file = new File("C://Users//fz3//workspace//Files//Cruzikana.log");
		// Creates a new FileWriter for that file.
		// Without the true you write over it. With it, you append
		fileWriter = new FileWriter(file, true);
	}

	// Method allows content to be passed into it when accessed by other classes
	public void writeFile(String content) throws IOException {
		// Filewriter writes content to file passed from other classes
		fileWriter.write(content);
		// Adds a new line to the file for each variable it takes
		fileWriter.write(System.lineSeparator());
		// Prints out the content that other classes pass through the message
		System.out.println(content);
	}

	public void closeIt() throws IOException {
		// Closes the filewriter
		fileWriter.close();

	}
}
