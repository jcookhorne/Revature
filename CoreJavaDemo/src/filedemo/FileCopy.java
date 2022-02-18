package filedemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("Data.txt");
			FileWriter fw = new FileWriter("copy.txt");
			int singleData = 0;
			while((singleData = fr.read()) != -1) {
				System.out.print((char)singleData);
				fw.write((char)singleData);
				fw.flush();
				}
			fw.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
