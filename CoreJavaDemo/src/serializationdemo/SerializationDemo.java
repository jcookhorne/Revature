package serializationdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileOutputStream fos = new FileOutputStream("myfile.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Account acc1 = new Account(0123, "Checking", 111);
			
			oos.writeObject(acc1);
			oos.close();
			fos.close();
			
			System.out.println("Object written");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}	

}
