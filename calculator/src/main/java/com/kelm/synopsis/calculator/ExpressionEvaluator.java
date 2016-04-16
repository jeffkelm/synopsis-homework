package com.kelm.synopsis.calculator;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kelm.synopsis.calculator.antlr4.CalculatorBaseListener;
import com.kelm.synopsis.calculator.antlr4.CalculatorBaseVisitor;
import com.kelm.synopsis.calculator.antlr4.CalculatorLexer;
import com.kelm.synopsis.calculator.antlr4.CalculatorParser;
import com.kelm.synopsis.calculator.antlr4.CalculatorVisitor;
import com.kelm.synopsis.calculator.antlr4.ThrowingErrorListener;

public class ExpressionEvaluator {
	private static final Logger LOG = LoggerFactory.getLogger(ExpressionEvaluator.class);

	public void evaluate(String expression) {
		LOG.info(String.format("Evaluating expression: %s.", expression));
		CharStream input = new ANTLRInputStream(expression);
		CalculatorLexer lexer = new CalculatorLexer(input);
		TokenStream tokens = new CommonTokenStream(lexer);
		CalculatorParser parser = new CalculatorParser(tokens);

		parser.addParseListener(new CalculatorBaseListener());
		parser.removeErrorListeners();
		parser.addErrorListener(new ThrowingErrorListener());

		ParseTree tree = parser.mathFunc();
		CalculatorVisitor<Double> visitor = new CalculatorBaseVisitor();
		if (LOG.isDebugEnabled()) {
			LOG.debug("Instantiated ANTLR classes, about to trigger visitor.");
		}
		Double result = visitor.visit(tree);

		LOG.info(String.format("Result of expression evaluation: %.2f.", result));
	}
}