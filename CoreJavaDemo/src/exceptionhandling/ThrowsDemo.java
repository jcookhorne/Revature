package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

		// TODO Auto-generated method stub
		public static void method1()throws FileNotFoundException 
		{
			FileInputStream fis = new FileInputStream("D:\\test.txt");	
		}
		
		public static void method2()throws FileNotFoundException 
		{
			//
			//	
			method1();
			//
			//
			//
		}

		public static void main(String[] args)//throws FileNotFoundException - never do this, this is equivalent to not handling the exception 
		{
				try {
					method2();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		}

	}

