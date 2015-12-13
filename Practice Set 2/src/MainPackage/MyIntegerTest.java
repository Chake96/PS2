package MainPackage;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyIntegerTest {

	private static MyInteger myIntEven;
	private static MyInteger myIntOdd;
	private static MyInteger myIntPrime;
	private static MyInteger myIntTest;
	
	@BeforeClass
	public static void setUpBeforeClass(){
		myIntEven = new MyInteger(2);
		myIntOdd = new MyInteger(3);
		myIntPrime = new MyInteger(1);
		myIntTest = new MyInteger(10);
	}
	
	
	@Test
	public void testIsEven() {
		assertTrue(myIntEven.isEven() == true);
		}
	
	@Test
	public void testIsOdd(){
		assertFalse(myIntOdd.isOdd() == false);
	}
	
	@Test
	public void testIsPrime(){
		assertTrue(myIntPrime.isPrime() == true);
		assertTrue(myIntTest.isPrime() == false);
	}

}
