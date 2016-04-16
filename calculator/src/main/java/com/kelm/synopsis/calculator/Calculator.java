package com.kelm.synopsis.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entry point for the application. The args list should contain two arguments
 * (the second is optional):
 * <ul>
 * <li>the expression to be calculated
 * <li>the log level (OPTIONAL) --> options: INFO/ERROR/DEBUG (defaults to INFO)
 * </ul>
 * <p>
 * The (optional) second argument to the command line is the log level set by
 * the user. The application's classes are assumed to be contained in the same
 * package as the application entry point class (or in its sub-packages) i.e.
 * the logger pointing to the application entry point`s class package is being
 * configured.
 */
public class Calculator {
	/**
	 * This class' logger's level is set via logback.xml. The logger for the
	 * rest of the application is set through
	 * {@link LoggerConfiguration#setLogLevel(String, Class)}.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(Calculator.class);

	public static void main(String[] args) {
		boolean validArgs = validateArgs(args);

		if (validArgs) {
			applyUserSpecifiedLoggerLevel(args);
			
			String expression = args[0];
			ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator();
			
			expressionEvaluator.evaluate(expression);			
		}
	}

	private static boolean validateArgs(String[] args) {
		boolean argsValidated = true;
		{
			if (!((args.length == 1) || (args.length == 2))) {
				LOG.error(
						"The expected argument list has a single argument (an expression to be calculated) with an optional second argument (the log level: ERROR/WARN/INFO/DEBUG).");
				argsValidated = false;
			}
		}

		return argsValidated;
	}

	private static void applyUserSpecifiedLoggerLevel(String[] args) {
		boolean loggerLevelOverrideSpecified = (args.length == 2);

		if (loggerLevelOverrideSpecified) {
			LoggerConfiguration loggerConfiguration = new LoggerConfiguration();
			String loggerLevel = args[1];

			loggerConfiguration.setLogLevel(loggerLevel, Calculator.class);
		}
	}
}