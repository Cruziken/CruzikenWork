
public class TheVariables {
	 
		//Creates a static integer called max_int and assigns it a value
			private static int max_int = 100;
			//Creates a  integer called lower_divisor and assigns it a value
			private int lower_divisor = 3;
			//Creates a integer called upper_divisor and assigns it a value
			private int upper_divisor = 5;
			//Creates a String called lower_divisor_label and assigns it a value
			private String lower_divisor_label = "fizz";
			//Creates a String integer called upper_divisor_label and assigns it a value
			private String upper_divisor_label = "buzz";
			//Creates a static integer called x and assigns it a value
			private static int x = 1;

	public void works() {
		if ((x%lower_divisor==0)&&(x%upper_divisor!=0))
			System.out.print(lower_divisor_label);
				
			
			if ((x%lower_divisor!=0)&&(x%upper_divisor==0))
				System.out.print(upper_divisor_label);
			 if ((x%lower_divisor==0)&&(x%upper_divisor==0))	
				System.out.print(lower_divisor_label + upper_divisor_label);
			 if ((x<=max_int))
				System.out.print(x);
					
}
}