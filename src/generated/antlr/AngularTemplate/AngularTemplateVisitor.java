// Generated from C:/Users/Ahmed_Ajajeh/IdeaProjects/compiler-setup/src/grammar/AngularTemplate.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularTemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularTemplateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularTemplateParser#htmlTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTemplate(AngularTemplateParser.HtmlTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(AngularTemplateParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularTemplateParser#closingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosingTag(AngularTemplateParser.ClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularTemplateParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(AngularTemplateParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularTemplateParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(AngularTemplateParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularTemplateParser#attributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeList(AngularTemplateParser.AttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularTemplateParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(AngularTemplateParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularTemplateParser#ngFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgFor(AngularTemplateParser.NgForContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularTemplateParser#ngIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIf(AngularTemplateParser.NgIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularTemplateParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(AngularTemplateParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularTemplateParser#propertyBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBinding(AngularTemplateParser.PropertyBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularTemplateParser#eventBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(AngularTemplateParser.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularTemplateParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(AngularTemplateParser.InterpolationContext ctx);
}