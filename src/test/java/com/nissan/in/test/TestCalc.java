package com.nissan.in.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void test1() {
		Calculator o1 = new Calculator();
		assertEquals(3,o1.calc(1,2,'+'));
	}
	
	@Test
	public void test2() {
		Calculator o1 = new Calculator();
		assertEquals(2,o1.calc(1,2,'*'));
	}
		@Test
		public void test3() {
			Calculator o1 = new Calculator();
			assertEquals(3,o1.calc(3,1,'/'));
			}
			
			@Test
			public void test4() {
				Calculator o1 = new Calculator();
				assertEquals(-1,o1.calc(1,2,'-'));
			
			}
	
}
