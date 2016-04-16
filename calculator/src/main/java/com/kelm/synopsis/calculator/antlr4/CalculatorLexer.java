// Generated from com\kelm\synopsis\calculator\antlr4\Calculator.g4 by ANTLR 4.3
package com.kelm.synopsis.calculator.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, Var=8, Num=9, 
		WhiteSpace=10, NewLine=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "Var", "Num", 
		"WhiteSpace", "NewLine"
	};


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rN\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\6\t"+
		"9\n\t\r\t\16\t:\3\n\6\n>\n\n\r\n\16\n?\3\13\3\13\3\13\3\13\3\f\5\fG\n"+
		"\f\3\f\3\f\5\fK\n\f\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\3\2\4\4\2C\\c|\4\2\13\13\"\"Q\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\36\3\2\2\2"+
		"\7#\3\2\2\2\t(\3\2\2\2\13*\3\2\2\2\r,\3\2\2\2\17\62\3\2\2\2\218\3\2\2"+
		"\2\23=\3\2\2\2\25A\3\2\2\2\27J\3\2\2\2\31\32\7n\2\2\32\33\7g\2\2\33\34"+
		"\7v\2\2\34\35\7*\2\2\35\4\3\2\2\2\36\37\7c\2\2\37 \7f\2\2 !\7f\2\2!\""+
		"\7*\2\2\"\6\3\2\2\2#$\7f\2\2$%\7k\2\2%&\7x\2\2&\'\7*\2\2\'\b\3\2\2\2("+
		")\7+\2\2)\n\3\2\2\2*+\7.\2\2+\f\3\2\2\2,-\7o\2\2-.\7w\2\2./\7n\2\2/\60"+
		"\7v\2\2\60\61\7*\2\2\61\16\3\2\2\2\62\63\7u\2\2\63\64\7w\2\2\64\65\7d"+
		"\2\2\65\66\7*\2\2\66\20\3\2\2\2\679\t\2\2\28\67\3\2\2\29:\3\2\2\2:8\3"+
		"\2\2\2:;\3\2\2\2;\22\3\2\2\2<>\4\62;\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?"+
		"@\3\2\2\2@\24\3\2\2\2AB\t\3\2\2BC\3\2\2\2CD\b\13\2\2D\26\3\2\2\2EG\7\17"+
		"\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HK\7\f\2\2IK\7\17\2\2JF\3\2\2\2JI\3"+
		"\2\2\2KL\3\2\2\2LM\b\f\2\2M\30\3\2\2\2\7\2:?FJ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}