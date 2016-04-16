package com.kelm.synopsis.calculator.antlr4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorBaseVisitorTest extends TestCase {
	private CalculatorBaseVisitor calculatorBaseVisitor;
	
	@Before
	public void setUp() throws Exception {
		calculatorBaseVisitor = new CalculatorBaseVisitor();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVisitAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testVisitDiv() {
		fail("Not yet implemented");
	}

	@Test
	public void testVisitSub() {
		fail("Not yet implemented");
	}

	@Test
	public void testVisitMult() {
		fail("Not yet implemented");
	}

	@Test
	public void testVisitLet() {
		fail("Not yet implemented");
	}
}