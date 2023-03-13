package Curs7;

public class ArrayExample2 {

	public static void main(String[] args) throws InterruptedException {

		//String[] orase = new String[4];
		//orase[0] = "Iasi";
		
		
		
		String[] orase = {"Iasi", "Bacau", "Cluj", "Pitesti"};
		
		
		System.out.println(orase[4]); //exceptie index out of bound
		
		for(String element : orase) {
			System.out.println(element);
		}
		
		
	}

}
