// Generated from C:/Users/pc/Desktop/newproject/newproject/newproject/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package src.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#scriptBlock}.
	 * @param ctx the parse tree
	 */
	void enterScriptBlock(AngularParser.ScriptBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#scriptBlock}.
	 * @param ctx the parse tree
	 */
	void exitScriptBlock(AngularParser.ScriptBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#tsStatement}.
	 * @param ctx the parse tree
	 */
	void enterTsStatement(AngularParser.TsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#tsStatement}.
	 * @param ctx the parse tree
	 */
	void exitTsStatement(AngularParser.TsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(AngularParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(AngularParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#standalone}.
	 * @param ctx the parse tree
	 */
	void enterStandalone(AngularParser.StandaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#standalone}.
	 * @param ctx the parse tree
	 */
	void exitStandalone(AngularParser.StandaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(AngularParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(AngularParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(AngularParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(AngularParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrowMethod}.
	 * @param ctx the parse tree
	 */
	void enterArrowMethod(AngularParser.ArrowMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrowMethod}.
	 * @param ctx the parse tree
	 */
	void exitArrowMethod(AngularParser.ArrowMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngularParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngularParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(AngularParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(AngularParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(AngularParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(AngularParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngOn}.
	 * @param ctx the parse tree
	 */
	void enterNgOn(AngularParser.NgOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngOn}.
	 * @param ctx the parse tree
	 */
	void exitNgOn(AngularParser.NgOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorDecleration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDecleration(AngularParser.ConstructorDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorDecleration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDecleration(AngularParser.ConstructorDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInputDeclaration(AngularParser.InputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInputDeclaration(AngularParser.InputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#outputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOutputDeclaration(AngularParser.OutputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#outputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOutputDeclaration(AngularParser.OutputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AngularParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AngularParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(AngularParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(AngularParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectDecleration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDecleration(AngularParser.ObjectDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectDecleration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDecleration(AngularParser.ObjectDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectName}.
	 * @param ctx the parse tree
	 */
	void enterObjectName(AngularParser.ObjectNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectName}.
	 * @param ctx the parse tree
	 */
	void exitObjectName(AngularParser.ObjectNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectInit}.
	 * @param ctx the parse tree
	 */
	void enterObjectInit(AngularParser.ObjectInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectInit}.
	 * @param ctx the parse tree
	 */
	void exitObjectInit(AngularParser.ObjectInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(AngularParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(AngularParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(AngularParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(AngularParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataStructureExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDataStructureExpression(AngularParser.DataStructureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataStructureExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDataStructureExpression(AngularParser.DataStructureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReturn(AngularParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReturn(AngularParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDotExpression(AngularParser.DotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDotExpression(AngularParser.DotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(AngularParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(AngularParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeCastExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeCastExpression(AngularParser.TypeCastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeCastExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeCastExpression(AngularParser.TypeCastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(AngularParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(AngularParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallingMethodExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallingMethodExpression(AngularParser.CallingMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallingMethodExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallingMethodExpression(AngularParser.CallingMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(AngularParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(AngularParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowMethodExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrowMethodExpression(AngularParser.ArrowMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowMethodExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrowMethodExpression(AngularParser.ArrowMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(AngularParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(AngularParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(AngularParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(AngularParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectNameExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectNameExpression(AngularParser.ObjectNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectNameExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectNameExpression(AngularParser.ObjectNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAssertionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeAssertionExpression(AngularParser.TypeAssertionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAssertionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeAssertionExpression(AngularParser.TypeAssertionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(AngularParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(AngularParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionalChainingExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOptionalChainingExpression(AngularParser.OptionalChainingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionalChainingExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOptionalChainingExpression(AngularParser.OptionalChainingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(AngularParser.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(AngularParser.OperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericTypeExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeExpression(AngularParser.GenericTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericTypeExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeExpression(AngularParser.GenericTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnExp}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReturnExp(AngularParser.ReturnExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnExp}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReturnExp(AngularParser.ReturnExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(AngularParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(AngularParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectDeclarationExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclarationExpression(AngularParser.ObjectDeclarationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectDeclarationExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclarationExpression(AngularParser.ObjectDeclarationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Await}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAwait(AngularParser.AwaitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Await}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAwait(AngularParser.AwaitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionList}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(AngularParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionList}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(AngularParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elseIfStatment}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatment(AngularParser.ElseIfStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseIfStatment}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatment(AngularParser.ElseIfStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elseStatment}.
	 * @param ctx the parse tree
	 */
	void enterElseStatment(AngularParser.ElseStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseStatment}.
	 * @param ctx the parse tree
	 */
	void exitElseStatment(AngularParser.ElseStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#shortIf}.
	 * @param ctx the parse tree
	 */
	void enterShortIf(AngularParser.ShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#shortIf}.
	 * @param ctx the parse tree
	 */
	void exitShortIf(AngularParser.ShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#shortElseIf}.
	 * @param ctx the parse tree
	 */
	void enterShortElseIf(AngularParser.ShortElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#shortElseIf}.
	 * @param ctx the parse tree
	 */
	void exitShortElseIf(AngularParser.ShortElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#shortelse}.
	 * @param ctx the parse tree
	 */
	void enterShortelse(AngularParser.ShortelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#shortelse}.
	 * @param ctx the parse tree
	 */
	void exitShortelse(AngularParser.ShortelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrowIf}.
	 * @param ctx the parse tree
	 */
	void enterArrowIf(AngularParser.ArrowIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrowIf}.
	 * @param ctx the parse tree
	 */
	void exitArrowIf(AngularParser.ArrowIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#callingMethod}.
	 * @param ctx the parse tree
	 */
	void enterCallingMethod(AngularParser.CallingMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#callingMethod}.
	 * @param ctx the parse tree
	 */
	void exitCallingMethod(AngularParser.CallingMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#dataStructure}.
	 * @param ctx the parse tree
	 */
	void enterDataStructure(AngularParser.DataStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#dataStructure}.
	 * @param ctx the parse tree
	 */
	void exitDataStructure(AngularParser.DataStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#itemsStructures}.
	 * @param ctx the parse tree
	 */
	void enterItemsStructures(AngularParser.ItemsStructuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#itemsStructures}.
	 * @param ctx the parse tree
	 */
	void exitItemsStructures(AngularParser.ItemsStructuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(AngularParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(AngularParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(AngularParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(AngularParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(AngularParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(AngularParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#compersion}.
	 * @param ctx the parse tree
	 */
	void enterCompersion(AngularParser.CompersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#compersion}.
	 * @param ctx the parse tree
	 */
	void exitCompersion(AngularParser.CompersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(AngularParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(AngularParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jasmineStatement}.
	 * @param ctx the parse tree
	 */
	void enterJasmineStatement(AngularParser.JasmineStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jasmineStatement}.
	 * @param ctx the parse tree
	 */
	void exitJasmineStatement(AngularParser.JasmineStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jasmineDescribe}.
	 * @param ctx the parse tree
	 */
	void enterJasmineDescribe(AngularParser.JasmineDescribeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jasmineDescribe}.
	 * @param ctx the parse tree
	 */
	void exitJasmineDescribe(AngularParser.JasmineDescribeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jasmineCallback}.
	 * @param ctx the parse tree
	 */
	void enterJasmineCallback(AngularParser.JasmineCallbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jasmineCallback}.
	 * @param ctx the parse tree
	 */
	void exitJasmineCallback(AngularParser.JasmineCallbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jasmineIt}.
	 * @param ctx the parse tree
	 */
	void enterJasmineIt(AngularParser.JasmineItContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jasmineIt}.
	 * @param ctx the parse tree
	 */
	void exitJasmineIt(AngularParser.JasmineItContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jasmineBeforeEach}.
	 * @param ctx the parse tree
	 */
	void enterJasmineBeforeEach(AngularParser.JasmineBeforeEachContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jasmineBeforeEach}.
	 * @param ctx the parse tree
	 */
	void exitJasmineBeforeEach(AngularParser.JasmineBeforeEachContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jasmineAfterEach}.
	 * @param ctx the parse tree
	 */
	void enterJasmineAfterEach(AngularParser.JasmineAfterEachContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jasmineAfterEach}.
	 * @param ctx the parse tree
	 */
	void exitJasmineAfterEach(AngularParser.JasmineAfterEachContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void enterAngularAttribute(AngularParser.AngularAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void exitAngularAttribute(AngularParser.AngularAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlClosingTag(AngularParser.HtmlClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlClosingTag(AngularParser.HtmlClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(AngularParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(AngularParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleBlock}.
	 * @param ctx the parse tree
	 */
	void enterStyleBlock(AngularParser.StyleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleBlock}.
	 * @param ctx the parse tree
	 */
	void exitStyleBlock(AngularParser.StyleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssRules}.
	 * @param ctx the parse tree
	 */
	void enterCssRules(AngularParser.CssRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssRules}.
	 * @param ctx the parse tree
	 */
	void exitCssRules(AngularParser.CssRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(AngularParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(AngularParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelector(AngularParser.CssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelector(AngularParser.CssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(AngularParser.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(AngularParser.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclarations(AngularParser.CssDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclarations(AngularParser.CssDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(AngularParser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(AngularParser.CssDeclarationContext ctx);
}