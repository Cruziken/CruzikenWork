import java.io.*;
import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args){
		System.out.print("Hello World");
		System.out.println(" Enter a file name.");
		
		Scanner read = new Scanner(System.in);
		String fileinput = read.nextLine();
		File myFile = new File(fileinput);
		
		 try {
			Scanner inputFile = new Scanner(myFile);
			FileReader fileReader = new FileReader(myFile);
			
			BufferedReader reader = new BufferedReader(fileReader);
			
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 
		
		
	
	}
	

}