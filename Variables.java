package Fizzbuzz;

import java.util.LinkedHashMap;
import java.util.Properties;

/**
 * This class assigns the values to variables necessary for the completion of
 * the FizzBuzz problem
 *
 */
public class Variables {
	// Creates an integer called max_int
	private int max_int;
	// Creates a integer called lower_divisor
	private int lower_divisor;
	// Creates a integer called upper_divisor
	private int upper_divisor;
	// Creates a String called lower_divisor_label
	private String lower_divisor_label;
	// Creates a String integer called upper_divisor_label
	private String upper_divisor_label;
	// Creates a properties variable called props
	private Properties props;

	/**
	 * This method assigns values to the variables used in the LogicController
	 * class
	 * 
	 * @param properties
	 */
	public void setVars(Properties props) {
		// Sets the props variable equal to whatever properties object is passed
		// through
		this.props = props;
		// Creates an instance of LogicController to access those methods
		// LogicController myLogicController = new LogicController();
		// Creates a LinkedHash map that will store the keys and values of propy
		LinkedHashMap<String, String> mymap = new LinkedHashMap<String, String>();
		// For as long as there are keys to convert to string in the file, call
		// them key)
		for (String key : this.props.stringPropertyNames()) {
			// For each key converted, get its key
			String value = this.props.getProperty(key);
			// Puts the keys and values into the LinkedHashMap
			mymap.put(key, value);
		}
		// Assigns max_int the value of the key "max_int"
		max_int = intIt(mymap.get("max_int"));
		// Assigns lower_divisor the value of the key "lower_divisor"
		lower_divisor = intIt(mymap.get("lower_divisor"));
		// Assigns upper_divisor the value of the key "upper_divisor"
		upper_divisor = intIt(mymap.get("upper_divisor"));
		// Assigns lower_divisor_label the value of the key
		// "lower_divisor_label"
		lower_divisor_label = (mymap.get("lower_divisor_label"));
		// Assigns upper_divisor_label the value of the key
		// "upper_divisor_label"
		upper_divisor_label = (mymap.get("upper_divisor_label"));

	}

	/**
	 * Getter method for max_int
	 * 
	 * @return
	 */
	int getMax_Int() {

		return max_int;
	}

	/**
	 * Getter method for lower_divisor
	 * 
	 * @return
	 */
	int getLower_Divisor() {
		return lower_divisor;
	}

	/**
	 * Getter method for upper_divisor
	 * 
	 * @return
	 */

	int getUpper_Divisor() {
		return upper_divisor;
	}

	/**
	 * Getter method for lower_divisor_label
	 * 
	 * @return
	 */

	String getLower_Divisor_Label() {
		return lower_divisor_label;
	}

	/**
	 * Getter method for upper_divisor_label
	 * 
	 * @return
	 */
	String getUpper_Divisor_Label() {
		return upper_divisor_label;
	}

	/**
	 * Method that makes Integers out of numbers that are Strings
	 * 
	 * @param assign
	 * 
	 * @return
	 */
	private int intIt(String assign) {
		// Returns back the value in integer form of a string
		return Integer.valueOf(assign);
	}
}
