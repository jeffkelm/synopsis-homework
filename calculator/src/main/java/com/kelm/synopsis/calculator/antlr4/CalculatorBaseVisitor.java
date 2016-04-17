// Generated from com\kelm\synopsis\calculator\antlr4\Calculator.g4 by ANTLR 4.3
package com.kelm.synopsis.calculator.antlr4;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.math.NumberUtils;
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
public class CalculatorBaseVisitor extends AbstractParseTreeVisitor<Double> implements CalculatorVisitor<Double> {
	private static final Logger LOG = LoggerFactory.getLogger(CalculatorBaseVisitor.class);
	/**
	 *  Rounds to 3 decimal places. Used for displaying logging messages.
	 */
	private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.###");
	{
		DECIMAL_FORMAT.setRoundingMode(RoundingMode.CEILING);
	}

	/**
	 * Tracks the variable name of a let operator (i.e. the first argument to
	 * the operator) and stores its eventually calculated value (the
	 * number/expression in the second argument) as the map value. The variable
	 * name is removed from the map once the let expression has been evaluated.
	 */
	private Map<String, Double> letVariableValueMap = new HashMap<String, Double>();

	/**
	 * 'add(' mathFuncArg ',' mathFuncArg ')' # add
	 */
	@Override
	public Double visitAdd(@NotNull CalculatorParser.AddContext ctx) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing an add operation: %s.", ctx.getText()));
		}
		MathFuncArgContext arg1 = ctx.mathFuncArg(0);
		MathFuncArgContext arg2 = ctx.mathFuncArg(1);
		Double arg1Result = (Double) visit(arg1);
		Double arg2Result = (Double) visit(arg2);

		if (arg1Result == null) {
			throw new ParseCancellationException(String.format("The first operand of an add operation returned null.", arg1.getText()));
		}
		if (arg2Result == null) {
			throw new ParseCancellationException(String.format("The second operand of an add operation returned null.", arg1.getText()));
		}

		Double sum = arg1Result + arg2Result;

		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Finished add operation: %s. Result: %s", new Object[] { ctx.getText(),  DECIMAL_FORMAT.format(sum) }));
		}

		return sum;
	}

	/**
	 * 'div(' mathFuncArg ',' mathFuncArg ')' # div
	 */
	@Override
	public Double visitDiv(@NotNull CalculatorParser.DivContext ctx) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing a div operation: %s.", ctx.getText()));
		}
		MathFuncArgContext arg1 = ctx.mathFuncArg(0);
		MathFuncArgContext arg2 = ctx.mathFuncArg(1);
		Double arg1Result = (Double) visit(arg1);
		Double arg2Result = (Double) visit(arg2);

		if (arg1Result == null) {
			throw new ParseCancellationException(String.format("The first operand of a div operation returned null.", arg1.getText()));
		}
		if (arg2Result == null) {
			throw new ParseCancellationException(String.format("The second operand of a div operation returned null.", arg1.getText()));
		}

		Double division = arg1Result / arg2Result;

		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Finished div operation: %s. Result: %s",
					new Object[] { ctx.getText(),  DECIMAL_FORMAT.format(division) }));
		}

		return division;
	}

	/**
	 * 'sub(' mathFuncArg ',' mathFuncArg ')' # sub
	 */
	@Override
	public Double visitSub(@NotNull CalculatorParser.SubContext ctx) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing a sub operation: %s.", ctx.getText()));
		}
		MathFuncArgContext arg1 = ctx.mathFuncArg(0);
		MathFuncArgContext arg2 = ctx.mathFuncArg(1);
		Double arg1Result = (Double) visit(arg1);
		Double arg2Result = (Double) visit(arg2);

		if (arg1Result == null) {
			throw new ParseCancellationException(String.format("The first operand of a sub operation returned null.", arg1.getText()));
		}
		if (arg2Result == null) {
			throw new ParseCancellationException(String.format("The second operand of a sub operation returned null.", arg1.getText()));
		}

		Double subtraction = arg1Result - arg2Result;

		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Finished sub operation: %s. Result: %s",
					new Object[] { ctx.getText(),  DECIMAL_FORMAT.format(subtraction) }));
		}

		return subtraction;
	}

	/**
	 * 'mult(' mathFuncArg ',' mathFuncArg ')' # mult
	 */
	@Override
	public Double visitMult(@NotNull CalculatorParser.MultContext ctx) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing a mult operation: %s.", ctx.getText()));
		}
		MathFuncArgContext arg1 = ctx.mathFuncArg(0);
		MathFuncArgContext arg2 = ctx.mathFuncArg(1);
		Double arg1Result = (Double) visit(arg1);
		Double arg2Result = (Double) visit(arg2);

		if (arg1Result == null) {
			throw new ParseCancellationException(String.format("The first operand of a sub operation returned null.", arg1.getText()));
		}
		if (arg2Result == null) {
			throw new ParseCancellationException(String.format("The second operand of a sub operation returned null.", arg1.getText()));
		}

		Double multiplication = arg1Result * arg2Result;

		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Finished mult operation: %s. Result: %s",
					new Object[] { ctx.getText(),  DECIMAL_FORMAT.format(multiplication) }));
		}

		return multiplication;
	}

	/**
	 * The operand of an arithmetic function (add/sub/mult/div) if it's a variable set by a let expression.
	 */
	@Override
	public Double visitVarArg(@NotNull CalculatorParser.VarArgContext ctx) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing a variable name: %s.", ctx.getText()));
		}
		Double varValue = null;
		{
			TerminalNode varNode = ctx.Var();

			if (varNode != null) {
				String var = varNode.getText();

				if (letVariableValueMap.containsKey(var)) {
					varValue = letVariableValueMap.get(var);
				}
				else {
					throw new ParseCancellationException(String.format(
							"Problem processing var from ANTLR context: %s. No variable with name: %s has been processed in the expression.",
							new Object[] { ctx.getText(), var }));
				}
			}
			else {
				throw new ParseCancellationException(String.format("Problem processing var: no var found in ANTLR context: %s.", ctx.getText()));
			}
		}

		return varValue;
	}
	
	/**
	 * The operand of an arithmetic function (add/sub/mult/div) if it's another function.
	 */
	@Override
	public Double visitFuncArg(@NotNull CalculatorParser.FuncArgContext ctx) {
		return visitChildren(ctx);
	}	

	/**
	 * The operand of an arithmetic function (add/sub/mult/div) if it's a plain number.
	 */
	@Override
	public Double visitNumArg(@NotNull CalculatorParser.NumArgContext ctx) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing a number argument: %s.", ctx.getText()));
		}
		String numText = ctx.Num().getText();
		Double num = convertNumToDouble(numText);

		return num;
	}

	private Double convertNumToDouble(String numText) {
		// the grammar guarantees that this is a number, but...
		boolean validNumber = NumberUtils.isNumber(numText);

		if (!validNumber) {
			throw new ParseCancellationException(String.format("Read %s while parsing a numArg; was expecting a double.", numText));
		}

		Double num = NumberUtils.toDouble(numText);

		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processed numArg, returning %s.",  DECIMAL_FORMAT.format(num)));
		}

		return num;
	}

	/**
	 * 'let(' Var ',' (Num | mathFunc) ',' mathFunc ')' # let
	 */
	@Override
	public Double visitLet(@NotNull CalculatorParser.LetContext ctx) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing a let operation: %s.", ctx.getText()));
		}
		// the first argument of the let expression
		String varName = ctx.Var().getText();
		// the second argument of the let expression. If this argument is
		// actually a number instead of a function, this variable is set to
		// null.
		MathFuncContext mathFuncValueArg = null;
		// the third argument of the let expression
		MathFuncContext mathFuncExpressionUsingVariableArg = null;
		{
			// The second argument of the let expression can be a mathFunc
			// or a Num and the third argument must be a mathFunc, so this
			// list contains exactly 1 or 2 elements.
			List<MathFuncContext> mathFuncList = ctx.mathFunc();

			if (!((mathFuncList.size() == 1) || (mathFuncList.size() == 2))) {
				throw new ParseCancellationException(String.format(
						"Error parsing let expression: %s. The first argument must be composed of one or more alpha characters. The second argument is either a number or an arithmetic expression or a let expression. The third argument must be an arithmetic expression or a let expression.",
						ctx.getText()));
			}
			if (mathFuncList.size() == 2) {
				mathFuncExpressionUsingVariableArg = mathFuncList.get(1);
				mathFuncValueArg = mathFuncList.get(0);
			}
			else {
				mathFuncExpressionUsingVariableArg = mathFuncList.get(0);
			}
		}
		Double varValue = calculateVariableValueForLetExpression(ctx, mathFuncValueArg);
		Double letExpressionResult = evaluateThirdArgumentOfLetExpression(ctx, varName,
				mathFuncExpressionUsingVariableArg, varValue);

		return letExpressionResult;
	}

	/**
	 * <ol>
	 * <li>Pushes the let expression variable and its associated value onto the
	 * 'variable stack'.
	 * <li>Processes the expression parameter of the let (i.e. the third
	 * parameter).
	 * <li>Pops the let expression variable from the 'variable stack'.
	 * </ol>
	 * 
	 * @param ctx
	 * @param varName
	 * @param expressionToProcess
	 * @param varValue
	 * @return
	 */
	private Double evaluateThirdArgumentOfLetExpression(CalculatorParser.LetContext ctx, String varName,
			MathFuncContext expressionToProcess, Double varValue) {
		// store the variable and its value
		letVariableValueMap.put(varName, varValue);
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("In let operation: %s. Associating value: %s with var: %s.",
					new Object[] { ctx.getText(),  DECIMAL_FORMAT.format(varValue), varName }));
		}

		Double letExpressionResult = visit(expressionToProcess);

		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Finished let operation: %s. Result: %s", new Object[] { ctx.getText(),  DECIMAL_FORMAT.format(letExpressionResult) }));
		}

		// at end of let expression; the variable name is now out-of-context
		letVariableValueMap.remove(varName);

		return letExpressionResult;
	}

	private Double calculateVariableValueForLetExpression(CalculatorParser.LetContext ctx,
			MathFuncContext mathFuncValueArg) {
		Double varValue = null;
		{
			if (mathFuncValueArg != null) {
				varValue = visit(mathFuncValueArg);
			}
			else {
				TerminalNode numValueArg = ctx.Num();

				varValue = convertNumToDouble(numValueArg.getText());
			}
		}

		return varValue;
	}
}