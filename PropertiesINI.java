import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesINI {
	
public void props() throws IOException{
	Properties defaultProps = new Properties();
	FileInputStream in = new FileInputStream("C://Users//fz3//workspace//FizzBuzz//TheRun.ini");
	try {
		defaultProps.load(in);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		in.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	// create application properties with default
	Properties applicationProps = new Properties(defaultProps);

	// now load properties 
	// from last invocation
	in = new FileInputStream("appProperties");
	applicationProps.load(in);
	in.close();

	FileOutputStream out = new FileOutputStream("appProperties");
	applicationProps.store(out, "---No Comment---");
	out.close();

	applicationProps.setProperty();

public void safest(){ 
	
}
}