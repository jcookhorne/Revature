package collections;

import java.util.Set;
import java.util.TreeSet;

import classes_and_objects.Room;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> allNames = new TreeSet<String>();
		
		allNames.add("xyz");
		allNames.add("abc");
		allNames.add("lmn");
		allNames.add("fgh");
		
		System.out.println(allNames);
		
		Set<Room> allRooms = new TreeSet<>();
		allRooms.add(new Room(200,100));
		allRooms.add(new Room(500,300));
		
		System.out.println(allRooms);
		
	}

}
