import java.util.*;
import java.io.*;

public class PropINI {
	
		  
		  public void doit() {
		    try{
		      Properties p = new Properties();
		      p.load(new FileInputStream("C://Users//fz3//workspace//FizzBuzz//TheRun.ini"));
		      System.out.println("max_int = " + p.getProperty("max_int"));
		      System.out.println("lower_divisor = " + p.getProperty("lower_divisor"));
		      System.out.println("upper_divisor = " + p.getProperty("upper_divisor"));
		      System.out.println("lower_divisor_label = " + p.getProperty("lower_divisor_label"));
		      System.out.println("upper_divisor_label = " + p.getProperty("upper_divisor_label"));
		      
		    }
		    catch (Exception e) {
		      System.out.println(e);
		    }
		  }
		}
	

