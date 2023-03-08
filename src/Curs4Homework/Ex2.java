package Curs4Homework;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("Please enter a number :");
		Scanner scan = new Scanner(System.in);
		int j = 1;
		for (int i = scan.nextInt();j <= 10; j++) {
			System.out.println(i*j);

		}
	}
	

}
