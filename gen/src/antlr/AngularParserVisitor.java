// Generated from C:/Users/maisa/proCom-main/proCom-main/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package src.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#scriptBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptBlock(AngularParser.ScriptBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#tsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsStatement(AngularParser.TsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(AngularParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#standalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalone(AngularParser.StandaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(AngularParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(AngularParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrowMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowMethod(AngularParser.ArrowMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AngularParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(AngularParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(AngularParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgOn(AngularParser.NgOnContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorDecleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDecleration(AngularParser.ConstructorDeclerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#inputDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDeclaration(AngularParser.InputDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#outputDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputDeclaration(AngularParser.OutputDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AngularParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(AngularParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectDecleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDecleration(AngularParser.ObjectDeclerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectName(AngularParser.ObjectNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInit(AngularParser.ObjectInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(AngularParser.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AngularParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(AngularParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataStructureExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStructureExpression(AngularParser.DataStructureExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(AngularParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpression(AngularParser.DotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpression(AngularParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCastExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCastExpression(AngularParser.TypeCastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(AngularParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallingMethodExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallingMethodExpression(AngularParser.CallingMethodExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(AngularParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowMethodExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowMethodExpression(AngularParser.ArrowMethodExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(AngularParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(AngularParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectNameExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectNameExpression(AngularParser.ObjectNameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAssertionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAssertionExpression(AngularParser.TypeAssertionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(AngularParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionalChainingExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalChainingExpression(AngularParser.OptionalChainingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorExpression(AngularParser.OperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericTypeExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeExpression(AngularParser.GenericTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnExp}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExp(AngularParser.ReturnExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostDecrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(AngularParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectDeclarationExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclarationExpression(AngularParser.ObjectDeclarationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Await}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwait(AngularParser.AwaitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionList}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(AngularParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseIfStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatment(AngularParser.ElseIfStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatment(AngularParser.ElseStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#shortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortIf(AngularParser.ShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#shortElseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortElseIf(AngularParser.ShortElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#shortelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortelse(AngularParser.ShortelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrowIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowIf(AngularParser.ArrowIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#callingMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallingMethod(AngularParser.CallingMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#dataStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStructure(AngularParser.DataStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#itemsStructures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemsStructures(AngularParser.ItemsStructuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(AngularParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(AngularParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(AngularParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#compersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompersion(AngularParser.CompersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(AngularParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Describe}
	 * labeled alternative in {@link AngularParser#jasmineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe(AngularParser.DescribeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code It}
	 * labeled alternative in {@link AngularParser#jasmineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIt(AngularParser.ItContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BeforeEach}
	 * labeled alternative in {@link AngularParser#jasmineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeforeEach(AngularParser.BeforeEachContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AfterEach}
	 * labeled alternative in {@link AngularParser#jasmineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfterEach(AngularParser.AfterEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jasmineDescribe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineDescribe(AngularParser.JasmineDescribeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jasmineCallback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineCallback(AngularParser.JasmineCallbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jasmineIt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineIt(AngularParser.JasmineItContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jasmineBeforeEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineBeforeEach(AngularParser.JasmineBeforeEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#jasmineAfterEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineAfterEach(AngularParser.JasmineAfterEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularAttribute(AngularParser.AngularAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlClosingTag(AngularParser.HtmlClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(AngularParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleBlock(AngularParser.StyleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRules(AngularParser.CssRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(AngularParser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelector(AngularParser.CssSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(AngularParser.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclarations(AngularParser.CssDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(AngularParser.CssDeclarationContext ctx);
}