package Curs3;

import java.util.Scanner;

public class Login {
	
	//exemplu pentru git
	public void verificaLogin() {	
		
		String username = "test";
		String password = "test123";
		
		//ne ajuta sa citim de la tastatura
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Te rog sa introduci username :");
		
		String user = scan.next();
		System.out.println("Te rog sa introduci parola :");
		String pass = scan.next();
		
		if(user.equals(username) && pass.equals(password)) {  //nu folosim == la Stringuri pentru ca == va compara locul din memorie
			System.out.println("Login successfully!");
		} else {
			System.out.println("Login failed!");
		}
				
	}
}
