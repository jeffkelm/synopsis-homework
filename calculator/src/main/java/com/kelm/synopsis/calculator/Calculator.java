package com.kelm.synopsis.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The args list should contain two arguments (the second is optional):
 * <ul>
 * <li>the expression to be calculated
 * <li> the log level (OPTIONAL) --> options: INFO/ERROR/DEBUG (defaults to INFO) 
 * </ul> 
 */
public class Calculator {
	private static final Logger LOG = LoggerFactory.getLogger(Calculator.class);
	
	public static void main(String[] args) {
		Calculator.validateArgs(args);
	}

	private static void validateArgs(String[] args) {
		if (!((args.length == 1) || (args.length == 2))) {
			LOG.error("The expected argument list has a single argument (an expression to be calculated) with an optional second argument (the log level: INFO/ERROR/DEBUG).");
		}
		else if (args.length == 2) {
			String logLevel = args[1];
			
			if (!("INFO".equals(logLevel) || "ERROR".equals(logLevel) || "DEBUG".equals(logLevel))) {
				LOG.error("The second argument is an optional log level directive and must be one of INFO/ERROR/DEBUG. If the second argument is omitted, ERROR will be selected as the log level.");
			}
		}
	}
}