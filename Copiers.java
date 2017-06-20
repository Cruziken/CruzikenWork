
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Scanner;

	public class Copiers  {
		private Scanner scanner;

		public void Copyit() {
			scanner = new Scanner (System.in);
			String filename = scanner.nextLine();
			
			File file2 = new File(filename);
			File filecopy = new File ("C:\\users\\fz3\\workspace\\The Game\\TheTest.txt");
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

