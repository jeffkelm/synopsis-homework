// Generated from com\kelm\synopsis\calculator\antlr4\Calculator.g4 by ANTLR 4.3
package com.kelm.synopsis.calculator.antlr4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.math3.util.MathUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kelm.synopsis.calculator.antlr4.CalculatorParser.MathFuncArgContext;
import com.kelm.synopsis.calculator.antlr4.CalculatorParser.MathFuncContext;

/**
 * This class provides an empty implementation of {@link CalculatorVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 * 
 * @see /calculator/src/main/antlr4/com/kelm/synopsis/calculator/antlr4/
 *      Calculator.g4
 *
 * @param <T>
 *            The return type of the visit operation: %s. Use {@link Void} for
 *            operations with no return type.
 */
public class CalculatorBaseVisitor extends AbstractParseTreeVisitor<Integer> implements CalculatorVisitor<Integer> {
	private static final Logger LOG = LoggerFactory.getLogger(CalculatorBaseVisitor.class);

	/**
	 * Tracks the variable name of a let operator (i.e. the first argument to
	 * the operator) and stores its eventually calculated value (the
	 * number/expression in the second argument) as the map value.
	 */
	private Map<String, Integer> letVariableValueMap = new HashMap<String, Integer>();

	/**
	 * 'add(' mathFuncArg ',' mathFuncArg ')' # add
	 */
	@Override
	public Integer visitAdd(@NotNull CalculatorParser.AddContext ctx) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing an add operation: %s."), ctx.getText());
		}
		MathFuncArgContext arg1 = ctx.mathFuncArg(0);
		MathFuncArgContext arg2 = ctx.mathFuncArg(1);
		Integer arg1Result = (Integer) visit(arg1);
		Integer arg2Result = (Integer) visit(arg2);

		if (arg1Result == null) {
			LOG.error(String.format("The first operand of an add operation returned null.", arg1.getText()));
		}
		if (arg2Result == null) {
			LOG.error(String.format("The second operand of an add operation returned null.", arg1.getText()));
		}

		Integer sum = arg1Result + arg2Result;

		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Finished add operation: %s. Result: %d"), new Object[] { ctx.getText(), sum });
		}

		return sum;
	}

	/**
	 * 'div(' mathFuncArg ',' mathFuncArg ')' # div
	 */
	@Override
	public Integer visitDiv(@NotNull CalculatorParser.DivContext ctx) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing a div operation: %s."), ctx.getText());
		}
		MathFuncArgContext arg1 = ctx.mathFuncArg(0);
		MathFuncArgContext arg2 = ctx.mathFuncArg(1);
		Integer arg1Result = (Integer) visit(arg1);
		Integer arg2Result = (Integer) visit(arg2);

		if (arg1Result == null) {
			LOG.error(String.format("The first operand of a div operation returned null.", arg1.getText()));
		}
		if (arg2Result == null) {
			LOG.error(String.format("The second operand of a div operation returned null.", arg1.getText()));
		}

		Integer division = arg1Result / arg2Result;
		
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Finished div operation: %s. Result: %d"), new Object[] { ctx.getText(), division });
		}

		return division;
	}

	/**
	 * 'sub(' mathFuncArg ',' mathFuncArg ')' # sub
	 */
	@Override
	public Integer visitSub(@NotNull CalculatorParser.SubContext ctx) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing a sub operation: %s."), ctx.getText());
		}
		MathFuncArgContext arg1 = ctx.mathFuncArg(0);
		MathFuncArgContext arg2 = ctx.mathFuncArg(1);
		Integer arg1Result = (Integer) visit(arg1);
		Integer arg2Result = (Integer) visit(arg2);

		if (arg1Result == null) {
			LOG.error(String.format("The first operand of a sub operation returned null.", arg1.getText()));
		}
		if (arg2Result == null) {
			LOG.error(String.format("The second operand of a sub operation returned null.", arg1.getText()));
		}

		Integer subtraction = arg1Result - arg2Result;
		
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Finished sub operation: %s. Result: %d"), new Object[] { ctx.getText(), subtraction });
		}

		return subtraction;
	}

	/**
	 * 'mult(' mathFuncArg ',' mathFuncArg ')' # mult
	 */
	@Override
	public Integer visitMult(@NotNull CalculatorParser.MultContext ctx) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing a mult operation: %s."), ctx.getText());
		}
		MathFuncArgContext arg1 = ctx.mathFuncArg(0);
		MathFuncArgContext arg2 = ctx.mathFuncArg(1);
		Integer arg1Result = (Integer) visit(arg1);
		Integer arg2Result = (Integer) visit(arg2);

		if (arg1Result == null) {
			LOG.error(String.format("The first operand of a sub operation returned null.", arg1.getText()));
		}
		if (arg2Result == null) {
			LOG.error(String.format("The second operand of a sub operation returned null.", arg1.getText()));
		}

		Integer multiplication = arg1Result * arg2Result;
		
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Finished mult operation: %s. Result: %d"), new Object[] { ctx.getText(), multiplication });
		}

		return multiplication;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Integer visitVarArg(@NotNull CalculatorParser.VarArgContext ctx) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing a variable name: %s."), ctx.getText());
		}
		TerminalNode var = ctx.Var();

		if ((var != null) && letVariableValueMap.containsKey(var)) {
			String varText = var.getText();
			Integer varValue = letVariableValueMap.get(varText);
		}

		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Integer visitNumArg(@NotNull CalculatorParser.NumArgContext ctx) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing a number argument: %s."), ctx.getText());
		}
		String numText = ctx.Num().getText();
		int num = convertNumToInteger(numText);

		return num;
	}

	private int convertNumToInteger(String numText) {
		// the grammar guarantees that this is a number, but...
		boolean validNumber = NumberUtils.isNumber(numText);

		if (!validNumber) {
			LOG.error(String.format("Read %s while parsing a numArg; was expecting an integer.", numText));
		}

		int num = NumberUtils.toInt(numText);

		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processed numArg, returning %d.", num));
		}

		return num;
	}

	/**
	 * 'let(' Var ',' (Num | mathFunc) ',' mathFunc ')' # let
	 */
	@Override
	public Integer visitLet(@NotNull CalculatorParser.LetContext ctx) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing a let operation: %s."), ctx.getText());
		}
		String varName = ctx.Var().getText();
		Integer varValue = null;
		{
			TerminalNode numValueArg = ctx.Num();
			MathFuncContext mathFuncValueArg = ctx.mathFunc().get(0);

			if (mathFuncValueArg != null) {
				varValue = visit(mathFuncValueArg);
			}
			else {
				varValue = convertNumToInteger(numValueArg.getText());
			}
		}
		// the third argument
		MathFuncContext letExpression = ctx.mathFunc().get(1);

		letVariableValueMap.put(varName, varValue);
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("In let operation: %s. Associating value: %d with var: %s."), new Object[] { ctx.getText(), varValue, varName });
		}

		return visit(letExpression);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Integer visitFuncArg(@NotNull CalculatorParser.FuncArgContext ctx) {
		return visitChildren(ctx);
	}
}