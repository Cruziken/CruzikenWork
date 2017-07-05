package Fizzbuzz;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;

public class INIfile {

	public void readIt() {
		Writer writeif = new Writer("C://Users//Public//Valerie.log");
		Logical myLogic = new Logical();
		// We are trying to scan from file a to file b (file a may not exist)
		// try {
		// Creates an instance of properties called p

		SortProperty p = new SortProperty();
		try {
			p.load(new FileInputStream("C://Users//fz3//workspace//FizzBuzz//TheRun.ini"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Enumeration enuKeys = p.keys();

		while (enuKeys.hasMoreElements()) {
			String keys = (String) enuKeys.nextElement();
			String value = p.getProperty(keys);
			myLogic.retrieve(keys, value);
			writeif.writeFile(keys + "=" + value); // Prints off each value to
													// desired
		}
		writeif.closeIt();

		// Creates an instance of properties called p

		/*
		 * TreeMap<String,String> tmap = new TreeMap<String, String>();
		 * tmap.putAll((Map<? extends String, ? extends String>) new
		 * FileInputStream("C://Users//fz3//workspace//FizzBuzz//TheRun.ini" ));
		 * Set set = tmap.entrySet(); Iterator iterator = set.iterator(); while
		 * (iterator.hasNext()); String mentry = (String)iterator.next();
		 * writeif.writeFile(mentry);
		 */

		// calls the load method on p to get keys and values data from
		// TheRun.ini
		/*
		 * Properties p = new Properties(); p.load(new
		 * FileInputStream("C://Users//fz3//workspace//FizzBuzz//TheRun.ini"));
		 * Enumeration enuKeys = p.keys();
		 * 
		 * while (enuKeys.hasMoreElements()) { String key =
		 * (String)enuKeys.nextElement(); String value = p.getProperty(key);
		 * writeif.writeFile(key + "=" + value); // Prints off each value to
		 * desired file }
		 */
		/*
		 * try { this.prop = new Properties(); prop.load(new
		 * FileInputStream("C://Users//fz3//workspace//FizzBuzz//TheRun.ini"));
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch
		 * (IOException e) { e.printStackTrace(); } }
		 * 
		 * public Set<Object> getAllKeys(){ Set<Object> keys = prop.keySet();
		 * return keys; }
		 * 
		 * public String getPropertyValue(String key){ return
		 * this.prop.getProperty(key); }
		 * 
		 * public void readIt(){ Writer writeif = new
		 * Writer("C://Users//Public//Valerie.log"); INIfile mpc = new
		 * INIfile(); Set<Object> keys = mpc.getAllKeys(); for(Object k:keys){
		 * String key = (String)k; String values = mpc.getPropertyValue(key);
		 * writeif.writeFile(key+ "="+values); } writeif.closeIt(); }
		 */
		// Closes the file writer

		/*
		 * // close the try catch (IOException e) { // If exception holds true
		 * prints off File does not exist e.printStackTrace(); }
		 */
	}
}
