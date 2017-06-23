

public class FizzBuzz {
	
	private void Starters(){
		//Creates an instance of ReaderINI called exc3
		// ReaderINI exc3 = new ReaderINI();
		//Creates an instance of LogSend called ex1
		LogSend ex1 = new LogSend();
		//Creates an instance of Logic called exc2
		 Logic exc4= new Logic();
		//Creates an instance of PropINI called exc2
		PropINI exc2 = new PropINI();
		//exc3.iniReader();
		exc1.logIt();
		 exc2.doit();
		 exc4.lesgo();

		 
	}
		//Creates the main method that starts the program
		 public static void main (String[] args){
			//Creates an instance of FizzBuzz called hope
			FizzBuzz hope = new FizzBuzz();
			//Calls the Starters method on hope
			hope.Starters();
				 
				 
		
	}
}
