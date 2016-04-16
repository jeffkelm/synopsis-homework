// Generated from com\kelm\synopsis\calculator\antlr4\Calculator.g4 by ANTLR 4.3
package com.kelm.synopsis.calculator.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull CalculatorParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull CalculatorParser.DivContext ctx);

	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(@NotNull CalculatorParser.SubContext ctx);

	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(@NotNull CalculatorParser.MultContext ctx);

	/**
	 * Visit a parse tree produced by the {@code varArg}
	 * labeled alternative in {@link CalculatorParser#mathFuncArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarArg(@NotNull CalculatorParser.VarArgContext ctx);

	/**
	 * Visit a parse tree produced by the {@code numArg}
	 * labeled alternative in {@link CalculatorParser#mathFuncArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumArg(@NotNull CalculatorParser.NumArgContext ctx);

	/**
	 * Visit a parse tree produced by the {@code let}
	 * labeled alternative in {@link CalculatorParser#mathFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(@NotNull CalculatorParser.LetContext ctx);

	/**
	 * Visit a parse tree produced by the {@code funcArg}
	 * labeled alternative in {@link CalculatorParser#mathFuncArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArg(@NotNull CalculatorParser.FuncArgContext ctx);
}