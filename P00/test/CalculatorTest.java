import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Muhammad Hakim
 * Student ID: 21015431
 * Class: C208/W65M, C209/W67N, C206/W66H
 * Date/Time created: Thursday 26-05-2022 12:17
 */

/**
 * @author hakim
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addNormal() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected, actual);
				
	}
	
	@Test
	public void addBoundary() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 9999;
		assertTrue((a >= 0 && a <= 9999) && (b >= 0 && b <= 9999));
		
	}
	
	@Test
	public void addError() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = -8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected, actual);
				
	}
	
	@Test
	public void subtractNormal() {
		//fail("Not yet implemented");
		int a = 8765;
		int b = 4321;
		
		Calculator cal = new Calculator(); 
		int actual = cal.subtract(a, b);
		
		int expected = 4444;
		assertEquals (expected, actual);
		
	}
	
	@Test
	public void subtractBoundary() {
		//fail("Not yet implemented");
		int a = 8765;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 4444;
		assertTrue((a >= 0 && a <= 9999) && (b >= 0 && b <= 9999));
		
	}
	
	@Test
	public void subtractError() {
		//fail("Not yet implemented");
		int a = 8765;
		int b = -4321;
		
		Calculator cal = new Calculator(); 
		int actual = cal.subtract(a, b);
		
		int expected = 4444;
		assertEquals (expected, actual);
		
	}
	
	@Test
	public void multiplyNormal() {
		//fail("Not yet implemented");
		int a = 20;
		int b = 30;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 600;
		assertEquals (expected, actual);
		
	}
	
	@Test
	public void multiplyBoundary() {
		//fail("Not yet implemented");
		int a = 20;
		int b = 30;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 600;
		assertTrue((a >= 0 && a <= 9999) && (b >= 0 && b <= 9999));
	
	}
	
	@Test
	public void multiplyError() {
		//fail("Not yet implemented");
		int a = 20;
		int b = -30;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 600;
		assertEquals (expected, actual);
	
	}
	
	@Test
	public void divideNormal() {
		//fail("Not yet implemented");
		int a = 9000;
		int b = 300;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 30;
		assertEquals (expected, actual);
		
	}
	
	@Test
	public void divideBoundary() {
		//fail("Not yet implemented");z
		int a = 9000;
		int b = 300;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 30;
		assertTrue((a >= 0 && a <= 9999) && (b >= 0 && b <= 9999));
	
	}
	
	@Test
	public void divideError() {
		//fail("Not yet implemented");
		int a = 9000;
		int b = -300;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 30;
		assertEquals (expected, actual);
	
	}
}
