import java.io.*;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
				System.out.print("Hello World! ");
					Scanner scanner = new Scanner(System.in);
					System.out.print("Enter a file name by listing it's absolute path: ");
					//Either have the file in Cruziken folder or C://Users//fz3//....filename.txt
				System.out.flush();
					String filename = scanner.nextLine();
					File file = new File(filename);
					try {
					Scanner input = new Scanner(file);
						while (input.hasNext()) {
							String num = input.nextLine();
							System.out.print(num);
						}
					}
				catch(FileNotFoundException e){
					System.err.format("File does not exist\n");
	
	}
			File file2 = new File(filename);
			File filecopy = new File ("C:\\users\\fz3\\workspace\\Dog\\TheCodingApprentice.txt");
			BufferedReader reader;
			PrintWriter writer;
			
			String line;
			
			try{
				if (filecopy.createNewFile() || !filecopy.createNewFile()){
					reader = new BufferedReader(new FileReader(file2));
					writer = new PrintWriter(new FileWriter(filecopy));
					
					while ((line = reader.readLine()) != null){
						writer.println(line);
					}
					reader.close();
					writer.close();
				}
				
				}catch(IOException ioEx) {
					System.err.println(" Couldn't move to directory.");
			}
				
			}
	
	}
