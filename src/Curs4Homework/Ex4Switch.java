package Curs4Homework;

import java.util.Scanner;

public class Ex4Switch {

	public static void main(String[] args) {
		System.out.println("Introduceti un numar intre 1 si 7 :");
		Scanner scan = new Scanner(System.in);
		int cifra = scan.nextInt();
		switch(cifra) {
		case 1 :
			System.out.println("Ziua saptamanii este Luni.");
			break;
		case 2 :
			System.out.println("Ziua saptamanii este Marti.");
			break;	
		case 3 :
			System.out.println("Ziua saptamanii este Miercuri.");
			break;
		case 4 :
			System.out.println("Ziua saptamanii este Joi.");
			break;
		case 5 :
			System.out.println("Ziua saptamanii este Vineri.");
			break;
		case 6 :
			System.out.println("Ziua saptamanii este Sambata.");
			break;
		case 7 :
			System.out.println("Ziua saptamanii este Duminica.");
			break;
		default :
			System.out.println("Please enter a number between 1 and 7");
		}
		
	}

}
