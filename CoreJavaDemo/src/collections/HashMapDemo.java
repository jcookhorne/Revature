package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, Integer> phoneBook = new HashMap<>();
		phoneBook.put("xyz", 12345);
		phoneBook.put("abc", 678);
		phoneBook.put("jkl", 2468);
		
		System.out.println("phone number of jkl is : " + phoneBook.get("jkl"));
		
		//take all the keys of the hashmap and put it inside a allKeys
		Set<String> allKeys = phoneBook.keySet();
		Iterator<String> itr = allKeys.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			Integer number = phoneBook.get(name);
			System.out.println("Key : " + name + ", Value : " + number);
		}
		
		
		// update
		phoneBook.replace("xyz", 5555555);
		System.out.println(phoneBook);
	}

}
