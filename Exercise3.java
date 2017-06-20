import java.io.*;
import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args){
		System.out.print("Hello World! ");
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a file name: ");
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
	

}
