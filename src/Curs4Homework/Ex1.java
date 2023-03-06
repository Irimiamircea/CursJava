package Curs4Homework;

import java.util.Scanner;

public class Ex1 {
	int suma;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 1; i < 11; i++) {
			int numarIntrodus = scan.nextInt();
			System.out.println("Please enter number " + i + " : " + numarIntrodus);
		}
		
	}
	
	
	
	
	
		public void printResult() {
			System.out.println("The sum of the numbers is: " + suma);
		}
}
