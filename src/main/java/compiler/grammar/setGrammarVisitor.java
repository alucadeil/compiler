// Generated from D:/Programs/IntelliJ IDEA 2019.3.4/proj/SetLanguage-master/src/main/java/compiler/grammar\setGrammar.g4 by ANTLR 4.8

package compiler.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link setGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface setGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(setGrammarParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(setGrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(setGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(setGrammarParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#set_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_operations(setGrammarParser.Set_operationsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insersionOperation}
	 * labeled alternative in {@link setGrammarParser#set_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsersionOperation(setGrammarParser.InsersionOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionOperation}
	 * labeled alternative in {@link setGrammarParser#set_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionOperation(setGrammarParser.UnionOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complementsOperation}
	 * labeled alternative in {@link setGrammarParser#set_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplementsOperation(setGrammarParser.ComplementsOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cartesianProductOperation}
	 * labeled alternative in {@link setGrammarParser#set_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianProductOperation(setGrammarParser.CartesianProductOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(setGrammarParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#create_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_set(setGrammarParser.Create_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#create_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_element(setGrammarParser.Create_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#create_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_string(setGrammarParser.Create_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#create_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_int(setGrammarParser.Create_intContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectSet}
	 * labeled alternative in {@link setGrammarParser#name_object_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectSet(setGrammarParser.NameObjectSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallSet}
	 * labeled alternative in {@link setGrammarParser#name_object_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallSet(setGrammarParser.FunctionCallSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idSet}
	 * labeled alternative in {@link setGrammarParser#name_object_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSet(setGrammarParser.IdSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectElement}
	 * labeled alternative in {@link setGrammarParser#name_object_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectElement(setGrammarParser.NameObjectElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intObjectElement}
	 * labeled alternative in {@link setGrammarParser#name_object_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntObjectElement(setGrammarParser.IntObjectElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallElement}
	 * labeled alternative in {@link setGrammarParser#name_object_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallElement(setGrammarParser.FunctionCallElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idElement}
	 * labeled alternative in {@link setGrammarParser#name_object_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdElement(setGrammarParser.IdElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectString}
	 * labeled alternative in {@link setGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectString(setGrammarParser.NameObjectStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectInt}
	 * labeled alternative in {@link setGrammarParser#name_object_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectInt(setGrammarParser.NameObjectIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#push_in_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush_in_set(setGrammarParser.Push_in_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#pull_from_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPull_from_set(setGrammarParser.Pull_from_setContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pushMore}
	 * labeled alternative in {@link setGrammarParser#push_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushMore(setGrammarParser.PushMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pushOne}
	 * labeled alternative in {@link setGrammarParser#push_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushOne(setGrammarParser.PushOneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pullMore}
	 * labeled alternative in {@link setGrammarParser#pull_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPullMore(setGrammarParser.PullMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pullOne}
	 * labeled alternative in {@link setGrammarParser#pull_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPullOne(setGrammarParser.PullOneContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#switch_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_stat(setGrammarParser.Switch_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#case_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_block(setGrammarParser.Case_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseId}
	 * labeled alternative in {@link setGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseId(setGrammarParser.CaseIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseStr}
	 * labeled alternative in {@link setGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStr(setGrammarParser.CaseStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseInt}
	 * labeled alternative in {@link setGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseInt(setGrammarParser.CaseIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(setGrammarParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(setGrammarParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(setGrammarParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(setGrammarParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#foreach_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_stat(setGrammarParser.Foreach_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link setGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(setGrammarParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contain}
	 * labeled alternative in {@link setGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContain(setGrammarParser.ContainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link setGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckType(setGrammarParser.CheckTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forEachElement}
	 * labeled alternative in {@link setGrammarParser#condition_for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachElement(setGrammarParser.ForEachElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(setGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatString}
	 * labeled alternative in {@link setGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatString(setGrammarParser.ConcatStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link setGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintId(setGrammarParser.PrintIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pretty_print}
	 * labeled alternative in {@link setGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPretty_print(setGrammarParser.Pretty_printContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link setGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintInt(setGrammarParser.PrintIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printString}
	 * labeled alternative in {@link setGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintString(setGrammarParser.PrintStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(setGrammarParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#param_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_call(setGrammarParser.Param_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link setGrammarParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArg(setGrammarParser.ParamCallArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link setGrammarParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArgs(setGrammarParser.ParamCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link setGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(setGrammarParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link setGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(setGrammarParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block_with_return(setGrammarParser.Stat_block_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#return_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_id(setGrammarParser.Return_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(setGrammarParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link setGrammarParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArg(setGrammarParser.ParamArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link setGrammarParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArgs(setGrammarParser.ParamArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link setGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(setGrammarParser.TypeContext ctx);
}