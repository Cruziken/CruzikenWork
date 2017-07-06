private Properties myProps;
	public  Properties getProperties(){return myProps;}
	public void setProperties(Properties props){this.myProps= props;}
	
	public void readIt() {
		
		// Creates an instance of Writer to access those methods and pass the
		// desired file name
		//Writer writeif = new Writer("C://Users//Public//Valerie.log");
		// Creates an instance of Logical that accesses the methods within class
		myProps = new Properties();
		// We are trying to scan from file a to file b (file a may not exist)
		try {
			// Loads the keys and values from the character stream from the file
			myProps.load(new FileInputStream("C://Users//fz3//workspace//FizzBuzz//TheRun.ini"));
			
		}
		// Catches the exception in case the file does not exist
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		System.out.println("we here");
		
		/*// Object that stores values that can't be equal to each other
				LinkedHashMap map = new LinkedHashMap();
						// As long as there are enumeration objects
						for (final String key: myProps.stringPropertyNames())
						
						map.put(key, myProps.getProperty(key));
						
						Set<V> set = new TreeSet<V>();
						for (K v : map.keySet()){
							set.addAll(map.get(key))
						}
						
						
						Iterator i = set.iterator();
						
						while(i.hasNext()){
							Map.Entry me = (Map.Entry)i.next();
							writeif.writeFile((String) me.getKey() + "="+ me.getValue());
						}
							
						
		
		// Object that generates a series of elements from the file in the
		// natural order from the file
		/*Enumeration<Object> enuKeys = myProps.keys();
		// As long as there are enumeration objects
		
		while (enuKeys.hasMoreElements()) {
			// Gets the keys from the enumeration
			String keys =  (String) enuKeys.nextElement();
			// Gets the respective values for the keys
			String value = myProps.getProperty(keys);
			//Get an array of keys and values
			String[] arrayVal = value.split(keys);
			// Writes the keys and values to the other file and the console
			writeif.writeFile(keys + "=" + value);
			writeif.varSaver(arrayVal);
			
		}*/
}
}
