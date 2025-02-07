// Generated from D:/Programs/IntelliJ IDEA 2019.3.4/proj/SetLanguage-master/src/main/java/compiler/grammar\setGrammar.g4 by ANTLR 4.8

package compiler.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class setGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSIGN=2, SET=3, ELEMENT=4, INT_TYPE=5, STRING_TYPE=6, OPAR=7, 
		CPAR=8, OANGLEBR=9, CANGLEBR=10, OBRACKET=11, CBRACKET=12, COLON=13, PUSH=14, 
		PULL=15, NEGATION=16, CONTAIN=17, INSERSION=18, UNION=19, COMPLEMENTS=20, 
		CARTESIAN_PRODUCT=21, EQ=22, NEQ=23, IS=24, PLUS=25, IN=26, PRINT=27, 
		PRITTY_PRINT=28, IF=29, ELSE=30, WHILE=31, FOREACH=32, SWITCH=33, CASE=34, 
		DEFAULT=35, MAIN=36, FUNCTION=37, RETURN=38, INT=39, ID=40, STRING=41, 
		COMMENT=42, SPACES=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ASSIGN", "SET", "ELEMENT", "INT_TYPE", "STRING_TYPE", "OPAR", 
			"CPAR", "OANGLEBR", "CANGLEBR", "OBRACKET", "CBRACKET", "COLON", "PUSH", 
			"PULL", "NEGATION", "CONTAIN", "INSERSION", "UNION", "COMPLEMENTS", "CARTESIAN_PRODUCT", 
			"EQ", "NEQ", "IS", "PLUS", "IN", "PRINT", "PRITTY_PRINT", "IF", "ELSE", 
			"WHILE", "FOREACH", "SWITCH", "CASE", "DEFAULT", "MAIN", "FUNCTION", 
			"RETURN", "INT", "ID", "STRING", "COMMENT", "SPACES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'='", "'set'", "'element'", "'integer'", "'string'", "'('", 
			"')'", "'<'", "'>'", "'{'", "'}'", "':'", "'<-'", "'->'", "'!'", "'<?>'", 
			"'-'", null, "'/'", "'*'", "'=='", "'!='", "'is'", null, "'in'", "'print'", 
			"'<<'", "'if'", "'else'", "'while'", "'forEach'", "'switch'", "'case'", 
			"'default'", "'main'", "'fun'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ASSIGN", "SET", "ELEMENT", "INT_TYPE", "STRING_TYPE", "OPAR", 
			"CPAR", "OANGLEBR", "CANGLEBR", "OBRACKET", "CBRACKET", "COLON", "PUSH", 
			"PULL", "NEGATION", "CONTAIN", "INSERSION", "UNION", "COMPLEMENTS", "CARTESIAN_PRODUCT", 
			"EQ", "NEQ", "IS", "PLUS", "IN", "PRINT", "PRITTY_PRINT", "IF", "ELSE", 
			"WHILE", "FOREACH", "SWITCH", "CASE", "DEFAULT", "MAIN", "FUNCTION", 
			"RETURN", "INT", "ID", "STRING", "COMMENT", "SPACES"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public setGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "setGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0111\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\6(\u00ed\n(\r(\16"+
		"(\u00ee\3)\3)\7)\u00f3\n)\f)\16)\u00f6\13)\3*\3*\3*\3*\7*\u00fc\n*\f*"+
		"\16*\u00ff\13*\3*\3*\3+\3+\3+\3+\7+\u0107\n+\f+\16+\u010a\13+\3+\3+\3"+
		",\3,\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\b\3\2\62;\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2"+
		"\u0115\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\ta\3\2\2"+
		"\2\13i\3\2\2\2\rq\3\2\2\2\17x\3\2\2\2\21z\3\2\2\2\23|\3\2\2\2\25~\3\2"+
		"\2\2\27\u0080\3\2\2\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u0086\3\2\2"+
		"\2\37\u0089\3\2\2\2!\u008c\3\2\2\2#\u008e\3\2\2\2%\u0092\3\2\2\2\'\u0094"+
		"\3\2\2\2)\u0096\3\2\2\2+\u0098\3\2\2\2-\u009a\3\2\2\2/\u009d\3\2\2\2\61"+
		"\u00a0\3\2\2\2\63\u00a3\3\2\2\2\65\u00a5\3\2\2\2\67\u00a8\3\2\2\29\u00ae"+
		"\3\2\2\2;\u00b1\3\2\2\2=\u00b4\3\2\2\2?\u00b9\3\2\2\2A\u00bf\3\2\2\2C"+
		"\u00c7\3\2\2\2E\u00ce\3\2\2\2G\u00d3\3\2\2\2I\u00db\3\2\2\2K\u00e0\3\2"+
		"\2\2M\u00e4\3\2\2\2O\u00ec\3\2\2\2Q\u00f0\3\2\2\2S\u00f7\3\2\2\2U\u0102"+
		"\3\2\2\2W\u010d\3\2\2\2YZ\7.\2\2Z\4\3\2\2\2[\\\7?\2\2\\\6\3\2\2\2]^\7"+
		"u\2\2^_\7g\2\2_`\7v\2\2`\b\3\2\2\2ab\7g\2\2bc\7n\2\2cd\7g\2\2de\7o\2\2"+
		"ef\7g\2\2fg\7p\2\2gh\7v\2\2h\n\3\2\2\2ij\7k\2\2jk\7p\2\2kl\7v\2\2lm\7"+
		"g\2\2mn\7i\2\2no\7g\2\2op\7t\2\2p\f\3\2\2\2qr\7u\2\2rs\7v\2\2st\7t\2\2"+
		"tu\7k\2\2uv\7p\2\2vw\7i\2\2w\16\3\2\2\2xy\7*\2\2y\20\3\2\2\2z{\7+\2\2"+
		"{\22\3\2\2\2|}\7>\2\2}\24\3\2\2\2~\177\7@\2\2\177\26\3\2\2\2\u0080\u0081"+
		"\7}\2\2\u0081\30\3\2\2\2\u0082\u0083\7\177\2\2\u0083\32\3\2\2\2\u0084"+
		"\u0085\7<\2\2\u0085\34\3\2\2\2\u0086\u0087\7>\2\2\u0087\u0088\7/\2\2\u0088"+
		"\36\3\2\2\2\u0089\u008a\7/\2\2\u008a\u008b\7@\2\2\u008b \3\2\2\2\u008c"+
		"\u008d\7#\2\2\u008d\"\3\2\2\2\u008e\u008f\7>\2\2\u008f\u0090\7A\2\2\u0090"+
		"\u0091\7@\2\2\u0091$\3\2\2\2\u0092\u0093\7/\2\2\u0093&\3\2\2\2\u0094\u0095"+
		"\7-\2\2\u0095(\3\2\2\2\u0096\u0097\7\61\2\2\u0097*\3\2\2\2\u0098\u0099"+
		"\7,\2\2\u0099,\3\2\2\2\u009a\u009b\7?\2\2\u009b\u009c\7?\2\2\u009c.\3"+
		"\2\2\2\u009d\u009e\7#\2\2\u009e\u009f\7?\2\2\u009f\60\3\2\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7u\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\7-\2\2\u00a4\64"+
		"\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\66\3\2\2\2\u00a8"+
		"\u00a9\7r\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2"+
		"\u00ac\u00ad\7v\2\2\u00ad8\3\2\2\2\u00ae\u00af\7>\2\2\u00af\u00b0\7>\2"+
		"\2\u00b0:\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7h\2\2\u00b3<\3\2\2\2"+
		"\u00b4\u00b5\7g\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8"+
		"\7g\2\2\u00b8>\3\2\2\2\u00b9\u00ba\7y\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc"+
		"\7k\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7g\2\2\u00be@\3\2\2\2\u00bf\u00c0"+
		"\7h\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7G\2\2\u00c3"+
		"\u00c4\7c\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7j\2\2\u00c6B\3\2\2\2\u00c7"+
		"\u00c8\7u\2\2\u00c8\u00c9\7y\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7v\2\2"+
		"\u00cb\u00cc\7e\2\2\u00cc\u00cd\7j\2\2\u00cdD\3\2\2\2\u00ce\u00cf\7e\2"+
		"\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7g\2\2\u00d2F\3\2"+
		"\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7"+
		"\7c\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7v\2\2\u00da"+
		"H\3\2\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7k\2\2\u00de"+
		"\u00df\7p\2\2\u00dfJ\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7w\2\2\u00e2"+
		"\u00e3\7p\2\2\u00e3L\3\2\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6"+
		"\u00e7\7v\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7p\2\2"+
		"\u00eaN\3\2\2\2\u00eb\u00ed\t\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3"+
		"\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00efP\3\2\2\2\u00f0\u00f4"+
		"\t\3\2\2\u00f1\u00f3\t\4\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5R\3\2\2\2\u00f6\u00f4\3\2\2\2"+
		"\u00f7\u00fd\7$\2\2\u00f8\u00fc\n\5\2\2\u00f9\u00fa\7$\2\2\u00fa\u00fc"+
		"\7$\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0101\7$\2\2\u0101T\3\2\2\2\u0102\u0103\7\61\2\2\u0103\u0104"+
		"\7\61\2\2\u0104\u0108\3\2\2\2\u0105\u0107\n\6\2\2\u0106\u0105\3\2\2\2"+
		"\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\b+\2\2\u010cV\3\2\2\2\u010d\u010e"+
		"\t\7\2\2\u010e\u010f\3\2\2\2\u010f\u0110\b,\2\2\u0110X\3\2\2\2\b\2\u00ee"+
		"\u00f4\u00fb\u00fd\u0108\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}