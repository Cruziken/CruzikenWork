package fizzbuzz;

import java.io.File;

/**
 * 
 * This class takes a filename and returns its absolute path
 *
 */
public class AbsolutePath {

	/**
	 * This method takes a String filename and returns the absolute path of the
	 * file passed to it
	 * 
	 * @param filename
	 * @return
	 */
	public String getAbsPath(String filename) {
		
		
		// Creates a string called path that'll house our absolute file name
		String path = "";
		// Creates a boolean bool which is true
		boolean bool;
		// In case there is no filename string to turn into a file...
		try {
			// create new file out of passed filename String
			File file = new File(filename);

			// returns true if the file exists
			bool = file.exists();

			// if file exists
			if (bool) {
				// get absolute path
				path = file.getAbsolutePath();
			}

		}
		// Catch the exception
		catch (Exception e) {

			// if any error occurs
			e.printStackTrace();
		}
		// Return the absolute path of the filename
		return path;
	}
}
