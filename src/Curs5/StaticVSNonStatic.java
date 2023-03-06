package Curs5;

public class StaticVSNonStatic {
	
	
	static String nume;    //o variabila statica nu este ascociata cu niciun obiect, se incarca inainte
	static String departament = "QA";
	
	
	public static void main(String[] args) {
		
		StaticVSNonStatic person = new StaticVSNonStatic();
		person.nume = "Oana";
		person.departament = "DEV";
		System.out.println(person.nume + departament);
		
		System.out.println("------------");
		
		StaticVSNonStatic person2 = new StaticVSNonStatic();
		person2.nume = "Maria";
		person2.departament = "HR";
		System.out.println(person2.nume + departament);
		
		System.out.println("------------");
		
		//departament = "Dev";
		StaticVSNonStatic person3 = new StaticVSNonStatic();
		person3.nume = "Ion";
		person3.departament = "Support";
		System.out.println(person3.nume + departament);
		
		System.out.println("------------");
		
		System.out.println(person.nume + departament);
		System.out.println(person2.nume + departament);
		System.out.println(person3.nume + departament);
	}

}
