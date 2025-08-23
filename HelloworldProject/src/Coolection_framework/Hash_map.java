package Coolection_framework;
import java.util.*;
import java.util.Map;

public class Hash_map {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("One","Orange");
		map.put("Four","Mango");
		map.put("Three","Banana");
		map.put("Five","Watermelon");
		map.put("Ten","Kiwi");
		map.put("Two","Kiwi");
		map.put("Nine","Kiwi");
		map.put(null,"Nothing");
		map.put(null, null);
		map.put("Nine","CusturdApple");
		System.out.println(map);
		System.out.println(map);
		map.replace("Nine","CusturdApple");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		
		
		
		
		

	}

}
