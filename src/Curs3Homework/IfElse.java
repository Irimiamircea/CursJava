package Curs3Homework;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ce punctaj ai obtinut la test?");
		int punctaj = scan.nextInt();
	
		if(punctaj >= 0 && punctaj <= 65 ) {
			System.out.println("Ai picat.Mai incearca.");
		} else {
			System.out.println("Felicitari! Ai trecut!");
		}
	}

}
