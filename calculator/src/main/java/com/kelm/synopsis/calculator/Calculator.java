package com.kelm.synopsis.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;

/**
 * The args list should contain two arguments (the second is optional):
 * <ul>
 * <li>the expression to be calculated
 * <li>the log level (OPTIONAL) --> options: INFO/ERROR/DEBUG (defaults to INFO)
 * </ul>
 */
public class Calculator {
	private static final Logger LOG = LoggerFactory.getLogger(Calculator.class);
	private static Level LOG_LEVEL = Level.ERROR;

	public static void main(String[] args) {
		boolean validArgs = Calculator.validateArgs(args);

		if (validArgs) {
			Calculator.setLogLevel(args);
		}
	}

	/**
	 * The second argument is the log level set by the user.
	 */
	private static void setLogLevel(String[] args) {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Processing user-specified log level.");
		}
		if (args.length == 2) {
			String userSpecifiedLogLevelString = args[1];

			LOG.info(String.format("Resetting log level from: %s to user-specified log level: %s.",
					new Object[] { LOG_LEVEL, userSpecifiedLogLevelString }));
			LOG_LEVEL = Level.valueOf(userSpecifiedLogLevelString);
		}
	}

	private static boolean validateArgs(String[] args) {
		boolean argsValidated = true;
		{
			if (!((args.length == 1) || (args.length == 2))) {
				LOG.error(
						"The expected argument list has a single argument (an expression to be calculated) with an optional second argument (the log level: INFO/ERROR/DEBUG).");
				argsValidated = false;
			} else if (args.length == 2) {
				String logLevel = args[1];

				if (!("INFO".equals(logLevel) || "ERROR".equals(logLevel) || "DEBUG".equals(logLevel))) {
					LOG.error(
							"The second argument is an optional log level directive and must be one of INFO/ERROR/DEBUG. If the second argument is omitted, ERROR will be selected as the log level.");
					argsValidated = false;
				}
			}
		}

		return argsValidated;
	}
}