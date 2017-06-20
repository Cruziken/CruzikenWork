import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReaderandPrinters  {
	private Scanner scanner;
	public void ReadandScan() {
	 scanner = new Scanner(System.in);
	
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
}
}