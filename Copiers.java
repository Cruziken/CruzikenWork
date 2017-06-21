
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	

	public class Copiers  {
	
		public void Copyit() {

			ReaderandPrinters filename = new ReaderandPrinters();
			filename.promptFile();
			String filename2 = filename.getFile();
			File file2 = new File(filename2);
			File filecopy = new File ("C:\\Users\\fz3\\workspace\\Practice\\TheTest.txt");
			BufferedReader reader;
			PrintWriter writer;
			
			String line;
			
			try{
				
				boolean success = filecopy.createNewFile();
				
				if (success) {
					System.out.println(" I AM STARTING TO PRINT ");
					reader = new BufferedReader(new FileReader(file2));
					writer = new PrintWriter(new FileWriter(filecopy));
					
					while ((line = reader.readLine()) != null){
						System.out.println("HI: " + line);
						writer.println(line);
					}
					reader.close();
					writer.close();
				}
//				if (filecopy.createNewFile()  !filecopy.createNewFile()){
//					reader = new BufferedReader(new FileReader(file2));
//					writer = new PrintWriter(new FileWriter(filecopy));
//					
//					while ((line = reader.readLine()) != null){
//						writer.println(line);
//					}
//					reader.close();
//					writer.close();
//				}
//				
				}catch(IOException ioEx) {
					System.err.println(" Check your directory destination. It may have copied over.");
			}			
			}
	}

