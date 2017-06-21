



public class Excersise5 {

private void Start() {
	//Creates an instance of Screamers called fun1
	Screamers fun1 = new Screamers();
	//Creates an instance of ReadersandPrinters called fun2
	ReaderandPrinters fun2 = new ReaderandPrinters();
////Creates an instance of Copiers called fun3
	Copiers fun3 = new Copiers();
	//Calls the Scream method on fun1
	fun1.Scream();
	//Calls the Proclaim method on fun2
	fun2.Proclaim();
	//Calls the promptFile method on fun2
	fun2.promptFile();
	//Calls the ReadandScan method on fun2
	fun2.ReadandScan();
	//Calls the Copyit method on fun3
	fun3.Copyit();
}

public static void main(String[] args){
	// Creates an instance of Excersise5 named task

Excersise5 task = new Excersise5();
//Calls the Start method on task. Starts the app
task.Start();

}
}
