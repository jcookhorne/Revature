package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapAndHashMap {

	
	public static void main(String[] args) {
		//create
		TreeMap<Integer, String> tm = new TreeMap<>();
		TreeMap< String, Integer> tm2 = new TreeMap<>();
		Map<String, String> map = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		
		// crud
		//create
		
		//update
		map.put("North Carolina", "Charlotte");
		map.put("ohio", "Columbus");
		map.put("Florida", "Orlando");
		map2.put("Joshua", 22);
		map2.put("Matthew", 26);
		map2.put("King", 82);
		map2.put("Bosse", 16);
		
		// treemap is sorted either by whatever the key is
		// so if its integer its that if its string by
		// the alphabet
		tm.put(22, "Joshua");
		tm.put(26, "Matthew");
		tm.put(82, "King");
		tm.put(16, "Bosse" );
		tm2.put("Joshua", 22);
		tm2.put("Matthew", 26);
		tm2.put("King", 82);
		tm2.put("Bosse", 16);
		
		//read
		System.out.println(tm);
		System.out.println(tm2);
		System.out.println(map);
		System.out.println(map.get("ohio"));
		//delete
		map.remove("Florida");
		
		//remove all
		//map.clear();
		
	}
	
	
}
