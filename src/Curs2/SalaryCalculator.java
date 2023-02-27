package Curs2;

public class SalaryCalculator {
	
	int hoursWorked = 40;
	
	
	public static void main(String[] args) {
		SalaryCalculator calc = new SalaryCalculator();
		
		Tester tester1 = new Tester(); //Tester() este constructorul scris default de catre Java, apoi l-am adaugat si noi pentru vizibilitate
		tester1.setName("Oana");
		tester1.setRatePerHour(30);
		Tester tester2 = new Tester();
		tester2.setName("Maria");
		tester2.setRatePerHour(25);
		Tester tester3 = new Tester();
		tester3.setName("Ana");
		tester3.setAge(25);
		
		System.out.println(tester1.getName());
		System.out.println(tester2.getName());                               //calc.calculateSalary(tester1getRatePerHour == plataPerOra
		System.out.println("Salariul lui " + tester1.getName() + " este " + calc.calculateSalary(tester1.getRatePerHour()));
		System.out.println(tester3.getName() + " are : " + tester3.getAge() + " ani.");
	}
	
	public int calculateSalary(int plataPerOra){    //plataPerOra putea fi orice INT (de asta l-am denumit altfel pentru ca nu este ceva ce trebuia initializat dinainte), iar noi l-am pus sa ia valoarea din tester1.getRatePerHour
		int salary = plataPerOra * hoursWorked;
		return salary;
		}
 }

