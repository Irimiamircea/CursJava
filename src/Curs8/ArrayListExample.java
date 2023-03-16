package Curs8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("Ioana");
		list.add("Ion");
		list.add("Maria");
		
		System.out.println(list.get(2));
		
		list.add(1, "George");
		
		for(String nume : list) {
			System.out.println(nume);
		}
		
		list.remove(0);   //stergem dupa index
		list.remove("Ioana");   //stergem dupa obiect
		
		System.out.println("----------------");
		
		for(String nume : list) {
			System.out.println(nume);
		}
		
		String text  = "Maria";
		System.out.println(list.contains(text));
		
		System.out.println("----------------");
		
		list.set(0, "Oana");
		for(String nume : list) {
			System.out.println(nume);
		}
		
		list.add("Ioana");
		list.add("Marian");
		
		System.out.println("----------------");
		
		
		list.subList(2, 4).clear();  //poti face un range din lista si sa aplici o metoda pe el
		for(String nume : list) {     //indexul final nu se sterge din range, s-au sters doar 2,3 
			System.out.println(nume);
		}
	}

}
