package Curs8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		
		Set<String> set = new HashSet<>();
		
		System.out.println(set.isEmpty());
		
		set.add("Rosu");
		System.out.println(set.isEmpty());

		System.out.println(set.size());
		
		set.add("Verde");
		set.add("Galben");
		set.add("Maro");
		
		System.out.println(set.size());
		
		System.out.println(set.contains("Alb"));
		
		System.out.println("-------------------");
		
		//Iterator pentru a parcurge setul
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {                      //hasNext - returneaza urmatorul element din lista
			System.out.println(it.next());
		}
		
		System.out.println("-------------------");
		
		set.remove("Verde");
		for(String element : set) {  // acelasi lucru doar cu foreach si fara iterator
			System.out.println(element);
		}
		
		set.clear();
		
		System.out.println(set.size());
	
	}

}
