// Generated from C:/Users/Ahmed_Ajajeh/IdeaProjects/compiler-setup/src/grammar/AngularTemplate.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularTemplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LT=1, GT=2, SLASH=3, LPAREN=4, RPAREN=5, DOT=6, COMMA=7, ASSIGN=8, BINDING_START=9, 
		BINDING_END=10, SPECIAL_TAG_NAME=11, ID=12, PROPERTY=13, INTERPOLATION_STRING=14, 
		IDENTIFIER_STRING=15, FUNCTION_CALL_STRING=16, NUMBER=17, STRING=18, INTERPOLATION=19, 
		NG_FOR=20, NG_IF=21, WS=22, COMMENT=23, TOKEN=24;
	public static final int
		RULE_htmlTemplate = 0, RULE_htmlElement = 1, RULE_closingTag = 2, RULE_content = 3, 
		RULE_text = 4, RULE_attributeList = 5, RULE_directive = 6, RULE_ngFor = 7, 
		RULE_ngIf = 8, RULE_attribute = 9, RULE_propertyBinding = 10, RULE_eventBinding = 11, 
		RULE_interpolation = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlTemplate", "htmlElement", "closingTag", "content", "text", "attributeList", 
			"directive", "ngFor", "ngIf", "attribute", "propertyBinding", "eventBinding", 
			"interpolation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'/'", "'('", "')'", "'.'", "','", "'='", "'['", 
			"']'", null, null, null, null, null, null, null, null, null, "'*ngFor'", 
			"'*ngIf'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LT", "GT", "SLASH", "LPAREN", "RPAREN", "DOT", "COMMA", "ASSIGN", 
			"BINDING_START", "BINDING_END", "SPECIAL_TAG_NAME", "ID", "PROPERTY", 
			"INTERPOLATION_STRING", "IDENTIFIER_STRING", "FUNCTION_CALL_STRING", 
			"NUMBER", "STRING", "INTERPOLATION", "NG_FOR", "NG_IF", "WS", "COMMENT", 
			"TOKEN"
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
	public String getGrammarFileName() { return "AngularTemplate.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularTemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTemplateContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).enterHtmlTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).exitHtmlTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularTemplateVisitor ) return ((AngularTemplateVisitor<? extends T>)visitor).visitHtmlTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTemplateContext htmlTemplate() throws RecognitionException {
		HtmlTemplateContext _localctx = new HtmlTemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LT) {
				{
				{
				setState(26);
				htmlElement();
				}
				}
				setState(31);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(AngularTemplateParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(AngularTemplateParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(AngularTemplateParser.GT, 0); }
		public TerminalNode SPECIAL_TAG_NAME() { return getToken(AngularTemplateParser.SPECIAL_TAG_NAME, 0); }
		public TerminalNode ID() { return getToken(AngularTemplateParser.ID, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public ClosingTagContext closingTag() {
			return getRuleContext(ClosingTagContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularTemplateVisitor ) return ((AngularTemplateVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlElement);
		int _la;
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(LT);
				setState(33);
				_la = _input.LA(1);
				if ( !(_la==SPECIAL_TAG_NAME || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(35);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(34);
					attributeList();
					}
					break;
				}
				setState(37);
				match(SLASH);
				setState(38);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(LT);
				setState(40);
				_la = _input.LA(1);
				if ( !(_la==SPECIAL_TAG_NAME || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(41);
					attributeList();
					}
					break;
				}
				setState(44);
				match(GT);
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(45);
					content();
					}
					break;
				}
				setState(48);
				closingTag();
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
	public static class ClosingTagContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(AngularTemplateParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(AngularTemplateParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(AngularTemplateParser.GT, 0); }
		public TerminalNode SPECIAL_TAG_NAME() { return getToken(AngularTemplateParser.SPECIAL_TAG_NAME, 0); }
		public TerminalNode ID() { return getToken(AngularTemplateParser.ID, 0); }
		public ClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).enterClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).exitClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularTemplateVisitor ) return ((AngularTemplateVisitor<? extends T>)visitor).visitClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosingTagContext closingTag() throws RecognitionException {
		ClosingTagContext _localctx = new ClosingTagContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_closingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LT);
			setState(52);
			match(SLASH);
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==SPECIAL_TAG_NAME || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(54);
			match(GT);
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
	public static class ContentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularTemplateVisitor ) return ((AngularTemplateVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(56);
						htmlElement();
						}
						break;
					case 2:
						{
						setState(57);
						interpolation();
						}
						break;
					case 3:
						{
						setState(58);
						text();
						}
						break;
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> LT() { return getTokens(AngularTemplateParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(AngularTemplateParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(AngularTemplateParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(AngularTemplateParser.GT, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularTemplateVisitor ) return ((AngularTemplateVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(64);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LT || _la==GT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class AttributeListContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<PropertyBindingContext> propertyBinding() {
			return getRuleContexts(PropertyBindingContext.class);
		}
		public PropertyBindingContext propertyBinding(int i) {
			return getRuleContext(PropertyBindingContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).exitAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularTemplateVisitor ) return ((AngularTemplateVisitor<? extends T>)visitor).visitAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3150352L) != 0)) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(69);
					attribute();
					}
					break;
				case BINDING_START:
					{
					setState(70);
					propertyBinding();
					}
					break;
				case LPAREN:
					{
					setState(71);
					eventBinding();
					}
					break;
				case NG_FOR:
				case NG_IF:
					{
					setState(72);
					directive();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
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
	public static class DirectiveContext extends ParserRuleContext {
		public NgForContext ngFor() {
			return getRuleContext(NgForContext.class,0);
		}
		public NgIfContext ngIf() {
			return getRuleContext(NgIfContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularTemplateVisitor ) return ((AngularTemplateVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_directive);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NG_FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				ngFor();
				}
				break;
			case NG_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				ngIf();
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
	public static class NgForContext extends ParserRuleContext {
		public TerminalNode NG_FOR() { return getToken(AngularTemplateParser.NG_FOR, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularTemplateParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularTemplateParser.STRING, 0); }
		public NgForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).enterNgFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).exitNgFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularTemplateVisitor ) return ((AngularTemplateVisitor<? extends T>)visitor).visitNgFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgForContext ngFor() throws RecognitionException {
		NgForContext _localctx = new NgForContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ngFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(NG_FOR);
			setState(83);
			match(ASSIGN);
			setState(84);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NgIfContext extends ParserRuleContext {
		public TerminalNode NG_IF() { return getToken(AngularTemplateParser.NG_IF, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularTemplateParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER_STRING() { return getToken(AngularTemplateParser.IDENTIFIER_STRING, 0); }
		public NgIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).enterNgIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).exitNgIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularTemplateVisitor ) return ((AngularTemplateVisitor<? extends T>)visitor).visitNgIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgIfContext ngIf() throws RecognitionException {
		NgIfContext _localctx = new NgIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ngIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(NG_IF);
			setState(87);
			match(ASSIGN);
			setState(88);
			match(IDENTIFIER_STRING);
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularTemplateParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularTemplateParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularTemplateParser.STRING, 0); }
		public TerminalNode IDENTIFIER_STRING() { return getToken(AngularTemplateParser.IDENTIFIER_STRING, 0); }
		public TerminalNode INTERPOLATION_STRING() { return getToken(AngularTemplateParser.INTERPOLATION_STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularTemplateVisitor ) return ((AngularTemplateVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);
			setState(91);
			match(ASSIGN);
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 311296L) != 0)) ) {
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
	public static class PropertyBindingContext extends ParserRuleContext {
		public TerminalNode BINDING_START() { return getToken(AngularTemplateParser.BINDING_START, 0); }
		public TerminalNode BINDING_END() { return getToken(AngularTemplateParser.BINDING_END, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularTemplateParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER_STRING() { return getToken(AngularTemplateParser.IDENTIFIER_STRING, 0); }
		public TerminalNode PROPERTY() { return getToken(AngularTemplateParser.PROPERTY, 0); }
		public TerminalNode ID() { return getToken(AngularTemplateParser.ID, 0); }
		public PropertyBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).enterPropertyBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).exitPropertyBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularTemplateVisitor ) return ((AngularTemplateVisitor<? extends T>)visitor).visitPropertyBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyBindingContext propertyBinding() throws RecognitionException {
		PropertyBindingContext _localctx = new PropertyBindingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_propertyBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(BINDING_START);
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==PROPERTY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(96);
			match(BINDING_END);
			setState(97);
			match(ASSIGN);
			setState(98);
			match(IDENTIFIER_STRING);
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
	public static class EventBindingContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AngularTemplateParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(AngularTemplateParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(AngularTemplateParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularTemplateParser.ASSIGN, 0); }
		public TerminalNode FUNCTION_CALL_STRING() { return getToken(AngularTemplateParser.FUNCTION_CALL_STRING, 0); }
		public EventBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularTemplateVisitor ) return ((AngularTemplateVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventBindingContext eventBinding() throws RecognitionException {
		EventBindingContext _localctx = new EventBindingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eventBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(LPAREN);
			setState(101);
			match(ID);
			setState(102);
			match(RPAREN);
			setState(103);
			match(ASSIGN);
			setState(104);
			match(FUNCTION_CALL_STRING);
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
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode INTERPOLATION() { return getToken(AngularTemplateParser.INTERPOLATION, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTemplateListener ) ((AngularTemplateListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularTemplateVisitor ) return ((AngularTemplateVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(INTERPOLATION);
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
		"\u0004\u0001\u0018m\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001$\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0001\u0003"+
		"\u00012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003<\b\u0003\n\u0003"+
		"\f\u0003?\t\u0003\u0001\u0004\u0004\u0004B\b\u0004\u000b\u0004\f\u0004"+
		"C\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005J\b\u0005"+
		"\n\u0005\f\u0005M\t\u0005\u0001\u0006\u0001\u0006\u0003\u0006Q\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001C\u0000\r\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0004\u0001"+
		"\u0000\u000b\f\u0001\u0000\u0001\u0002\u0002\u0000\u000e\u000f\u0012\u0012"+
		"\u0001\u0000\f\rm\u0000\u001d\u0001\u0000\u0000\u0000\u00021\u0001\u0000"+
		"\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000"+
		"\bA\u0001\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000\fP\u0001\u0000"+
		"\u0000\u0000\u000eR\u0001\u0000\u0000\u0000\u0010V\u0001\u0000\u0000\u0000"+
		"\u0012Z\u0001\u0000\u0000\u0000\u0014^\u0001\u0000\u0000\u0000\u0016d"+
		"\u0001\u0000\u0000\u0000\u0018j\u0001\u0000\u0000\u0000\u001a\u001c\u0003"+
		"\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e\u0001\u0001\u0000\u0000\u0000\u001f\u001d\u0001"+
		"\u0000\u0000\u0000 !\u0005\u0001\u0000\u0000!#\u0007\u0000\u0000\u0000"+
		"\"$\u0003\n\u0005\u0000#\"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%&\u0005\u0003\u0000\u0000&2\u0005\u0002"+
		"\u0000\u0000\'(\u0005\u0001\u0000\u0000(*\u0007\u0000\u0000\u0000)+\u0003"+
		"\n\u0005\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,.\u0005\u0002\u0000\u0000-/\u0003\u0006\u0003\u0000"+
		".-\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u000002\u0003\u0004\u0002\u00001 \u0001\u0000\u0000\u00001\'\u0001\u0000"+
		"\u0000\u00002\u0003\u0001\u0000\u0000\u000034\u0005\u0001\u0000\u0000"+
		"45\u0005\u0003\u0000\u000056\u0007\u0000\u0000\u000067\u0005\u0002\u0000"+
		"\u00007\u0005\u0001\u0000\u0000\u00008<\u0003\u0002\u0001\u00009<\u0003"+
		"\u0018\f\u0000:<\u0003\b\u0004\u0000;8\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0007\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000@B\b\u0001\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000D\t\u0001\u0000\u0000\u0000EJ\u0003\u0012\t\u0000FJ"+
		"\u0003\u0014\n\u0000GJ\u0003\u0016\u000b\u0000HJ\u0003\f\u0006\u0000I"+
		"E\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000L\u000b\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NQ\u0003\u000e\u0007\u0000OQ\u0003\u0010\b\u0000"+
		"PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\r\u0001\u0000\u0000"+
		"\u0000RS\u0005\u0014\u0000\u0000ST\u0005\b\u0000\u0000TU\u0005\u0012\u0000"+
		"\u0000U\u000f\u0001\u0000\u0000\u0000VW\u0005\u0015\u0000\u0000WX\u0005"+
		"\b\u0000\u0000XY\u0005\u000f\u0000\u0000Y\u0011\u0001\u0000\u0000\u0000"+
		"Z[\u0005\f\u0000\u0000[\\\u0005\b\u0000\u0000\\]\u0007\u0002\u0000\u0000"+
		"]\u0013\u0001\u0000\u0000\u0000^_\u0005\t\u0000\u0000_`\u0007\u0003\u0000"+
		"\u0000`a\u0005\n\u0000\u0000ab\u0005\b\u0000\u0000bc\u0005\u000f\u0000"+
		"\u0000c\u0015\u0001\u0000\u0000\u0000de\u0005\u0004\u0000\u0000ef\u0005"+
		"\f\u0000\u0000fg\u0005\u0005\u0000\u0000gh\u0005\b\u0000\u0000hi\u0005"+
		"\u0010\u0000\u0000i\u0017\u0001\u0000\u0000\u0000jk\u0005\u0013\u0000"+
		"\u0000k\u0019\u0001\u0000\u0000\u0000\u000b\u001d#*.1;=CIKP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}