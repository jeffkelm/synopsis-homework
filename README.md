Project assumptions:

1) Uses Antlr 4.3 to parse the grammar. It uses a visitor class to evaluate the rules defined in the grammar.
2) All values are calculated as type double. When displayed in log messages, double values are rounded to 3 decimal places.
3) Uses logback for logging.
4) Uses JUnit 4.12 for unit tests.
5) Uses Maven 3 for running the build.
6) Uses utilities from the Apache Commons libraries (NumUtils/MathUtils/StringUtils).
7) The result of the expression is displayed via the log (INFO level). Logs are captured both in the console and in expressionEvaluation.log.

This GitHub project includes:

1) the Maven configuration files
2) the Eclipse (Mars) project files
3) unit tests

Other notes:

I learned both Antlr and Git on-the-fly for this assignment. Please excuse any non-standard usage!
