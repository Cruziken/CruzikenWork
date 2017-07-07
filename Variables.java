package Fizzbuzz;

import java.util.LinkedHashMap;
import java.util.Properties;

public class Variables {
		// Creates a static integer called max_int and assigns it a value
		private int max_int;
		// Creates a integer called lower_divisor and assigns it a value
		private int lower_divisor;
		// Creates a integer called upper_divisor and assigns it a value
		private int upper_divisor;
		// Creates a String called lower_divisor_label and assigns it a value and
		private String lower_divisor_label;
		// Creates a String integer called upper_divisor_label and assigns it a
		// value
		private String upper_divisor_label;
		// Creates a static integer called x and assigns it a value
		private Properties values;

		public void setLogic(Properties propy) {
			this.values = propy;
		}

	public void setVar() {
		Logical myLogical = new Logical();
		setLogic(values);
		this.values.list(System.out);
		LinkedHashMap<String, String> mymap = new LinkedHashMap<String, String>();
		for (String key : this.values.stringPropertyNames()) {
			String value = this.values.getProperty(key);
			mymap.put(key, value);
		}

		max_int = integerIt(mymap.get("max_int"));
		lower_divisor = integerIt(mymap.get("lower_divisor"));
		upper_divisor = integerIt(mymap.get("upper_divisor"));
		lower_divisor_label = (mymap.get("lower_divisor_label"));
		upper_divisor_label = (mymap.get("upper_divisor_label"));
		myLogical.test(max_int,lower_divisor,upper_divisor,lower_divisor_label,
			upper_divisor_label);
	}
	
	public int integerIt(String keys) {
		return Integer.valueOf(keys);
	}
	}
