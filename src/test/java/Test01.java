package test.java;

import static org.junit.Assert.*;
import main.java.Number;

import org.junit.Test;


public class Test01 {
	
	@Test
	public void TestPrimes(){
		assertTrue("2 is a Prime Number", new Number(2).isPrime());
		assertTrue("3 is a Prime Number", new Number(3).isPrime());
		assertFalse("4 is not a Prime Number", new Number(4).isPrime());
		assertTrue("5 is a Prime Number", new Number(5).isPrime());
		assertFalse("6 is not a Prime Number", new Number(6).isPrime());
		assertTrue("7 is a Prime Number", new Number(7).isPrime());
		assertFalse("8 is not a Prime Number", new Number(8).isPrime());
		assertFalse("9 is not a Prime Number", new Number(9).isPrime());
		assertFalse("10 is not a Prime Number", new Number(10).isPrime());
	}
	@Test
	public void TestDivisors(){
		Number number = new Number(0);
		assertEquals(1, number.countPositiveDivisors(1));
		assertEquals(2, number.countPositiveDivisors(2));
		//test that skip the search of divisors after 2
		assertEquals(2, number.countPositiveDivisors(4));
		assertEquals(3, number.countPositiveDivisors(100));
	}


}
