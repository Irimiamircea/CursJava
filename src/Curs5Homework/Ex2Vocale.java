package Curs5Homework;

public class Ex2Vocale {

	public static void main(String[] args) {

		int vocale = 0;
		String propozitie = "Eu invat Java.";
		
	/*	for(int i = 0; i < propozitie.length(); i++) {
			if(propozitie.charAt(i) == 'a'|| propozitie.charAt(i) == 'e'|| propozitie.charAt(i) == 'i' || propozitie.charAt(i) == 'o' || propozitie.charAt(i) == 'u') {
				vocale++;
			}
		}
		System.out.println("Vocale:" + vocale);
		*/
	
	int j = 0;
	while(j < propozitie.length()) {
	if(propozitie.charAt(j) == 'a'|| propozitie.charAt(j) == 'e'|| propozitie.charAt(j) == 'i' || propozitie.charAt(j) == 'o' || propozitie.charAt(j) == 'u'){
		vocale++;
		}
	j++;
	}
	System.out.println("Vocale:" + vocale);
	
	}
}