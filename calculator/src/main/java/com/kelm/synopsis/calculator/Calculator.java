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
 */
public class Calculator {
	/**
	 * This logger's level is set via logback.xml. The logger for the rest of
	 * the application is set through {@link #setLogLevel(String[])}.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(Calculator.class);

	public static void main(String[] args) {
		boolean validArgs = Calculator.validateArgs(args);

		if (validArgs) {
			if (args.length == 2) {
				LoggerConfiguration loggerConfiguration = new LoggerConfiguration();
				String logLevel = args[1];
				
				loggerConfiguration.setLogLevel(logLevel,  Calculator.class);
			}
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
}