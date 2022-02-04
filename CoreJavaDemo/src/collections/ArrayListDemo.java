package collections;

import java.util.ArrayList;
import java.util.List;

import classes_and_objects.Room;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// not recommended way of createing ArrayList Object
		//ArrayList myList = new ArrayList();
		//Recommended way
		List<Object> myList = new ArrayList<Object>();
		
		
		String str1 = "Hello";
		String str2 = "Welcome";
		Room room = new Room(50, 250);
		//Integer number = new Integer(5);// new Integer() is deprecated
		// deprecated means its old and not usual to use
		int data = 100; 
		
		Integer number = 5;
		myList.add(room);
		myList.add(str1);
		myList.add(str2);
		myList.add(number);
		myList.add(str2);
		myList.add(data); // auto boxing primitive is automatically
		// converted to its wrapper type
		// update List
		myList.set(1, "What is good");
		
		// remove
		myList.remove(4);
		System.out.println(myList);
		System.out.println(myList.get(3));

	}

}
