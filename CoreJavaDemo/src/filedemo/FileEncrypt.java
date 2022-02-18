package filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.KeyGenerator;

public class FileEncrypt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int content = sc.nextInt();
		
		
	
	try {
		KeyGenerator keygenerator = KeyGenerator.getInstance(null);
		
		FileInputStream fis = new FileInputStream("Data.txt");
		FileOutputStream fos = new FileOutputStream("copy.txt");
		int singleData = 0;
		while((singleData = fis.read()) != -1) {
			System.out.print((char)singleData);
			
			}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoSuchAlgorithmException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

