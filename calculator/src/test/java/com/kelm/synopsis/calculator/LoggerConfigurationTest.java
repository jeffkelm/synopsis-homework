package com.kelm.synopsis.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import com.kelm.synopsis.calculator.LoggerConfiguration;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import junit.framework.TestCase;

/**
 * Tests use a {@link Logger} instead of a {@link org.slf4j.Logger} to gain
 * access to {@link Logger#setLevel(Level)} and
 * {@link Logger#getLevel()}.
 */
public class LoggerConfigurationTest extends TestCase {
	private LoggerConfiguration loggerConfiguration;
	private Logger mockLogger;

	@Before
	public void setUp() {
		mockLogger = MockForLoggerConfiguration.buildMockLogger();
		loggerConfiguration = new LoggerConfiguration();
	}

	@After
	public void tearDown() {
	}

	/**
	 * Happy path.
	 */
	@Test
	public void testSetLogLevel() {
		mockLogger.setLevel(Level.TRACE);
		assertEquals(Level.TRACE, mockLogger.getLevel());
		loggerConfiguration.setLogLevel("INFO", MockForLoggerConfiguration.class);
		assertEquals(Level.INFO, mockLogger.getLevel());
	}

	/**
	 * Logger level should remain unchanged.
	 */
	public void testSetLogLevelNullClassPassed() {
		mockLogger.setLevel(Level.TRACE);
		assertEquals(Level.TRACE, mockLogger.getLevel());
		loggerConfiguration.setLogLevel("INFO", null);
		assertEquals(Level.TRACE, mockLogger.getLevel());
	}

	/**
	 * Logger level should remain unchanged.
	 */
	public void testSetLogLevelInvalidLoggerLevelPassed() {
		mockLogger.setLevel(Level.TRACE);
		assertEquals(Level.TRACE, mockLogger.getLevel());
		loggerConfiguration.setLogLevel("banana", MockForLoggerConfiguration.class);
		assertEquals(Level.TRACE, mockLogger.getLevel());
	}

	/**
	 * Logger level should remain unchanged.
	 */
	public void testSetLogLevelInvalidLoggerLevelAndNullClassPassed() {
		mockLogger.setLevel(Level.TRACE);
		assertEquals(Level.TRACE, mockLogger.getLevel());
		loggerConfiguration.setLogLevel("banana", null);
		assertEquals(Level.TRACE, mockLogger.getLevel());
	}

	private static final class MockForLoggerConfiguration {
		static Logger buildMockLogger() {
			LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
			Package mockPackage = MockForLoggerConfiguration.class.getPackage();
			String mockPackageName = mockPackage.getName();
			Logger mockLogger = loggerContext.getLogger(mockPackageName);

			return mockLogger;
		}
	}
}