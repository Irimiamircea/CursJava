package Curs8;

public class GenericsExample {

	public static void main(String[] args) {

		GenericsExample obj = new GenericsExample();
		obj.printDetails(123);
		obj.printDetails("Text");
		obj.printDetails('C');
		obj.printDetails(12.35);
		
	}
	 
	public <T> void printDetails(T obj) {                 //tip generic
		System.out.println("Obiectul meu este : " + obj);
	}

	/*public void printDetails(String text) {
		System.out.println("Obiectul meu este : " + text);
	}
	
	
	public void printDetails(int nr) {
		System.out.println("Obiectul meu este : " + nr);
	}*/
	
}
