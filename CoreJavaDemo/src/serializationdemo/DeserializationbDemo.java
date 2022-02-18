package serializationdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			FileInputStream fis = new FileInputStream("myFile.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Account account = (Account) ois.readObject();
			fis.close();
			ois.close();
			System.out.println(account);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
