package Curs3Homework;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Care este varsta ta?");
		
		int varsta = scan.nextInt();
		
		if(varsta < 18) {
			System.out.println("Esti minor.");
		} else if (varsta >= 18 && varsta <= 65) {
			System.out.println("Esti adult.");
		} else {
			System.out.println("Esti batran.");
		}
	}

}
