package com.garyhu;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculateTest {

	private static Calculate calculate = new Calculate();

	@Before
	public void setUp() throws Exception {
		calculate.clear();
	}

	@Test
	public void testAdd() {
		calculate.add(2);
		calculate.add(3);
		assertEquals(5, calculate.getResult());
	}

	@Test
	public void testSubstract() {
		calculate.add(10);
		calculate.substract(2);
		assertEquals(8, calculate.getResult());
	}

	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() {
	}

	@Test
	public void testDivide() {
		calculate.divide(8);
		calculate.divide(2);
		assertEquals(4, calculate.getResult());
	}

}
