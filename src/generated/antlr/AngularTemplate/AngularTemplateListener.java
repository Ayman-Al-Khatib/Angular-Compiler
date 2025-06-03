// Generated from C:/Users/Ahmed_Ajajeh/IdeaProjects/compiler-setup/src/grammar/AngularTemplate.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularTemplateParser}.
 */
public interface AngularTemplateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularTemplateParser#htmlTemplate}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTemplate(AngularTemplateParser.HtmlTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTemplateParser#htmlTemplate}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTemplate(AngularTemplateParser.HtmlTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(AngularTemplateParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(AngularTemplateParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTemplateParser#closingTag}.
	 * @param ctx the parse tree
	 */
	void enterClosingTag(AngularTemplateParser.ClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTemplateParser#closingTag}.
	 * @param ctx the parse tree
	 */
	void exitClosingTag(AngularTemplateParser.ClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(AngularTemplateParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(AngularTemplateParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(AngularTemplateParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(AngularTemplateParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTemplateParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(AngularTemplateParser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTemplateParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(AngularTemplateParser.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTemplateParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(AngularTemplateParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTemplateParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(AngularTemplateParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTemplateParser#ngFor}.
	 * @param ctx the parse tree
	 */
	void enterNgFor(AngularTemplateParser.NgForContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTemplateParser#ngFor}.
	 * @param ctx the parse tree
	 */
	void exitNgFor(AngularTemplateParser.NgForContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTemplateParser#ngIf}.
	 * @param ctx the parse tree
	 */
	void enterNgIf(AngularTemplateParser.NgIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTemplateParser#ngIf}.
	 * @param ctx the parse tree
	 */
	void exitNgIf(AngularTemplateParser.NgIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTemplateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(AngularTemplateParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTemplateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(AngularTemplateParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTemplateParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBinding(AngularTemplateParser.PropertyBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTemplateParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBinding(AngularTemplateParser.PropertyBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTemplateParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(AngularTemplateParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTemplateParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(AngularTemplateParser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTemplateParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(AngularTemplateParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTemplateParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(AngularTemplateParser.InterpolationContext ctx);
}