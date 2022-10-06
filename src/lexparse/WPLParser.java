// Generated from WPL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, ASSIGN=28, DIVIDE=29, EQUAL=30, GREATER=31, 
		LESS=32, MINUS=33, MULTIPLY=34, NOT=35, PLUS=36, UNEQUAL=37, LPAR=38, 
		RPAR=39, SEMICOLON=40, FALSE=41, TRUE=42, INTEGER=43, STRING=44, WS=45;
	public static final int
		RULE_compilation_unit = 0, RULE_boolean = 1, RULE_assignExpression = 2, 
		RULE_type = 3, RULE_typeGen = 4, RULE_var = 5, RULE_varDef = 6, RULE_intDec = 7, 
		RULE_intDef = 8, RULE_strDec = 9, RULE_strDef = 10, RULE_boolDec = 11, 
		RULE_boolDef = 12, RULE_inferDec = 13, RULE_inferDef = 14, RULE_array = 15, 
		RULE_expression = 16, RULE_parameterList = 17, RULE_function = 18, RULE_externFunction = 19, 
		RULE_procedure = 20, RULE_externProcedure = 21, RULE_assignment = 22, 
		RULE_loop = 23, RULE_conditional = 24, RULE_statement = 25, RULE_selection = 26, 
		RULE_call = 27, RULE_return = 28, RULE_block = 29, RULE_int = 30, RULE_str = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilation_unit", "boolean", "assignExpression", "type", "typeGen", 
			"var", "varDef", "intDec", "intDef", "strDec", "strDef", "boolDec", "boolDef", 
			"inferDec", "inferDef", "array", "expression", "parameterList", "function", 
			"externFunction", "procedure", "externProcedure", "assignment", "loop", 
			"conditional", "statement", "selection", "call", "return", "block", "int", 
			"str"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolean'", "'str'", "'int'", "', '", "'<-'", "'int '", "'str '", 
			"'bool '", "'var '", "'['", "']'", "' func '", "' ('", "'?)'", "'{'", 
			"'return'", "'}'", "'extern '", "'proc'", "'while '", "' do'", "'if '", 
			"'else'", "' then'", "' : '", "'select'", "'return '", "':='", "'/'", 
			"'='", "'>'", "'<'", "'-'", "'*'", "'~'", "'+'", "'~='", "'('", "')'", 
			"';'", "'false'", "'true'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ASSIGN", "DIVIDE", "EQUAL", "GREATER", "LESS", 
			"MINUS", "MULTIPLY", "NOT", "PLUS", "UNEQUAL", "LPAR", "RPAR", "SEMICOLON", 
			"FALSE", "TRUE", "INTEGER", "STRING", "WS"
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
	public String getGrammarFileName() { return "WPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Compilation_unitContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> exprs = new ArrayList<ExpressionContext>();
		public TerminalNode EOF() { return getToken(WPLParser.EOF, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(WPLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(WPLParser.SEMICOLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterCompilation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitCompilation_unit(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				((Compilation_unitContext)_localctx).expression = expression(0);
				((Compilation_unitContext)_localctx).exprs.add(((Compilation_unitContext)_localctx).expression);
				setState(65);
				match(SEMICOLON);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__17) | (1L << MINUS) | (1L << NOT) | (1L << LPAR) | (1L << FALSE) | (1L << TRUE) | (1L << INTEGER) | (1L << STRING))) != 0) );
			setState(71);
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

	public static class BooleanContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(WPLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(WPLParser.FALSE, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitBoolean(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_boolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class AssignExpressionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(WPLParser.STRING, 0); }
		public TerminalNode ASSIGN() { return getToken(WPLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitAssignExpression(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(STRING);
			setState(76);
			match(ASSIGN);
			setState(77);
			expression(0);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
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

	public static class TypeGenContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public TypeGenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeGen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterTypeGen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitTypeGen(this);
		}
	}

	public final TypeGenContext typeGen() throws RecognitionException {
		TypeGenContext _localctx = new TypeGenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeGen);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				str();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				int_();
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				boolean_();
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

	public static class VarContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				str();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				str();
				setState(88);
				match(T__3);
				setState(89);
				var();
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

	public static class VarDefContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitVarDef(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDef);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				str();
				setState(94);
				match(T__4);
				setState(95);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				str();
				setState(98);
				match(T__4);
				setState(99);
				expression(0);
				setState(100);
				match(T__3);
				setState(101);
				varDef();
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

	public static class IntDecContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<IntDecContext> intDec() {
			return getRuleContexts(IntDecContext.class);
		}
		public IntDecContext intDec(int i) {
			return getRuleContext(IntDecContext.class,i);
		}
		public IntDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterIntDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitIntDec(this);
		}
	}

	public final IntDecContext intDec() throws RecognitionException {
		return intDec(0);
	}

	private IntDecContext intDec(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntDecContext _localctx = new IntDecContext(_ctx, _parentState);
		IntDecContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_intDec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(106);
				str();
				setState(107);
				match(T__4);
				setState(108);
				int_();
				}
				break;
			case 2:
				{
				setState(110);
				var();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IntDecContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_intDec);
					setState(113);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(114);
					match(T__3);
					setState(115);
					intDec(2);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class IntDefContext extends ParserRuleContext {
		public IntDecContext intDec() {
			return getRuleContext(IntDecContext.class,0);
		}
		public IntDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterIntDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitIntDef(this);
		}
	}

	public final IntDefContext intDef() throws RecognitionException {
		IntDefContext _localctx = new IntDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_intDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__5);
			setState(122);
			intDec(0);
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

	public static class StrDecContext extends ParserRuleContext {
		public List<StrContext> str() {
			return getRuleContexts(StrContext.class);
		}
		public StrContext str(int i) {
			return getRuleContext(StrContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<StrDecContext> strDec() {
			return getRuleContexts(StrDecContext.class);
		}
		public StrDecContext strDec(int i) {
			return getRuleContext(StrDecContext.class,i);
		}
		public StrDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterStrDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitStrDec(this);
		}
	}

	public final StrDecContext strDec() throws RecognitionException {
		return strDec(0);
	}

	private StrDecContext strDec(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StrDecContext _localctx = new StrDecContext(_ctx, _parentState);
		StrDecContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_strDec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(125);
				str();
				setState(126);
				match(T__4);
				setState(127);
				str();
				}
				break;
			case 2:
				{
				setState(129);
				var();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StrDecContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_strDec);
					setState(132);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(133);
					match(T__3);
					setState(134);
					strDec(2);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class StrDefContext extends ParserRuleContext {
		public StrDecContext strDec() {
			return getRuleContext(StrDecContext.class,0);
		}
		public StrDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterStrDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitStrDef(this);
		}
	}

	public final StrDefContext strDef() throws RecognitionException {
		StrDefContext _localctx = new StrDefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_strDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__6);
			setState(141);
			strDec(0);
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

	public static class BoolDecContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<BoolDecContext> boolDec() {
			return getRuleContexts(BoolDecContext.class);
		}
		public BoolDecContext boolDec(int i) {
			return getRuleContext(BoolDecContext.class,i);
		}
		public BoolDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterBoolDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitBoolDec(this);
		}
	}

	public final BoolDecContext boolDec() throws RecognitionException {
		return boolDec(0);
	}

	private BoolDecContext boolDec(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolDecContext _localctx = new BoolDecContext(_ctx, _parentState);
		BoolDecContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_boolDec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(144);
				str();
				setState(145);
				match(T__4);
				setState(146);
				boolean_();
				}
				break;
			case 2:
				{
				setState(148);
				var();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolDecContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolDec);
					setState(151);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(152);
					match(T__3);
					setState(153);
					boolDec(2);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class BoolDefContext extends ParserRuleContext {
		public BoolDecContext boolDec() {
			return getRuleContext(BoolDecContext.class,0);
		}
		public BoolDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterBoolDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitBoolDef(this);
		}
	}

	public final BoolDefContext boolDef() throws RecognitionException {
		BoolDefContext _localctx = new BoolDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_boolDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__7);
			setState(160);
			boolDec(0);
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

	public static class InferDecContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public TypeGenContext typeGen() {
			return getRuleContext(TypeGenContext.class,0);
		}
		public List<InferDecContext> inferDec() {
			return getRuleContexts(InferDecContext.class);
		}
		public InferDecContext inferDec(int i) {
			return getRuleContext(InferDecContext.class,i);
		}
		public InferDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterInferDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitInferDec(this);
		}
	}

	public final InferDecContext inferDec() throws RecognitionException {
		return inferDec(0);
	}

	private InferDecContext inferDec(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InferDecContext _localctx = new InferDecContext(_ctx, _parentState);
		InferDecContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_inferDec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(163);
			str();
			setState(164);
			match(T__4);
			setState(165);
			typeGen();
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InferDecContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inferDec);
					setState(167);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(168);
					match(T__3);
					setState(169);
					inferDec(2);
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class InferDefContext extends ParserRuleContext {
		public InferDecContext inferDec() {
			return getRuleContext(InferDecContext.class,0);
		}
		public InferDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterInferDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitInferDef(this);
		}
	}

	public final InferDefContext inferDef() throws RecognitionException {
		InferDefContext _localctx = new InferDefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inferDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__8);
			setState(176);
			inferDec(0);
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

	public static class ArrayContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			type();
			setState(179);
			match(T__9);
			setState(180);
			int_();
			setState(181);
			match(T__10);
			setState(182);
			str();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WPLParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(WPLParser.RPAR, 0); }
		public TerminalNode MINUS() { return getToken(WPLParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(WPLParser.NOT, 0); }
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExternFunctionContext externFunction() {
			return getRuleContext(ExternFunctionContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(WPLParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(WPLParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(WPLParser.PLUS, 0); }
		public TerminalNode LESS() { return getToken(WPLParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(WPLParser.GREATER, 0); }
		public TerminalNode EQUAL() { return getToken(WPLParser.EQUAL, 0); }
		public TerminalNode UNEQUAL() { return getToken(WPLParser.UNEQUAL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(185);
				match(LPAR);
				setState(186);
				expression(0);
				setState(187);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(189);
				match(MINUS);
				setState(190);
				expression(12);
				}
				break;
			case 3:
				{
				setState(191);
				match(NOT);
				setState(192);
				expression(11);
				}
				break;
			case 4:
				{
				setState(193);
				assignExpression();
				}
				break;
			case 5:
				{
				setState(194);
				boolean_();
				}
				break;
			case 6:
				{
				setState(195);
				str();
				}
				break;
			case 7:
				{
				setState(196);
				int_();
				}
				break;
			case 8:
				{
				setState(197);
				function();
				}
				break;
			case 9:
				{
				setState(198);
				externFunction();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(202);
						_la = _input.LA(1);
						if ( !(_la==DIVIDE || _la==MULTIPLY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(203);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(205);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(206);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(208);
						_la = _input.LA(1);
						if ( !(_la==GREATER || _la==LESS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(209);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(211);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==UNEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ParameterListContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameterList);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				type();
				setState(219);
				str();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				type();
				setState(222);
				str();
				setState(223);
				match(T__3);
				setState(224);
				parameterList();
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			type();
			setState(229);
			match(T__11);
			setState(230);
			str();
			setState(231);
			match(T__12);
			setState(232);
			parameterList();
			setState(233);
			match(T__13);
			setState(234);
			match(T__14);
			setState(235);
			match(T__15);
			setState(236);
			type();
			setState(237);
			match(T__16);
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

	public static class ExternFunctionContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExternFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterExternFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitExternFunction(this);
		}
	}

	public final ExternFunctionContext externFunction() throws RecognitionException {
		ExternFunctionContext _localctx = new ExternFunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_externFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__17);
			setState(240);
			function();
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

	public static class ProcedureContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitProcedure(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__18);
			setState(243);
			str();
			setState(244);
			match(T__12);
			setState(245);
			parameterList();
			setState(246);
			match(T__13);
			setState(247);
			match(T__14);
			setState(248);
			match(T__16);
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

	public static class ExternProcedureContext extends ParserRuleContext {
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public ExternProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externProcedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterExternProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitExternProcedure(this);
		}
	}

	public final ExternProcedureContext externProcedure() throws RecognitionException {
		ExternProcedureContext _localctx = new ExternProcedureContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_externProcedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__17);
			setState(251);
			procedure();
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

	public static class AssignmentContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			var();
			setState(254);
			match(T__4);
			setState(255);
			expression(0);
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

	public static class LoopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__19);
			setState(258);
			expression(0);
			setState(259);
			match(T__20);
			setState(260);
			match(T__14);
			setState(261);
			match(T__16);
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

	public static class ConditionalContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditional);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(T__21);
				setState(264);
				expression(0);
				setState(265);
				match(T__14);
				setState(266);
				match(T__16);
				setState(267);
				match(T__22);
				setState(268);
				match(T__14);
				setState(269);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(T__21);
				setState(272);
				expression(0);
				setState(273);
				match(T__23);
				setState(274);
				match(T__14);
				setState(275);
				match(T__16);
				setState(276);
				match(T__22);
				setState(277);
				match(T__14);
				setState(278);
				match(T__16);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(T__21);
				setState(281);
				expression(0);
				setState(282);
				match(T__14);
				setState(283);
				conditional();
				setState(284);
				match(T__16);
				setState(285);
				match(T__22);
				setState(286);
				match(T__14);
				setState(287);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				match(T__21);
				setState(290);
				expression(0);
				setState(291);
				match(T__14);
				setState(292);
				match(T__16);
				setState(293);
				match(T__22);
				setState(294);
				match(T__14);
				setState(295);
				conditional();
				setState(296);
				match(T__16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				match(T__21);
				setState(299);
				expression(0);
				setState(300);
				match(T__14);
				setState(301);
				conditional();
				setState(302);
				match(T__16);
				setState(303);
				match(T__22);
				setState(304);
				match(T__14);
				setState(305);
				conditional();
				setState(306);
				match(T__16);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(308);
				match(T__21);
				setState(309);
				expression(0);
				setState(310);
				match(T__23);
				setState(311);
				match(T__14);
				setState(312);
				conditional();
				setState(313);
				match(T__16);
				setState(314);
				match(T__22);
				setState(315);
				match(T__14);
				setState(316);
				match(T__16);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(318);
				match(T__21);
				setState(319);
				expression(0);
				setState(320);
				match(T__23);
				setState(321);
				match(T__14);
				setState(322);
				match(T__16);
				setState(323);
				match(T__22);
				setState(324);
				match(T__14);
				setState(325);
				conditional();
				setState(326);
				match(T__16);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(328);
				match(T__21);
				setState(329);
				expression(0);
				setState(330);
				match(T__23);
				setState(331);
				match(T__14);
				setState(332);
				conditional();
				setState(333);
				match(T__16);
				setState(334);
				match(T__22);
				setState(335);
				match(T__14);
				setState(336);
				conditional();
				setState(337);
				match(T__16);
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

	public static class StatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(WPLParser.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(342);
			expression(0);
			setState(343);
			match(T__24);
			setState(344);
			expression(0);
			setState(345);
			match(SEMICOLON);
			}
			_ctx.stop = _input.LT(-1);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement);
					setState(347);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(348);
					statement(2);
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class SelectionContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitSelection(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__25);
			setState(355);
			match(T__14);
			setState(356);
			statement(0);
			setState(357);
			match(T__16);
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

	public static class CallContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(WPLParser.LPAR, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WPLParser.RPAR, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			str();
			setState(360);
			match(LPAR);
			setState(361);
			var();
			setState(362);
			match(RPAR);
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

	public static class ReturnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitReturn(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_return);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(T__15);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(T__26);
				setState(366);
				expression(0);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_block);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(T__14);
				setState(370);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(T__14);
				setState(372);
				block();
				setState(373);
				match(T__16);
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

	public static class IntContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(WPLParser.INTEGER, 0); }
		public IntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitInt(this);
		}
	}

	public final IntContext int_() throws RecognitionException {
		IntContext _localctx = new IntContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(INTEGER);
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

	public static class StrContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(WPLParser.STRING, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitStr(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return intDec_sempred((IntDecContext)_localctx, predIndex);
		case 9:
			return strDec_sempred((StrDecContext)_localctx, predIndex);
		case 11:
			return boolDec_sempred((BoolDecContext)_localctx, predIndex);
		case 13:
			return inferDec_sempred((InferDecContext)_localctx, predIndex);
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 25:
			return statement_sempred((StatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean intDec_sempred(IntDecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean strDec_sempred(StrDecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolDec_sempred(BoolDecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inferDec_sempred(InferDecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u017e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000"+
		"D\b\u0000\u000b\u0000\f\u0000E\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004U\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\\\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006h\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007p\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007u\b\u0007\n\u0007\f\u0007x\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0083\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u0088\b\t\n\t\f\t\u008b\t\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0096\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u009b\b\u000b\n\u000b\f\u000b\u009e\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00ab"+
		"\b\r\n\r\f\r\u00ae\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00c8\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00d6\b\u0010"+
		"\n\u0010\f\u0010\u00d9\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00e3"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0154\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u015e\b\u0019\n\u0019\f\u0019\u0161\t\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0170\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0178\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0000\u0006\u000e\u0012"+
		"\u0016\u001a 2 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0006\u0001\u0000"+
		")*\u0001\u0000\u0001\u0003\u0002\u0000\u001d\u001d\"\"\u0002\u0000!!$"+
		"$\u0001\u0000\u001f \u0002\u0000\u001e\u001e%%\u0180\u0000C\u0001\u0000"+
		"\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000"+
		"\u0006O\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000\u0000\n[\u0001\u0000"+
		"\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000eo\u0001\u0000\u0000\u0000"+
		"\u0010y\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000\u0000\u0000\u0014"+
		"\u008c\u0001\u0000\u0000\u0000\u0016\u0095\u0001\u0000\u0000\u0000\u0018"+
		"\u009f\u0001\u0000\u0000\u0000\u001a\u00a2\u0001\u0000\u0000\u0000\u001c"+
		"\u00af\u0001\u0000\u0000\u0000\u001e\u00b2\u0001\u0000\u0000\u0000 \u00c7"+
		"\u0001\u0000\u0000\u0000\"\u00e2\u0001\u0000\u0000\u0000$\u00e4\u0001"+
		"\u0000\u0000\u0000&\u00ef\u0001\u0000\u0000\u0000(\u00f2\u0001\u0000\u0000"+
		"\u0000*\u00fa\u0001\u0000\u0000\u0000,\u00fd\u0001\u0000\u0000\u0000."+
		"\u0101\u0001\u0000\u0000\u00000\u0153\u0001\u0000\u0000\u00002\u0155\u0001"+
		"\u0000\u0000\u00004\u0162\u0001\u0000\u0000\u00006\u0167\u0001\u0000\u0000"+
		"\u00008\u016f\u0001\u0000\u0000\u0000:\u0177\u0001\u0000\u0000\u0000<"+
		"\u0179\u0001\u0000\u0000\u0000>\u017b\u0001\u0000\u0000\u0000@A\u0003"+
		" \u0010\u0000AB\u0005(\u0000\u0000BD\u0001\u0000\u0000\u0000C@\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0005\u0000\u0000\u0001"+
		"H\u0001\u0001\u0000\u0000\u0000IJ\u0007\u0000\u0000\u0000J\u0003\u0001"+
		"\u0000\u0000\u0000KL\u0005,\u0000\u0000LM\u0005\u001c\u0000\u0000MN\u0003"+
		" \u0010\u0000N\u0005\u0001\u0000\u0000\u0000OP\u0007\u0001\u0000\u0000"+
		"P\u0007\u0001\u0000\u0000\u0000QU\u0003>\u001f\u0000RU\u0003<\u001e\u0000"+
		"SU\u0003\u0002\u0001\u0000TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000U\t\u0001\u0000\u0000\u0000V\\\u0003>"+
		"\u001f\u0000WX\u0003>\u001f\u0000XY\u0005\u0004\u0000\u0000YZ\u0003\n"+
		"\u0005\u0000Z\\\u0001\u0000\u0000\u0000[V\u0001\u0000\u0000\u0000[W\u0001"+
		"\u0000\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0003>\u001f\u0000"+
		"^_\u0005\u0005\u0000\u0000_`\u0003 \u0010\u0000`h\u0001\u0000\u0000\u0000"+
		"ab\u0003>\u001f\u0000bc\u0005\u0005\u0000\u0000cd\u0003 \u0010\u0000d"+
		"e\u0005\u0004\u0000\u0000ef\u0003\f\u0006\u0000fh\u0001\u0000\u0000\u0000"+
		"g]\u0001\u0000\u0000\u0000ga\u0001\u0000\u0000\u0000h\r\u0001\u0000\u0000"+
		"\u0000ij\u0006\u0007\uffff\uffff\u0000jk\u0003>\u001f\u0000kl\u0005\u0005"+
		"\u0000\u0000lm\u0003<\u001e\u0000mp\u0001\u0000\u0000\u0000np\u0003\n"+
		"\u0005\u0000oi\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000pv\u0001"+
		"\u0000\u0000\u0000qr\n\u0001\u0000\u0000rs\u0005\u0004\u0000\u0000su\u0003"+
		"\u000e\u0007\u0002tq\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u000f\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005\u0006\u0000\u0000z{\u0003"+
		"\u000e\u0007\u0000{\u0011\u0001\u0000\u0000\u0000|}\u0006\t\uffff\uffff"+
		"\u0000}~\u0003>\u001f\u0000~\u007f\u0005\u0005\u0000\u0000\u007f\u0080"+
		"\u0003>\u001f\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u0083\u0003"+
		"\n\u0005\u0000\u0082|\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0089\u0001\u0000\u0000\u0000\u0084\u0085\n\u0001\u0000"+
		"\u0000\u0085\u0086\u0005\u0004\u0000\u0000\u0086\u0088\u0003\u0012\t\u0002"+
		"\u0087\u0084\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000"+
		"\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u0013\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005\u0007\u0000\u0000\u008d\u008e\u0003\u0012\t\u0000\u008e"+
		"\u0015\u0001\u0000\u0000\u0000\u008f\u0090\u0006\u000b\uffff\uffff\u0000"+
		"\u0090\u0091\u0003>\u001f\u0000\u0091\u0092\u0005\u0005\u0000\u0000\u0092"+
		"\u0093\u0003\u0002\u0001\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094"+
		"\u0096\u0003\n\u0005\u0000\u0095\u008f\u0001\u0000\u0000\u0000\u0095\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u009c\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\n\u0001\u0000\u0000\u0098\u0099\u0005\u0004\u0000\u0000\u0099\u009b\u0003"+
		"\u0016\u000b\u0002\u009a\u0097\u0001\u0000\u0000\u0000\u009b\u009e\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u0017\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005\b\u0000\u0000\u00a0\u00a1\u0003\u0016"+
		"\u000b\u0000\u00a1\u0019\u0001\u0000\u0000\u0000\u00a2\u00a3\u0006\r\uffff"+
		"\uffff\u0000\u00a3\u00a4\u0003>\u001f\u0000\u00a4\u00a5\u0005\u0005\u0000"+
		"\u0000\u00a5\u00a6\u0003\b\u0004\u0000\u00a6\u00ac\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\n\u0001\u0000\u0000\u00a8\u00a9\u0005\u0004\u0000\u0000\u00a9"+
		"\u00ab\u0003\u001a\r\u0002\u00aa\u00a7\u0001\u0000\u0000\u0000\u00ab\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u001b\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\t\u0000\u0000\u00b0\u00b1\u0003"+
		"\u001a\r\u0000\u00b1\u001d\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\u0006"+
		"\u0003\u0000\u00b3\u00b4\u0005\n\u0000\u0000\u00b4\u00b5\u0003<\u001e"+
		"\u0000\u00b5\u00b6\u0005\u000b\u0000\u0000\u00b6\u00b7\u0003>\u001f\u0000"+
		"\u00b7\u001f\u0001\u0000\u0000\u0000\u00b8\u00b9\u0006\u0010\uffff\uffff"+
		"\u0000\u00b9\u00ba\u0005&\u0000\u0000\u00ba\u00bb\u0003 \u0010\u0000\u00bb"+
		"\u00bc\u0005\'\u0000\u0000\u00bc\u00c8\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0005!\u0000\u0000\u00be\u00c8\u0003 \u0010\f\u00bf\u00c0\u0005#\u0000"+
		"\u0000\u00c0\u00c8\u0003 \u0010\u000b\u00c1\u00c8\u0003\u0004\u0002\u0000"+
		"\u00c2\u00c8\u0003\u0002\u0001\u0000\u00c3\u00c8\u0003>\u001f\u0000\u00c4"+
		"\u00c8\u0003<\u001e\u0000\u00c5\u00c8\u0003$\u0012\u0000\u00c6\u00c8\u0003"+
		"&\u0013\u0000\u00c7\u00b8\u0001\u0000\u0000\u0000\u00c7\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c7\u00bf\u0001\u0000\u0000\u0000\u00c7\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c2\u0001\u0000\u0000\u0000\u00c7\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\n\n\u0000\u0000\u00ca\u00cb\u0007\u0002\u0000"+
		"\u0000\u00cb\u00d6\u0003 \u0010\u000b\u00cc\u00cd\n\t\u0000\u0000\u00cd"+
		"\u00ce\u0007\u0003\u0000\u0000\u00ce\u00d6\u0003 \u0010\n\u00cf\u00d0"+
		"\n\b\u0000\u0000\u00d0\u00d1\u0007\u0004\u0000\u0000\u00d1\u00d6\u0003"+
		" \u0010\t\u00d2\u00d3\n\u0007\u0000\u0000\u00d3\u00d4\u0007\u0005\u0000"+
		"\u0000\u00d4\u00d6\u0003 \u0010\u0007\u00d5\u00c9\u0001\u0000\u0000\u0000"+
		"\u00d5\u00cc\u0001\u0000\u0000\u0000\u00d5\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d2\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8!\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0003\u0006\u0003\u0000\u00db\u00dc\u0003>\u001f\u0000\u00dc\u00e3"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0003\u0006\u0003\u0000\u00de\u00df"+
		"\u0003>\u001f\u0000\u00df\u00e0\u0005\u0004\u0000\u0000\u00e0\u00e1\u0003"+
		"\"\u0011\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00da\u0001\u0000"+
		"\u0000\u0000\u00e2\u00dd\u0001\u0000\u0000\u0000\u00e3#\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0003\u0006\u0003\u0000\u00e5\u00e6\u0005\f\u0000\u0000"+
		"\u00e6\u00e7\u0003>\u001f\u0000\u00e7\u00e8\u0005\r\u0000\u0000\u00e8"+
		"\u00e9\u0003\"\u0011\u0000\u00e9\u00ea\u0005\u000e\u0000\u0000\u00ea\u00eb"+
		"\u0005\u000f\u0000\u0000\u00eb\u00ec\u0005\u0010\u0000\u0000\u00ec\u00ed"+
		"\u0003\u0006\u0003\u0000\u00ed\u00ee\u0005\u0011\u0000\u0000\u00ee%\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0005\u0012\u0000\u0000\u00f0\u00f1\u0003"+
		"$\u0012\u0000\u00f1\'\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0013"+
		"\u0000\u0000\u00f3\u00f4\u0003>\u001f\u0000\u00f4\u00f5\u0005\r\u0000"+
		"\u0000\u00f5\u00f6\u0003\"\u0011\u0000\u00f6\u00f7\u0005\u000e\u0000\u0000"+
		"\u00f7\u00f8\u0005\u000f\u0000\u0000\u00f8\u00f9\u0005\u0011\u0000\u0000"+
		"\u00f9)\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u0012\u0000\u0000\u00fb"+
		"\u00fc\u0003(\u0014\u0000\u00fc+\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003"+
		"\n\u0005\u0000\u00fe\u00ff\u0005\u0005\u0000\u0000\u00ff\u0100\u0003 "+
		"\u0010\u0000\u0100-\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u0014\u0000"+
		"\u0000\u0102\u0103\u0003 \u0010\u0000\u0103\u0104\u0005\u0015\u0000\u0000"+
		"\u0104\u0105\u0005\u000f\u0000\u0000\u0105\u0106\u0005\u0011\u0000\u0000"+
		"\u0106/\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0016\u0000\u0000\u0108"+
		"\u0109\u0003 \u0010\u0000\u0109\u010a\u0005\u000f\u0000\u0000\u010a\u010b"+
		"\u0005\u0011\u0000\u0000\u010b\u010c\u0005\u0017\u0000\u0000\u010c\u010d"+
		"\u0005\u000f\u0000\u0000\u010d\u010e\u0005\u0011\u0000\u0000\u010e\u0154"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u0016\u0000\u0000\u0110\u0111"+
		"\u0003 \u0010\u0000\u0111\u0112\u0005\u0018\u0000\u0000\u0112\u0113\u0005"+
		"\u000f\u0000\u0000\u0113\u0114\u0005\u0011\u0000\u0000\u0114\u0115\u0005"+
		"\u0017\u0000\u0000\u0115\u0116\u0005\u000f\u0000\u0000\u0116\u0117\u0005"+
		"\u0011\u0000\u0000\u0117\u0154\u0001\u0000\u0000\u0000\u0118\u0119\u0005"+
		"\u0016\u0000\u0000\u0119\u011a\u0003 \u0010\u0000\u011a\u011b\u0005\u000f"+
		"\u0000\u0000\u011b\u011c\u00030\u0018\u0000\u011c\u011d\u0005\u0011\u0000"+
		"\u0000\u011d\u011e\u0005\u0017\u0000\u0000\u011e\u011f\u0005\u000f\u0000"+
		"\u0000\u011f\u0120\u0005\u0011\u0000\u0000\u0120\u0154\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0005\u0016\u0000\u0000\u0122\u0123\u0003 \u0010\u0000"+
		"\u0123\u0124\u0005\u000f\u0000\u0000\u0124\u0125\u0005\u0011\u0000\u0000"+
		"\u0125\u0126\u0005\u0017\u0000\u0000\u0126\u0127\u0005\u000f\u0000\u0000"+
		"\u0127\u0128\u00030\u0018\u0000\u0128\u0129\u0005\u0011\u0000\u0000\u0129"+
		"\u0154\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u0016\u0000\u0000\u012b"+
		"\u012c\u0003 \u0010\u0000\u012c\u012d\u0005\u000f\u0000\u0000\u012d\u012e"+
		"\u00030\u0018\u0000\u012e\u012f\u0005\u0011\u0000\u0000\u012f\u0130\u0005"+
		"\u0017\u0000\u0000\u0130\u0131\u0005\u000f\u0000\u0000\u0131\u0132\u0003"+
		"0\u0018\u0000\u0132\u0133\u0005\u0011\u0000\u0000\u0133\u0154\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0005\u0016\u0000\u0000\u0135\u0136\u0003 \u0010"+
		"\u0000\u0136\u0137\u0005\u0018\u0000\u0000\u0137\u0138\u0005\u000f\u0000"+
		"\u0000\u0138\u0139\u00030\u0018\u0000\u0139\u013a\u0005\u0011\u0000\u0000"+
		"\u013a\u013b\u0005\u0017\u0000\u0000\u013b\u013c\u0005\u000f\u0000\u0000"+
		"\u013c\u013d\u0005\u0011\u0000\u0000\u013d\u0154\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0005\u0016\u0000\u0000\u013f\u0140\u0003 \u0010\u0000\u0140"+
		"\u0141\u0005\u0018\u0000\u0000\u0141\u0142\u0005\u000f\u0000\u0000\u0142"+
		"\u0143\u0005\u0011\u0000\u0000\u0143\u0144\u0005\u0017\u0000\u0000\u0144"+
		"\u0145\u0005\u000f\u0000\u0000\u0145\u0146\u00030\u0018\u0000\u0146\u0147"+
		"\u0005\u0011\u0000\u0000\u0147\u0154\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0005\u0016\u0000\u0000\u0149\u014a\u0003 \u0010\u0000\u014a\u014b\u0005"+
		"\u0018\u0000\u0000\u014b\u014c\u0005\u000f\u0000\u0000\u014c\u014d\u0003"+
		"0\u0018\u0000\u014d\u014e\u0005\u0011\u0000\u0000\u014e\u014f\u0005\u0017"+
		"\u0000\u0000\u014f\u0150\u0005\u000f\u0000\u0000\u0150\u0151\u00030\u0018"+
		"\u0000\u0151\u0152\u0005\u0011\u0000\u0000\u0152\u0154\u0001\u0000\u0000"+
		"\u0000\u0153\u0107\u0001\u0000\u0000\u0000\u0153\u010f\u0001\u0000\u0000"+
		"\u0000\u0153\u0118\u0001\u0000\u0000\u0000\u0153\u0121\u0001\u0000\u0000"+
		"\u0000\u0153\u012a\u0001\u0000\u0000\u0000\u0153\u0134\u0001\u0000\u0000"+
		"\u0000\u0153\u013e\u0001\u0000\u0000\u0000\u0153\u0148\u0001\u0000\u0000"+
		"\u0000\u01541\u0001\u0000\u0000\u0000\u0155\u0156\u0006\u0019\uffff\uffff"+
		"\u0000\u0156\u0157\u0003 \u0010\u0000\u0157\u0158\u0005\u0019\u0000\u0000"+
		"\u0158\u0159\u0003 \u0010\u0000\u0159\u015a\u0005(\u0000\u0000\u015a\u015f"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\n\u0001\u0000\u0000\u015c\u015e\u0003"+
		"2\u0019\u0002\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000"+
		"\u0000\u0000\u01603\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005\u001a\u0000\u0000\u0163\u0164\u0005\u000f\u0000"+
		"\u0000\u0164\u0165\u00032\u0019\u0000\u0165\u0166\u0005\u0011\u0000\u0000"+
		"\u01665\u0001\u0000\u0000\u0000\u0167\u0168\u0003>\u001f\u0000\u0168\u0169"+
		"\u0005&\u0000\u0000\u0169\u016a\u0003\n\u0005\u0000\u016a\u016b\u0005"+
		"\'\u0000\u0000\u016b7\u0001\u0000\u0000\u0000\u016c\u0170\u0005\u0010"+
		"\u0000\u0000\u016d\u016e\u0005\u001b\u0000\u0000\u016e\u0170\u0003 \u0010"+
		"\u0000\u016f\u016c\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000"+
		"\u0000\u01709\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u000f\u0000\u0000"+
		"\u0172\u0178\u0005\u0011\u0000\u0000\u0173\u0174\u0005\u000f\u0000\u0000"+
		"\u0174\u0175\u0003:\u001d\u0000\u0175\u0176\u0005\u0011\u0000\u0000\u0176"+
		"\u0178\u0001\u0000\u0000\u0000\u0177\u0171\u0001\u0000\u0000\u0000\u0177"+
		"\u0173\u0001\u0000\u0000\u0000\u0178;\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0005+\u0000\u0000\u017a=\u0001\u0000\u0000\u0000\u017b\u017c\u0005,"+
		"\u0000\u0000\u017c?\u0001\u0000\u0000\u0000\u0013ET[gov\u0082\u0089\u0095"+
		"\u009c\u00ac\u00c7\u00d5\u00d7\u00e2\u0153\u015f\u016f\u0177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}