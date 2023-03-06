package Curs5;

public class DataTypesExamples {

	public static void main(String[] args) {

		// tipuri de date integer (intregi)
		byte byteNumber = 127;
		short shortNumber = 32767;
		int intNumber = 2147483647;
		long longNumber = 9223372036854775807L; 
		float floatNumber = 3.13F; //6-7 cifre zecimale
		double doubleNumber = 3.123456789012345; //aprox 15 cifre zecimale
		
		//char
		char character = 'A'; //un singur caracter unicode
		
		boolean booleanValue = true;	//true sau false
		
		
		System.out.println("Tipuri de date in java:");
		System.out.println("byte:" + byteNumber);
		System.out.println("short:" + shortNumber);
		System.out.println("int:" + intNumber);
		System.out.println("long:" + longNumber);
		System.out.println("float:" + floatNumber);
		System.out.println("double:" + doubleNumber);
		
	}

}
