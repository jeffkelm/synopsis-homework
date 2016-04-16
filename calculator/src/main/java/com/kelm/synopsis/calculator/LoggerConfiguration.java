package com.kelm.synopsis.calculator;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;

/**
 * Sets the logger level for the application. It uses the logger pointing to the
 * package containing the specified class (which should be the application entry
 * point's class). Valid logger levels are: ERROR/WARN/INFO/DEBUG.
 */
public class LoggerConfiguration {
	private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(LoggerConfiguration.class);

	/**
	 * Using a {@link Logger} instead of {@link org.slf4j.Logger} to get access
	 * to {@link Logger#setLevel(Level)}.
	 */
	public void setLogLevel(String userSpecifiedLogLevelString, Class<?> applicationEntryPointClass) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("Processing user-specified log level %s for %s.",
					new Object[] { userSpecifiedLogLevelString, applicationEntryPointClass }));
		}
		if (applicationEntryPointClass == null) {
			LOG.error(
					"No application entry point class was supplied. Logger level for the application will be left as set in logback.xml.");
		}
		else if (StringUtils.isBlank(userSpecifiedLogLevelString)) {
			// since this method is only invoked if a second command line
			// argument is passed, we'll call this an error instead of a warn
			LOG.error(
					"No log level was supplied. Logger level for the application will be left as set in logback.xml.");
		}
		else {
			LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
			Package applicationPackage = applicationEntryPointClass.getPackage();
			String applicationPackageName = applicationPackage.getName();
			Logger applicationLogger = loggerContext.getLogger(applicationPackageName);
			Level configuredLogLevel = applicationLogger.getLevel();

			if (!("ERROR".equals(userSpecifiedLogLevelString) || "WARN".equals(userSpecifiedLogLevelString)
					|| "INFO".equals(userSpecifiedLogLevelString) || "DEBUG".equals(userSpecifiedLogLevelString))) {
				LOG.error(String.format(
						"The second argument is an optional log level directive and must be one of: ERROR/WARN/INFO/DEBUG. Leaving the log level of %s (as configured in logback.xml).",
						configuredLogLevel));
			}
			else {
				Level userSpecifiedLogLevel = Level.valueOf(userSpecifiedLogLevelString);

				LOG.info(String.format("Resetting log level from: %s to user-specified log level: %s.",
						new Object[] { configuredLogLevel, userSpecifiedLogLevelString }));
				applicationLogger.setLevel(userSpecifiedLogLevel);
			}
		}
	}
}