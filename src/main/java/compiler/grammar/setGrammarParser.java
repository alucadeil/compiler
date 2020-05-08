// Generated from D:/Programs/IntelliJ IDEA 2019.3.4/proj/SetLanguage-master/src/main/java/compiler/grammar\setGrammar.g4 by ANTLR 4.8

package compiler.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class setGrammarParser extends Parser {
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
	public static final int
		RULE_parse = 0, RULE_main = 1, RULE_start = 2, RULE_instruction = 3, RULE_set_operations = 4, 
		RULE_set_operation = 5, RULE_create = 6, RULE_create_set = 7, RULE_create_element = 8, 
		RULE_create_string = 9, RULE_create_int = 10, RULE_name_object_set = 11, 
		RULE_name_object_element = 12, RULE_name_object_string = 13, RULE_name_object_int = 14, 
		RULE_push_in_set = 15, RULE_pull_from_set = 16, RULE_push_more = 17, RULE_pull_more = 18, 
		RULE_switch_stat = 19, RULE_case_block = 20, RULE_value = 21, RULE_if_stat = 22, 
		RULE_condition_block = 23, RULE_stat_block = 24, RULE_while_stat = 25, 
		RULE_foreach_stat = 26, RULE_condition = 27, RULE_condition_for_each = 28, 
		RULE_print = 29, RULE_print_expr = 30, RULE_function_call = 31, RULE_param_call = 32, 
		RULE_arg_call = 33, RULE_function = 34, RULE_stat_block_with_return = 35, 
		RULE_return_id = 36, RULE_param = 37, RULE_arg = 38, RULE_type = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "main", "start", "instruction", "set_operations", "set_operation", 
			"create", "create_set", "create_element", "create_string", "create_int", 
			"name_object_set", "name_object_element", "name_object_string", "name_object_int", 
			"push_in_set", "pull_from_set", "push_more", "pull_more", "switch_stat", 
			"case_block", "value", "if_stat", "condition_block", "stat_block", "while_stat", 
			"foreach_stat", "condition", "condition_for_each", "print", "print_expr", 
			"function_call", "param_call", "arg_call", "function", "stat_block_with_return", 
			"return_id", "param", "arg", "type"
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

	@Override
	public String getGrammarFileName() { return "setGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public setGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(setGrammarParser.EOF, 0); }
		public List<CreateContext> create() {
			return getRuleContexts(CreateContext.class);
		}
		public CreateContext create(int i) {
			return getRuleContext(CreateContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ELEMENT) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(80);
				create();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(86);
				function();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			main();
			setState(93);
			match(EOF);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(setGrammarParser.MAIN, 0); }
		public TerminalNode OBRACKET() { return getToken(setGrammarParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(setGrammarParser.CBRACKET, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(MAIN);
			setState(96);
			match(OBRACKET);
			setState(97);
			start();
			setState(98);
			match(CBRACKET);
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

	public static class StartContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ELEMENT) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOREACH) | (1L << SWITCH) | (1L << ID))) != 0)) {
				{
				{
				setState(100);
				instruction();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class InstructionContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public Push_in_setContext push_in_set() {
			return getRuleContext(Push_in_setContext.class,0);
		}
		public Pull_from_setContext pull_from_set() {
			return getRuleContext(Pull_from_setContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Foreach_statContext foreach_stat() {
			return getRuleContext(Foreach_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Set_operationsContext set_operations() {
			return getRuleContext(Set_operationsContext.class,0);
		}
		public Switch_statContext switch_stat() {
			return getRuleContext(Switch_statContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				create();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				push_in_set();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				pull_from_set();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				if_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				while_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				foreach_stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				function_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(114);
				set_operations();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(115);
				switch_stat();
				}
				break;
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

	public static class Set_operationsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(setGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(setGrammarParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(setGrammarParser.ASSIGN, 0); }
		public Set_operationContext set_operation() {
			return getRuleContext(Set_operationContext.class,0);
		}
		public TerminalNode SET() { return getToken(setGrammarParser.SET, 0); }
		public Set_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_operations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitSet_operations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_operationsContext set_operations() throws RecognitionException {
		Set_operationsContext _localctx = new Set_operationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_set_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET) {
				{
				setState(118);
				match(SET);
				}
			}

			setState(121);
			match(ID);
			setState(122);
			match(ASSIGN);
			setState(123);
			match(ID);
			setState(124);
			set_operation();
			setState(125);
			match(ID);
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

	public static class Set_operationContext extends ParserRuleContext {
		public Set_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_operation; }
	 
		public Set_operationContext() { }
		public void copyFrom(Set_operationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnionOperationContext extends Set_operationContext {
		public TerminalNode UNION() { return getToken(setGrammarParser.UNION, 0); }
		public UnionOperationContext(Set_operationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitUnionOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComplementsOperationContext extends Set_operationContext {
		public TerminalNode COMPLEMENTS() { return getToken(setGrammarParser.COMPLEMENTS, 0); }
		public ComplementsOperationContext(Set_operationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitComplementsOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsersionOperationContext extends Set_operationContext {
		public TerminalNode INSERSION() { return getToken(setGrammarParser.INSERSION, 0); }
		public InsersionOperationContext(Set_operationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitInsersionOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CartesianProductOperationContext extends Set_operationContext {
		public TerminalNode CARTESIAN_PRODUCT() { return getToken(setGrammarParser.CARTESIAN_PRODUCT, 0); }
		public CartesianProductOperationContext(Set_operationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitCartesianProductOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_operationContext set_operation() throws RecognitionException {
		Set_operationContext _localctx = new Set_operationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_set_operation);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERSION:
				_localctx = new InsersionOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(INSERSION);
				}
				break;
			case UNION:
				_localctx = new UnionOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(UNION);
				}
				break;
			case COMPLEMENTS:
				_localctx = new ComplementsOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(COMPLEMENTS);
				}
				break;
			case CARTESIAN_PRODUCT:
				_localctx = new CartesianProductOperationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(CARTESIAN_PRODUCT);
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

	public static class CreateContext extends ParserRuleContext {
		public Create_setContext create_set() {
			return getRuleContext(Create_setContext.class,0);
		}
		public Create_elementContext create_element() {
			return getRuleContext(Create_elementContext.class,0);
		}
		public Create_stringContext create_string() {
			return getRuleContext(Create_stringContext.class,0);
		}
		public Create_intContext create_int() {
			return getRuleContext(Create_intContext.class,0);
		}
		public Set_operationsContext set_operations() {
			return getRuleContext(Set_operationsContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				create_set();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				create_element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				create_string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				create_int();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				set_operations();
				}
				break;
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

	public static class Create_setContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(setGrammarParser.ASSIGN, 0); }
		public Name_object_setContext name_object_set() {
			return getRuleContext(Name_object_setContext.class,0);
		}
		public TerminalNode SET() { return getToken(setGrammarParser.SET, 0); }
		public Create_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitCreate_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_setContext create_set() throws RecognitionException {
		Create_setContext _localctx = new Create_setContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_create_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET) {
				{
				setState(140);
				match(SET);
				}
			}

			setState(143);
			match(ID);
			setState(144);
			match(ASSIGN);
			setState(145);
			name_object_set();
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

	public static class Create_elementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(setGrammarParser.ASSIGN, 0); }
		public Name_object_elementContext name_object_element() {
			return getRuleContext(Name_object_elementContext.class,0);
		}
		public TerminalNode ELEMENT() { return getToken(setGrammarParser.ELEMENT, 0); }
		public Create_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitCreate_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_elementContext create_element() throws RecognitionException {
		Create_elementContext _localctx = new Create_elementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELEMENT) {
				{
				setState(147);
				match(ELEMENT);
				}
			}

			setState(150);
			match(ID);
			setState(151);
			match(ASSIGN);
			setState(152);
			name_object_element();
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

	public static class Create_stringContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(setGrammarParser.ASSIGN, 0); }
		public Name_object_stringContext name_object_string() {
			return getRuleContext(Name_object_stringContext.class,0);
		}
		public TerminalNode STRING_TYPE() { return getToken(setGrammarParser.STRING_TYPE, 0); }
		public Create_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitCreate_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_stringContext create_string() throws RecognitionException {
		Create_stringContext _localctx = new Create_stringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_create_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_TYPE) {
				{
				setState(154);
				match(STRING_TYPE);
				}
			}

			setState(157);
			match(ID);
			setState(158);
			match(ASSIGN);
			setState(159);
			name_object_string();
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

	public static class Create_intContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(setGrammarParser.ASSIGN, 0); }
		public Name_object_intContext name_object_int() {
			return getRuleContext(Name_object_intContext.class,0);
		}
		public TerminalNode INT_TYPE() { return getToken(setGrammarParser.INT_TYPE, 0); }
		public Create_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_int; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitCreate_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_intContext create_int() throws RecognitionException {
		Create_intContext _localctx = new Create_intContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_create_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE) {
				{
				setState(161);
				match(INT_TYPE);
				}
			}

			setState(164);
			match(ID);
			setState(165);
			match(ASSIGN);
			setState(166);
			name_object_int();
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

	public static class Name_object_setContext extends ParserRuleContext {
		public Name_object_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_set; }
	 
		public Name_object_setContext() { }
		public void copyFrom(Name_object_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdSetContext extends Name_object_setContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public IdSetContext(Name_object_setContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitIdSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameObjectSetContext extends Name_object_setContext {
		public TerminalNode STRING() { return getToken(setGrammarParser.STRING, 0); }
		public NameObjectSetContext(Name_object_setContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitNameObjectSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallSetContext extends Name_object_setContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallSetContext(Name_object_setContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitFunctionCallSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_setContext name_object_set() throws RecognitionException {
		Name_object_setContext _localctx = new Name_object_setContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name_object_set);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new NameObjectSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new FunctionCallSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				function_call();
				}
				break;
			case 3:
				_localctx = new IdSetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(ID);
				}
				break;
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

	public static class Name_object_elementContext extends ParserRuleContext {
		public Name_object_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_element; }
	 
		public Name_object_elementContext() { }
		public void copyFrom(Name_object_elementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallElementContext extends Name_object_elementContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallElementContext(Name_object_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitFunctionCallElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdElementContext extends Name_object_elementContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public IdElementContext(Name_object_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitIdElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameObjectElementContext extends Name_object_elementContext {
		public TerminalNode STRING() { return getToken(setGrammarParser.STRING, 0); }
		public NameObjectElementContext(Name_object_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitNameObjectElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntObjectElementContext extends Name_object_elementContext {
		public TerminalNode INT() { return getToken(setGrammarParser.INT, 0); }
		public IntObjectElementContext(Name_object_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitIntObjectElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_elementContext name_object_element() throws RecognitionException {
		Name_object_elementContext _localctx = new Name_object_elementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_name_object_element);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new NameObjectElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new IntObjectElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(INT);
				}
				break;
			case 3:
				_localctx = new FunctionCallElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				function_call();
				}
				break;
			case 4:
				_localctx = new IdElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(ID);
				}
				break;
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

	public static class Name_object_stringContext extends ParserRuleContext {
		public Name_object_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_string; }
	 
		public Name_object_stringContext() { }
		public void copyFrom(Name_object_stringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectStringContext extends Name_object_stringContext {
		public TerminalNode STRING() { return getToken(setGrammarParser.STRING, 0); }
		public NameObjectStringContext(Name_object_stringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitNameObjectString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_stringContext name_object_string() throws RecognitionException {
		Name_object_stringContext _localctx = new Name_object_stringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_name_object_string);
		try {
			_localctx = new NameObjectStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(STRING);
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

	public static class Name_object_intContext extends ParserRuleContext {
		public Name_object_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_int; }
	 
		public Name_object_intContext() { }
		public void copyFrom(Name_object_intContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectIntContext extends Name_object_intContext {
		public TerminalNode INT() { return getToken(setGrammarParser.INT, 0); }
		public NameObjectIntContext(Name_object_intContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitNameObjectInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_intContext name_object_int() throws RecognitionException {
		Name_object_intContext _localctx = new Name_object_intContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_name_object_int);
		try {
			_localctx = new NameObjectIntContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(INT);
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

	public static class Push_in_setContext extends ParserRuleContext {
		public Token id;
		public TerminalNode PUSH() { return getToken(setGrammarParser.PUSH, 0); }
		public Push_moreContext push_more() {
			return getRuleContext(Push_moreContext.class,0);
		}
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public Push_in_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push_in_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitPush_in_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Push_in_setContext push_in_set() throws RecognitionException {
		Push_in_setContext _localctx = new Push_in_setContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_push_in_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((Push_in_setContext)_localctx).id = match(ID);
			setState(184);
			match(PUSH);
			setState(185);
			push_more();
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

	public static class Pull_from_setContext extends ParserRuleContext {
		public Token id;
		public TerminalNode PULL() { return getToken(setGrammarParser.PULL, 0); }
		public Pull_moreContext pull_more() {
			return getRuleContext(Pull_moreContext.class,0);
		}
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public Pull_from_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pull_from_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitPull_from_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pull_from_setContext pull_from_set() throws RecognitionException {
		Pull_from_setContext _localctx = new Pull_from_setContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pull_from_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			((Pull_from_setContext)_localctx).id = match(ID);
			setState(188);
			match(PULL);
			setState(189);
			pull_more();
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

	public static class Push_moreContext extends ParserRuleContext {
		public Push_moreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push_more; }
	 
		public Push_moreContext() { }
		public void copyFrom(Push_moreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PushMoreContext extends Push_moreContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public Push_moreContext push_more() {
			return getRuleContext(Push_moreContext.class,0);
		}
		public PushMoreContext(Push_moreContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitPushMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PushOneContext extends Push_moreContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public PushOneContext(Push_moreContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitPushOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Push_moreContext push_more() throws RecognitionException {
		Push_moreContext _localctx = new Push_moreContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_push_more);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new PushMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(ID);
				setState(192);
				match(T__0);
				setState(193);
				push_more();
				}
				break;
			case 2:
				_localctx = new PushOneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(ID);
				}
				break;
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

	public static class Pull_moreContext extends ParserRuleContext {
		public Pull_moreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pull_more; }
	 
		public Pull_moreContext() { }
		public void copyFrom(Pull_moreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PullMoreContext extends Pull_moreContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public Pull_moreContext pull_more() {
			return getRuleContext(Pull_moreContext.class,0);
		}
		public PullMoreContext(Pull_moreContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitPullMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PullOneContext extends Pull_moreContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public PullOneContext(Pull_moreContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitPullOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pull_moreContext pull_more() throws RecognitionException {
		Pull_moreContext _localctx = new Pull_moreContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pull_more);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new PullMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(ID);
				setState(198);
				match(T__0);
				setState(199);
				pull_more();
				}
				break;
			case 2:
				_localctx = new PullOneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(ID);
				}
				break;
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

	public static class Switch_statContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(setGrammarParser.SWITCH, 0); }
		public TerminalNode OPAR() { return getToken(setGrammarParser.OPAR, 0); }
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public TerminalNode CPAR() { return getToken(setGrammarParser.CPAR, 0); }
		public TerminalNode OBRACKET() { return getToken(setGrammarParser.OBRACKET, 0); }
		public TerminalNode CBRACKET() { return getToken(setGrammarParser.CBRACKET, 0); }
		public List<Case_blockContext> case_block() {
			return getRuleContexts(Case_blockContext.class);
		}
		public Case_blockContext case_block(int i) {
			return getRuleContext(Case_blockContext.class,i);
		}
		public Switch_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitSwitch_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statContext switch_stat() throws RecognitionException {
		Switch_statContext _localctx = new Switch_statContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_switch_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(SWITCH);
			setState(204);
			match(OPAR);
			setState(205);
			match(ID);
			setState(206);
			match(CPAR);
			setState(207);
			match(OBRACKET);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(208);
				case_block();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(CBRACKET);
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

	public static class Case_blockContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(setGrammarParser.CASE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COLON() { return getToken(setGrammarParser.COLON, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(setGrammarParser.DEFAULT, 0); }
		public Case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitCase_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_blockContext case_block() throws RecognitionException {
		Case_blockContext _localctx = new Case_blockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_case_block);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(CASE);
				setState(217);
				value();
				setState(218);
				match(COLON);
				setState(219);
				start();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(DEFAULT);
				setState(222);
				match(COLON);
				setState(223);
				start();
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CaseStrContext extends ValueContext {
		public TerminalNode STRING() { return getToken(setGrammarParser.STRING, 0); }
		public CaseStrContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitCaseStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseIdContext extends ValueContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public CaseIdContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitCaseId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseIntContext extends ValueContext {
		public TerminalNode INT() { return getToken(setGrammarParser.INT, 0); }
		public CaseIntContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitCaseInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new CaseIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new CaseStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(STRING);
				}
				break;
			case INT:
				_localctx = new CaseIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(INT);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(setGrammarParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(setGrammarParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(setGrammarParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(setGrammarParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IF);
			setState(232);
			condition_block();
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					match(ELSE);
					setState(234);
					match(IF);
					setState(235);
					condition_block();
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(241);
				match(ELSE);
				setState(242);
				stat_block();
				}
			}

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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(setGrammarParser.OPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(setGrammarParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(setGrammarParser.NEGATION, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condition_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(OPAR);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(246);
				match(NEGATION);
				}
			}

			setState(249);
			condition();
			setState(250);
			match(CPAR);
			setState(251);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(setGrammarParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(setGrammarParser.CBRACKET, 0); }
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stat_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(OBRACKET);
			setState(254);
			start();
			setState(255);
			match(CBRACKET);
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(setGrammarParser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(WHILE);
			setState(258);
			condition_block();
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

	public static class Foreach_statContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(setGrammarParser.FOREACH, 0); }
		public TerminalNode OPAR() { return getToken(setGrammarParser.OPAR, 0); }
		public Condition_for_eachContext condition_for_each() {
			return getRuleContext(Condition_for_eachContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(setGrammarParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Foreach_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitForeach_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_statContext foreach_stat() throws RecognitionException {
		Foreach_statContext _localctx = new Foreach_statContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_foreach_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(FOREACH);
			setState(261);
			match(OPAR);
			setState(262);
			condition_for_each();
			setState(263);
			match(CPAR);
			setState(264);
			stat_block();
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckTypeContext extends ConditionContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public TerminalNode IS() { return getToken(setGrammarParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CheckTypeContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitCheckType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainContext extends ConditionContext {
		public List<TerminalNode> ID() { return getTokens(setGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(setGrammarParser.ID, i);
		}
		public TerminalNode CONTAIN() { return getToken(setGrammarParser.CONTAIN, 0); }
		public ContainContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitContain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ConditionContext {
		public Token op;
		public List<TerminalNode> ID() { return getTokens(setGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(setGrammarParser.ID, i);
		}
		public TerminalNode EQ() { return getToken(setGrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(setGrammarParser.NEQ, 0); }
		public EqualityExprContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condition);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new EqualityExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(ID);
				setState(267);
				((EqualityExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
					((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(268);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ContainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(ID);
				setState(270);
				match(CONTAIN);
				setState(271);
				match(ID);
				}
				break;
			case 3:
				_localctx = new CheckTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(ID);
				setState(273);
				match(IS);
				setState(274);
				type();
				}
				break;
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

	public static class Condition_for_eachContext extends ParserRuleContext {
		public Condition_for_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_for_each; }
	 
		public Condition_for_eachContext() { }
		public void copyFrom(Condition_for_eachContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForEachElementContext extends Condition_for_eachContext {
		public TerminalNode ELEMENT() { return getToken(setGrammarParser.ELEMENT, 0); }
		public List<TerminalNode> ID() { return getTokens(setGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(setGrammarParser.ID, i);
		}
		public TerminalNode IN() { return getToken(setGrammarParser.IN, 0); }
		public ForEachElementContext(Condition_for_eachContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitForEachElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_for_eachContext condition_for_each() throws RecognitionException {
		Condition_for_eachContext _localctx = new Condition_for_eachContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_condition_for_each);
		try {
			_localctx = new ForEachElementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ELEMENT);
			setState(278);
			match(ID);
			setState(279);
			match(IN);
			setState(280);
			match(ID);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(setGrammarParser.PRINT, 0); }
		public Print_exprContext print_expr() {
			return getRuleContext(Print_exprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(PRINT);
			setState(283);
			print_expr(0);
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

	public static class Print_exprContext extends ParserRuleContext {
		public Print_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expr; }
	 
		public Print_exprContext() { }
		public void copyFrom(Print_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConcatStringContext extends Print_exprContext {
		public List<Print_exprContext> print_expr() {
			return getRuleContexts(Print_exprContext.class);
		}
		public Print_exprContext print_expr(int i) {
			return getRuleContext(Print_exprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(setGrammarParser.PLUS, 0); }
		public ConcatStringContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitConcatString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIdContext extends Print_exprContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public PrintIdContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitPrintId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pretty_printContext extends Print_exprContext {
		public TerminalNode PRITTY_PRINT() { return getToken(setGrammarParser.PRITTY_PRINT, 0); }
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public Pretty_printContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitPretty_print(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIntContext extends Print_exprContext {
		public TerminalNode INT() { return getToken(setGrammarParser.INT, 0); }
		public PrintIntContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitPrintInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStringContext extends Print_exprContext {
		public TerminalNode STRING() { return getToken(setGrammarParser.STRING, 0); }
		public PrintStringContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitPrintString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_exprContext print_expr() throws RecognitionException {
		return print_expr(0);
	}

	private Print_exprContext print_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Print_exprContext _localctx = new Print_exprContext(_ctx, _parentState);
		Print_exprContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_print_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new PrintIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(286);
				match(ID);
				}
				break;
			case STRING:
				{
				_localctx = new PrintStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(STRING);
				}
				break;
			case INT:
				{
				_localctx = new PrintIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				match(INT);
				}
				break;
			case PRITTY_PRINT:
				{
				_localctx = new Pretty_printContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				match(PRITTY_PRINT);
				setState(290);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatStringContext(new Print_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_print_expr);
					setState(293);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(294);
					match(PLUS);
					setState(295);
					print_expr(6);
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(ID);
			setState(302);
			param_call();
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

	public static class Param_callContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(setGrammarParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(setGrammarParser.CPAR, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public Param_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitParam_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_callContext param_call() throws RecognitionException {
		Param_callContext _localctx = new Param_callContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_param_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(OPAR);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(305);
				arg_call();
				}
			}

			setState(308);
			match(CPAR);
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

	public static class Arg_callContext extends ParserRuleContext {
		public Arg_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_call; }
	 
		public Arg_callContext() { }
		public void copyFrom(Arg_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamCallArgsContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public ParamCallArgsContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitParamCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamCallArgContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public ParamCallArgContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitParamCallArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_callContext arg_call() throws RecognitionException {
		Arg_callContext _localctx = new Arg_callContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arg_call);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ParamCallArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamCallArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(ID);
				setState(312);
				match(T__0);
				setState(313);
				arg_call();
				}
				break;
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(setGrammarParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_block_with_returnContext stat_block_with_return() {
			return getRuleContext(Stat_block_with_returnContext.class,0);
		}
		public ReturnFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitReturnFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(setGrammarParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public VoidFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new VoidFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(FUNCTION);
				setState(317);
				match(ID);
				setState(318);
				param();
				setState(319);
				stat_block();
				}
				break;
			case 2:
				_localctx = new ReturnFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(FUNCTION);
				setState(322);
				type();
				setState(323);
				match(ID);
				setState(324);
				param();
				setState(325);
				stat_block_with_return();
				}
				break;
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

	public static class Stat_block_with_returnContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(setGrammarParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Return_idContext return_id() {
			return getRuleContext(Return_idContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(setGrammarParser.CBRACKET, 0); }
		public Stat_block_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block_with_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitStat_block_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_block_with_returnContext stat_block_with_return() throws RecognitionException {
		Stat_block_with_returnContext _localctx = new Stat_block_with_returnContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_stat_block_with_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(OBRACKET);
			setState(330);
			start();
			setState(331);
			return_id();
			setState(332);
			match(CBRACKET);
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

	public static class Return_idContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(setGrammarParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public Return_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitReturn_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_idContext return_id() throws RecognitionException {
		Return_idContext _localctx = new Return_idContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_return_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(RETURN);
			setState(335);
			match(ID);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(setGrammarParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(setGrammarParser.CPAR, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(OPAR);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ELEMENT) | (1L << INT_TYPE) | (1L << STRING_TYPE))) != 0)) {
				{
				setState(338);
				arg();
				}
			}

			setState(341);
			match(CPAR);
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

	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamArgsContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamArgsContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitParamArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamArgContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(setGrammarParser.ID, 0); }
		public ParamArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitParamArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arg);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new ParamArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				type();
				setState(344);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				type();
				setState(347);
				match(ID);
				setState(348);
				match(T__0);
				setState(349);
				arg();
				}
				break;
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(setGrammarParser.SET, 0); }
		public TerminalNode ELEMENT() { return getToken(setGrammarParser.ELEMENT, 0); }
		public TerminalNode STRING_TYPE() { return getToken(setGrammarParser.STRING_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(setGrammarParser.INT_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setGrammarVisitor ) return ((setGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ELEMENT) | (1L << INT_TYPE) | (1L << STRING_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return print_expr_sempred((Print_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean print_expr_sempred(Print_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0166\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\7\2T\n\2\f"+
		"\2\16\2W\13\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\7\4h\n\4\f\4\16\4k\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5w\n\5\3\6\5\6z\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0086"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u008d\n\b\3\t\5\t\u0090\n\t\3\t\3\t\3\t\3"+
		"\t\3\n\5\n\u0097\n\n\3\n\3\n\3\n\3\n\3\13\5\13\u009e\n\13\3\13\3\13\3"+
		"\13\3\13\3\f\5\f\u00a5\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00ae\n\r\3"+
		"\16\3\16\3\16\3\16\5\16\u00b4\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00c6\n\23\3\24\3\24"+
		"\3\24\3\24\5\24\u00cc\n\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00d4\n"+
		"\25\f\25\16\25\u00d7\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00e3\n\26\3\27\3\27\3\27\5\27\u00e8\n\27\3\30\3\30\3\30\3"+
		"\30\3\30\7\30\u00ef\n\30\f\30\16\30\u00f2\13\30\3\30\3\30\5\30\u00f6\n"+
		"\30\3\31\3\31\5\31\u00fa\n\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0116\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \5 \u0126\n \3 \3 \3 \7 \u012b\n \f \16 \u012e"+
		"\13 \3!\3!\3!\3\"\3\"\5\"\u0135\n\"\3\"\3\"\3#\3#\3#\3#\5#\u013d\n#\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u014a\n$\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"\'\3\'\5\'\u0156\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0162\n(\3)\3"+
		")\3)\2\3>*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNP\2\4\3\2\30\31\3\2\5\b\2\u016e\2U\3\2\2\2\4a\3\2\2\2\6i\3"+
		"\2\2\2\bv\3\2\2\2\ny\3\2\2\2\f\u0085\3\2\2\2\16\u008c\3\2\2\2\20\u008f"+
		"\3\2\2\2\22\u0096\3\2\2\2\24\u009d\3\2\2\2\26\u00a4\3\2\2\2\30\u00ad\3"+
		"\2\2\2\32\u00b3\3\2\2\2\34\u00b5\3\2\2\2\36\u00b7\3\2\2\2 \u00b9\3\2\2"+
		"\2\"\u00bd\3\2\2\2$\u00c5\3\2\2\2&\u00cb\3\2\2\2(\u00cd\3\2\2\2*\u00e2"+
		"\3\2\2\2,\u00e7\3\2\2\2.\u00e9\3\2\2\2\60\u00f7\3\2\2\2\62\u00ff\3\2\2"+
		"\2\64\u0103\3\2\2\2\66\u0106\3\2\2\28\u0115\3\2\2\2:\u0117\3\2\2\2<\u011c"+
		"\3\2\2\2>\u0125\3\2\2\2@\u012f\3\2\2\2B\u0132\3\2\2\2D\u013c\3\2\2\2F"+
		"\u0149\3\2\2\2H\u014b\3\2\2\2J\u0150\3\2\2\2L\u0153\3\2\2\2N\u0161\3\2"+
		"\2\2P\u0163\3\2\2\2RT\5\16\b\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"V[\3\2\2\2WU\3\2\2\2XZ\5F$\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2"+
		"\\^\3\2\2\2][\3\2\2\2^_\5\4\3\2_`\7\2\2\3`\3\3\2\2\2ab\7&\2\2bc\7\r\2"+
		"\2cd\5\6\4\2de\7\16\2\2e\5\3\2\2\2fh\5\b\5\2gf\3\2\2\2hk\3\2\2\2ig\3\2"+
		"\2\2ij\3\2\2\2j\7\3\2\2\2ki\3\2\2\2lw\5\16\b\2mw\5 \21\2nw\5\"\22\2ow"+
		"\5<\37\2pw\5.\30\2qw\5\64\33\2rw\5\66\34\2sw\5@!\2tw\5\n\6\2uw\5(\25\2"+
		"vl\3\2\2\2vm\3\2\2\2vn\3\2\2\2vo\3\2\2\2vp\3\2\2\2vq\3\2\2\2vr\3\2\2\2"+
		"vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\t\3\2\2\2xz\7\5\2\2yx\3\2\2\2yz\3\2\2"+
		"\2z{\3\2\2\2{|\7*\2\2|}\7\4\2\2}~\7*\2\2~\177\5\f\7\2\177\u0080\7*\2\2"+
		"\u0080\13\3\2\2\2\u0081\u0086\7\24\2\2\u0082\u0086\7\25\2\2\u0083\u0086"+
		"\7\26\2\2\u0084\u0086\7\27\2\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\r\3\2\2\2\u0087\u008d\5"+
		"\20\t\2\u0088\u008d\5\22\n\2\u0089\u008d\5\24\13\2\u008a\u008d\5\26\f"+
		"\2\u008b\u008d\5\n\6\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u0089"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\17\3\2\2\2\u008e"+
		"\u0090\7\5\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\7*\2\2\u0092\u0093\7\4\2\2\u0093\u0094\5\30\r\2\u0094"+
		"\21\3\2\2\2\u0095\u0097\7\6\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2"+
		"\2\u0097\u0098\3\2\2\2\u0098\u0099\7*\2\2\u0099\u009a\7\4\2\2\u009a\u009b"+
		"\5\32\16\2\u009b\23\3\2\2\2\u009c\u009e\7\b\2\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7*\2\2\u00a0\u00a1\7\4"+
		"\2\2\u00a1\u00a2\5\34\17\2\u00a2\25\3\2\2\2\u00a3\u00a5\7\7\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7*"+
		"\2\2\u00a7\u00a8\7\4\2\2\u00a8\u00a9\5\36\20\2\u00a9\27\3\2\2\2\u00aa"+
		"\u00ae\7+\2\2\u00ab\u00ae\5@!\2\u00ac\u00ae\7*\2\2\u00ad\u00aa\3\2\2\2"+
		"\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00b4"+
		"\7+\2\2\u00b0\u00b4\7)\2\2\u00b1\u00b4\5@!\2\u00b2\u00b4\7*\2\2\u00b3"+
		"\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2"+
		"\2\2\u00b4\33\3\2\2\2\u00b5\u00b6\7+\2\2\u00b6\35\3\2\2\2\u00b7\u00b8"+
		"\7)\2\2\u00b8\37\3\2\2\2\u00b9\u00ba\7*\2\2\u00ba\u00bb\7\20\2\2\u00bb"+
		"\u00bc\5$\23\2\u00bc!\3\2\2\2\u00bd\u00be\7*\2\2\u00be\u00bf\7\21\2\2"+
		"\u00bf\u00c0\5&\24\2\u00c0#\3\2\2\2\u00c1\u00c2\7*\2\2\u00c2\u00c3\7\3"+
		"\2\2\u00c3\u00c6\5$\23\2\u00c4\u00c6\7*\2\2\u00c5\u00c1\3\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6%\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8\u00c9\7\3\2\2\u00c9"+
		"\u00cc\5&\24\2\u00ca\u00cc\7*\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00ca\3\2"+
		"\2\2\u00cc\'\3\2\2\2\u00cd\u00ce\7#\2\2\u00ce\u00cf\7\t\2\2\u00cf\u00d0"+
		"\7*\2\2\u00d0\u00d1\7\n\2\2\u00d1\u00d5\7\r\2\2\u00d2\u00d4\5*\26\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\16\2\2\u00d9"+
		")\3\2\2\2\u00da\u00db\7$\2\2\u00db\u00dc\5,\27\2\u00dc\u00dd\7\17\2\2"+
		"\u00dd\u00de\5\6\4\2\u00de\u00e3\3\2\2\2\u00df\u00e0\7%\2\2\u00e0\u00e1"+
		"\7\17\2\2\u00e1\u00e3\5\6\4\2\u00e2\u00da\3\2\2\2\u00e2\u00df\3\2\2\2"+
		"\u00e3+\3\2\2\2\u00e4\u00e8\7*\2\2\u00e5\u00e8\7+\2\2\u00e6\u00e8\7)\2"+
		"\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8-"+
		"\3\2\2\2\u00e9\u00ea\7\37\2\2\u00ea\u00f0\5\60\31\2\u00eb\u00ec\7 \2\2"+
		"\u00ec\u00ed\7\37\2\2\u00ed\u00ef\5\60\31\2\u00ee\u00eb\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f5\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7 \2\2\u00f4\u00f6\5\62\32\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6/\3\2\2\2\u00f7\u00f9\7\t\2\2"+
		"\u00f8\u00fa\7\22\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fc\58\35\2\u00fc\u00fd\7\n\2\2\u00fd\u00fe\5\62\32\2"+
		"\u00fe\61\3\2\2\2\u00ff\u0100\7\r\2\2\u0100\u0101\5\6\4\2\u0101\u0102"+
		"\7\16\2\2\u0102\63\3\2\2\2\u0103\u0104\7!\2\2\u0104\u0105\5\60\31\2\u0105"+
		"\65\3\2\2\2\u0106\u0107\7\"\2\2\u0107\u0108\7\t\2\2\u0108\u0109\5:\36"+
		"\2\u0109\u010a\7\n\2\2\u010a\u010b\5\62\32\2\u010b\67\3\2\2\2\u010c\u010d"+
		"\7*\2\2\u010d\u010e\t\2\2\2\u010e\u0116\7*\2\2\u010f\u0110\7*\2\2\u0110"+
		"\u0111\7\23\2\2\u0111\u0116\7*\2\2\u0112\u0113\7*\2\2\u0113\u0114\7\32"+
		"\2\2\u0114\u0116\5P)\2\u0115\u010c\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0112"+
		"\3\2\2\2\u01169\3\2\2\2\u0117\u0118\7\6\2\2\u0118\u0119\7*\2\2\u0119\u011a"+
		"\7\34\2\2\u011a\u011b\7*\2\2\u011b;\3\2\2\2\u011c\u011d\7\35\2\2\u011d"+
		"\u011e\5> \2\u011e=\3\2\2\2\u011f\u0120\b \1\2\u0120\u0126\7*\2\2\u0121"+
		"\u0126\7+\2\2\u0122\u0126\7)\2\2\u0123\u0124\7\36\2\2\u0124\u0126\7*\2"+
		"\2\u0125\u011f\3\2\2\2\u0125\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0126\u012c\3\2\2\2\u0127\u0128\f\7\2\2\u0128\u0129\7\33\2\2"+
		"\u0129\u012b\5> \b\u012a\u0127\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d?\3\2\2\2\u012e\u012c\3\2\2\2\u012f"+
		"\u0130\7*\2\2\u0130\u0131\5B\"\2\u0131A\3\2\2\2\u0132\u0134\7\t\2\2\u0133"+
		"\u0135\5D#\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2"+
		"\2\u0136\u0137\7\n\2\2\u0137C\3\2\2\2\u0138\u013d\7*\2\2\u0139\u013a\7"+
		"*\2\2\u013a\u013b\7\3\2\2\u013b\u013d\5D#\2\u013c\u0138\3\2\2\2\u013c"+
		"\u0139\3\2\2\2\u013dE\3\2\2\2\u013e\u013f\7\'\2\2\u013f\u0140\7*\2\2\u0140"+
		"\u0141\5L\'\2\u0141\u0142\5\62\32\2\u0142\u014a\3\2\2\2\u0143\u0144\7"+
		"\'\2\2\u0144\u0145\5P)\2\u0145\u0146\7*\2\2\u0146\u0147\5L\'\2\u0147\u0148"+
		"\5H%\2\u0148\u014a\3\2\2\2\u0149\u013e\3\2\2\2\u0149\u0143\3\2\2\2\u014a"+
		"G\3\2\2\2\u014b\u014c\7\r\2\2\u014c\u014d\5\6\4\2\u014d\u014e\5J&\2\u014e"+
		"\u014f\7\16\2\2\u014fI\3\2\2\2\u0150\u0151\7(\2\2\u0151\u0152\7*\2\2\u0152"+
		"K\3\2\2\2\u0153\u0155\7\t\2\2\u0154\u0156\5N(\2\u0155\u0154\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\7\n\2\2\u0158M\3\2\2\2"+
		"\u0159\u015a\5P)\2\u015a\u015b\7*\2\2\u015b\u0162\3\2\2\2\u015c\u015d"+
		"\5P)\2\u015d\u015e\7*\2\2\u015e\u015f\7\3\2\2\u015f\u0160\5N(\2\u0160"+
		"\u0162\3\2\2\2\u0161\u0159\3\2\2\2\u0161\u015c\3\2\2\2\u0162O\3\2\2\2"+
		"\u0163\u0164\t\3\2\2\u0164Q\3\2\2\2\37U[ivy\u0085\u008c\u008f\u0096\u009d"+
		"\u00a4\u00ad\u00b3\u00c5\u00cb\u00d5\u00e2\u00e7\u00f0\u00f5\u00f9\u0115"+
		"\u0125\u012c\u0134\u013c\u0149\u0155\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}