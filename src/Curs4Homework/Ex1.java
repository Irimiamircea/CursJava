package Curs4Homework;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		forLoop();
		
	}
	public static void forLoop() {
	System.out.println("Please enter number 1 :");
	Scanner scan = new Scanner(System.in);
	int suma = 0;
	int numberCounter = 1;
	
	for (int numarIntrodus = scan.nextInt(); numberCounter < 11; numarIntrodus = scan.nextInt()) {
		System.out.println("Please enter number " +  numberCounter + ": ");
		suma = suma + numarIntrodus;
		numberCounter ++;
		
	}
	System.out.println("The sum of the numbers is: " + suma);
}
}
