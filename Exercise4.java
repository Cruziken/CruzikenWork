import java.io.*;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
				System.out.print("Hello World! ");
				//Prints out the statement "Hello World".
					Scanner scanner = new Scanner(System.in);
					//Creates a new instance of the scanner named scanner.
					System.out.print("Enter a file name by listing it's absolute path: ");
					//Prompts the user for an absolute file name.
					//Either have the file in Cruziken folder or C://Users//fz3//....filename.txt
					String filename = scanner.nextLine();
					//Stores variable filename as the user input requested
					File file = new File(filename);
					//Changes the variable named filename into a file instance.
					try {
					//Exception is thrown to alert the compiler of what to do if it doesn't find the file.
					Scanner input = new Scanner(file);
					//Creates an instance of Scanner named input.
						while (input.hasNext()) {
							String num = input.nextLine();
							//Creates a string out of Text found within file.
							System.out.print(num);
							//Prints num string from past line
						}
					}
				catch(FileNotFoundException e){
					//Alerts the compiler of what to do in case of the exception.
					System.err.format("File does not exist\n");
					//Prints off if FileNotFoundException is true
	
	}
			File file2 = new File(filename);
			//Creates a new instance of File named file2 as an equivalent of filename
			File filecopy = new File ("C:\\users\\fz3\\workspace\\MidiPlayer\\TheCodingApprentice.txt");
			//Creates a new instance of File named filecopy
			//Indicates the change in depository if one occurs
			BufferedReader reader;
			//Creates a BufferedReader named reader. 
			PrintWriter writer;
			//Creates a PrintWriter named writer.
			String line;
			//Creates a String named line
			
			try{
				//Exception is thrown to alert the compiler of what to do if it doesn't find the file.
				if (filecopy.createNewFile() || !filecopy.createNewFile()){
				//If the filecopy is or isn't equal to its new file then the following code runs
					reader = new BufferedReader(new FileReader(file2));
					//Creates a buffering character input string that reads the content in file2
					writer = new PrintWriter(new FileWriter(filecopy));
					//Creates a printWriter that prints content of filecopy
					while ((line = reader.readLine()) != null){
						writer.println(line);
					//Copies over content from file2 to filecopy
					}
					reader.close();
					//Closes the stream and releases any system resources associated with it
					writer.close();
					//Closes the stream and releases any system resources associated with it.
				}
				
				}catch(IOException ioEx) {
					//Alerts the compiler of what to do in case of the exception.
					System.err.println(" Couldn't move to directory.");
					//Prints off if FileNotFoundException is true.
			}
				
			}
	
	}
