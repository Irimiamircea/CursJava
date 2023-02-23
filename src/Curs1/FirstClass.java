package Curs1;

public class FirstClass {
	//variabila de instanta -> are nevoie de un obiect al clasei pntru a fi utilizata
	String nume = "Ioana";
	int varsta = 25;

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		FirstClass obiect = new FirstClass();				
		//variabila locala
		String prenume = "Ana";
		System.out.println(prenume);
		
		System.out.println(obiect.nume);
	}

}
