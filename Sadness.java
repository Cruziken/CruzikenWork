private int upper_divisor = 5;
			//Creates a String called lower_divisor_label and assigns it a value
			private String lower_divisor_label = "fizz";
			//Creates a String integer called upper_divisor_label and assigns it a value
			private String upper_divisor_label = "buzz";
			//Creates a static integer called x and assigns it a value
			private static int x= 0;
			private static String filename;
			;
			
			;
	public void test() { 
			
			//Creates while loop that runs until x is less than or equal to 100
			while (x<max_int){
				//Increments the x int by one for as long as the loop condition lasts
				x++;
				//If x is not divisible by 3 or 5 print the integer
				if ((x%lower_divisor!=0)&&(x%upper_divisor!=0)){
					System.out.println(x);
					try(FileWriter writer = new FileWriter(filename, true)){
						BufferedWriter bw = new BufferedWriter(writer);
					    PrintWriter out1 = new PrintWriter(bw);
						out1.println(x);
					
					}catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						if (out1 != null){
							out1.close();
						}
					}
				}
				
				//If x is divisible by 3 but not 5 print "fizz"
				else if ((x%lower_divisor==0)&&(x%upper_divisor!=0)){
					System.out.println(lower_divisor_label);
					try (FileWriter writer = new FileWriter(filename, true)){
						BufferedWriter bw = new BufferedWriter(writer);
					    PrintWriter out2 = new PrintWriter(bw);
					    out2.println(lower_divisor_label);
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						if (out2 != null){
							out2.close();
					}
					}
				}

				//If x is not divisible by 3 but is by 5 print "buzz"
				else if ((x%lower_divisor!=0)&&(x%upper_divisor==0)){
					System.out.println(upper_divisor_label);
					try (FileWriter writer = new FileWriter(filename, true)){
						BufferedWriter bw = new BufferedWriter(writer);
					    PrintWriter out3 = new PrintWriter(bw);
					    {
					    out3.println(upper_divisor_label);
					    }
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						if (out3 != null){
							out3.close();
					}
					
				//If x is divisible by 3 and is by 5 print "fizzbuzz"
				else if ((x%lower_divisor==0)&&(x%upper_divisor==0)){
					System.out.println(lower_divisor_label + upper_divisor_label);
					try (FileWriter writer = new FileWriter(filename, true)){
						BufferedWriter bw = new BufferedWriter(writer);
					    PrintWriter out = new PrintWriter(bw);
					    {
					    out4.println(lower_divisor_label+ upper_divisor_label);
					    }
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						if (out4 != null){
							out4.close();
						}
						}
				}
					}
				}
			}
					
			
	}
			public Logic() {
				filename = "C://Users//fz3//workspace//Files//TheDespair.log";
	}
}

