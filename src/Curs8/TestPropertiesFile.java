package Curs8;

import java.io.IOException;

public class TestPropertiesFile {

	public static void main(String[] args) throws IOException {

		
		PropertiesFileProcessor propFile = new PropertiesFileProcessor();
		
		//propFile.writePropertiesFile();   //daca lasam, ne suprascrie cu ce era inainte si ne sterge emailul
		propFile.readPropertiesFile("email");
		propFile.readPropertiesFile("user");
		
	}

}
