



public class Excersise5 {

private void Start() {
	
	//Creates an instance of Screamers called fun1
	Screamers fun1 = new Screamers();
	Cpy fun2 = new Cpy();
	//Creates an instance of Copiers called fun2
	Copiers fun3 = new Copiers();
	
	fun1.Scream();
	fun2.Proclai();
	fun2.ReadandSca();
	fun3.Copyit();
}

public static void main(String[] args){
	// Creates an instance of Excersise5 named task
	
Excersise5 task = new Excersise5();
//Calls the Start method on task. Starts the app
task.Start();

}
}
