package Curs2;

public class Tester {
	//constructor - metoda cu numele clasei
	public Tester() {                           //java scrie mereu constructorul default, de asta a mers si inainte sa il scriem noi
		//constructorul nu are niciodata return type
	}
	
	
	//variabile
	String name;
	int ratePerHour;
	
	//metode
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRatePerHour() {
		return ratePerHour;
	}
	
	public void setRatePerHour(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	
	
	

}
