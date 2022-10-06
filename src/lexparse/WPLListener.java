// Generated from WPL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WPLParser}.
 */
public interface WPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WPLParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(WPLParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(WPLParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(WPLParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(WPLParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(WPLParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(WPLParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(WPLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(WPLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#typeGen}.
	 * @param ctx the parse tree
	 */
	void enterTypeGen(WPLParser.TypeGenContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#typeGen}.
	 * @param ctx the parse tree
	 */
	void exitTypeGen(WPLParser.TypeGenContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(WPLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(WPLParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(WPLParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(WPLParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#intDec}.
	 * @param ctx the parse tree
	 */
	void enterIntDec(WPLParser.IntDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#intDec}.
	 * @param ctx the parse tree
	 */
	void exitIntDec(WPLParser.IntDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#intDef}.
	 * @param ctx the parse tree
	 */
	void enterIntDef(WPLParser.IntDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#intDef}.
	 * @param ctx the parse tree
	 */
	void exitIntDef(WPLParser.IntDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#strDec}.
	 * @param ctx the parse tree
	 */
	void enterStrDec(WPLParser.StrDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#strDec}.
	 * @param ctx the parse tree
	 */
	void exitStrDec(WPLParser.StrDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#strDef}.
	 * @param ctx the parse tree
	 */
	void enterStrDef(WPLParser.StrDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#strDef}.
	 * @param ctx the parse tree
	 */
	void exitStrDef(WPLParser.StrDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#boolDec}.
	 * @param ctx the parse tree
	 */
	void enterBoolDec(WPLParser.BoolDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#boolDec}.
	 * @param ctx the parse tree
	 */
	void exitBoolDec(WPLParser.BoolDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#boolDef}.
	 * @param ctx the parse tree
	 */
	void enterBoolDef(WPLParser.BoolDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#boolDef}.
	 * @param ctx the parse tree
	 */
	void exitBoolDef(WPLParser.BoolDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#inferDec}.
	 * @param ctx the parse tree
	 */
	void enterInferDec(WPLParser.InferDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#inferDec}.
	 * @param ctx the parse tree
	 */
	void exitInferDec(WPLParser.InferDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#inferDef}.
	 * @param ctx the parse tree
	 */
	void enterInferDef(WPLParser.InferDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#inferDef}.
	 * @param ctx the parse tree
	 */
	void exitInferDef(WPLParser.InferDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(WPLParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(WPLParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(WPLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(WPLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(WPLParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(WPLParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(WPLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(WPLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#externFunction}.
	 * @param ctx the parse tree
	 */
	void enterExternFunction(WPLParser.ExternFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#externFunction}.
	 * @param ctx the parse tree
	 */
	void exitExternFunction(WPLParser.ExternFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(WPLParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(WPLParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#externProcedure}.
	 * @param ctx the parse tree
	 */
	void enterExternProcedure(WPLParser.ExternProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#externProcedure}.
	 * @param ctx the parse tree
	 */
	void exitExternProcedure(WPLParser.ExternProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(WPLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(WPLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(WPLParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(WPLParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(WPLParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(WPLParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(WPLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(WPLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(WPLParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(WPLParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(WPLParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(WPLParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(WPLParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(WPLParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(WPLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(WPLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(WPLParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(WPLParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(WPLParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(WPLParser.StrContext ctx);
}