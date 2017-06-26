
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Properties;

public class Log {
	
		
		public void logIt  () {
			//Initiates try to catch the exception that the file does not exist.
			try {
				//Makes whatever is printed to the command to be transfered to desired file
				System.setOut(new PrintStream(new FileOutputStream("C://Users//fz3//workspace//HelloWorld//src//Ex6.txt")));
 			} //catch the exception
			catch (FileNotFoundException e1) {
				//Prints if the file to send output to does not exist
				e1.printStackTrace();
			}
			System.out.println("Success!");
		}
}
			
				
