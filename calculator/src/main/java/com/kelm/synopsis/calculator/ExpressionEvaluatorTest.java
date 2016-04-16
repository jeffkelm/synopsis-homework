package com.kelm.synopsis.calculator;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ExpressionEvaluatorTest extends TestCase {
	/**
	 *  Rounds to 3 decimal places. Used for displaying logging messages.
	 */
	private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.###");
	{
		DECIMAL_FORMAT.setRoundingMode(RoundingMode.CEILING);
	}
	
	private ExpressionEvaluator expressionEvaluator;
	
	@Before
	public void setUp() throws Exception {
		expressionEvaluator = new ExpressionEvaluator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEvaluateSimpleAdd() {
		String expression = "add(1,2)";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(3.0, result);
	}
	
	@Test
	public void testEvaluateAddWithWrongParameterCount() {
		try {
			String expression = "add(1,2,3)";
			Double result = expressionEvaluator.evaluate(expression);
			
			fail("Should have thrown a ParseCancellationException.");
		}
		catch (ParseCancellationException e) {
		}
	}
	
	@Test
	public void testEvaluateAddWithComplexFirstParameter() {
		String expression = "add(sub(6,2),2)";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(6.0, result);
	}
	
	@Test
	public void testEvaluateAddWithComplexSecondParameter() {
		String expression = "add(1,sub(2,3))";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(0.0, result);
	}
	
	@Test
	public void testEvaluateAddWithTwoComplexParameters() {
		String expression = "add(add(4,3),sub(3,2))";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(8.0, result);
	}
	
	@Test
	public void testEvaluateSimpleSub() {
		String expression = "sub(2,1)";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(1.0, result);
	}
	
	@Test
	public void testEvaluateSubWithNegativeAnswer() {
		String expression = "sub(2,9)";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(-7.0, result);
	}

	@Test
	public void testEvaluateSubWithWrongParameterCount() {
		try {
			String expression = "sub(1,2,3)";
			Double result = expressionEvaluator.evaluate(expression);
			
			fail("Should have thrown a ParseCancellationException.");
		}
		catch (ParseCancellationException e) {
		}
	}
	
	@Test
	public void testEvaluateSubWithComplexFirstParameter() {
		String expression = "sub(add(6,2),2)";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(6.0, result);
	}
	
	@Test
	public void testEvaluateSubWithComplexSecondParameter() {
		String expression = "sub(1,sub(2,3))";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(2.0, result);
	}
	
	@Test
	public void testEvaluateSubWithTwoComplexParameters() {
		String expression = "sub(add(4,3),sub(3,2))";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(6.0, result);
	}
	
	@Test
	public void testEvaluateSimpleMult() {
		String expression = "mult(1,2)";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(2.0, result);
	}

	@Test
	public void testEvaluateMultWithWrongParameterCount() {
		try {
			String expression = "mult(1,2,3)";
			Double result = expressionEvaluator.evaluate(expression);
			
			fail("Should have thrown a ParseCancellationException.");
		}
		catch (ParseCancellationException e) {
		}
	}
	
	@Test
	public void testEvaluateMultWithComplexFirstParameter() {
		String expression = "mult(add(6,2),2)";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(16.0, result);
	}
	
	@Test
	public void testEvaluateMultWithComplexSecondParameter() {
		String expression = "mult(1,sub(2,3))";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(-1.0, result);
	}
	
	@Test
	public void testEvaluateMultWithTwoComplexParameters() {
		String expression = "mult(add(4,3),sub(4,2))";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(14.0, result);
	}
	
	@Test
	public void testEvaluateSimpleDiv() {
		String expression = "div(1,2)";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(0.5, result);
	}

	@Test
	public void testEvaluateDivWithWrongParameterCount() {
		try {
			String expression = "div(1,2,3)";
			Double result = expressionEvaluator.evaluate(expression);
			
			fail("Should have thrown a ParseCancellationException.");
		}
		catch (ParseCancellationException e) {
		}
	}
	
	@Test
	public void testEvaluateDivWithComplexFirstParameter() {
		String expression = "div(add(6,2),2)";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(4.0, result);
	}
	
	@Test
	public void testEvaluateDivWithComplexSecondParameter() {
		String expression = "div(6,sub(11,3))";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(0.75, result);
	}
	
	@Test
	public void testEvaluateDivWithTwoComplexParameters() {
		String expression = "div(add(4,3),sub(4,2))";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(3.5, result);
	}
	
	@Test
	public void testEvaluateSimpleLet() {
		String expression = "let(x,1,add(x,3))";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(4.0, result);
	}
	
	@Test
	public void testEvaluateLetWithComplexValueArgument() {
		String expression = "let(x,mult(4,add(3,8)),add(x,3))";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals(47.0, result);
	}
	
	@Test
	public void testVeryComplexExpression() {
		String expression = "div(100,let(x,mult(4,add(3,8)),let(y,add(x,3),sub(x,y))))";
		Double result = expressionEvaluator.evaluate(expression);
		
		assertEquals("-33.333", DECIMAL_FORMAT.format(result));
	}
	
	@Test
	public void testNullExpression() {
		String expression = null;
		try {
			Double result = expressionEvaluator.evaluate(expression);
			
			fail("Should have thrown an IllegalArgumentException.");
		}
		catch (IllegalArgumentException e) {
		}
	}
	
	@Test
	public void testEmptyStringExpression() {
		String expression = "";
		try {
			Double result = expressionEvaluator.evaluate(expression);
			
			fail("Should have thrown an IllegalArgumentException.");
		}
		catch (IllegalArgumentException e) {
		}
	}	
	
	@Test
	public void testInvalidExpression() {
		try {
			String expression = "www6(33)";
			Double result = expressionEvaluator.evaluate(expression);
			
			fail("Should have thrown a ParseCancellationException.");
		}
		catch (ParseCancellationException e) {
		}
	}
	
	@Test
	public void testExpressionWithLetVariableOutOfScope() {
		try {
			String expression = "add(x,let(x,2,add(x,3)))";
			Double result = expressionEvaluator.evaluate(expression);
			
			fail("Should have thrown a ParseCancellationException.");
		}
		catch (ParseCancellationException e) {
		}
	}
}