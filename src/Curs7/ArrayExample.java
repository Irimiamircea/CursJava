package Curs7;

public class ArrayExample {

	public static void main(String[] args) {

		String[] textArray = new String[5];
		
		//String[] textArray = {null, null, null, null, null }
		//index of array =       0,    1,    2,    3,     4
		
		
		textArray[0]= "this ";
		System.out.println(textArray[0]);
		//String[] textArray = { this, null, null, null, null}
		textArray[1]= "is ";
		textArray[2]= "an ";
		textArray[3]= "array ";
		textArray[4]= "!";

		for(int i = 0; i < textArray.length; i ++) {
			System.out.print(textArray[i]);
		}
		
		//for each --enchanged loop
		for(String element : textArray) {
			System.out.print(element);
		}
	}

}
