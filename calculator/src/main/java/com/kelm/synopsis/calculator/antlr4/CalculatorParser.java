// Generated from com\kelm\synopsis\calculator\antlr4\Calculator.g4 by ANTLR 4.3
package com.kelm.synopsis.calculator.antlr4;
import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, Var=8, Num=9, 
		WhiteSpace=10, NewLine=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'let('", "'add('", "'div('", "')'", "','", "'mult('", "'sub('", 
		"Var", "Num", "WhiteSpace", "NewLine"
	};
	public static final int
		RULE_mathFunc = 0, RULE_mathFuncArg = 1;
	public static final String[] ruleNames = {
		"mathFunc", "mathFuncArg"
	};

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MathFuncContext extends ParserRuleContext {
		public MathFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathFunc; }
	 
		public MathFuncContext() { }
		public void copyFrom(MathFuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends MathFuncContext {
		public MathFuncArgContext mathFuncArg(int i) {
			return getRuleContext(MathFuncArgContext.class,i);
		}
		public List<MathFuncArgContext> mathFuncArg() {
			return getRuleContexts(MathFuncArgContext.class);
		}
		public AddContext(MathFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends MathFuncContext {
		public MathFuncArgContext mathFuncArg(int i) {
			return getRuleContext(MathFuncArgContext.class,i);
		}
		public List<MathFuncArgContext> mathFuncArg() {
			return getRuleContexts(MathFuncArgContext.class);
		}
		public DivContext(MathFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends MathFuncContext {
		public MathFuncArgContext mathFuncArg(int i) {
			return getRuleContext(MathFuncArgContext.class,i);
		}
		public List<MathFuncArgContext> mathFuncArg() {
			return getRuleContexts(MathFuncArgContext.class);
		}
		public SubContext(MathFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends MathFuncContext {
		public MathFuncArgContext mathFuncArg(int i) {
			return getRuleContext(MathFuncArgContext.class,i);
		}
		public List<MathFuncArgContext> mathFuncArg() {
			return getRuleContexts(MathFuncArgContext.class);
		}
		public MultContext(MathFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetContext extends MathFuncContext {
		public List<MathFuncContext> mathFunc() {
			return getRuleContexts(MathFuncContext.class);
		}
		public TerminalNode Num() { return getToken(CalculatorParser.Num, 0); }
		public MathFuncContext mathFunc(int i) {
			return getRuleContext(MathFuncContext.class,i);
		}
		public TerminalNode Var() { return getToken(CalculatorParser.Var, 0); }
		public LetContext(MathFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathFuncContext mathFunc() throws RecognitionException {
		MathFuncContext _localctx = new MathFuncContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mathFunc);
		try {
			setState(39);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(4); match(T__5);
				setState(5); mathFuncArg();
				setState(6); match(T__2);
				setState(7); mathFuncArg();
				setState(8); match(T__3);
				}
				break;
			case T__0:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(10); match(T__0);
				setState(11); mathFuncArg();
				setState(12); match(T__2);
				setState(13); mathFuncArg();
				setState(14); match(T__3);
				}
				break;
			case T__1:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(16); match(T__1);
				setState(17); mathFuncArg();
				setState(18); match(T__2);
				setState(19); mathFuncArg();
				setState(20); match(T__3);
				}
				break;
			case T__4:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(22); match(T__4);
				setState(23); mathFuncArg();
				setState(24); match(T__2);
				setState(25); mathFuncArg();
				setState(26); match(T__3);
				}
				break;
			case T__6:
				_localctx = new LetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(28); match(T__6);
				setState(29); match(Var);
				setState(30); match(T__2);
				setState(33);
				switch (_input.LA(1)) {
				case Num:
					{
					setState(31); match(Num);
					}
					break;
				case T__6:
				case T__5:
				case T__4:
				case T__1:
				case T__0:
					{
					setState(32); mathFunc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(35); match(T__2);
				setState(36); mathFunc();
				setState(37); match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathFuncArgContext extends ParserRuleContext {
		public MathFuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathFuncArg; }
	 
		public MathFuncArgContext() { }
		public void copyFrom(MathFuncArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarArgContext extends MathFuncArgContext {
		public TerminalNode Var() { return getToken(CalculatorParser.Var, 0); }
		public VarArgContext(MathFuncArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterVarArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitVarArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitVarArg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumArgContext extends MathFuncArgContext {
		public TerminalNode Num() { return getToken(CalculatorParser.Num, 0); }
		public NumArgContext(MathFuncArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterNumArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitNumArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitNumArg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncArgContext extends MathFuncArgContext {
		public MathFuncContext mathFunc() {
			return getRuleContext(MathFuncContext.class,0);
		}
		public FuncArgContext(MathFuncArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFuncArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFuncArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitFuncArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathFuncArgContext mathFuncArg() throws RecognitionException {
		MathFuncArgContext _localctx = new MathFuncArgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mathFuncArg);
		try {
			setState(44);
			switch (_input.LA(1)) {
			case Var:
				_localctx = new VarArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41); match(Var);
				}
				break;
			case Num:
				_localctx = new NumArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42); match(Num);
				}
				break;
			case T__6:
			case T__5:
			case T__4:
			case T__1:
			case T__0:
				_localctx = new FuncArgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43); mathFunc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\61\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2$\n\2\3\2\3\2\3"+
		"\2\3\2\5\2*\n\2\3\3\3\3\3\3\5\3/\n\3\3\3\2\2\4\2\4\2\2\65\2)\3\2\2\2\4"+
		".\3\2\2\2\6\7\7\4\2\2\7\b\5\4\3\2\b\t\7\7\2\2\t\n\5\4\3\2\n\13\7\6\2\2"+
		"\13*\3\2\2\2\f\r\7\t\2\2\r\16\5\4\3\2\16\17\7\7\2\2\17\20\5\4\3\2\20\21"+
		"\7\6\2\2\21*\3\2\2\2\22\23\7\b\2\2\23\24\5\4\3\2\24\25\7\7\2\2\25\26\5"+
		"\4\3\2\26\27\7\6\2\2\27*\3\2\2\2\30\31\7\5\2\2\31\32\5\4\3\2\32\33\7\7"+
		"\2\2\33\34\5\4\3\2\34\35\7\6\2\2\35*\3\2\2\2\36\37\7\3\2\2\37 \7\n\2\2"+
		" #\7\7\2\2!$\7\13\2\2\"$\5\2\2\2#!\3\2\2\2#\"\3\2\2\2$%\3\2\2\2%&\7\7"+
		"\2\2&\'\5\2\2\2\'(\7\6\2\2(*\3\2\2\2)\6\3\2\2\2)\f\3\2\2\2)\22\3\2\2\2"+
		")\30\3\2\2\2)\36\3\2\2\2*\3\3\2\2\2+/\7\n\2\2,/\7\13\2\2-/\5\2\2\2.+\3"+
		"\2\2\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\5#).";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}