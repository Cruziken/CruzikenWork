
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Properties;

public class Dog {
	

		public void logIt  () {
			
			try {
				System.setOut(new PrintStream(new FileOutputStream("C://Users//fz3//workspace//HelloWorld//src//Ex6.txt")));
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			}
		}
}
			
				