// Generated from C:/Users/maisa/IdeaProjects/proCom-main/proCom-main/out/production/newproject/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package out.production.newproject.src.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_OPEN=1, TEXT=2, SCRIPT_OPEN=3, STYLE_OPEN=4, WS=5, HTML_TAG_CLOSE=6, 
		HTML_SLASH_CLOSE=7, HTML_SLASH=8, HTML_EQUALS=9, HTML_ATTRIBUTE_VALUE=10, 
		HTML_PROPERTY_BINDING=11, HTML_EVENT_BINDING=12, HTML_TAG_NAME=13, HTML_TWO_WAY_BINDING=14, 
		HTML_STAR_BINDING=15, HTML_INTERPOLATION=16, HTML_ATTRIBUTE_NAME=17, HTML_WS=18, 
		STYLE_CLOSE=19, CSS_PROPERTY=20, CSS_VALUE=21, CSS_CLASS_SELECTOR=22, 
		CSS_ID_SELECTOR=23, CSS_ELEMENT_SELECTOR=24, CSS_COMBINATOR_WS=25, CSS_LBRACE=26, 
		CSS_RBRACE=27, CSS_COLON=28, CSS_SEMICOLON=29, CSS_WS=30, SCRIPT_CLOSE=31, 
		IF=32, ELSEIF=33, ELSE=34, FOR=35, WHILE=36, SWITCH=37, CASE=38, BREAK=39, 
		CONTINUE=40, DEFAULT=41, DO=42, TRY=43, CATCH=44, FINALLY=45, THROW=46, 
		FUNCTION=47, RETURN=48, CONST=49, LET=50, CONSTRUCTOR=51, VAR=52, CLASS=53, 
		IMPORT=54, IMPORTS=55, EXPORT=56, AS=57, FROM=58, NEW=59, THIS=60, IMPLEMENTS=61, 
		INPUT=62, OUTPUT=63, COMPONENT=64, NGONINIT=65, NGONCHANGES=66, SELECTOR=67, 
		STANDALONE=68, STYLEURL=69, TEMPLATEURL=70, TEMPLATE=71, DESCRIBE=72, 
		INTERFACE=73, IT=74, BEFOREEACH=75, AFTEREACH=76, AWAIT=77, PUBLIC=78, 
		PRIVATE=79, PROTECTED=80, READONLY=81, STATIC=82, ABSTRACT=83, FINAL=84, 
		ASYNC=85, EQUAL=86, ARROW=87, PLUS=88, MINUS=89, STAR=90, DIVIDE=91, MODULO=92, 
		AND=93, OR=94, NOT=95, EQUAL_TO=96, EQUAL_TO3=97, NOT_EQUAL=98, NOT_EQUAL2=99, 
		GREATER_THAN=100, LESS_THAN=101, GREATER_THAN_OR_EQUAL=102, LESS_THAN_OR_EQUAL=103, 
		LPAREN=104, RPAREN=105, LSBRACKET=106, RSBRACKET=107, LCURLY=108, RCURLY=109, 
		COMMA=110, SEMI=111, COLON=112, DOT=113, QUESTION=114, A=115, Integer=116, 
		Float=117, String=118, Boolean=119, Undefined=120, Null=121, ACCESS_MODIFIER=122, 
		SINGLE_LINE_COMMENT=123, COMMENT_BLOCK=124, TS_WS=125, IDENTIFIER=126, 
		EXTENDS=127, QUESITIONMARK=128;
	public static final int
		RULE_program = 0, RULE_scriptBlock = 1, RULE_tsStatement = 2, RULE_importStatement = 3, 
		RULE_importSpecifier = 4, RULE_componentDeclaration = 5, RULE_selector = 6, 
		RULE_standalone = 7, RULE_url = 8, RULE_imports = 9, RULE_functionDeclaration = 10, 
		RULE_methodDeclaration = 11, RULE_arrowMethod = 12, RULE_block = 13, RULE_parameterList = 14, 
		RULE_parameter = 15, RULE_modifier = 16, RULE_classDeclaration = 17, RULE_classMember = 18, 
		RULE_ngOn = 19, RULE_constructorDecleration = 20, RULE_inputDeclaration = 21, 
		RULE_outputDeclaration = 22, RULE_variableDeclaration = 23, RULE_type = 24, 
		RULE_propertyDeclaration = 25, RULE_property = 26, RULE_objectDecleration = 27, 
		RULE_objectName = 28, RULE_objectInit = 29, RULE_objectType = 30, RULE_objectLiteral = 31, 
		RULE_literal = 32, RULE_statement = 33, RULE_expression = 34, RULE_ifStatement = 35, 
		RULE_elseIfStatment = 36, RULE_elseStatment = 37, RULE_shortIf = 38, RULE_shortElseIf = 39, 
		RULE_shortelse = 40, RULE_arrowIf = 41, RULE_forStatement = 42, RULE_whileStatement = 43, 
		RULE_expressionStatement = 44, RULE_returnStatement = 45, RULE_callingMethod = 46, 
		RULE_dataStructure = 47, RULE_itemsStructures = 48, RULE_map = 49, RULE_list = 50, 
		RULE_operator = 51, RULE_compersion = 52, RULE_eos = 53, RULE_jasmineStatement = 54, 
		RULE_jasmineDescribe = 55, RULE_jasmineCallback = 56, RULE_jasmineIt = 57, 
		RULE_jasmineBeforeEach = 58, RULE_jasmineAfterEach = 59, RULE_htmlElement = 60, 
		RULE_htmlAttributes = 61, RULE_angularAttribute = 62, RULE_htmlClosingTag = 63, 
		RULE_htmlAttribute = 64, RULE_htmlContent = 65, RULE_stylesheet = 66, 
		RULE_styleBlock = 67, RULE_cssRules = 68, RULE_cssRule = 69, RULE_cssSelector = 70, 
		RULE_simpleSelector = 71, RULE_cssDeclarations = 72, RULE_cssDeclaration = 73;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "scriptBlock", "tsStatement", "importStatement", "importSpecifier", 
			"componentDeclaration", "selector", "standalone", "url", "imports", "functionDeclaration", 
			"methodDeclaration", "arrowMethod", "block", "parameterList", "parameter", 
			"modifier", "classDeclaration", "classMember", "ngOn", "constructorDecleration", 
			"inputDeclaration", "outputDeclaration", "variableDeclaration", "type", 
			"propertyDeclaration", "property", "objectDecleration", "objectName", 
			"objectInit", "objectType", "objectLiteral", "literal", "statement", 
			"expression", "ifStatement", "elseIfStatment", "elseStatment", "shortIf", 
			"shortElseIf", "shortelse", "arrowIf", "forStatement", "whileStatement", 
			"expressionStatement", "returnStatement", "callingMethod", "dataStructure", 
			"itemsStructures", "map", "list", "operator", "compersion", "eos", "jasmineStatement", 
			"jasmineDescribe", "jasmineCallback", "jasmineIt", "jasmineBeforeEach", 
			"jasmineAfterEach", "htmlElement", "htmlAttributes", "angularAttribute", 
			"htmlClosingTag", "htmlAttribute", "htmlContent", "stylesheet", "styleBlock", 
			"cssRules", "cssRule", "cssSelector", "simpleSelector", "cssDeclarations", 
			"cssDeclaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'<script>'", "'<style>'", null, null, "'/>'", null, 
			null, null, null, null, null, null, null, null, null, null, "'</style>'", 
			null, null, null, null, null, null, null, null, null, null, null, "'</script>'", 
			"'if'", "'else if'", "'else'", "'for'", "'while'", "'switch'", "'case'", 
			"'break'", "'continue'", "'default'", "'do'", "'try'", "'catch'", "'finally'", 
			"'throw'", "'function'", "'return'", "'const'", "'let'", "'constructor'", 
			"'var'", "'class'", "'import'", "'imports'", "'export'", "'as'", "'from'", 
			"'new'", "'this'", "'implements'", "'@Input'", "'@Output'", "'@Component'", 
			"'ngOnInit'", "'ngOnChanges'", "'selector'", "'standalone'", "'styleUrls'", 
			"'templateUrl'", "'template'", "'describe'", "'interface'", "'it'", "'beforeEach'", 
			"'afterEach'", "'await'", "'public'", "'private'", "'protected'", "'readonly'", 
			"'static'", "'abstract'", "'final'", "'async'", null, "'=>'", "'+'", 
			"'-'", "'*'", null, "'%'", "'&&'", "'||'", "'!'", "'=='", "'==='", "'!='", 
			"'!=='", null, "'<'", "'>='", "'<='", "'('", "')'", "'['", "']'", null, 
			null, "','", null, null, "'.'", "'?'", "'@'", null, null, null, null, 
			"'undefined'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAG_OPEN", "TEXT", "SCRIPT_OPEN", "STYLE_OPEN", "WS", "HTML_TAG_CLOSE", 
			"HTML_SLASH_CLOSE", "HTML_SLASH", "HTML_EQUALS", "HTML_ATTRIBUTE_VALUE", 
			"HTML_PROPERTY_BINDING", "HTML_EVENT_BINDING", "HTML_TAG_NAME", "HTML_TWO_WAY_BINDING", 
			"HTML_STAR_BINDING", "HTML_INTERPOLATION", "HTML_ATTRIBUTE_NAME", "HTML_WS", 
			"STYLE_CLOSE", "CSS_PROPERTY", "CSS_VALUE", "CSS_CLASS_SELECTOR", "CSS_ID_SELECTOR", 
			"CSS_ELEMENT_SELECTOR", "CSS_COMBINATOR_WS", "CSS_LBRACE", "CSS_RBRACE", 
			"CSS_COLON", "CSS_SEMICOLON", "CSS_WS", "SCRIPT_CLOSE", "IF", "ELSEIF", 
			"ELSE", "FOR", "WHILE", "SWITCH", "CASE", "BREAK", "CONTINUE", "DEFAULT", 
			"DO", "TRY", "CATCH", "FINALLY", "THROW", "FUNCTION", "RETURN", "CONST", 
			"LET", "CONSTRUCTOR", "VAR", "CLASS", "IMPORT", "IMPORTS", "EXPORT", 
			"AS", "FROM", "NEW", "THIS", "IMPLEMENTS", "INPUT", "OUTPUT", "COMPONENT", 
			"NGONINIT", "NGONCHANGES", "SELECTOR", "STANDALONE", "STYLEURL", "TEMPLATEURL", 
			"TEMPLATE", "DESCRIBE", "INTERFACE", "IT", "BEFOREEACH", "AFTEREACH", 
			"AWAIT", "PUBLIC", "PRIVATE", "PROTECTED", "READONLY", "STATIC", "ABSTRACT", 
			"FINAL", "ASYNC", "EQUAL", "ARROW", "PLUS", "MINUS", "STAR", "DIVIDE", 
			"MODULO", "AND", "OR", "NOT", "EQUAL_TO", "EQUAL_TO3", "NOT_EQUAL", "NOT_EQUAL2", 
			"GREATER_THAN", "LESS_THAN", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", 
			"LPAREN", "RPAREN", "LSBRACKET", "RSBRACKET", "LCURLY", "RCURLY", "COMMA", 
			"SEMI", "COLON", "DOT", "QUESTION", "A", "Integer", "Float", "String", 
			"Boolean", "Undefined", "Null", "ACCESS_MODIFIER", "SINGLE_LINE_COMMENT", 
			"COMMENT_BLOCK", "TS_WS", "IDENTIFIER", "EXTENDS", "QUESITIONMARK"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<StyleBlockContext> styleBlock() {
			return getRuleContexts(StyleBlockContext.class);
		}
		public StyleBlockContext styleBlock(int i) {
			return getRuleContext(StyleBlockContext.class,i);
		}
		public List<ScriptBlockContext> scriptBlock() {
			return getRuleContexts(ScriptBlockContext.class);
		}
		public ScriptBlockContext scriptBlock(int i) {
			return getRuleContext(ScriptBlockContext.class,i);
		}
		public List<JasmineStatementContext> jasmineStatement() {
			return getRuleContexts(JasmineStatementContext.class);
		}
		public JasmineStatementContext jasmineStatement(int i) {
			return getRuleContext(JasmineStatementContext.class,i);
		}
		public List<TsStatementContext> tsStatement() {
			return getRuleContexts(TsStatementContext.class);
		}
		public TsStatementContext tsStatement(int i) {
			return getRuleContext(TsStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1294661854940889114L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4897687822003076865L) != 0)) {
				{
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(148);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(149);
					styleBlock();
					}
					break;
				case 3:
					{
					setState(150);
					scriptBlock();
					}
					break;
				case 4:
					{
					setState(151);
					jasmineStatement();
					}
					break;
				case 5:
					{
					setState(152);
					tsStatement();
					}
					break;
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptBlockContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(AngularParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_CLOSE() { return getToken(AngularParser.SCRIPT_CLOSE, 0); }
		public List<TsStatementContext> tsStatement() {
			return getRuleContexts(TsStatementContext.class);
		}
		public TsStatementContext tsStatement(int i) {
			return getRuleContext(TsStatementContext.class,i);
		}
		public ScriptBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterScriptBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitScriptBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitScriptBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptBlockContext scriptBlock() throws RecognitionException {
		ScriptBlockContext _localctx = new ScriptBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scriptBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(SCRIPT_OPEN);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1294661854940889088L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4897687822003076865L) != 0)) {
				{
				{
				setState(161);
				tsStatement();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(SCRIPT_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TsStatementContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsStatementContext tsStatement() throws RecognitionException {
		TsStatementContext _localctx = new TsStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tsStatement);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				importStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				componentDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public ImportSpecifierContext importSpecifier() {
			return getRuleContext(ImportSpecifierContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importStatement);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(IMPORT);
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(177);
					match(IDENTIFIER);
					}
					break;
				case STAR:
					{
					setState(178);
					match(STAR);
					setState(179);
					match(AS);
					setState(180);
					match(IDENTIFIER);
					}
					break;
				case LCURLY:
					{
					setState(181);
					importSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(184);
				match(FROM);
				setState(185);
				match(String);
				setState(186);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(IMPORT);
				setState(188);
				match(String);
				setState(189);
				eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportSpecifierContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> AS() { return getTokens(AngularParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(AngularParser.AS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(LCURLY);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(193);
				match(IDENTIFIER);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(194);
					match(AS);
					setState(195);
					match(IDENTIFIER);
					}
				}

				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(198);
					match(COMMA);
					setState(199);
					match(IDENTIFIER);
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(200);
						match(AS);
						setState(201);
						match(IDENTIFIER);
						}
					}

					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(211);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<StandaloneContext> standalone() {
			return getRuleContexts(StandaloneContext.class);
		}
		public StandaloneContext standalone(int i) {
			return getRuleContext(StandaloneContext.class,i);
		}
		public List<UrlContext> url() {
			return getRuleContexts(UrlContext.class);
		}
		public UrlContext url(int i) {
			return getRuleContext(UrlContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(COMPONENT);
			setState(214);
			match(LPAREN);
			setState(215);
			match(LCURLY);
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				{
				setState(216);
				selector();
				}
				break;
			case STANDALONE:
				{
				setState(217);
				standalone();
				}
				break;
			case STYLEURL:
			case TEMPLATEURL:
				{
				setState(218);
				url();
				}
				break;
			case IMPORTS:
				{
				setState(219);
				imports();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(222);
				match(COMMA);
				setState(227);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECTOR:
					{
					setState(223);
					selector();
					}
					break;
				case STANDALONE:
					{
					setState(224);
					standalone();
					}
					break;
				case STYLEURL:
				case TEMPLATEURL:
					{
					setState(225);
					url();
					}
					break;
				case IMPORTS:
					{
					setState(226);
					imports();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(RCURLY);
			setState(235);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(SELECTOR);
			setState(238);
			match(COLON);
			setState(239);
			match(String);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(AngularParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode Boolean() { return getToken(AngularParser.Boolean, 0); }
		public StandaloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandalone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandalone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandalone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneContext standalone() throws RecognitionException {
		StandaloneContext _localctx = new StandaloneContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_standalone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(STANDALONE);
			setState(242);
			match(COLON);
			setState(243);
			match(Boolean);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UrlContext extends ParserRuleContext {
		public TerminalNode STYLEURL() { return getToken(AngularParser.STYLEURL, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode LSBRACKET() { return getToken(AngularParser.LSBRACKET, 0); }
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public TerminalNode RSBRACKET() { return getToken(AngularParser.RSBRACKET, 0); }
		public TerminalNode TEMPLATEURL() { return getToken(AngularParser.TEMPLATEURL, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_url);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLEURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(STYLEURL);
				setState(246);
				match(COLON);
				setState(247);
				match(LSBRACKET);
				setState(248);
				match(String);
				setState(249);
				match(RSBRACKET);
				}
				break;
			case TEMPLATEURL:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(TEMPLATEURL);
				setState(251);
				match(COLON);
				setState(252);
				match(String);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode LSBRACKET() { return getToken(AngularParser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(AngularParser.RSBRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_imports);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(IMPORTS);
				setState(256);
				match(COLON);
				setState(257);
				match(LSBRACKET);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(258);
					match(IDENTIFIER);
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(259);
						match(COMMA);
						setState(260);
						match(IDENTIFIER);
						}
						}
						setState(265);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(268);
				match(RSBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(IMPORTS);
				setState(270);
				match(COLON);
				setState(271);
				match(LSBRACKET);
				setState(272);
				match(IDENTIFIER);
				setState(273);
				match(RSBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDeclaration);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION) {
					{
					setState(276);
					match(FUNCTION);
					}
				}

				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(279);
					match(IDENTIFIER);
					}
				}

				setState(282);
				parameterList();
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(283);
					match(COLON);
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(284);
						match(IDENTIFIER);
						}
					}

					}
				}

				setState(289);
				block();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				arrowMethod();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodDeclaration);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1069547521L) != 0)) {
					{
					setState(294);
					modifier();
					}
				}

				setState(297);
				match(IDENTIFIER);
				setState(298);
				parameterList();
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(299);
					match(COLON);
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(300);
						match(IDENTIFIER);
						}
					}

					}
				}

				setState(305);
				block();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				arrowMethod();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowMethodContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(AngularParser.ASYNC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrowMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowMethodContext arrowMethod() throws RecognitionException {
		ArrowMethodContext _localctx = new ArrowMethodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrowMethod);
		int _la;
		try {
			int _alt;
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1069547521L) != 0)) {
					{
					setState(310);
					modifier();
					}
				}

				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(313);
					match(IDENTIFIER);
					}
				}

				setState(316);
				parameterList();
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(317);
					match(COLON);
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(318);
						match(IDENTIFIER);
						}
					}

					}
				}

				setState(323);
				match(ARROW);
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(324);
					match(LCURLY);
					}
					break;
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(327);
						statement();
						}
						} 
					}
					setState(332);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(333);
					match(RCURLY);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(336);
					match(IDENTIFIER);
					}
				}

				setState(339);
				parameterList();
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(340);
					match(COLON);
					setState(342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(341);
						match(IDENTIFIER);
						}
						break;
					}
					}
				}

				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(346);
					match(LCURLY);
					}
					break;
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1267499519688310784L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 19131593054699519L) != 0)) {
					{
					{
					setState(349);
					statement();
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(355);
				match(RCURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(357);
					match(ASYNC);
					}
				}

				setState(360);
				match(LPAREN);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(361);
					match(IDENTIFIER);
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(362);
						match(COMMA);
						setState(363);
						match(IDENTIFIER);
						}
						}
						setState(368);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(371);
				match(RPAREN);
				setState(372);
				match(ARROW);
				setState(373);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(374);
				match(LPAREN);
				setState(375);
				match(RPAREN);
				setState(376);
				match(ARROW);
				setState(377);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(LCURLY);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(381);
					statement();
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(387);
				returnStatement();
				}
			}

			setState(390);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(LPAREN);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 281474976710911L) != 0)) {
				{
				setState(393);
				parameter();
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(394);
					match(COMMA);
					setState(395);
					parameter();
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(403);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameter);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(405);
				match(IDENTIFIER);
				setState(406);
				match(COLON);
				setState(407);
				match(IDENTIFIER);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(408);
					match(EQUAL);
					setState(409);
					literal();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				modifier();
				{
				setState(414);
				match(IDENTIFIER);
				setState(415);
				match(COLON);
				setState(416);
				match(IDENTIFIER);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(417);
					match(EQUAL);
					setState(418);
					literal();
					}
				}

				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(AngularParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(AngularParser.PROTECTED, 0); }
		public TerminalNode READONLY() { return getToken(AngularParser.READONLY, 0); }
		public TerminalNode STATIC() { return getToken(AngularParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(AngularParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(AngularParser.FINAL, 0); }
		public TerminalNode ASYNC() { return getToken(AngularParser.ASYNC, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1069547521L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(AngularParser.IMPLEMENTS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1069547521L) != 0)) {
				{
				setState(426);
				modifier();
				}
			}

			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(429);
				match(CLASS);
				}
			}

			setState(432);
			match(IDENTIFIER);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS || _la==EXTENDS) {
				{
				setState(433);
				_la = _input.LA(1);
				if ( !(_la==IMPLEMENTS || _la==EXTENDS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(434);
				match(IDENTIFIER);
				}
			}

			setState(437);
			match(LCURLY);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4495155378069176320L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2305843558971597059L) != 0)) {
				{
				{
				setState(438);
				classMember();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public InputDeclarationContext inputDeclaration() {
			return getRuleContext(InputDeclarationContext.class,0);
		}
		public OutputDeclarationContext outputDeclaration() {
			return getRuleContext(OutputDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public ConstructorDeclerationContext constructorDecleration() {
			return getRuleContext(ConstructorDeclerationContext.class,0);
		}
		public NgOnContext ngOn() {
			return getRuleContext(NgOnContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classMember);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				inputDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				outputDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				methodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				propertyDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(450);
				variableDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(451);
				objectDecleration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(452);
				constructorDecleration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(453);
				ngOn();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NgOnContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NGONINIT() { return getToken(AngularParser.NGONINIT, 0); }
		public TerminalNode NGONCHANGES() { return getToken(AngularParser.NGONCHANGES, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public NgOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngOn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgOn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgOn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgOn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgOnContext ngOn() throws RecognitionException {
		NgOnContext _localctx = new NgOnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ngOn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !(_la==NGONINIT || _la==NGONCHANGES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(457);
			parameterList();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(458);
				match(COLON);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(459);
					match(IDENTIFIER);
					}
				}

				}
			}

			setState(464);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclerationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDecleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclerationContext constructorDecleration() throws RecognitionException {
		ConstructorDeclerationContext _localctx = new ConstructorDeclerationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructorDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(CONSTRUCTOR);
			setState(467);
			parameterList();
			setState(468);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputDeclarationContext extends ParserRuleContext {
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode INPUT() { return getToken(AngularParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public InputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInputDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInputDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputDeclarationContext inputDeclaration() throws RecognitionException {
		InputDeclarationContext _localctx = new InputDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(470);
			match(INPUT);
			setState(471);
			match(LPAREN);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 4539628425194766337L) != 0)) {
				{
				setState(472);
				literal();
				}
			}

			setState(475);
			match(RPAREN);
			setState(476);
			property();
			}
			setState(478);
			eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutputDeclarationContext extends ParserRuleContext {
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode OUTPUT() { return getToken(AngularParser.OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OutputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOutputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOutputDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOutputDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputDeclarationContext outputDeclaration() throws RecognitionException {
		OutputDeclarationContext _localctx = new OutputDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_outputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(480);
			match(OUTPUT);
			setState(481);
			match(LPAREN);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 4539628425194766337L) != 0)) {
				{
				setState(482);
				literal();
				}
			}

			setState(485);
			match(RPAREN);
			setState(486);
			objectDecleration();
			}
			setState(488);
			eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 136918859915L) != 0)) {
				{
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1069547521L) != 0)) {
					{
					setState(490);
					modifier();
					}
				}

				setState(493);
				type();
				}
			}

			setState(496);
			match(IDENTIFIER);
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(497);
				match(COLON);
				setState(498);
				expression(0);
				}
				break;
			}
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(501);
				match(EQUAL);
				setState(502);
				expression(0);
				}
				break;
			}
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(505);
				match(AS);
				setState(506);
				match(IDENTIFIER);
				}
				break;
			}
			setState(509);
			eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode INTERFACE() { return getToken(AngularParser.INTERFACE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_la = _input.LA(1);
			if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 16777227L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_propertyDeclaration);
		int _la;
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1069547521L) != 0)) {
					{
					setState(513);
					modifier();
					}
				}

				setState(516);
				property();
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(517);
					match(EQUAL);
					setState(518);
					expression(0);
					}
				}

				setState(521);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1069547521L) != 0)) {
					{
					setState(523);
					modifier();
					}
				}

				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 16777227L) != 0)) {
					{
					setState(526);
					type();
					}
				}

				setState(529);
				property();
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(530);
					match(EQUAL);
					setState(531);
					expression(0);
					}
				}

				setState(534);
				eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(AngularParser.QUESTION, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_property);
		try {
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(538);
				match(IDENTIFIER);
				setState(539);
				match(COLON);
				setState(540);
				expression(0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				imports();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(542);
				match(IDENTIFIER);
				setState(543);
				match(QUESTION);
				setState(544);
				match(COLON);
				setState(545);
				expression(0);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(546);
				imports();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDeclerationContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ObjectInitContext objectInit() {
			return getRuleContext(ObjectInitContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public ObjectDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDecleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclerationContext objectDecleration() throws RecognitionException {
		ObjectDeclerationContext _localctx = new ObjectDeclerationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_objectDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(549);
				property();
				}
				break;
			case 2:
				{
				setState(550);
				objectName();
				}
				break;
			}
			setState(553);
			match(EQUAL);
			setState(554);
			objectInit();
			setState(555);
			eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public ObjectNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectNameContext objectName() throws RecognitionException {
		ObjectNameContext _localctx = new ObjectNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_objectName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(IDENTIFIER);
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(558);
				objectType();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInitContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectInitContext objectInit() throws RecognitionException {
		ObjectInitContext _localctx = new ObjectInitContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(NEW);
			setState(562);
			match(IDENTIFIER);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(563);
				objectType();
				}
			}

			setState(566);
			match(LPAREN);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1261306962826493952L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 597862282959359L) != 0)) {
				{
				setState(567);
				expression(0);
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(568);
					match(COMMA);
					setState(569);
					expression(0);
					}
					}
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(577);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(LESS_THAN);
			setState(580);
			match(IDENTIFIER);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSBRACKET || _la==LCURLY) {
				{
				setState(581);
				list();
				}
			}

			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(584);
				match(COMMA);
				setState(585);
				match(IDENTIFIER);
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSBRACKET || _la==LCURLY) {
					{
					setState(586);
					list();
					}
				}

				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594);
			match(GREATER_THAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(LCURLY);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTS || _la==IDENTIFIER) {
				{
				setState(597);
				property();
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(598);
						match(COMMA);
						setState(599);
						property();
						}
						} 
					}
					setState(604);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				}
			}

			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(607);
				match(COMMA);
				}
			}

			setState(610);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(AngularParser.Integer, 0); }
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public TerminalNode Float() { return getToken(AngularParser.Float, 0); }
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public TerminalNode Boolean() { return getToken(AngularParser.Boolean, 0); }
		public TerminalNode Null() { return getToken(AngularParser.Null, 0); }
		public TerminalNode Undefined() { return getToken(AngularParser.Undefined, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literal);
		int _la;
		try {
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(612);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(615);
				match(Integer);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(616);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(619);
				match(Float);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(620);
				match(String);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(621);
				match(Boolean);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(622);
				match(Null);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(623);
				match(Undefined);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(624);
				match(THIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public JasmineStatementContext jasmineStatement() {
			return getRuleContext(JasmineStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statement);
		int _la;
		try {
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LCURLY) {
					{
					setState(628);
					match(LCURLY);
					}
				}

				setState(631);
				variableDeclaration();
				setState(633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(632);
					match(RCURLY);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(635);
				objectDecleration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(636);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(637);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(638);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(639);
				jasmineStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(640);
				expressionStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostIncrementExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<TerminalNode> PLUS() { return getTokens(AngularParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(AngularParser.PLUS, i);
		}
		public PostIncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataStructureExpressionContext extends ExpressionContext {
		public DataStructureContext dataStructure() {
			return getRuleContext(DataStructureContext.class,0);
		}
		public DataStructureExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDataStructureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDataStructureExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDataStructureExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ExpressionContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public DotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralExpressionContext extends ExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCastExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TypeCastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallingMethodExpressionContext extends ExpressionContext {
		public CallingMethodContext callingMethod() {
			return getRuleContext(CallingMethodContext.class,0);
		}
		public CallingMethodExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCallingMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCallingMethodExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCallingMethodExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowMethodExpressionContext extends ExpressionContext {
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public ArrowMethodExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowMethodExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowMethodExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExpressionContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompersionContext compersion() {
			return getRuleContext(CompersionContext.class,0);
		}
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectNameExpressionContext extends ExpressionContext {
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public ObjectNameExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAssertionExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TypeAssertionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeAssertionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeAssertionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeAssertionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public DataStructureContext dataStructure() {
			return getRuleContext(DataStructureContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionalChainingExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(AngularParser.QUESTION, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public OptionalChainingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionalChainingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionalChainingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionalChainingExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperatorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OperatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeExpressionContext extends ExpressionContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public GenericTypeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGenericTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGenericTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGenericTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnExpContext extends ExpressionContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public ReturnExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostDecrementExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<TerminalNode> MINUS() { return getTokens(AngularParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(AngularParser.MINUS, i);
		}
		public PostDecrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDeclarationExpressionContext extends ExpressionContext {
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public ObjectDeclarationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectDeclarationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectDeclarationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectDeclarationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AwaitContext extends ExpressionContext {
		public TerminalNode AWAIT() { return getToken(AngularParser.AWAIT, 0); }
		public AwaitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAwait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAwait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAwait(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExpressionListContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(644);
				objectLiteral();
				}
				break;
			case 2:
				{
				_localctx = new ObjectDeclarationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(645);
				objectDecleration();
				}
				break;
			case 3:
				{
				_localctx = new ObjectNameExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(646);
				objectName();
				}
				break;
			case 4:
				{
				_localctx = new ArrowMethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(647);
				arrowMethod();
				}
				break;
			case 5:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(648);
				match(THIS);
				}
				break;
			case 6:
				{
				_localctx = new AwaitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(649);
				match(AWAIT);
				}
				break;
			case 7:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(650);
				match(IDENTIFIER);
				}
				break;
			case 8:
				{
				_localctx = new PostIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(651);
				match(IDENTIFIER);
				setState(652);
				match(PLUS);
				setState(653);
				match(PLUS);
				}
				break;
			case 9:
				{
				_localctx = new PostDecrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(654);
				match(IDENTIFIER);
				setState(655);
				match(MINUS);
				setState(656);
				match(MINUS);
				}
				break;
			case 10:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(657);
				literal();
				}
				break;
			case 11:
				{
				_localctx = new CallingMethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(658);
				callingMethod();
				}
				break;
			case 12:
				{
				_localctx = new GenericTypeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(659);
				match(LESS_THAN);
				setState(660);
				expression(0);
				setState(661);
				match(GREATER_THAN);
				setState(662);
				match(IDENTIFIER);
				}
				break;
			case 13:
				{
				_localctx = new TypeCastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(664);
				match(LPAREN);
				setState(665);
				expression(0);
				setState(666);
				match(AS);
				setState(667);
				match(IDENTIFIER);
				setState(668);
				match(RPAREN);
				}
				break;
			case 14:
				{
				_localctx = new DataStructureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(670);
				dataStructure();
				}
				break;
			case 15:
				{
				_localctx = new ReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(671);
				returnStatement();
				}
				break;
			case 16:
				{
				_localctx = new ReturnExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LCURLY) {
					{
					setState(672);
					match(LCURLY);
					}
				}

				setState(675);
				returnStatement();
				setState(677);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(676);
					match(RCURLY);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(707);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						_localctx = new DotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(681);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(682);
						match(DOT);
						setState(683);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new OptionalChainingExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(684);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(685);
						match(QUESTION);
						setState(686);
						match(DOT);
						setState(687);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(688);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(689);
						compersion();
						setState(690);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new OperatorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(692);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(693);
						operator();
						setState(694);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionListContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(696);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(697);
						list();
						}
						break;
					case 6:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(698);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(699);
						match(EQUAL);
						setState(702);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LSBRACKET:
						case LCURLY:
							{
							setState(700);
							dataStructure();
							}
							break;
						case THIS:
						case PLUS:
						case MINUS:
						case Integer:
						case Float:
						case String:
						case Boolean:
						case Undefined:
						case Null:
							{
							setState(701);
							literal();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 7:
						{
						_localctx = new TypeAssertionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(704);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(705);
						match(AS);
						setState(706);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElseIfStatmentContext> elseIfStatment() {
			return getRuleContexts(ElseIfStatmentContext.class);
		}
		public ElseIfStatmentContext elseIfStatment(int i) {
			return getRuleContext(ElseIfStatmentContext.class,i);
		}
		public ElseStatmentContext elseStatment() {
			return getRuleContext(ElseStatmentContext.class,0);
		}
		public ShortIfContext shortIf() {
			return getRuleContext(ShortIfContext.class,0);
		}
		public ArrowIfContext arrowIf() {
			return getRuleContext(ArrowIfContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifStatement);
		try {
			int _alt;
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(712);
				match(IF);
				setState(713);
				match(LPAREN);
				setState(714);
				expression(0);
				setState(715);
				match(RPAREN);
				setState(716);
				block();
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(717);
						elseIfStatment();
						}
						} 
					}
					setState(722);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				setState(724);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(723);
					elseStatment();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				shortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				arrowIf();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfStatmentContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(AngularParser.ELSEIF, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseIfStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseIfStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseIfStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatmentContext elseIfStatment() throws RecognitionException {
		ElseIfStatmentContext _localctx = new ElseIfStatmentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elseIfStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(ELSEIF);
			setState(731);
			match(LPAREN);
			setState(732);
			expression(0);
			setState(733);
			match(RPAREN);
			setState(734);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatmentContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatmentContext elseStatment() throws RecognitionException {
		ElseStatmentContext _localctx = new ElseStatmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elseStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(ELSE);
			setState(737);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShortIfContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QUESITIONMARK() { return getToken(AngularParser.QUESITIONMARK, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ShortelseContext shortelse() {
			return getRuleContext(ShortelseContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AngularParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AngularParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AngularParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(AngularParser.RPAREN, i);
		}
		public List<ShortElseIfContext> shortElseIf() {
			return getRuleContexts(ShortElseIfContext.class);
		}
		public ShortElseIfContext shortElseIf(int i) {
			return getRuleContext(ShortElseIfContext.class,i);
		}
		public ShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortIfContext shortIf() throws RecognitionException {
		ShortIfContext _localctx = new ShortIfContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_shortIf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(739);
				match(LPAREN);
				}
				break;
			}
			setState(742);
			expression(0);
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(743);
				match(RPAREN);
				}
			}

			setState(746);
			match(QUESITIONMARK);
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(747);
				match(LPAREN);
				}
				break;
			}
			setState(750);
			statement();
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(751);
				match(RPAREN);
				}
			}

			setState(757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(754);
					shortElseIf();
					}
					} 
				}
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(760);
			shortelse();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShortElseIfContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QUESITIONMARK() { return getToken(AngularParser.QUESITIONMARK, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AngularParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AngularParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AngularParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(AngularParser.RPAREN, i);
		}
		public ShortElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortElseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterShortElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitShortElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitShortElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortElseIfContext shortElseIf() throws RecognitionException {
		ShortElseIfContext _localctx = new ShortElseIfContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_shortElseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(COLON);
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(763);
				match(LPAREN);
				}
				break;
			}
			setState(766);
			expression(0);
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(767);
				match(RPAREN);
				}
			}

			setState(770);
			match(QUESITIONMARK);
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(771);
				match(LPAREN);
				}
				break;
			}
			setState(774);
			statement();
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(775);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShortelseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ShortelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterShortelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitShortelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitShortelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortelseContext shortelse() throws RecognitionException {
		ShortelseContext _localctx = new ShortelseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_shortelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(COLON);
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(779);
				match(LPAREN);
				}
				break;
			}
			setState(782);
			statement();
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(783);
				match(RPAREN);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowIfContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ArrowIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowIfContext arrowIf() throws RecognitionException {
		ArrowIfContext _localctx = new ArrowIfContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arrowIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(786);
				match(LPAREN);
				}
				break;
			}
			setState(789);
			expression(0);
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(790);
				match(RPAREN);
				}
			}

			setState(793);
			match(ARROW);
			setState(794);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(AngularParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AngularParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(FOR);
			setState(797);
			match(LPAREN);
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(798);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(799);
				expression(0);
				}
				break;
			}
			setState(802);
			match(SEMI);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1261306962826493952L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 597862282959359L) != 0)) {
				{
				setState(803);
				expression(0);
				}
			}

			setState(806);
			match(SEMI);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1261306962826493952L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 597862282959359L) != 0)) {
				{
				setState(807);
				expression(0);
				}
			}

			setState(810);
			match(RPAREN);
			setState(811);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(WHILE);
			setState(814);
			match(LPAREN);
			setState(815);
			expression(0);
			setState(816);
			match(RPAREN);
			setState(817);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			expression(0);
			setState(820);
			eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(RETURN);
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(823);
				match(LPAREN);
				}
				break;
			}
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(826);
				expressionStatement();
				}
				break;
			}
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(829);
				match(RPAREN);
				}
				break;
			}
			setState(832);
			eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallingMethodContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode CATCH() { return getToken(AngularParser.CATCH, 0); }
		public List<DataStructureContext> dataStructure() {
			return getRuleContexts(DataStructureContext.class);
		}
		public DataStructureContext dataStructure(int i) {
			return getRuleContext(DataStructureContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<CallingMethodContext> callingMethod() {
			return getRuleContexts(CallingMethodContext.class);
		}
		public CallingMethodContext callingMethod(int i) {
			return getRuleContext(CallingMethodContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TerminalNode A() { return getToken(AngularParser.A, 0); }
		public CallingMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callingMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCallingMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCallingMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCallingMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallingMethodContext callingMethod() throws RecognitionException {
		CallingMethodContext _localctx = new CallingMethodContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_callingMethod);
		int _la;
		try {
			int _alt;
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(834);
				_la = _input.LA(1);
				if ( !(_la==CATCH || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(835);
				match(LPAREN);
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1261306962826493952L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 597862282959359L) != 0)) {
					{
					setState(836);
					expression(0);
					setState(841);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(837);
						match(COMMA);
						setState(838);
						expression(0);
						}
						}
						setState(843);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(846);
				match(RPAREN);
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(854);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOT:
							{
							{
							setState(848);
							match(DOT);
							setState(851);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
							case 1:
								{
								setState(849);
								callingMethod();
								}
								break;
							case 2:
								{
								setState(850);
								match(IDENTIFIER);
								}
								break;
							}
							}
							}
							break;
						case LSBRACKET:
						case LCURLY:
							{
							setState(853);
							dataStructure();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(858);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(862);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case A:
					{
					setState(859);
					match(A);
					setState(860);
					match(IDENTIFIER);
					}
					break;
				case CATCH:
					{
					setState(861);
					match(CATCH);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(864);
				match(LPAREN);
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1261306962826493952L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 597862282959359L) != 0)) {
					{
					setState(865);
					expression(0);
					setState(870);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(866);
						match(COMMA);
						setState(867);
						expression(0);
						}
						}
						setState(872);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(875);
				match(RPAREN);
				}
				setState(885);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(883);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOT:
							{
							{
							setState(877);
							match(DOT);
							setState(880);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
							case 1:
								{
								setState(878);
								callingMethod();
								}
								break;
							case 2:
								{
								setState(879);
								match(IDENTIFIER);
								}
								break;
							}
							}
							}
							break;
						case LSBRACKET:
						case LCURLY:
							{
							setState(882);
							dataStructure();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(887);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataStructureContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public DataStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDataStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDataStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDataStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataStructureContext dataStructure() throws RecognitionException {
		DataStructureContext _localctx = new DataStructureContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dataStructure);
		try {
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				map();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ItemsStructuresContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public CallingMethodContext callingMethod() {
			return getRuleContext(CallingMethodContext.class,0);
		}
		public ItemsStructuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemsStructures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterItemsStructures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitItemsStructures(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitItemsStructures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsStructuresContext itemsStructures() throws RecognitionException {
		ItemsStructuresContext _localctx = new ItemsStructuresContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_itemsStructures);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(894);
				literal();
				}
				break;
			case 2:
				{
				setState(895);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(896);
				list();
				}
				break;
			case 4:
				{
				setState(897);
				map();
				}
				break;
			case 5:
				{
				setState(898);
				callingMethod();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<ItemsStructuresContext> itemsStructures() {
			return getRuleContexts(ItemsStructuresContext.class);
		}
		public ItemsStructuresContext itemsStructures(int i) {
			return getRuleContext(ItemsStructuresContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_map);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(LCURLY);
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH || _la==THIS || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 291924869123L) != 0)) {
				{
				{
				setState(902);
				itemsStructures();
				setState(903);
				match(COLON);
				setState(904);
				itemsStructures();
				}
				setState(913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(906);
						match(COMMA);
						{
						setState(907);
						itemsStructures();
						setState(908);
						match(COLON);
						setState(909);
						itemsStructures();
						}
						}
						} 
					}
					setState(915);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				}
				}
			}

			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(918);
				match(COMMA);
				}
			}

			setState(921);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LSBRACKET() { return getToken(AngularParser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(AngularParser.RSBRACKET, 0); }
		public List<ItemsStructuresContext> itemsStructures() {
			return getRuleContexts(ItemsStructuresContext.class);
		}
		public ItemsStructuresContext itemsStructures(int i) {
			return getRuleContext(ItemsStructuresContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_list);
		int _la;
		try {
			int _alt;
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				match(LSBRACKET);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH || _la==THIS || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 291924869123L) != 0)) {
					{
					setState(924);
					itemsStructures();
					setState(929);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(925);
							match(COMMA);
							setState(926);
							itemsStructures();
							}
							} 
						}
						setState(931);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
					}
					}
				}

				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(934);
					match(COMMA);
					}
				}

				setState(937);
				match(RSBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LCURLY) {
					{
					setState(938);
					match(LCURLY);
					}
				}

				setState(941);
				match(LSBRACKET);
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH || _la==THIS || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 291924869123L) != 0)) {
					{
					setState(942);
					itemsStructures();
					setState(947);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(943);
							match(COMMA);
							setState(944);
							itemsStructures();
							}
							} 
						}
						setState(949);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
					}
					}
				}

				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(952);
					match(COMMA);
					}
				}

				setState(955);
				match(RSBRACKET);
				setState(957);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(956);
					match(RCURLY);
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(AngularParser.DIVIDE, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_operator);
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(961);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(962);
				match(PLUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(963);
				match(MINUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(964);
				match(STAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(965);
				match(DIVIDE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(966);
				match(PLUS);
				setState(967);
				match(EQUAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(968);
				match(MINUS);
				setState(969);
				match(EQUAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompersionContext extends ParserRuleContext {
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(AngularParser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(AngularParser.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(AngularParser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL_TO() { return getToken(AngularParser.EQUAL_TO, 0); }
		public TerminalNode AND() { return getToken(AngularParser.AND, 0); }
		public TerminalNode OR() { return getToken(AngularParser.OR, 0); }
		public TerminalNode EQUAL_TO3() { return getToken(AngularParser.EQUAL_TO3, 0); }
		public TerminalNode NOT_EQUAL2() { return getToken(AngularParser.NOT_EQUAL2, 0); }
		public CompersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCompersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCompersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCompersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompersionContext compersion() throws RecognitionException {
		CompersionContext _localctx = new CompersionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_compersion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 2043L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(974);
				match(SEMI);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class JasmineStatementContext extends ParserRuleContext {
		public JasmineDescribeContext jasmineDescribe() {
			return getRuleContext(JasmineDescribeContext.class,0);
		}
		public JasmineItContext jasmineIt() {
			return getRuleContext(JasmineItContext.class,0);
		}
		public JasmineBeforeEachContext jasmineBeforeEach() {
			return getRuleContext(JasmineBeforeEachContext.class,0);
		}
		public JasmineAfterEachContext jasmineAfterEach() {
			return getRuleContext(JasmineAfterEachContext.class,0);
		}
		public JasmineStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJasmineStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJasmineStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJasmineStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineStatementContext jasmineStatement() throws RecognitionException {
		JasmineStatementContext _localctx = new JasmineStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_jasmineStatement);
		try {
			setState(981);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESCRIBE:
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				jasmineDescribe();
				}
				break;
			case IT:
				enterOuterAlt(_localctx, 2);
				{
				setState(978);
				jasmineIt();
				}
				break;
			case BEFOREEACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(979);
				jasmineBeforeEach();
				}
				break;
			case AFTEREACH:
				enterOuterAlt(_localctx, 4);
				{
				setState(980);
				jasmineAfterEach();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JasmineDescribeContext extends ParserRuleContext {
		public TerminalNode DESCRIBE() { return getToken(AngularParser.DESCRIBE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public JasmineCallbackContext jasmineCallback() {
			return getRuleContext(JasmineCallbackContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public JasmineDescribeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineDescribe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJasmineDescribe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJasmineDescribe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJasmineDescribe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineDescribeContext jasmineDescribe() throws RecognitionException {
		JasmineDescribeContext _localctx = new JasmineDescribeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_jasmineDescribe);
		try {
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				match(DESCRIBE);
				setState(984);
				match(LPAREN);
				setState(985);
				match(String);
				setState(986);
				match(COMMA);
				setState(987);
				jasmineCallback();
				setState(989);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(988);
					match(RPAREN);
					}
					break;
				}
				setState(992);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(991);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				match(DESCRIBE);
				setState(995);
				match(LPAREN);
				setState(996);
				match(String);
				setState(997);
				match(COMMA);
				setState(998);
				arrowMethod();
				setState(999);
				match(RPAREN);
				setState(1000);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JasmineCallbackContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public TerminalNode ASYNC() { return getToken(AngularParser.ASYNC, 0); }
		public List<JasmineStatementContext> jasmineStatement() {
			return getRuleContexts(JasmineStatementContext.class);
		}
		public JasmineStatementContext jasmineStatement(int i) {
			return getRuleContext(JasmineStatementContext.class,i);
		}
		public JasmineCallbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineCallback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJasmineCallback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJasmineCallback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJasmineCallback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineCallbackContext jasmineCallback() throws RecognitionException {
		JasmineCallbackContext _localctx = new JasmineCallbackContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_jasmineCallback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(1004);
				match(ASYNC);
				}
			}

			setState(1007);
			parameterList();
			setState(1008);
			match(ARROW);
			setState(1009);
			match(LCURLY);
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 29L) != 0)) {
				{
				{
				setState(1010);
				jasmineStatement();
				}
				}
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1016);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JasmineItContext extends ParserRuleContext {
		public TerminalNode IT() { return getToken(AngularParser.IT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public List<TerminalNode> String() { return getTokens(AngularParser.String); }
		public TerminalNode String(int i) {
			return getToken(AngularParser.String, i);
		}
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public JasmineItContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineIt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJasmineIt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJasmineIt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJasmineIt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineItContext jasmineIt() throws RecognitionException {
		JasmineItContext _localctx = new JasmineItContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_jasmineIt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			match(IT);
			setState(1019);
			match(LPAREN);
			setState(1020);
			match(String);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1021);
				match(IDENTIFIER);
				}
			}

			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==String) {
				{
				setState(1024);
				match(String);
				}
			}

			setState(1027);
			match(COMMA);
			setState(1028);
			arrowMethod();
			setState(1029);
			match(RPAREN);
			setState(1030);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JasmineBeforeEachContext extends ParserRuleContext {
		public TerminalNode BEFOREEACH() { return getToken(AngularParser.BEFOREEACH, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public JasmineBeforeEachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineBeforeEach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJasmineBeforeEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJasmineBeforeEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJasmineBeforeEach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineBeforeEachContext jasmineBeforeEach() throws RecognitionException {
		JasmineBeforeEachContext _localctx = new JasmineBeforeEachContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_jasmineBeforeEach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(BEFOREEACH);
			setState(1033);
			match(LPAREN);
			setState(1034);
			arrowMethod();
			setState(1035);
			match(RPAREN);
			setState(1036);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JasmineAfterEachContext extends ParserRuleContext {
		public TerminalNode AFTEREACH() { return getToken(AngularParser.AFTEREACH, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public JasmineAfterEachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineAfterEach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJasmineAfterEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJasmineAfterEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJasmineAfterEach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineAfterEachContext jasmineAfterEach() throws RecognitionException {
		JasmineAfterEachContext _localctx = new JasmineAfterEachContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jasmineAfterEach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(AFTEREACH);
			setState(1039);
			match(LPAREN);
			setState(1040);
			arrowMethod();
			setState(1041);
			match(RPAREN);
			setState(1042);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(AngularParser.TAG_OPEN, 0); }
		public TerminalNode HTML_TAG_NAME() { return getToken(AngularParser.HTML_TAG_NAME, 0); }
		public TerminalNode HTML_TAG_CLOSE() { return getToken(AngularParser.HTML_TAG_CLOSE, 0); }
		public HtmlClosingTagContext htmlClosingTag() {
			return getRuleContext(HtmlClosingTagContext.class,0);
		}
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public TerminalNode HTML_SLASH_CLOSE() { return getToken(AngularParser.HTML_SLASH_CLOSE, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_htmlElement);
		try {
			int _alt;
			setState(1063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				match(TAG_OPEN);
				setState(1045);
				match(HTML_TAG_NAME);
				setState(1047);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1046);
					htmlAttributes();
					}
					break;
				}
				setState(1049);
				match(HTML_TAG_CLOSE);
				setState(1053);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1050);
						htmlContent();
						}
						} 
					}
					setState(1055);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				}
				setState(1056);
				htmlClosingTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057);
				match(TAG_OPEN);
				setState(1058);
				match(HTML_TAG_NAME);
				setState(1060);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1059);
					htmlAttributes();
					}
					break;
				}
				setState(1062);
				match(HTML_SLASH_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributesContext extends ParserRuleContext {
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<AngularAttributeContext> angularAttribute() {
			return getRuleContexts(AngularAttributeContext.class);
		}
		public AngularAttributeContext angularAttribute(int i) {
			return getRuleContext(AngularAttributeContext.class,i);
		}
		public HtmlAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributesContext htmlAttributes() throws RecognitionException {
		HtmlAttributesContext _localctx = new HtmlAttributesContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_htmlAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 251904L) != 0)) {
				{
				setState(1067);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1065);
					htmlAttribute();
					}
					break;
				case 2:
					{
					setState(1066);
					angularAttribute();
					}
					break;
				}
				}
				setState(1071);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AngularAttributeContext extends ParserRuleContext {
		public TerminalNode HTML_PROPERTY_BINDING() { return getToken(AngularParser.HTML_PROPERTY_BINDING, 0); }
		public TerminalNode HTML_EVENT_BINDING() { return getToken(AngularParser.HTML_EVENT_BINDING, 0); }
		public TerminalNode HTML_TWO_WAY_BINDING() { return getToken(AngularParser.HTML_TWO_WAY_BINDING, 0); }
		public TerminalNode HTML_STAR_BINDING() { return getToken(AngularParser.HTML_STAR_BINDING, 0); }
		public TerminalNode HTML_INTERPOLATION() { return getToken(AngularParser.HTML_INTERPOLATION, 0); }
		public AngularAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularAttributeContext angularAttribute() throws RecognitionException {
		AngularAttributeContext _localctx = new AngularAttributeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_angularAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120832L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlClosingTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(AngularParser.TAG_OPEN, 0); }
		public TerminalNode HTML_SLASH() { return getToken(AngularParser.HTML_SLASH, 0); }
		public TerminalNode HTML_TAG_NAME() { return getToken(AngularParser.HTML_TAG_NAME, 0); }
		public TerminalNode HTML_TAG_CLOSE() { return getToken(AngularParser.HTML_TAG_CLOSE, 0); }
		public HtmlClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlClosingTagContext htmlClosingTag() throws RecognitionException {
		HtmlClosingTagContext _localctx = new HtmlClosingTagContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_htmlClosingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(TAG_OPEN);
			setState(1075);
			match(HTML_SLASH);
			setState(1076);
			match(HTML_TAG_NAME);
			setState(1077);
			match(HTML_TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode HTML_ATTRIBUTE_NAME() { return getToken(AngularParser.HTML_ATTRIBUTE_NAME, 0); }
		public TerminalNode HTML_EQUALS() { return getToken(AngularParser.HTML_EQUALS, 0); }
		public TerminalNode HTML_ATTRIBUTE_VALUE() { return getToken(AngularParser.HTML_ATTRIBUTE_VALUE, 0); }
		public TerminalNode HTML_PROPERTY_BINDING() { return getToken(AngularParser.HTML_PROPERTY_BINDING, 0); }
		public TerminalNode HTML_EVENT_BINDING() { return getToken(AngularParser.HTML_EVENT_BINDING, 0); }
		public TerminalNode HTML_TWO_WAY_BINDING() { return getToken(AngularParser.HTML_TWO_WAY_BINDING, 0); }
		public TerminalNode HTML_STAR_BINDING() { return getToken(AngularParser.HTML_STAR_BINDING, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_htmlAttribute);
		int _la;
		try {
			setState(1104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_ATTRIBUTE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1079);
				match(HTML_ATTRIBUTE_NAME);
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1080);
					match(HTML_EQUALS);
					setState(1081);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

				}
				break;
			case HTML_PROPERTY_BINDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				match(HTML_PROPERTY_BINDING);
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1085);
					match(HTML_EQUALS);
					setState(1086);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

				}
				break;
			case HTML_EVENT_BINDING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1089);
				match(HTML_EVENT_BINDING);
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1090);
					match(HTML_EQUALS);
					setState(1091);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

				}
				break;
			case HTML_TWO_WAY_BINDING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1094);
				match(HTML_TWO_WAY_BINDING);
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1095);
					match(HTML_EQUALS);
					setState(1096);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

				}
				break;
			case HTML_STAR_BINDING:
				enterOuterAlt(_localctx, 5);
				{
				setState(1099);
				match(HTML_STAR_BINDING);
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1100);
					match(HTML_EQUALS);
					setState(1101);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode HTML_INTERPOLATION() { return getToken(AngularParser.HTML_INTERPOLATION, 0); }
		public TerminalNode TEXT() { return getToken(AngularParser.TEXT, 0); }
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_htmlContent);
		try {
			setState(1109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1106);
				htmlElement();
				}
				break;
			case HTML_INTERPOLATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1107);
				match(HTML_INTERPOLATION);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1108);
				match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public StyleBlockContext styleBlock() {
			return getRuleContext(StyleBlockContext.class,0);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STYLE_OPEN) {
				{
				setState(1111);
				styleBlock();
				}
			}

			setState(1114);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StyleBlockContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(AngularParser.STYLE_OPEN, 0); }
		public CssRulesContext cssRules() {
			return getRuleContext(CssRulesContext.class,0);
		}
		public TerminalNode STYLE_CLOSE() { return getToken(AngularParser.STYLE_CLOSE, 0); }
		public StyleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleBlockContext styleBlock() throws RecognitionException {
		StyleBlockContext _localctx = new StyleBlockContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_styleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			match(STYLE_OPEN);
			setState(1117);
			cssRules();
			setState(1118);
			match(STYLE_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssRulesContext extends ParserRuleContext {
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public CssRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRulesContext cssRules() throws RecognitionException {
		CssRulesContext _localctx = new CssRulesContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_cssRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) {
				{
				{
				setState(1120);
				cssRule();
				}
				}
				setState(1125);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends ParserRuleContext {
		public CssSelectorContext cssSelector() {
			return getRuleContext(CssSelectorContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(AngularParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(AngularParser.CSS_RBRACE, 0); }
		public CssDeclarationsContext cssDeclarations() {
			return getRuleContext(CssDeclarationsContext.class,0);
		}
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_cssRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			cssSelector();
			setState(1127);
			match(CSS_LBRACE);
			setState(1129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_PROPERTY) {
				{
				setState(1128);
				cssDeclarations();
				}
			}

			setState(1131);
			match(CSS_RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorContext extends ParserRuleContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_cssSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			simpleSelector();
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) {
				{
				{
				setState(1134);
				simpleSelector();
				}
				}
				setState(1139);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends ParserRuleContext {
		public TerminalNode CSS_CLASS_SELECTOR() { return getToken(AngularParser.CSS_CLASS_SELECTOR, 0); }
		public TerminalNode CSS_ID_SELECTOR() { return getToken(AngularParser.CSS_ID_SELECTOR, 0); }
		public TerminalNode CSS_ELEMENT_SELECTOR() { return getToken(AngularParser.CSS_ELEMENT_SELECTOR, 0); }
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_simpleSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationsContext extends ParserRuleContext {
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public List<TerminalNode> CSS_SEMICOLON() { return getTokens(AngularParser.CSS_SEMICOLON); }
		public TerminalNode CSS_SEMICOLON(int i) {
			return getToken(AngularParser.CSS_SEMICOLON, i);
		}
		public CssDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationsContext cssDeclarations() throws RecognitionException {
		CssDeclarationsContext _localctx = new CssDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_cssDeclarations);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			cssDeclaration();
			setState(1147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1143);
					match(CSS_SEMICOLON);
					setState(1144);
					cssDeclaration();
					}
					} 
				}
				setState(1149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMICOLON) {
				{
				setState(1150);
				match(CSS_SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> CSS_PROPERTY() { return getTokens(AngularParser.CSS_PROPERTY); }
		public TerminalNode CSS_PROPERTY(int i) {
			return getToken(AngularParser.CSS_PROPERTY, i);
		}
		public TerminalNode CSS_COLON() { return getToken(AngularParser.CSS_COLON, 0); }
		public List<TerminalNode> CSS_VALUE() { return getTokens(AngularParser.CSS_VALUE); }
		public TerminalNode CSS_VALUE(int i) {
			return getToken(AngularParser.CSS_VALUE, i);
		}
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_cssDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			match(CSS_PROPERTY);
			setState(1154);
			match(CSS_COLON);
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_PROPERTY) {
				{
				setState(1155);
				match(CSS_PROPERTY);
				}
			}

			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1158);
				match(CSS_VALUE);
				}
				break;
			}
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_VALUE) {
				{
				setState(1161);
				match(CSS_VALUE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 23);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0080\u048d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u009a\b\u0000"+
		"\n\u0000\f\u0000\u009d\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u00a3\b\u0001\n\u0001\f\u0001\u00a6\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00af\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00b7\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00bf\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00c5\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00cb\b\u0004"+
		"\u0005\u0004\u00cd\b\u0004\n\u0004\f\u0004\u00d0\t\u0004\u0003\u0004\u00d2"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00dd\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00e4"+
		"\b\u0005\u0005\u0005\u00e6\b\u0005\n\u0005\f\u0005\u00e9\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00fe\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0106\b\t\n\t\f\t\u0109"+
		"\t\t\u0003\t\u010b\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0003\t\u0113\b\t\u0001\n\u0003\n\u0116\b\n\u0001\n\u0003\n\u0119\b\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u011e\b\n\u0003\n\u0120\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0125\b\n\u0001\u000b\u0003\u000b\u0128\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u012e\b\u000b\u0003"+
		"\u000b\u0130\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0135"+
		"\b\u000b\u0001\f\u0003\f\u0138\b\f\u0001\f\u0003\f\u013b\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0140\b\f\u0003\f\u0142\b\f\u0001\f\u0001\f\u0003\f"+
		"\u0146\b\f\u0001\f\u0005\f\u0149\b\f\n\f\f\f\u014c\t\f\u0001\f\u0003\f"+
		"\u014f\b\f\u0001\f\u0003\f\u0152\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u0157"+
		"\b\f\u0003\f\u0159\b\f\u0001\f\u0003\f\u015c\b\f\u0001\f\u0005\f\u015f"+
		"\b\f\n\f\f\f\u0162\t\f\u0001\f\u0001\f\u0001\f\u0003\f\u0167\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u016d\b\f\n\f\f\f\u0170\t\f\u0003\f"+
		"\u0172\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u017b\b\f\u0001\r\u0001\r\u0005\r\u017f\b\r\n\r\f\r\u0182\t\r\u0001"+
		"\r\u0003\r\u0185\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u018d\b\u000e\n\u000e\f\u000e\u0190\t\u000e\u0003"+
		"\u000e\u0192\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u019b\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u01a4\b\u000f\u0001\u000f\u0003\u000f\u01a7\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0003\u0011\u01ac\b\u0011\u0001\u0011\u0003\u0011"+
		"\u01af\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01b4\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u01b8\b\u0011\n\u0011\f\u0011"+
		"\u01bb\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u01c7\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01cd\b\u0013\u0003\u0013\u01cf\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u01da\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01e4"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0003\u0017\u01ec\b\u0017\u0001\u0017\u0003\u0017\u01ef\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01f4\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u01f8\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u01fc\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0003\u0019\u0203\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0208\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u020d\b"+
		"\u0019\u0001\u0019\u0003\u0019\u0210\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0215\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0219"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0224\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0228\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u0230\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0235\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u023b\b\u001d\n\u001d\f\u001d"+
		"\u023e\t\u001d\u0003\u001d\u0240\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0247\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u024c\b\u001e\u0005\u001e\u024e\b\u001e"+
		"\n\u001e\f\u001e\u0251\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0259\b\u001f\n\u001f\f\u001f"+
		"\u025c\t\u001f\u0003\u001f\u025e\b\u001f\u0001\u001f\u0003\u001f\u0261"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0003 \u0266\b \u0001 \u0001 "+
		"\u0003 \u026a\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0272"+
		"\b \u0001!\u0001!\u0003!\u0276\b!\u0001!\u0001!\u0003!\u027a\b!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0282\b!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u02a2\b\"\u0001\"\u0001\"\u0003\"\u02a6\b\"\u0003\"\u02a8\b"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u02bf\b\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u02c4\b\"\n\"\f\"\u02c7\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0005#\u02cf\b#\n#\f#\u02d2\t#\u0001#\u0003#\u02d5\b#\u0001#\u0001#"+
		"\u0003#\u02d9\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001&\u0003&\u02e5\b&\u0001&\u0001&\u0003&\u02e9\b&\u0001&\u0001"+
		"&\u0003&\u02ed\b&\u0001&\u0001&\u0003&\u02f1\b&\u0001&\u0005&\u02f4\b"+
		"&\n&\f&\u02f7\t&\u0001&\u0001&\u0001\'\u0001\'\u0003\'\u02fd\b\'\u0001"+
		"\'\u0001\'\u0003\'\u0301\b\'\u0001\'\u0001\'\u0003\'\u0305\b\'\u0001\'"+
		"\u0001\'\u0003\'\u0309\b\'\u0001(\u0001(\u0003(\u030d\b(\u0001(\u0001"+
		"(\u0003(\u0311\b(\u0001)\u0003)\u0314\b)\u0001)\u0001)\u0003)\u0318\b"+
		")\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0003*\u0321\b*\u0001"+
		"*\u0001*\u0003*\u0325\b*\u0001*\u0001*\u0003*\u0329\b*\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0003-\u0339\b-\u0001-\u0003-\u033c\b-\u0001-\u0003-\u033f\b"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0005.\u0348\b.\n."+
		"\f.\u034b\t.\u0003.\u034d\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u0354\b.\u0001.\u0005.\u0357\b.\n.\f.\u035a\t.\u0001.\u0001.\u0001."+
		"\u0003.\u035f\b.\u0001.\u0001.\u0001.\u0001.\u0005.\u0365\b.\n.\f.\u0368"+
		"\t.\u0003.\u036a\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0371\b"+
		".\u0001.\u0005.\u0374\b.\n.\f.\u0377\t.\u0003.\u0379\b.\u0001/\u0001/"+
		"\u0003/\u037d\b/\u00010\u00010\u00010\u00010\u00010\u00030\u0384\b0\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0005"+
		"1\u0390\b1\n1\f1\u0393\t1\u00031\u0395\b1\u00011\u00031\u0398\b1\u0001"+
		"1\u00011\u00012\u00012\u00012\u00012\u00052\u03a0\b2\n2\f2\u03a3\t2\u0003"+
		"2\u03a5\b2\u00012\u00032\u03a8\b2\u00012\u00012\u00032\u03ac\b2\u0001"+
		"2\u00012\u00012\u00012\u00052\u03b2\b2\n2\f2\u03b5\t2\u00032\u03b7\b2"+
		"\u00012\u00032\u03ba\b2\u00012\u00012\u00032\u03be\b2\u00032\u03c0\b2"+
		"\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0003"+
		"3\u03cb\b3\u00014\u00014\u00015\u00035\u03d0\b5\u00016\u00016\u00016\u0001"+
		"6\u00036\u03d6\b6\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u03de"+
		"\b7\u00017\u00037\u03e1\b7\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00037\u03eb\b7\u00018\u00038\u03ee\b8\u00018\u00018\u00018\u0001"+
		"8\u00058\u03f4\b8\n8\f8\u03f7\t8\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u00039\u03ff\b9\u00019\u00039\u0402\b9\u00019\u00019\u00019\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001<\u0001<\u0001<\u0003<\u0418\b<\u0001<\u0001<\u0005"+
		"<\u041c\b<\n<\f<\u041f\t<\u0001<\u0001<\u0001<\u0001<\u0003<\u0425\b<"+
		"\u0001<\u0003<\u0428\b<\u0001=\u0001=\u0005=\u042c\b=\n=\f=\u042f\t=\u0001"+
		">\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0003"+
		"@\u043b\b@\u0001@\u0001@\u0001@\u0003@\u0440\b@\u0001@\u0001@\u0001@\u0003"+
		"@\u0445\b@\u0001@\u0001@\u0001@\u0003@\u044a\b@\u0001@\u0001@\u0001@\u0003"+
		"@\u044f\b@\u0003@\u0451\b@\u0001A\u0001A\u0001A\u0003A\u0456\bA\u0001"+
		"B\u0003B\u0459\bB\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001D\u0005"+
		"D\u0462\bD\nD\fD\u0465\tD\u0001E\u0001E\u0001E\u0003E\u046a\bE\u0001E"+
		"\u0001E\u0001F\u0001F\u0005F\u0470\bF\nF\fF\u0473\tF\u0001G\u0001G\u0001"+
		"H\u0001H\u0001H\u0005H\u047a\bH\nH\fH\u047d\tH\u0001H\u0003H\u0480\bH"+
		"\u0001I\u0001I\u0001I\u0003I\u0485\bI\u0001I\u0003I\u0488\bI\u0001I\u0003"+
		"I\u048b\bI\u0001I\u0000\u0001DJ\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0000\t\u0002\u000088NU\u0002\u0000==\u007f\u007f\u0001\u0000"+
		"AB\u0003\u00001244II\u0001\u0000XY\u0002\u0000,,~~\u0002\u0000]^`g\u0002"+
		"\u0000\u000b\f\u000e\u0010\u0001\u0000\u0016\u0018\u0534\u0000\u009b\u0001"+
		"\u0000\u0000\u0000\u0002\u00a0\u0001\u0000\u0000\u0000\u0004\u00ae\u0001"+
		"\u0000\u0000\u0000\u0006\u00be\u0001\u0000\u0000\u0000\b\u00c0\u0001\u0000"+
		"\u0000\u0000\n\u00d5\u0001\u0000\u0000\u0000\f\u00ed\u0001\u0000\u0000"+
		"\u0000\u000e\u00f1\u0001\u0000\u0000\u0000\u0010\u00fd\u0001\u0000\u0000"+
		"\u0000\u0012\u0112\u0001\u0000\u0000\u0000\u0014\u0124\u0001\u0000\u0000"+
		"\u0000\u0016\u0134\u0001\u0000\u0000\u0000\u0018\u017a\u0001\u0000\u0000"+
		"\u0000\u001a\u017c\u0001\u0000\u0000\u0000\u001c\u0188\u0001\u0000\u0000"+
		"\u0000\u001e\u01a6\u0001\u0000\u0000\u0000 \u01a8\u0001\u0000\u0000\u0000"+
		"\"\u01ab\u0001\u0000\u0000\u0000$\u01c6\u0001\u0000\u0000\u0000&\u01c8"+
		"\u0001\u0000\u0000\u0000(\u01d2\u0001\u0000\u0000\u0000*\u01d6\u0001\u0000"+
		"\u0000\u0000,\u01e0\u0001\u0000\u0000\u0000.\u01ee\u0001\u0000\u0000\u0000"+
		"0\u01ff\u0001\u0000\u0000\u00002\u0218\u0001\u0000\u0000\u00004\u0223"+
		"\u0001\u0000\u0000\u00006\u0227\u0001\u0000\u0000\u00008\u022d\u0001\u0000"+
		"\u0000\u0000:\u0231\u0001\u0000\u0000\u0000<\u0243\u0001\u0000\u0000\u0000"+
		">\u0254\u0001\u0000\u0000\u0000@\u0271\u0001\u0000\u0000\u0000B\u0281"+
		"\u0001\u0000\u0000\u0000D\u02a7\u0001\u0000\u0000\u0000F\u02d8\u0001\u0000"+
		"\u0000\u0000H\u02da\u0001\u0000\u0000\u0000J\u02e0\u0001\u0000\u0000\u0000"+
		"L\u02e4\u0001\u0000\u0000\u0000N\u02fa\u0001\u0000\u0000\u0000P\u030a"+
		"\u0001\u0000\u0000\u0000R\u0313\u0001\u0000\u0000\u0000T\u031c\u0001\u0000"+
		"\u0000\u0000V\u032d\u0001\u0000\u0000\u0000X\u0333\u0001\u0000\u0000\u0000"+
		"Z\u0336\u0001\u0000\u0000\u0000\\\u0378\u0001\u0000\u0000\u0000^\u037c"+
		"\u0001\u0000\u0000\u0000`\u0383\u0001\u0000\u0000\u0000b\u0385\u0001\u0000"+
		"\u0000\u0000d\u03bf\u0001\u0000\u0000\u0000f\u03ca\u0001\u0000\u0000\u0000"+
		"h\u03cc\u0001\u0000\u0000\u0000j\u03cf\u0001\u0000\u0000\u0000l\u03d5"+
		"\u0001\u0000\u0000\u0000n\u03ea\u0001\u0000\u0000\u0000p\u03ed\u0001\u0000"+
		"\u0000\u0000r\u03fa\u0001\u0000\u0000\u0000t\u0408\u0001\u0000\u0000\u0000"+
		"v\u040e\u0001\u0000\u0000\u0000x\u0427\u0001\u0000\u0000\u0000z\u042d"+
		"\u0001\u0000\u0000\u0000|\u0430\u0001\u0000\u0000\u0000~\u0432\u0001\u0000"+
		"\u0000\u0000\u0080\u0450\u0001\u0000\u0000\u0000\u0082\u0455\u0001\u0000"+
		"\u0000\u0000\u0084\u0458\u0001\u0000\u0000\u0000\u0086\u045c\u0001\u0000"+
		"\u0000\u0000\u0088\u0463\u0001\u0000\u0000\u0000\u008a\u0466\u0001\u0000"+
		"\u0000\u0000\u008c\u046d\u0001\u0000\u0000\u0000\u008e\u0474\u0001\u0000"+
		"\u0000\u0000\u0090\u0476\u0001\u0000\u0000\u0000\u0092\u0481\u0001\u0000"+
		"\u0000\u0000\u0094\u009a\u0003x<\u0000\u0095\u009a\u0003\u0086C\u0000"+
		"\u0096\u009a\u0003\u0002\u0001\u0000\u0097\u009a\u0003l6\u0000\u0098\u009a"+
		"\u0003\u0004\u0002\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099\u0095"+
		"\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0000\u0000\u0001\u009f\u0001"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a4\u0005\u0003\u0000\u0000\u00a1\u00a3"+
		"\u0003\u0004\u0002\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u001f\u0000\u0000\u00a8\u0003"+
		"\u0001\u0000\u0000\u0000\u00a9\u00af\u0003\u0006\u0003\u0000\u00aa\u00af"+
		"\u0003\n\u0005\u0000\u00ab\u00af\u0003\"\u0011\u0000\u00ac\u00af\u0003"+
		"\u0014\n\u0000\u00ad\u00af\u0003B!\u0000\u00ae\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00ae\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000"+
		"\u0000\u00af\u0005\u0001\u0000\u0000\u0000\u00b0\u00b6\u00056\u0000\u0000"+
		"\u00b1\u00b7\u0005~\u0000\u0000\u00b2\u00b3\u0005Z\u0000\u0000\u00b3\u00b4"+
		"\u00059\u0000\u0000\u00b4\u00b7\u0005~\u0000\u0000\u00b5\u00b7\u0003\b"+
		"\u0004\u0000\u00b6\u00b1\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005:\u0000\u0000\u00b9\u00ba\u0005v\u0000\u0000"+
		"\u00ba\u00bf\u0003j5\u0000\u00bb\u00bc\u00056\u0000\u0000\u00bc\u00bd"+
		"\u0005v\u0000\u0000\u00bd\u00bf\u0003j5\u0000\u00be\u00b0\u0001\u0000"+
		"\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf\u0007\u0001\u0000"+
		"\u0000\u0000\u00c0\u00d1\u0005l\u0000\u0000\u00c1\u00c4\u0005~\u0000\u0000"+
		"\u00c2\u00c3\u00059\u0000\u0000\u00c3\u00c5\u0005~\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00ce"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005n\u0000\u0000\u00c7\u00ca\u0005"+
		"~\u0000\u0000\u00c8\u00c9\u00059\u0000\u0000\u00c9\u00cb\u0005~\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00c6\u0001\u0000\u0000"+
		"\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00c1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0005m\u0000\u0000\u00d4\t\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0005@\u0000\u0000\u00d6\u00d7\u0005h\u0000\u0000\u00d7\u00dc"+
		"\u0005l\u0000\u0000\u00d8\u00dd\u0003\f\u0006\u0000\u00d9\u00dd\u0003"+
		"\u000e\u0007\u0000\u00da\u00dd\u0003\u0010\b\u0000\u00db\u00dd\u0003\u0012"+
		"\t\u0000\u00dc\u00d8\u0001\u0000\u0000\u0000\u00dc\u00d9\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e7\u0001\u0000\u0000\u0000\u00de\u00e3\u0005n\u0000\u0000"+
		"\u00df\u00e4\u0003\f\u0006\u0000\u00e0\u00e4\u0003\u000e\u0007\u0000\u00e1"+
		"\u00e4\u0003\u0010\b\u0000\u00e2\u00e4\u0003\u0012\t\u0000\u00e3\u00df"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e5\u00de\u0001\u0000\u0000\u0000\u00e6\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005m\u0000\u0000\u00eb\u00ec\u0005"+
		"i\u0000\u0000\u00ec\u000b\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005C\u0000"+
		"\u0000\u00ee\u00ef\u0005p\u0000\u0000\u00ef\u00f0\u0005v\u0000\u0000\u00f0"+
		"\r\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005D\u0000\u0000\u00f2\u00f3"+
		"\u0005p\u0000\u0000\u00f3\u00f4\u0005w\u0000\u0000\u00f4\u000f\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005E\u0000\u0000\u00f6\u00f7\u0005p\u0000\u0000"+
		"\u00f7\u00f8\u0005j\u0000\u0000\u00f8\u00f9\u0005v\u0000\u0000\u00f9\u00fe"+
		"\u0005k\u0000\u0000\u00fa\u00fb\u0005F\u0000\u0000\u00fb\u00fc\u0005p"+
		"\u0000\u0000\u00fc\u00fe\u0005v\u0000\u0000\u00fd\u00f5\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000\u00fe\u0011\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u00057\u0000\u0000\u0100\u0101\u0005p\u0000\u0000\u0101"+
		"\u010a\u0005j\u0000\u0000\u0102\u0107\u0005~\u0000\u0000\u0103\u0104\u0005"+
		"n\u0000\u0000\u0104\u0106\u0005~\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u0102\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"+
		"\u0000\u010c\u0113\u0005k\u0000\u0000\u010d\u010e\u00057\u0000\u0000\u010e"+
		"\u010f\u0005p\u0000\u0000\u010f\u0110\u0005j\u0000\u0000\u0110\u0111\u0005"+
		"~\u0000\u0000\u0111\u0113\u0005k\u0000\u0000\u0112\u00ff\u0001\u0000\u0000"+
		"\u0000\u0112\u010d\u0001\u0000\u0000\u0000\u0113\u0013\u0001\u0000\u0000"+
		"\u0000\u0114\u0116\u0005/\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000"+
		"\u0117\u0119\u0005~\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\u011f\u0003\u001c\u000e\u0000\u011b\u011d\u0005p\u0000\u0000\u011c\u011e"+
		"\u0005~\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u011b\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0003\u001a\r\u0000\u0122\u0125\u0001\u0000"+
		"\u0000\u0000\u0123\u0125\u0003\u0018\f\u0000\u0124\u0115\u0001\u0000\u0000"+
		"\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0015\u0001\u0000\u0000"+
		"\u0000\u0126\u0128\u0003 \u0010\u0000\u0127\u0126\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0005~\u0000\u0000\u012a\u012f\u0003\u001c\u000e\u0000\u012b"+
		"\u012d\u0005p\u0000\u0000\u012c\u012e\u0005~\u0000\u0000\u012d\u012c\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0130\u0001"+
		"\u0000\u0000\u0000\u012f\u012b\u0001\u0000\u0000\u0000\u012f\u0130\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0003"+
		"\u001a\r\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0135\u0003\u0018"+
		"\f\u0000\u0134\u0127\u0001\u0000\u0000\u0000\u0134\u0133\u0001\u0000\u0000"+
		"\u0000\u0135\u0017\u0001\u0000\u0000\u0000\u0136\u0138\u0003 \u0010\u0000"+
		"\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000"+
		"\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u013b\u0005~\u0000\u0000\u013a"+
		"\u0139\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0001\u0000\u0000\u0000\u013c\u0141\u0003\u001c\u000e\u0000\u013d"+
		"\u013f\u0005p\u0000\u0000\u013e\u0140\u0005~\u0000\u0000\u013f\u013e\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0142\u0001"+
		"\u0000\u0000\u0000\u0141\u013d\u0001\u0000\u0000\u0000\u0141\u0142\u0001"+
		"\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0005"+
		"W\u0000\u0000\u0144\u0146\u0005l\u0000\u0000\u0145\u0144\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u014a\u0001\u0000\u0000"+
		"\u0000\u0147\u0149\u0003B!\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149"+
		"\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014d\u014f\u0005m\u0000\u0000\u014e\u014d"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u017b"+
		"\u0001\u0000\u0000\u0000\u0150\u0152\u0005~\u0000\u0000\u0151\u0150\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0001"+
		"\u0000\u0000\u0000\u0153\u0158\u0003\u001c\u000e\u0000\u0154\u0156\u0005"+
		"p\u0000\u0000\u0155\u0157\u0005~\u0000\u0000\u0156\u0155\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000"+
		"\u0000\u0158\u0154\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000"+
		"\u0000\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u015c\u0005l\u0000\u0000"+
		"\u015b\u015a\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000"+
		"\u015c\u0160\u0001\u0000\u0000\u0000\u015d\u015f\u0003B!\u0000\u015e\u015d"+
		"\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u015e"+
		"\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0163"+
		"\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0005m\u0000\u0000\u0164\u017b\u0001\u0000\u0000\u0000\u0165\u0167\u0005"+
		"U\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0171\u0005h\u0000"+
		"\u0000\u0169\u016e\u0005~\u0000\u0000\u016a\u016b\u0005n\u0000\u0000\u016b"+
		"\u016d\u0005~\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u0170"+
		"\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e"+
		"\u0001\u0000\u0000\u0000\u0171\u0169\u0001\u0000\u0000\u0000\u0171\u0172"+
		"\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174"+
		"\u0005i\u0000\u0000\u0174\u0175\u0005W\u0000\u0000\u0175\u017b\u0003\u001a"+
		"\r\u0000\u0176\u0177\u0005h\u0000\u0000\u0177\u0178\u0005i\u0000\u0000"+
		"\u0178\u0179\u0005W\u0000\u0000\u0179\u017b\u0003\u001a\r\u0000\u017a"+
		"\u0137\u0001\u0000\u0000\u0000\u017a\u0151\u0001\u0000\u0000\u0000\u017a"+
		"\u0166\u0001\u0000\u0000\u0000\u017a\u0176\u0001\u0000\u0000\u0000\u017b"+
		"\u0019\u0001\u0000\u0000\u0000\u017c\u0180\u0005l\u0000\u0000\u017d\u017f"+
		"\u0003B!\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000"+
		"\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000"+
		"\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000"+
		"\u0000\u0000\u0183\u0185\u0003Z-\u0000\u0184\u0183\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0005m\u0000\u0000\u0187\u001b\u0001\u0000\u0000\u0000\u0188"+
		"\u0191\u0005h\u0000\u0000\u0189\u018e\u0003\u001e\u000f\u0000\u018a\u018b"+
		"\u0005n\u0000\u0000\u018b\u018d\u0003\u001e\u000f\u0000\u018c\u018a\u0001"+
		"\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0192\u0001"+
		"\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0189\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0001"+
		"\u0000\u0000\u0000\u0193\u0194\u0005i\u0000\u0000\u0194\u001d\u0001\u0000"+
		"\u0000\u0000\u0195\u0196\u0005~\u0000\u0000\u0196\u0197\u0005p\u0000\u0000"+
		"\u0197\u019a\u0005~\u0000\u0000\u0198\u0199\u0005V\u0000\u0000\u0199\u019b"+
		"\u0003@ \u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u01a7\u0001\u0000\u0000\u0000\u019c\u01a7\u0005~\u0000"+
		"\u0000\u019d\u019e\u0003 \u0010\u0000\u019e\u019f\u0005~\u0000\u0000\u019f"+
		"\u01a0\u0005p\u0000\u0000\u01a0\u01a3\u0005~\u0000\u0000\u01a1\u01a2\u0005"+
		"V\u0000\u0000\u01a2\u01a4\u0003@ \u0000\u01a3\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a7\u0005~\u0000\u0000\u01a6\u0195\u0001\u0000\u0000\u0000"+
		"\u01a6\u019c\u0001\u0000\u0000\u0000\u01a6\u019d\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7\u001f\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0007\u0000\u0000\u0000\u01a9!\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ac\u0003 \u0010\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u01af"+
		"\u00055\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae\u01af\u0001"+
		"\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b3\u0005"+
		"~\u0000\u0000\u01b1\u01b2\u0007\u0001\u0000\u0000\u01b2\u01b4\u0005~\u0000"+
		"\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b9\u0005l\u0000\u0000"+
		"\u01b6\u01b8\u0003$\u0012\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8"+
		"\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb"+
		"\u01b9\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005m\u0000\u0000\u01bd#\u0001"+
		"\u0000\u0000\u0000\u01be\u01c7\u0003*\u0015\u0000\u01bf\u01c7\u0003,\u0016"+
		"\u0000\u01c0\u01c7\u0003\u0016\u000b\u0000\u01c1\u01c7\u00032\u0019\u0000"+
		"\u01c2\u01c7\u0003.\u0017\u0000\u01c3\u01c7\u00036\u001b\u0000\u01c4\u01c7"+
		"\u0003(\u0014\u0000\u01c5\u01c7\u0003&\u0013\u0000\u01c6\u01be\u0001\u0000"+
		"\u0000\u0000\u01c6\u01bf\u0001\u0000\u0000\u0000\u01c6\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c1\u0001\u0000\u0000\u0000\u01c6\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7%\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0007\u0002\u0000\u0000\u01c9\u01ce\u0003\u001c\u000e"+
		"\u0000\u01ca\u01cc\u0005p\u0000\u0000\u01cb\u01cd\u0005~\u0000\u0000\u01cc"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd"+
		"\u01cf\u0001\u0000\u0000\u0000\u01ce\u01ca\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0003\u001a\r\u0000\u01d1\'\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u00053\u0000\u0000\u01d3\u01d4\u0003\u001c\u000e\u0000\u01d4\u01d5\u0003"+
		"\u001a\r\u0000\u01d5)\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005>\u0000"+
		"\u0000\u01d7\u01d9\u0005h\u0000\u0000\u01d8\u01da\u0003@ \u0000\u01d9"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u0005i\u0000\u0000\u01dc\u01dd"+
		"\u00034\u001a\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01df\u0003"+
		"j5\u0000\u01df+\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005?\u0000\u0000"+
		"\u01e1\u01e3\u0005h\u0000\u0000\u01e2\u01e4\u0003@ \u0000\u01e3\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005i\u0000\u0000\u01e6\u01e7\u0003"+
		"6\u001b\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9\u0003j5"+
		"\u0000\u01e9-\u0001\u0000\u0000\u0000\u01ea\u01ec\u0003 \u0010\u0000\u01eb"+
		"\u01ea\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ef\u00030\u0018\u0000\u01ee\u01eb"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f3\u0005~\u0000\u0000\u01f1\u01f2\u0005"+
		"p\u0000\u0000\u01f2\u01f4\u0003D\"\u0000\u01f3\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f6\u0005V\u0000\u0000\u01f6\u01f8\u0003D\"\u0000\u01f7"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8"+
		"\u01fb\u0001\u0000\u0000\u0000\u01f9\u01fa\u00059\u0000\u0000\u01fa\u01fc"+
		"\u0005~\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe\u0003"+
		"j5\u0000\u01fe/\u0001\u0000\u0000\u0000\u01ff\u0200\u0007\u0003\u0000"+
		"\u0000\u02001\u0001\u0000\u0000\u0000\u0201\u0203\u0003 \u0010\u0000\u0202"+
		"\u0201\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203"+
		"\u0204\u0001\u0000\u0000\u0000\u0204\u0207\u00034\u001a\u0000\u0205\u0206"+
		"\u0005V\u0000\u0000\u0206\u0208\u0003D\"\u0000\u0207\u0205\u0001\u0000"+
		"\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000"+
		"\u0000\u0000\u0209\u020a\u0003j5\u0000\u020a\u0219\u0001\u0000\u0000\u0000"+
		"\u020b\u020d\u0003 \u0010\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020c"+
		"\u020d\u0001\u0000\u0000\u0000\u020d\u020f\u0001\u0000\u0000\u0000\u020e"+
		"\u0210\u00030\u0018\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210"+
		"\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0214"+
		"\u00034\u001a\u0000\u0212\u0213\u0005V\u0000\u0000\u0213\u0215\u0003D"+
		"\"\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000"+
		"\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0217\u0003j5\u0000\u0217"+
		"\u0219\u0001\u0000\u0000\u0000\u0218\u0202\u0001\u0000\u0000\u0000\u0218"+
		"\u020c\u0001\u0000\u0000\u0000\u02193\u0001\u0000\u0000\u0000\u021a\u021b"+
		"\u0005~\u0000\u0000\u021b\u021c\u0005p\u0000\u0000\u021c\u0224\u0003D"+
		"\"\u0000\u021d\u0224\u0003\u0012\t\u0000\u021e\u021f\u0005~\u0000\u0000"+
		"\u021f\u0220\u0005r\u0000\u0000\u0220\u0221\u0005p\u0000\u0000\u0221\u0224"+
		"\u0003D\"\u0000\u0222\u0224\u0003\u0012\t\u0000\u0223\u021a\u0001\u0000"+
		"\u0000\u0000\u0223\u021d\u0001\u0000\u0000\u0000\u0223\u021e\u0001\u0000"+
		"\u0000\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u02245\u0001\u0000\u0000"+
		"\u0000\u0225\u0228\u00034\u001a\u0000\u0226\u0228\u00038\u001c\u0000\u0227"+
		"\u0225\u0001\u0000\u0000\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0001\u0000\u0000\u0000\u0229\u022a\u0005V\u0000\u0000\u022a\u022b"+
		"\u0003:\u001d\u0000\u022b\u022c\u0003j5\u0000\u022c7\u0001\u0000\u0000"+
		"\u0000\u022d\u022f\u0005~\u0000\u0000\u022e\u0230\u0003<\u001e\u0000\u022f"+
		"\u022e\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230"+
		"9\u0001\u0000\u0000\u0000\u0231\u0232\u0005;\u0000\u0000\u0232\u0234\u0005"+
		"~\u0000\u0000\u0233\u0235\u0003<\u001e\u0000\u0234\u0233\u0001\u0000\u0000"+
		"\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000"+
		"\u0000\u0236\u023f\u0005h\u0000\u0000\u0237\u023c\u0003D\"\u0000\u0238"+
		"\u0239\u0005n\u0000\u0000\u0239\u023b\u0003D\"\u0000\u023a\u0238\u0001"+
		"\u0000\u0000\u0000\u023b\u023e\u0001\u0000\u0000\u0000\u023c\u023a\u0001"+
		"\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u0240\u0001"+
		"\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023f\u0237\u0001"+
		"\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0241\u0001"+
		"\u0000\u0000\u0000\u0241\u0242\u0005i\u0000\u0000\u0242;\u0001\u0000\u0000"+
		"\u0000\u0243\u0244\u0005e\u0000\u0000\u0244\u0246\u0005~\u0000\u0000\u0245"+
		"\u0247\u0003d2\u0000\u0246\u0245\u0001\u0000\u0000\u0000\u0246\u0247\u0001"+
		"\u0000\u0000\u0000\u0247\u024f\u0001\u0000\u0000\u0000\u0248\u0249\u0005"+
		"n\u0000\u0000\u0249\u024b\u0005~\u0000\u0000\u024a\u024c\u0003d2\u0000"+
		"\u024b\u024a\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000"+
		"\u024c\u024e\u0001\u0000\u0000\u0000\u024d\u0248\u0001\u0000\u0000\u0000"+
		"\u024e\u0251\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000"+
		"\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0252\u0001\u0000\u0000\u0000"+
		"\u0251\u024f\u0001\u0000\u0000\u0000\u0252\u0253\u0005d\u0000\u0000\u0253"+
		"=\u0001\u0000\u0000\u0000\u0254\u025d\u0005l\u0000\u0000\u0255\u025a\u0003"+
		"4\u001a\u0000\u0256\u0257\u0005n\u0000\u0000\u0257\u0259\u00034\u001a"+
		"\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0259\u025c\u0001\u0000\u0000"+
		"\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000"+
		"\u0000\u025b\u025e\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000"+
		"\u0000\u025d\u0255\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000"+
		"\u0000\u025e\u0260\u0001\u0000\u0000\u0000\u025f\u0261\u0005n\u0000\u0000"+
		"\u0260\u025f\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000"+
		"\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0263\u0005m\u0000\u0000\u0263"+
		"?\u0001\u0000\u0000\u0000\u0264\u0266\u0007\u0004\u0000\u0000\u0265\u0264"+
		"\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u0001\u0000\u0000\u0000\u0267\u0272\u0005t\u0000\u0000\u0268\u026a\u0007"+
		"\u0004\u0000\u0000\u0269\u0268\u0001\u0000\u0000\u0000\u0269\u026a\u0001"+
		"\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u0272\u0005"+
		"u\u0000\u0000\u026c\u0272\u0005v\u0000\u0000\u026d\u0272\u0005w\u0000"+
		"\u0000\u026e\u0272\u0005y\u0000\u0000\u026f\u0272\u0005x\u0000\u0000\u0270"+
		"\u0272\u0005<\u0000\u0000\u0271\u0265\u0001\u0000\u0000\u0000\u0271\u0269"+
		"\u0001\u0000\u0000\u0000\u0271\u026c\u0001\u0000\u0000\u0000\u0271\u026d"+
		"\u0001\u0000\u0000\u0000\u0271\u026e\u0001\u0000\u0000\u0000\u0271\u026f"+
		"\u0001\u0000\u0000\u0000\u0271\u0270\u0001\u0000\u0000\u0000\u0272A\u0001"+
		"\u0000\u0000\u0000\u0273\u0282\u0003.\u0017\u0000\u0274\u0276\u0005l\u0000"+
		"\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000"+
		"\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0279\u0003.\u0017\u0000"+
		"\u0278\u027a\u0005m\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u0279"+
		"\u027a\u0001\u0000\u0000\u0000\u027a\u0282\u0001\u0000\u0000\u0000\u027b"+
		"\u0282\u00036\u001b\u0000\u027c\u0282\u0003F#\u0000\u027d\u0282\u0003"+
		"T*\u0000\u027e\u0282\u0003V+\u0000\u027f\u0282\u0003l6\u0000\u0280\u0282"+
		"\u0003X,\u0000\u0281\u0273\u0001\u0000\u0000\u0000\u0281\u0275\u0001\u0000"+
		"\u0000\u0000\u0281\u027b\u0001\u0000\u0000\u0000\u0281\u027c\u0001\u0000"+
		"\u0000\u0000\u0281\u027d\u0001\u0000\u0000\u0000\u0281\u027e\u0001\u0000"+
		"\u0000\u0000\u0281\u027f\u0001\u0000\u0000\u0000\u0281\u0280\u0001\u0000"+
		"\u0000\u0000\u0282C\u0001\u0000\u0000\u0000\u0283\u0284\u0006\"\uffff"+
		"\uffff\u0000\u0284\u02a8\u0003>\u001f\u0000\u0285\u02a8\u00036\u001b\u0000"+
		"\u0286\u02a8\u00038\u001c\u0000\u0287\u02a8\u0003\u0018\f\u0000\u0288"+
		"\u02a8\u0005<\u0000\u0000\u0289\u02a8\u0005M\u0000\u0000\u028a\u02a8\u0005"+
		"~\u0000\u0000\u028b\u028c\u0005~\u0000\u0000\u028c\u028d\u0005X\u0000"+
		"\u0000\u028d\u02a8\u0005X\u0000\u0000\u028e\u028f\u0005~\u0000\u0000\u028f"+
		"\u0290\u0005Y\u0000\u0000\u0290\u02a8\u0005Y\u0000\u0000\u0291\u02a8\u0003"+
		"@ \u0000\u0292\u02a8\u0003\\.\u0000\u0293\u0294\u0005e\u0000\u0000\u0294"+
		"\u0295\u0003D\"\u0000\u0295\u0296\u0005d\u0000\u0000\u0296\u0297\u0005"+
		"~\u0000\u0000\u0297\u02a8\u0001\u0000\u0000\u0000\u0298\u0299\u0005h\u0000"+
		"\u0000\u0299\u029a\u0003D\"\u0000\u029a\u029b\u00059\u0000\u0000\u029b"+
		"\u029c\u0005~\u0000\u0000\u029c\u029d\u0005i\u0000\u0000\u029d\u02a8\u0001"+
		"\u0000\u0000\u0000\u029e\u02a8\u0003^/\u0000\u029f\u02a8\u0003Z-\u0000"+
		"\u02a0\u02a2\u0005l\u0000\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3"+
		"\u02a5\u0003Z-\u0000\u02a4\u02a6\u0005m\u0000\u0000\u02a5\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a8\u0001"+
		"\u0000\u0000\u0000\u02a7\u0283\u0001\u0000\u0000\u0000\u02a7\u0285\u0001"+
		"\u0000\u0000\u0000\u02a7\u0286\u0001\u0000\u0000\u0000\u02a7\u0287\u0001"+
		"\u0000\u0000\u0000\u02a7\u0288\u0001\u0000\u0000\u0000\u02a7\u0289\u0001"+
		"\u0000\u0000\u0000\u02a7\u028a\u0001\u0000\u0000\u0000\u02a7\u028b\u0001"+
		"\u0000\u0000\u0000\u02a7\u028e\u0001\u0000\u0000\u0000\u02a7\u0291\u0001"+
		"\u0000\u0000\u0000\u02a7\u0292\u0001\u0000\u0000\u0000\u02a7\u0293\u0001"+
		"\u0000\u0000\u0000\u02a7\u0298\u0001\u0000\u0000\u0000\u02a7\u029e\u0001"+
		"\u0000\u0000\u0000\u02a7\u029f\u0001\u0000\u0000\u0000\u02a7\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a8\u02c5\u0001\u0000\u0000\u0000\u02a9\u02aa\n\n"+
		"\u0000\u0000\u02aa\u02ab\u0005q\u0000\u0000\u02ab\u02c4\u0003D\"\u000b"+
		"\u02ac\u02ad\n\t\u0000\u0000\u02ad\u02ae\u0005r\u0000\u0000\u02ae\u02af"+
		"\u0005q\u0000\u0000\u02af\u02c4\u0003D\"\n\u02b0\u02b1\n\b\u0000\u0000"+
		"\u02b1\u02b2\u0003h4\u0000\u02b2\u02b3\u0003D\"\t\u02b3\u02c4\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b5\n\u0007\u0000\u0000\u02b5\u02b6\u0003f3\u0000"+
		"\u02b6\u02b7\u0003D\"\b\u02b7\u02c4\u0001\u0000\u0000\u0000\u02b8\u02b9"+
		"\n\u0017\u0000\u0000\u02b9\u02c4\u0003d2\u0000\u02ba\u02bb\n\u0012\u0000"+
		"\u0000\u02bb\u02be\u0005V\u0000\u0000\u02bc\u02bf\u0003^/\u0000\u02bd"+
		"\u02bf\u0003@ \u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02be\u02bd\u0001"+
		"\u0000\u0000\u0000\u02bf\u02c4\u0001\u0000\u0000\u0000\u02c0\u02c1\n\u0004"+
		"\u0000\u0000\u02c1\u02c2\u00059\u0000\u0000\u02c2\u02c4\u0005~\u0000\u0000"+
		"\u02c3\u02a9\u0001\u0000\u0000\u0000\u02c3\u02ac\u0001\u0000\u0000\u0000"+
		"\u02c3\u02b0\u0001\u0000\u0000\u0000\u02c3\u02b4\u0001\u0000\u0000\u0000"+
		"\u02c3\u02b8\u0001\u0000\u0000\u0000\u02c3\u02ba\u0001\u0000\u0000\u0000"+
		"\u02c3\u02c0\u0001\u0000\u0000\u0000\u02c4\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000"+
		"\u02c6E\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c9\u0005 \u0000\u0000\u02c9\u02ca\u0005h\u0000\u0000\u02ca\u02cb\u0003"+
		"D\"\u0000\u02cb\u02cc\u0005i\u0000\u0000\u02cc\u02d0\u0003\u001a\r\u0000"+
		"\u02cd\u02cf\u0003H$\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02cf\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d0\u02d1"+
		"\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d3\u02d5\u0003J%\u0000\u02d4\u02d3\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d9\u0001\u0000"+
		"\u0000\u0000\u02d6\u02d9\u0003L&\u0000\u02d7\u02d9\u0003R)\u0000\u02d8"+
		"\u02c8\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d8"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d9G\u0001\u0000\u0000\u0000\u02da\u02db"+
		"\u0005!\u0000\u0000\u02db\u02dc\u0005h\u0000\u0000\u02dc\u02dd\u0003D"+
		"\"\u0000\u02dd\u02de\u0005i\u0000\u0000\u02de\u02df\u0003\u001a\r\u0000"+
		"\u02dfI\u0001\u0000\u0000\u0000\u02e0\u02e1\u0005\"\u0000\u0000\u02e1"+
		"\u02e2\u0003\u001a\r\u0000\u02e2K\u0001\u0000\u0000\u0000\u02e3\u02e5"+
		"\u0005h\u0000\u0000\u02e4\u02e3\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001"+
		"\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u02e8\u0003"+
		"D\"\u0000\u02e7\u02e9\u0005i\u0000\u0000\u02e8\u02e7\u0001\u0000\u0000"+
		"\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000"+
		"\u0000\u02ea\u02ec\u0005\u0080\u0000\u0000\u02eb\u02ed\u0005h\u0000\u0000"+
		"\u02ec\u02eb\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000"+
		"\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02f0\u0003B!\u0000\u02ef\u02f1"+
		"\u0005i\u0000\u0000\u02f0\u02ef\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f5\u0001\u0000\u0000\u0000\u02f2\u02f4\u0003"+
		"N\'\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f7\u0001\u0000"+
		"\u0000\u0000\u02f5\u02f3\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f8\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f8\u02f9\u0003P(\u0000\u02f9M\u0001\u0000\u0000\u0000"+
		"\u02fa\u02fc\u0005p\u0000\u0000\u02fb\u02fd\u0005h\u0000\u0000\u02fc\u02fb"+
		"\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02fe"+
		"\u0001\u0000\u0000\u0000\u02fe\u0300\u0003D\"\u0000\u02ff\u0301\u0005"+
		"i\u0000\u0000\u0300\u02ff\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000"+
		"\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0304\u0005\u0080"+
		"\u0000\u0000\u0303\u0305\u0005h\u0000\u0000\u0304\u0303\u0001\u0000\u0000"+
		"\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000"+
		"\u0000\u0306\u0308\u0003B!\u0000\u0307\u0309\u0005i\u0000\u0000\u0308"+
		"\u0307\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309"+
		"O\u0001\u0000\u0000\u0000\u030a\u030c\u0005p\u0000\u0000\u030b\u030d\u0005"+
		"h\u0000\u0000\u030c\u030b\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000"+
		"\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u0310\u0003B!\u0000"+
		"\u030f\u0311\u0005i\u0000\u0000\u0310\u030f\u0001\u0000\u0000\u0000\u0310"+
		"\u0311\u0001\u0000\u0000\u0000\u0311Q\u0001\u0000\u0000\u0000\u0312\u0314"+
		"\u0005h\u0000\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0313\u0314\u0001"+
		"\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0317\u0003"+
		"D\"\u0000\u0316\u0318\u0005i\u0000\u0000\u0317\u0316\u0001\u0000\u0000"+
		"\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000"+
		"\u0000\u0319\u031a\u0005W\u0000\u0000\u031a\u031b\u0003D\"\u0000\u031b"+
		"S\u0001\u0000\u0000\u0000\u031c\u031d\u0005#\u0000\u0000\u031d\u0320\u0005"+
		"h\u0000\u0000\u031e\u0321\u0003.\u0017\u0000\u031f\u0321\u0003D\"\u0000"+
		"\u0320\u031e\u0001\u0000\u0000\u0000\u0320\u031f\u0001\u0000\u0000\u0000"+
		"\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000\u0000"+
		"\u0322\u0324\u0005o\u0000\u0000\u0323\u0325\u0003D\"\u0000\u0324\u0323"+
		"\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0326"+
		"\u0001\u0000\u0000\u0000\u0326\u0328\u0005o\u0000\u0000\u0327\u0329\u0003"+
		"D\"\u0000\u0328\u0327\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000"+
		"\u0000\u0000\u0329\u032a\u0001\u0000\u0000\u0000\u032a\u032b\u0005i\u0000"+
		"\u0000\u032b\u032c\u0003\u001a\r\u0000\u032cU\u0001\u0000\u0000\u0000"+
		"\u032d\u032e\u0005$\u0000\u0000\u032e\u032f\u0005h\u0000\u0000\u032f\u0330"+
		"\u0003D\"\u0000\u0330\u0331\u0005i\u0000\u0000\u0331\u0332\u0003\u001a"+
		"\r\u0000\u0332W\u0001\u0000\u0000\u0000\u0333\u0334\u0003D\"\u0000\u0334"+
		"\u0335\u0003j5\u0000\u0335Y\u0001\u0000\u0000\u0000\u0336\u0338\u0005"+
		"0\u0000\u0000\u0337\u0339\u0005h\u0000\u0000\u0338\u0337\u0001\u0000\u0000"+
		"\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339\u033b\u0001\u0000\u0000"+
		"\u0000\u033a\u033c\u0003X,\u0000\u033b\u033a\u0001\u0000\u0000\u0000\u033b"+
		"\u033c\u0001\u0000\u0000\u0000\u033c\u033e\u0001\u0000\u0000\u0000\u033d"+
		"\u033f\u0005i\u0000\u0000\u033e\u033d\u0001\u0000\u0000\u0000\u033e\u033f"+
		"\u0001\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u0341"+
		"\u0003j5\u0000\u0341[\u0001\u0000\u0000\u0000\u0342\u0343\u0007\u0005"+
		"\u0000\u0000\u0343\u034c\u0005h\u0000\u0000\u0344\u0349\u0003D\"\u0000"+
		"\u0345\u0346\u0005n\u0000\u0000\u0346\u0348\u0003D\"\u0000\u0347\u0345"+
		"\u0001\u0000\u0000\u0000\u0348\u034b\u0001\u0000\u0000\u0000\u0349\u0347"+
		"\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034d"+
		"\u0001\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034c\u0344"+
		"\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000\u034d\u034e"+
		"\u0001\u0000\u0000\u0000\u034e\u034f\u0005i\u0000\u0000\u034f\u0358\u0001"+
		"\u0000\u0000\u0000\u0350\u0353\u0005q\u0000\u0000\u0351\u0354\u0003\\"+
		".\u0000\u0352\u0354\u0005~\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000"+
		"\u0353\u0352\u0001\u0000\u0000\u0000\u0354\u0357\u0001\u0000\u0000\u0000"+
		"\u0355\u0357\u0003^/\u0000\u0356\u0350\u0001\u0000\u0000\u0000\u0356\u0355"+
		"\u0001\u0000\u0000\u0000\u0357\u035a\u0001\u0000\u0000\u0000\u0358\u0356"+
		"\u0001\u0000\u0000\u0000\u0358\u0359\u0001\u0000\u0000\u0000\u0359\u0379"+
		"\u0001\u0000\u0000\u0000\u035a\u0358\u0001\u0000\u0000\u0000\u035b\u035c"+
		"\u0005s\u0000\u0000\u035c\u035f\u0005~\u0000\u0000\u035d\u035f\u0005,"+
		"\u0000\u0000\u035e\u035b\u0001\u0000\u0000\u0000\u035e\u035d\u0001\u0000"+
		"\u0000\u0000\u035f\u0360\u0001\u0000\u0000\u0000\u0360\u0369\u0005h\u0000"+
		"\u0000\u0361\u0366\u0003D\"\u0000\u0362\u0363\u0005n\u0000\u0000\u0363"+
		"\u0365\u0003D\"\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0365\u0368"+
		"\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0366\u0367"+
		"\u0001\u0000\u0000\u0000\u0367\u036a\u0001\u0000\u0000\u0000\u0368\u0366"+
		"\u0001\u0000\u0000\u0000\u0369\u0361\u0001\u0000\u0000\u0000\u0369\u036a"+
		"\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000\u036b\u036c"+
		"\u0005i\u0000\u0000\u036c\u0375\u0001\u0000\u0000\u0000\u036d\u0370\u0005"+
		"q\u0000\u0000\u036e\u0371\u0003\\.\u0000\u036f\u0371\u0005~\u0000\u0000"+
		"\u0370\u036e\u0001\u0000\u0000\u0000\u0370\u036f\u0001\u0000\u0000\u0000"+
		"\u0371\u0374\u0001\u0000\u0000\u0000\u0372\u0374\u0003^/\u0000\u0373\u036d"+
		"\u0001\u0000\u0000\u0000\u0373\u0372\u0001\u0000\u0000\u0000\u0374\u0377"+
		"\u0001\u0000\u0000\u0000\u0375\u0373\u0001\u0000\u0000\u0000\u0375\u0376"+
		"\u0001\u0000\u0000\u0000\u0376\u0379\u0001\u0000\u0000\u0000\u0377\u0375"+
		"\u0001\u0000\u0000\u0000\u0378\u0342\u0001\u0000\u0000\u0000\u0378\u035e"+
		"\u0001\u0000\u0000\u0000\u0379]\u0001\u0000\u0000\u0000\u037a\u037d\u0003"+
		"d2\u0000\u037b\u037d\u0003b1\u0000\u037c\u037a\u0001\u0000\u0000\u0000"+
		"\u037c\u037b\u0001\u0000\u0000\u0000\u037d_\u0001\u0000\u0000\u0000\u037e"+
		"\u0384\u0003@ \u0000\u037f\u0384\u0005~\u0000\u0000\u0380\u0384\u0003"+
		"d2\u0000\u0381\u0384\u0003b1\u0000\u0382\u0384\u0003\\.\u0000\u0383\u037e"+
		"\u0001\u0000\u0000\u0000\u0383\u037f\u0001\u0000\u0000\u0000\u0383\u0380"+
		"\u0001\u0000\u0000\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0383\u0382"+
		"\u0001\u0000\u0000\u0000\u0384a\u0001\u0000\u0000\u0000\u0385\u0394\u0005"+
		"l\u0000\u0000\u0386\u0387\u0003`0\u0000\u0387\u0388\u0005p\u0000\u0000"+
		"\u0388\u0389\u0003`0\u0000\u0389\u0391\u0001\u0000\u0000\u0000\u038a\u038b"+
		"\u0005n\u0000\u0000\u038b\u038c\u0003`0\u0000\u038c\u038d\u0005p\u0000"+
		"\u0000\u038d\u038e\u0003`0\u0000\u038e\u0390\u0001\u0000\u0000\u0000\u038f"+
		"\u038a\u0001\u0000\u0000\u0000\u0390\u0393\u0001\u0000\u0000\u0000\u0391"+
		"\u038f\u0001\u0000\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392"+
		"\u0395\u0001\u0000\u0000\u0000\u0393\u0391\u0001\u0000\u0000\u0000\u0394"+
		"\u0386\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395"+
		"\u0397\u0001\u0000\u0000\u0000\u0396\u0398\u0005n\u0000\u0000\u0397\u0396"+
		"\u0001\u0000\u0000\u0000\u0397\u0398\u0001\u0000\u0000\u0000\u0398\u0399"+
		"\u0001\u0000\u0000\u0000\u0399\u039a\u0005m\u0000\u0000\u039ac\u0001\u0000"+
		"\u0000\u0000\u039b\u03a4\u0005j\u0000\u0000\u039c\u03a1\u0003`0\u0000"+
		"\u039d\u039e\u0005n\u0000\u0000\u039e\u03a0\u0003`0\u0000\u039f\u039d"+
		"\u0001\u0000\u0000\u0000\u03a0\u03a3\u0001\u0000\u0000\u0000\u03a1\u039f"+
		"\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000\u0000\u0000\u03a2\u03a5"+
		"\u0001\u0000\u0000\u0000\u03a3\u03a1\u0001\u0000\u0000\u0000\u03a4\u039c"+
		"\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000\u03a5\u03a7"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a8\u0005n\u0000\u0000\u03a7\u03a6\u0001"+
		"\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001"+
		"\u0000\u0000\u0000\u03a9\u03c0\u0005k\u0000\u0000\u03aa\u03ac\u0005l\u0000"+
		"\u0000\u03ab\u03aa\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000"+
		"\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000\u03ad\u03b6\u0005j\u0000\u0000"+
		"\u03ae\u03b3\u0003`0\u0000\u03af\u03b0\u0005n\u0000\u0000\u03b0\u03b2"+
		"\u0003`0\u0000\u03b1\u03af\u0001\u0000\u0000\u0000\u03b2\u03b5\u0001\u0000"+
		"\u0000\u0000\u03b3\u03b1\u0001\u0000\u0000\u0000\u03b3\u03b4\u0001\u0000"+
		"\u0000\u0000\u03b4\u03b7\u0001\u0000\u0000\u0000\u03b5\u03b3\u0001\u0000"+
		"\u0000\u0000\u03b6\u03ae\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000"+
		"\u0000\u0000\u03b7\u03b9\u0001\u0000\u0000\u0000\u03b8\u03ba\u0005n\u0000"+
		"\u0000\u03b9\u03b8\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000"+
		"\u0000\u03ba\u03bb\u0001\u0000\u0000\u0000\u03bb\u03bd\u0005k\u0000\u0000"+
		"\u03bc\u03be\u0005m\u0000\u0000\u03bd\u03bc\u0001\u0000\u0000\u0000\u03bd"+
		"\u03be\u0001\u0000\u0000\u0000\u03be\u03c0\u0001\u0000\u0000\u0000\u03bf"+
		"\u039b\u0001\u0000\u0000\u0000\u03bf\u03ab\u0001\u0000\u0000\u0000\u03c0"+
		"e\u0001\u0000\u0000\u0000\u03c1\u03cb\u0005V\u0000\u0000\u03c2\u03cb\u0005"+
		"X\u0000\u0000\u03c3\u03cb\u0005Y\u0000\u0000\u03c4\u03cb\u0005Z\u0000"+
		"\u0000\u03c5\u03cb\u0005[\u0000\u0000\u03c6\u03c7\u0005X\u0000\u0000\u03c7"+
		"\u03cb\u0005V\u0000\u0000\u03c8\u03c9\u0005Y\u0000\u0000\u03c9\u03cb\u0005"+
		"V\u0000\u0000\u03ca\u03c1\u0001\u0000\u0000\u0000\u03ca\u03c2\u0001\u0000"+
		"\u0000\u0000\u03ca\u03c3\u0001\u0000\u0000\u0000\u03ca\u03c4\u0001\u0000"+
		"\u0000\u0000\u03ca\u03c5\u0001\u0000\u0000\u0000\u03ca\u03c6\u0001\u0000"+
		"\u0000\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000\u03cbg\u0001\u0000\u0000"+
		"\u0000\u03cc\u03cd\u0007\u0006\u0000\u0000\u03cdi\u0001\u0000\u0000\u0000"+
		"\u03ce\u03d0\u0005o\u0000\u0000\u03cf\u03ce\u0001\u0000\u0000\u0000\u03cf"+
		"\u03d0\u0001\u0000\u0000\u0000\u03d0k\u0001\u0000\u0000\u0000\u03d1\u03d6"+
		"\u0003n7\u0000\u03d2\u03d6\u0003r9\u0000\u03d3\u03d6\u0003t:\u0000\u03d4"+
		"\u03d6\u0003v;\u0000\u03d5\u03d1\u0001\u0000\u0000\u0000\u03d5\u03d2\u0001"+
		"\u0000\u0000\u0000\u03d5\u03d3\u0001\u0000\u0000\u0000\u03d5\u03d4\u0001"+
		"\u0000\u0000\u0000\u03d6m\u0001\u0000\u0000\u0000\u03d7\u03d8\u0005H\u0000"+
		"\u0000\u03d8\u03d9\u0005h\u0000\u0000\u03d9\u03da\u0005v\u0000\u0000\u03da"+
		"\u03db\u0005n\u0000\u0000\u03db\u03dd\u0003p8\u0000\u03dc\u03de\u0005"+
		"i\u0000\u0000\u03dd\u03dc\u0001\u0000\u0000\u0000\u03dd\u03de\u0001\u0000"+
		"\u0000\u0000\u03de\u03e0\u0001\u0000\u0000\u0000\u03df\u03e1\u0005o\u0000"+
		"\u0000\u03e0\u03df\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000"+
		"\u0000\u03e1\u03eb\u0001\u0000\u0000\u0000\u03e2\u03e3\u0005H\u0000\u0000"+
		"\u03e3\u03e4\u0005h\u0000\u0000\u03e4\u03e5\u0005v\u0000\u0000\u03e5\u03e6"+
		"\u0005n\u0000\u0000\u03e6\u03e7\u0003\u0018\f\u0000\u03e7\u03e8\u0005"+
		"i\u0000\u0000\u03e8\u03e9\u0005o\u0000\u0000\u03e9\u03eb\u0001\u0000\u0000"+
		"\u0000\u03ea\u03d7\u0001\u0000\u0000\u0000\u03ea\u03e2\u0001\u0000\u0000"+
		"\u0000\u03ebo\u0001\u0000\u0000\u0000\u03ec\u03ee\u0005U\u0000\u0000\u03ed"+
		"\u03ec\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee"+
		"\u03ef\u0001\u0000\u0000\u0000\u03ef\u03f0\u0003\u001c\u000e\u0000\u03f0"+
		"\u03f1\u0005W\u0000\u0000\u03f1\u03f5\u0005l\u0000\u0000\u03f2\u03f4\u0003"+
		"l6\u0000\u03f3\u03f2\u0001\u0000\u0000\u0000\u03f4\u03f7\u0001\u0000\u0000"+
		"\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000\u0000"+
		"\u0000\u03f6\u03f8\u0001\u0000\u0000\u0000\u03f7\u03f5\u0001\u0000\u0000"+
		"\u0000\u03f8\u03f9\u0005m\u0000\u0000\u03f9q\u0001\u0000\u0000\u0000\u03fa"+
		"\u03fb\u0005J\u0000\u0000\u03fb\u03fc\u0005h\u0000\u0000\u03fc\u03fe\u0005"+
		"v\u0000\u0000\u03fd\u03ff\u0005~\u0000\u0000\u03fe\u03fd\u0001\u0000\u0000"+
		"\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0401\u0001\u0000\u0000"+
		"\u0000\u0400\u0402\u0005v\u0000\u0000\u0401\u0400\u0001\u0000\u0000\u0000"+
		"\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000"+
		"\u0403\u0404\u0005n\u0000\u0000\u0404\u0405\u0003\u0018\f\u0000\u0405"+
		"\u0406\u0005i\u0000\u0000\u0406\u0407\u0005o\u0000\u0000\u0407s\u0001"+
		"\u0000\u0000\u0000\u0408\u0409\u0005K\u0000\u0000\u0409\u040a\u0005h\u0000"+
		"\u0000\u040a\u040b\u0003\u0018\f\u0000\u040b\u040c\u0005i\u0000\u0000"+
		"\u040c\u040d\u0005o\u0000\u0000\u040du\u0001\u0000\u0000\u0000\u040e\u040f"+
		"\u0005L\u0000\u0000\u040f\u0410\u0005h\u0000\u0000\u0410\u0411\u0003\u0018"+
		"\f\u0000\u0411\u0412\u0005i\u0000\u0000\u0412\u0413\u0005o\u0000\u0000"+
		"\u0413w\u0001\u0000\u0000\u0000\u0414\u0415\u0005\u0001\u0000\u0000\u0415"+
		"\u0417\u0005\r\u0000\u0000\u0416\u0418\u0003z=\u0000\u0417\u0416\u0001"+
		"\u0000\u0000\u0000\u0417\u0418\u0001\u0000\u0000\u0000\u0418\u0419\u0001"+
		"\u0000\u0000\u0000\u0419\u041d\u0005\u0006\u0000\u0000\u041a\u041c\u0003"+
		"\u0082A\u0000\u041b\u041a\u0001\u0000\u0000\u0000\u041c\u041f\u0001\u0000"+
		"\u0000\u0000\u041d\u041b\u0001\u0000\u0000\u0000\u041d\u041e\u0001\u0000"+
		"\u0000\u0000\u041e\u0420\u0001\u0000\u0000\u0000\u041f\u041d\u0001\u0000"+
		"\u0000\u0000\u0420\u0428\u0003~?\u0000\u0421\u0422\u0005\u0001\u0000\u0000"+
		"\u0422\u0424\u0005\r\u0000\u0000\u0423\u0425\u0003z=\u0000\u0424\u0423"+
		"\u0001\u0000\u0000\u0000\u0424\u0425\u0001\u0000\u0000\u0000\u0425\u0426"+
		"\u0001\u0000\u0000\u0000\u0426\u0428\u0005\u0007\u0000\u0000\u0427\u0414"+
		"\u0001\u0000\u0000\u0000\u0427\u0421\u0001\u0000\u0000\u0000\u0428y\u0001"+
		"\u0000\u0000\u0000\u0429\u042c\u0003\u0080@\u0000\u042a\u042c\u0003|>"+
		"\u0000\u042b\u0429\u0001\u0000\u0000\u0000\u042b\u042a\u0001\u0000\u0000"+
		"\u0000\u042c\u042f\u0001\u0000\u0000\u0000\u042d\u042b\u0001\u0000\u0000"+
		"\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e{\u0001\u0000\u0000\u0000"+
		"\u042f\u042d\u0001\u0000\u0000\u0000\u0430\u0431\u0007\u0007\u0000\u0000"+
		"\u0431}\u0001\u0000\u0000\u0000\u0432\u0433\u0005\u0001\u0000\u0000\u0433"+
		"\u0434\u0005\b\u0000\u0000\u0434\u0435\u0005\r\u0000\u0000\u0435\u0436"+
		"\u0005\u0006\u0000\u0000\u0436\u007f\u0001\u0000\u0000\u0000\u0437\u043a"+
		"\u0005\u0011\u0000\u0000\u0438\u0439\u0005\t\u0000\u0000\u0439\u043b\u0005"+
		"\n\u0000\u0000\u043a\u0438\u0001\u0000\u0000\u0000\u043a\u043b\u0001\u0000"+
		"\u0000\u0000\u043b\u0451\u0001\u0000\u0000\u0000\u043c\u043f\u0005\u000b"+
		"\u0000\u0000\u043d\u043e\u0005\t\u0000\u0000\u043e\u0440\u0005\n\u0000"+
		"\u0000\u043f\u043d\u0001\u0000\u0000\u0000\u043f\u0440\u0001\u0000\u0000"+
		"\u0000\u0440\u0451\u0001\u0000\u0000\u0000\u0441\u0444\u0005\f\u0000\u0000"+
		"\u0442\u0443\u0005\t\u0000\u0000\u0443\u0445\u0005\n\u0000\u0000\u0444"+
		"\u0442\u0001\u0000\u0000\u0000\u0444\u0445\u0001\u0000\u0000\u0000\u0445"+
		"\u0451\u0001\u0000\u0000\u0000\u0446\u0449\u0005\u000e\u0000\u0000\u0447"+
		"\u0448\u0005\t\u0000\u0000\u0448\u044a\u0005\n\u0000\u0000\u0449\u0447"+
		"\u0001\u0000\u0000\u0000\u0449\u044a\u0001\u0000\u0000\u0000\u044a\u0451"+
		"\u0001\u0000\u0000\u0000\u044b\u044e\u0005\u000f\u0000\u0000\u044c\u044d"+
		"\u0005\t\u0000\u0000\u044d\u044f\u0005\n\u0000\u0000\u044e\u044c\u0001"+
		"\u0000\u0000\u0000\u044e\u044f\u0001\u0000\u0000\u0000\u044f\u0451\u0001"+
		"\u0000\u0000\u0000\u0450\u0437\u0001\u0000\u0000\u0000\u0450\u043c\u0001"+
		"\u0000\u0000\u0000\u0450\u0441\u0001\u0000\u0000\u0000\u0450\u0446\u0001"+
		"\u0000\u0000\u0000\u0450\u044b\u0001\u0000\u0000\u0000\u0451\u0081\u0001"+
		"\u0000\u0000\u0000\u0452\u0456\u0003x<\u0000\u0453\u0456\u0005\u0010\u0000"+
		"\u0000\u0454\u0456\u0005\u0002\u0000\u0000\u0455\u0452\u0001\u0000\u0000"+
		"\u0000\u0455\u0453\u0001\u0000\u0000\u0000\u0455\u0454\u0001\u0000\u0000"+
		"\u0000\u0456\u0083\u0001\u0000\u0000\u0000\u0457\u0459\u0003\u0086C\u0000"+
		"\u0458\u0457\u0001\u0000\u0000\u0000\u0458\u0459\u0001\u0000\u0000\u0000"+
		"\u0459\u045a\u0001\u0000\u0000\u0000\u045a\u045b\u0005\u0000\u0000\u0001"+
		"\u045b\u0085\u0001\u0000\u0000\u0000\u045c\u045d\u0005\u0004\u0000\u0000"+
		"\u045d\u045e\u0003\u0088D\u0000\u045e\u045f\u0005\u0013\u0000\u0000\u045f"+
		"\u0087\u0001\u0000\u0000\u0000\u0460\u0462\u0003\u008aE\u0000\u0461\u0460"+
		"\u0001\u0000\u0000\u0000\u0462\u0465\u0001\u0000\u0000\u0000\u0463\u0461"+
		"\u0001\u0000\u0000\u0000\u0463\u0464\u0001\u0000\u0000\u0000\u0464\u0089"+
		"\u0001\u0000\u0000\u0000\u0465\u0463\u0001\u0000\u0000\u0000\u0466\u0467"+
		"\u0003\u008cF\u0000\u0467\u0469\u0005\u001a\u0000\u0000\u0468\u046a\u0003"+
		"\u0090H\u0000\u0469\u0468\u0001\u0000\u0000\u0000\u0469\u046a\u0001\u0000"+
		"\u0000\u0000\u046a\u046b\u0001\u0000\u0000\u0000\u046b\u046c\u0005\u001b"+
		"\u0000\u0000\u046c\u008b\u0001\u0000\u0000\u0000\u046d\u0471\u0003\u008e"+
		"G\u0000\u046e\u0470\u0003\u008eG\u0000\u046f\u046e\u0001\u0000\u0000\u0000"+
		"\u0470\u0473\u0001\u0000\u0000\u0000\u0471\u046f\u0001\u0000\u0000\u0000"+
		"\u0471\u0472\u0001\u0000\u0000\u0000\u0472\u008d\u0001\u0000\u0000\u0000"+
		"\u0473\u0471\u0001\u0000\u0000\u0000\u0474\u0475\u0007\b\u0000\u0000\u0475"+
		"\u008f\u0001\u0000\u0000\u0000\u0476\u047b\u0003\u0092I\u0000\u0477\u0478"+
		"\u0005\u001d\u0000\u0000\u0478\u047a\u0003\u0092I\u0000\u0479\u0477\u0001"+
		"\u0000\u0000\u0000\u047a\u047d\u0001\u0000\u0000\u0000\u047b\u0479\u0001"+
		"\u0000\u0000\u0000\u047b\u047c\u0001\u0000\u0000\u0000\u047c\u047f\u0001"+
		"\u0000\u0000\u0000\u047d\u047b\u0001\u0000\u0000\u0000\u047e\u0480\u0005"+
		"\u001d\u0000\u0000\u047f\u047e\u0001\u0000\u0000\u0000\u047f\u0480\u0001"+
		"\u0000\u0000\u0000\u0480\u0091\u0001\u0000\u0000\u0000\u0481\u0482\u0005"+
		"\u0014\u0000\u0000\u0482\u0484\u0005\u001c\u0000\u0000\u0483\u0485\u0005"+
		"\u0014\u0000\u0000\u0484\u0483\u0001\u0000\u0000\u0000\u0484\u0485\u0001"+
		"\u0000\u0000\u0000\u0485\u0487\u0001\u0000\u0000\u0000\u0486\u0488\u0005"+
		"\u0015\u0000\u0000\u0487\u0486\u0001\u0000\u0000\u0000\u0487\u0488\u0001"+
		"\u0000\u0000\u0000\u0488\u048a\u0001\u0000\u0000\u0000\u0489\u048b\u0005"+
		"\u0015\u0000\u0000\u048a\u0489\u0001\u0000\u0000\u0000\u048a\u048b\u0001"+
		"\u0000\u0000\u0000\u048b\u0093\u0001\u0000\u0000\u0000\u00ad\u0099\u009b"+
		"\u00a4\u00ae\u00b6\u00be\u00c4\u00ca\u00ce\u00d1\u00dc\u00e3\u00e7\u00fd"+
		"\u0107\u010a\u0112\u0115\u0118\u011d\u011f\u0124\u0127\u012d\u012f\u0134"+
		"\u0137\u013a\u013f\u0141\u0145\u014a\u014e\u0151\u0156\u0158\u015b\u0160"+
		"\u0166\u016e\u0171\u017a\u0180\u0184\u018e\u0191\u019a\u01a3\u01a6\u01ab"+
		"\u01ae\u01b3\u01b9\u01c6\u01cc\u01ce\u01d9\u01e3\u01eb\u01ee\u01f3\u01f7"+
		"\u01fb\u0202\u0207\u020c\u020f\u0214\u0218\u0223\u0227\u022f\u0234\u023c"+
		"\u023f\u0246\u024b\u024f\u025a\u025d\u0260\u0265\u0269\u0271\u0275\u0279"+
		"\u0281\u02a1\u02a5\u02a7\u02be\u02c3\u02c5\u02d0\u02d4\u02d8\u02e4\u02e8"+
		"\u02ec\u02f0\u02f5\u02fc\u0300\u0304\u0308\u030c\u0310\u0313\u0317\u0320"+
		"\u0324\u0328\u0338\u033b\u033e\u0349\u034c\u0353\u0356\u0358\u035e\u0366"+
		"\u0369\u0370\u0373\u0375\u0378\u037c\u0383\u0391\u0394\u0397\u03a1\u03a4"+
		"\u03a7\u03ab\u03b3\u03b6\u03b9\u03bd\u03bf\u03ca\u03cf\u03d5\u03dd\u03e0"+
		"\u03ea\u03ed\u03f5\u03fe\u0401\u0417\u041d\u0424\u0427\u042b\u042d\u043a"+
		"\u043f\u0444\u0449\u044e\u0450\u0455\u0458\u0463\u0469\u0471\u047b\u047f"+
		"\u0484\u0487\u048a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}