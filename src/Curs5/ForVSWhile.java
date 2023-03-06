package Curs5;

import java.util.Scanner;

public class ForVSWhile {
	
	
	/*
	 * un program care ii cere userului numere pe care le aduna, fara limita
	 * cand userul vrea sa iasa din program introduce 0
	 * printam suma totala la final
	 */
	public static void main(String[] args) {
	//	rezolvareCuFor();
		rezolvareCuWhile();
	}

		
	/*	public static void rezolvareCuFor(){   //fara static nu mergea chemata metoda mai sus
			System.out.println("Please enter a number:");
			Scanner scan = new Scanner(System.in);
			
			int suma = 0;
			for(int numar = scan.nextInt(); numar != 0; numar = scan.nextInt()) {
				System.out.println("Please enter a number:");
				suma = suma + numar;
			}
		
		
		
	} */
		
		public static void rezolvareCuWhile() {
			System.out.println("Please enter a number:");
			Scanner scan = new Scanner(System.in);
			
			int suma = 0;
			int numar = scan.nextInt();
			while(numar != 0) {
				System.out.println("Please enter a number:");
				suma = suma + numar;
				numar = scan.nextInt();
			}
			System.out.println("Suma totala este:" + suma);
		}
}
