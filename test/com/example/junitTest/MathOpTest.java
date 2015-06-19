package com.example.junitTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MathOpTest {

	private MathOp math;
	
	@Before
	public void setUp() throws Exception {
		math = new MathOp();
	}

	@Test
	public void testAdd() {
		assertEquals(4, math.add(3, 1));
	}

	@Test
	public void testSub() {
		assertEquals(-4, math.sub(-3, 1));
	}
	
	@Test
	public void testSquare() {
		assertEquals(25, math.square(5));
	}

}
