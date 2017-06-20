

public class Excersise5 {

private void Start() {
	Screamers fun1 = new Screamers();
	ReaderandPrinters fun2 = new ReaderandPrinters();
	Copiers fun3 = new Copiers();
	fun1.Scream();
	fun2.ReadandScan();
	fun3.Copyit();
}
	
	public static void main(String[] args){
	Excersise5 task = new Excersise5();
	task.Start();
	
	
}
}