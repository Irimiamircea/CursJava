package Curs7;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeSound();
		
		Deer bamby = new Deer();
		bamby.makeSound();
		bamby.eatGrass();
		
		Lion simba = new Lion();
		simba.makeSound();
		simba.eatMeat();
		
	}
	
	public static void feedAnimal(Animal object) {
		if(object instanceof Lion) {
			System.out.println("you are getting steak");
		} else if(object instanceof Deer) {
			System.out.println("you are getting salad");
		}
	}
}
