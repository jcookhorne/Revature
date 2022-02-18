package mavendemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {
	@BeforeAll 
	public static void first() {
		System.out.println("Before all method is called");
	}
	
//	
//	@AfterAll
//	public static void last() {
//		System.out.println("After all methods are called.");
//	}
	@BeforeEach
	public void eachBefore() {
		System.out.println("Before each is called");
	}
	@AfterEach
	public void eachAfter() {
		System.out.println("After each is caled. ");
	}
	
	
	@Test
	public void testAddPositive() {
		Calculator calc = new Calculator();
		int actualOutput =  calc.add(5, 7);
		int expectedOutput = 12;
		
		assertEquals(expectedOutput, actualOutput);
	}
	@Test
	public void testAddZero() {
		Calculator calc = new Calculator();
		int actualOutput =  calc.add(0, 0);
		int expectedOutput = 0;
		
		assertEquals(expectedOutput, actualOutput);
	}
	@Test
	public void testAddNegative() {
		Calculator calc = new Calculator();
		int actualOutput =  calc.add(-8, -4);
		int expectedOutput = -12;
		
		assertEquals(expectedOutput, actualOutput);
	}
	@Test
	public void testmultiplyNegative() {
		Calculator calc = new Calculator();
		int actualOutput =  calc.multiply(-8, -5);
		int expectedOutput = 40;
		
		assertEquals(expectedOutput, actualOutput);
	}
	@Test
	public void testmultiplypositive() {
		Calculator calc = new Calculator();
		int actualOutput =  calc.multiply(5, 22);
		int expectedOutput = 110;
		
		assertEquals(expectedOutput, actualOutput);
	}
	
	
}


