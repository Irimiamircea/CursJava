package Curs8;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		
		map.put("T", "Tester");
		map.put("D", "Dev");
		map.put("M", "Manager");
		map.put("PM", "Product Manager");
		
		for(String key : map.keySet() ) {
		System.out.println(key);	
		}
		for(String value : map.values() ) {
			System.out.println(value);	
		}
		
		System.out.println(map);
		System.out.println(map.get("T"));
		System.out.println(map.get("Tester")); //nu exista getValue, doar getKey
		
		System.out.println(map.containsValue("Support"));
		System.out.println(map.containsKey("D"));
	}

}
