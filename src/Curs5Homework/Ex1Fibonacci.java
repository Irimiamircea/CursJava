package Curs5Homework;

public class Ex1Fibonacci {

	public static void main(String[] args) {

		int count = 9;
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.println(num1 +  " " + num2);
		
		
	/*	for(int i = 2; i < count; i++) {
		 num3 = num1 + num2;
		 System.out.println(" " + num3);
		 num1 = num2;
		 num2 = num3;
		} 
	*/	
		int i = 2;
		while(i < count) {
			num3 = num1 +num2;
			System.out.println(" " + num3);
			num1 = num2;
			num2 = num3;
			i++;
			
		}
		
	}

}
