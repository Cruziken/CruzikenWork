package Fizzbuzz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	// Creates an instance of fileWriter so we can mess with it
	private FileWriter fileWriter = null;

	// Method allows the passing of filenames from other classes
	public Writer(String filename) {
		// Creates (or gets access to ) a file from this absolute path
		File file = new File(filename);
		// Creates a new FileWriter for that file.
		// Without the true you write over it. With it, you append
		try {
			fileWriter = new FileWriter(file, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Method allows content to be passed into it when accessed by other classes
	public void writeFile(String content) {
		// Filewriter writes content to file passed from other classes
		try {
			fileWriter.write(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Adds a new line to the file for each variable it takes
		try {
			fileWriter.write(System.lineSeparator());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Prints out the content that other classes pass through the message
		System.out.println(content);
	}

	public void closeIt() {
		// Closes the filewriter
		try {
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
