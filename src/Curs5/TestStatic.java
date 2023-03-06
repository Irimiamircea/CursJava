package Curs5;

public class TestStatic {

	public static void main(String[] args) {
		
		
		VariableScope obj = new VariableScope();
		obj.afiseazaText();
		
		VariableScope.afiseazaAltText();  //nu avem nevoie de obiect cand chemam un static
		
	}

}
