// Generated from com\kelm\synopsis\calculator\antlr4\Calculator.g4 by ANTLR 4.3
package com.kelm.synopsis.calculator.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull CalculatorParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull CalculatorParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull CalculatorParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull CalculatorParser.DivContext ctx);

	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 */
	void enterSub(@NotNull CalculatorParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 */
	void exitSub(@NotNull CalculatorParser.SubContext ctx);

	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull CalculatorParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull CalculatorParser.MultContext ctx);

	/**
	 * Enter a parse tree produced by the {@code varArg}
	 * labeled alternative in {@link CalculatorParser#mathFuncArg}.
	 * @param ctx the parse tree
	 */
	void enterVarArg(@NotNull CalculatorParser.VarArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varArg}
	 * labeled alternative in {@link CalculatorParser#mathFuncArg}.
	 * @param ctx the parse tree
	 */
	void exitVarArg(@NotNull CalculatorParser.VarArgContext ctx);

	/**
	 * Enter a parse tree produced by the {@code numArg}
	 * labeled alternative in {@link CalculatorParser#mathFuncArg}.
	 * @param ctx the parse tree
	 */
	void enterNumArg(@NotNull CalculatorParser.NumArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numArg}
	 * labeled alternative in {@link CalculatorParser#mathFuncArg}.
	 * @param ctx the parse tree
	 */
	void exitNumArg(@NotNull CalculatorParser.NumArgContext ctx);

	/**
	 * Enter a parse tree produced by the {@code let}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 */
	void enterLet(@NotNull CalculatorParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 */
	void exitLet(@NotNull CalculatorParser.LetContext ctx);

	/**
	 * Enter a parse tree produced by the {@code funcArg}
	 * labeled alternative in {@link CalculatorParser#mathFuncArg}.
	 * @param ctx the parse tree
	 */
	void enterFuncArg(@NotNull CalculatorParser.FuncArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcArg}
	 * labeled alternative in {@link CalculatorParser#mathFuncArg}.
	 * @param ctx the parse tree
	 */
	void exitFuncArg(@NotNull CalculatorParser.FuncArgContext ctx);
}