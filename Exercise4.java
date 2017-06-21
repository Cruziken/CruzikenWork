import java.io.*;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
				//Prints out the statement "Hello World".
				System.out.print("Hello World! ");
					//Creates a new instance of the scanner named scanner.
					Scanner scanner = new Scanner(System.in);
					//Prompts the user for an absolute file name.
					//Either have the file in Cruziken folder or C://Users//fz3//....filename.txt
					System.out.print("Enter a file name by listing it's absolute path: ");
					//Stores variable filename as the user input requested
					String filename = scanner.nextLine();
					//Changes the variable named filename into a file instance.
					File file = new File(filename);
					//Exception is thrown to alert the compiler of what to do if it doesn't find the file.
					try {
					//Creates an instance of Scanner named input.
					Scanner input = new Scanner(file);
						while (input.hasNext()) {
							//Creates a string out of Text found within file.
							String num = input.nextLine();
							//Prints num string from past line
							System.out.print(num);
						}
					}
				//Alerts the compiler of what to do in case of the exception.
				catch(FileNotFoundException e){
					//Prints off if FileNotFoundException is true
					System.err.format("File does not exist\n");
					
	
	}
			//Creates a new instance of File named file2 as an equivalent of filename		
			File file2 = new File(filename);
			//Creates a new instance of File named filecopy
			//Indicates the change in depository if one occurs
			File filecopy = new File ("C:\\users\\fz3\\workspace\\MidiPlayer\\TheCodingApprentice.txt");
			//Creates a BufferedReader named reader.
			BufferedReader reader;
			//Creates a PrintWriter named writer. 
			PrintWriter writer;
			//Creates a String named line
			String line;
		
			//Exception is thrown to alert the compiler of what to do if it doesn't find the file.
			try{
				//If the filecopy is or isn't equal to its new file then the following code runs
				if (filecopy.createNewFile() || !filecopy.createNewFile()){
					//Creates a buffering character input string that reads the content in file2
					reader = new BufferedReader(new FileReader(file2));
					//Creates a printWriter that prints content of filecopy
					writer = new PrintWriter(new FileWriter(filecopy));
					//Copies over content from file2 to filecopy
					while ((line = reader.readLine()) != null){
						writer.println(line);
					}
					//Closes the stream and releases any system resources associated with it
					reader.close();
					//Closes the stream and releases any system resources associated with it
					writer.close();
				}
				
				}//Alerts the compiler of what to do in case of the exception.
					catch(IOException ioEx) {
						//Prints off if FileNotFoundException is true.					
						System.err.println(" Couldn't move to directory.");
					
			}
				
			}
	
	}
