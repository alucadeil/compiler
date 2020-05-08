package compiler.visitor;

import compiler.grammar.setGrammarBaseVisitor;
import compiler.grammar.setGrammarParser;
import compiler.visitor.exceptions.NotDefinedVariable;
import compiler.visitor.exceptions.NotValidCast;
import org.antlr.v4.runtime.ParserRuleContext;

import javax.print.DocFlavor;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static compiler.config.Config.COMPILE_PACKAGE_NAME;


public class setVisitor extends setGrammarBaseVisitor<String> {
    private String className;
    private Map<String, Type> globalVariable = new HashMap<>();
    private Map<String, Type> localVariable = new HashMap<>();
    private Map<String, Type> functionNames = new HashMap<>();

    public setVisitor(String fileName){
        String fileNameForClass = getStringWithFirstCapital(fileName);
        this.className = replaceDot(fileNameForClass);
    }

    private String getStringWithFirstCapital(String string) {
        return string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase();
    }

    private String replaceDot(String string) {
        return string.replaceAll("[.]", "_");
    }

    private boolean isGlobal(ParserRuleContext ctx){
        return ctx.getParent().getParent() instanceof setGrammarParser.ParseContext;
    }

    private void addVariableToList(ParserRuleContext ctx, String name, Type type) {
        if (isGlobal(ctx)){
            globalVariable.put(name, type);
        } else {
            localVariable.put(name, type);
        }
    }

    private void addToLocalVariableList(String name, Type type){
        localVariable.put(name, type);
    }

    private void clearLocalVariableList(){
        localVariable.clear();
    }

    private void addToFunctionList(String name, Type type){
        functionNames.put(name, type);
    }

    private void checkVariable(String name) {
        if (!(globalVariable.containsKey(name) || localVariable.containsKey(name))){
            try {
                throw new NotDefinedVariable("Variable " + name + " is not defined");
            } catch (NotDefinedVariable notDefinedVariable) {
                logError(notDefinedVariable.getMessage());
                System.exit(-1);
            }
        }
    }

    private void checkFunction(String name) {
        if (!(functionNames.containsKey(name))){
            try {
                throw new NotDefinedVariable("Function " + name + " is not defined");
            } catch (NotDefinedVariable notDefinedVariable) {
                logError(notDefinedVariable.getMessage());
                System.exit(-2);
            }
        }
    }

    private void checkCast(String name, Type needType) {
        try {
            if (localVariable.containsKey(name)) {
                if (!(localVariable.get(name).equals(needType))) {
                    throw new NotValidCast("Variable " + name + " need have type " + needType);
                }
            } else {
                if (!(globalVariable.get(name).equals(needType))) {
                    throw new NotValidCast("Variable " + name + " need have type " + needType);
                }
            }
        } catch (NotValidCast notValidCast) {
            logError(notValidCast.getMessage());
            System.exit(-3);
        }
    }

    private void logError(String message) {
        System.out.println("Compilation Error: " + message);
    }

    private void checkCastFunction(String name, Type needType){
        if (!(functionNames.get(name).equals(needType))){
            try {
                throw new NotValidCast("Function " + name + " need have type " + needType);
            } catch (NotValidCast notValidCast) {
                notValidCast.printStackTrace();
                System.exit(-4);
            }
        }

    }

    private Type getTypeVariable(String name){
        if (localVariable.containsKey(name)) {
            return localVariable.get(name);
        } else {
            return globalVariable.get(name);
        }
    }

    private boolean notExistLocaleVariable(String name){
        return !localVariable.containsKey(name);
    }

    @Override
    public String visitParse(setGrammarParser.ParseContext ctx) {
        String buffer = "// program " + className + " compiled on " + new Date().toString() + "\n";
        buffer += "package " + COMPILE_PACKAGE_NAME + ";\n";
        buffer += "public class " + "Main" + " {\n";
        List<setGrammarParser.CreateContext> createContextList = ctx.create();
        for (setGrammarParser.CreateContext aCreateContextList : createContextList) {
            buffer += "static " + this.visit(aCreateContextList);
            buffer += "\n";
        }
        List<setGrammarParser.FunctionContext> functionContextList = ctx.function();
        for (setGrammarParser.FunctionContext aFunctionContextList : functionContextList) {
            buffer += this.visit(aFunctionContextList);
            buffer += "\n";
        }
        buffer += this.visit(ctx.main());
        buffer += "}\n";
        return buffer;
    }

    @Override
    public String visitMain(setGrammarParser.MainContext ctx) {
        clearLocalVariableList();
        return  "public static void main(String[]args) throws Exception{\n" +
                this.visit(ctx.start()) +
                "}\n";
    }

    @Override
    public String visitStart(setGrammarParser.StartContext ctx) {
        String buffer = "";
        for (int children = 0; children < ctx.getChildCount(); children++){
            buffer += "";
            buffer += this.visit(ctx.getChild(children));
            buffer += "\n";
        }
        return buffer;
    }

    @Override
    public String visitCreate_set(setGrammarParser.Create_setContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)){
            addVariableToList(ctx, name, Type.SET);
            newVariable = Type.SET.toString() + " ";
        }
        String nameObject = this.visit(ctx.name_object_set());
        return newVariable + name + " = " + nameObject;
    }

    @Override
    public String visitCreate_element(setGrammarParser.Create_elementContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)){
            addVariableToList(ctx, name, Type.ELEMENT);
            newVariable = Type.ELEMENT.toString() + " ";
        }
        String nameObject = this.visit(ctx.name_object_element());
        return newVariable + name + " = " + nameObject;
    }

    @Override
    public String visitCreate_string(setGrammarParser.Create_stringContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)){
            addVariableToList(ctx, name, Type.STRING);
            newVariable = Type.STRING.toString() + " ";
        }
        String nameObject = this.visit(ctx.name_object_string());
        return newVariable + name + " = " + nameObject;
    }

    @Override
    public String visitCreate_int(setGrammarParser.Create_intContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)){
            addVariableToList(ctx, name, Type.INTEGER);
            newVariable = Type.INTEGER.toString() + " ";
        }
        String nameObject = this.visit(ctx.name_object_int());
        return newVariable + name + " = " + nameObject;
    }

    @Override
    public String visitNameObjectSet(setGrammarParser.NameObjectSetContext ctx) {
        setGrammarParser.Create_setContext context = (setGrammarParser.Create_setContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        return "new " + type + "(" + ctx.STRING().getText() + ");";
    }

    @Override
    public String visitIdSet(setGrammarParser.IdSetContext ctx) {
        String right = ctx.ID().getText();
        checkVariable(right);
        setGrammarParser.Create_setContext context = (setGrammarParser.Create_setContext) ctx.getParent();
        String left = context.ID().getText();
        checkCast(right, getTypeVariable(left));
        return right + ";";
    }

    @Override
    public String visitSet_operations(setGrammarParser.Set_operationsContext ctx) {
        String resultVariable = ctx.ID(0).getText();
        String newVariable = "";
        if (notExistLocaleVariable(resultVariable)){
            addVariableToList(ctx, resultVariable, Type.SET);
            newVariable = Type.SET.toString();
        }
        checkVariable(resultVariable);
        String leftVariable = ctx.ID(1).getText();
        checkVariable(leftVariable);
        String rightVariable = ctx.ID(2).getText();
        checkVariable(rightVariable);

        return newVariable + " " + resultVariable + " = " + leftVariable + this.visit(ctx.set_operation()) + rightVariable + ");";
    }

    @Override
    public String visitInsersionOperation(setGrammarParser.InsersionOperationContext ctx) {
        return ".insersion(";
    }

    @Override
    public String visitUnionOperation(setGrammarParser.UnionOperationContext ctx) {
        return ".union(";
    }

    @Override
    public String visitComplementsOperation(setGrammarParser.ComplementsOperationContext ctx) {
        return ".complements(";
    }

    @Override
    public String visitCartesianProductOperation(setGrammarParser.CartesianProductOperationContext ctx) {
        return ".cartesianProduct(";
    }

    @Override
    public String visitPretty_print(setGrammarParser.Pretty_printContext ctx) {
        String variableName = ctx.ID().getText();
        checkVariable(variableName);

        return variableName + ".pretty()";
    }

    @Override
    public String visitFunctionCallSet(setGrammarParser.FunctionCallSetContext ctx) {
        setGrammarParser.Function_callContext context = ctx.function_call();
        String name = context.ID().getText();
        checkFunction(name);
        setGrammarParser.Create_setContext contextP = (setGrammarParser.Create_setContext) ctx.getParent();
        String left = contextP.ID().getText();
        checkCastFunction(name, getTypeVariable(left));
        return name + this.visit(context.param_call());
    }

    @Override
    public String visitNameObjectElement(setGrammarParser.NameObjectElementContext ctx) {
        setGrammarParser.Create_elementContext context = (setGrammarParser.Create_elementContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        return "new " + type + "(" + ctx.STRING().getText() + ");";
    }

    @Override
    public String visitIntObjectElement(setGrammarParser.IntObjectElementContext ctx) {
        setGrammarParser.Create_intContext context = (setGrammarParser.Create_intContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        return "new " + type + "(" + ctx.INT().getText() + ");";
    }

    @Override
    public String visitNameObjectString(setGrammarParser.NameObjectStringContext ctx) {
        setGrammarParser.Create_stringContext context = (setGrammarParser.Create_stringContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        return "new " + type + "(" + ctx.STRING().getText() + ");";
    }

    @Override
    public String visitNameObjectInt(setGrammarParser.NameObjectIntContext ctx) {
        setGrammarParser.Create_intContext context = (setGrammarParser.Create_intContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        return "new " + type + "(" + ctx.INT().getText() + ");";
    }

    @Override
    public String visitIdElement(setGrammarParser.IdElementContext ctx) {
        String right = ctx.ID().getText();
        checkVariable(right);
        setGrammarParser.Create_elementContext context = (setGrammarParser.Create_elementContext) ctx.getParent();
        String left = context.ID().getText();
        checkCast(right, getTypeVariable(left));
        return right + ";";
    }

    @Override
    public String visitFunctionCallElement(setGrammarParser.FunctionCallElementContext ctx) {
        setGrammarParser.Function_callContext context = ctx.function_call();
        String name = context.ID().getText();
        checkFunction(name);
        setGrammarParser.Create_elementContext contextP = (setGrammarParser.Create_elementContext) ctx.getParent();
        String left = contextP.ID().getText();
        checkCastFunction(name, getTypeVariable(left));
        return name + this.visit(context.param_call());
    }

    @Override
    public String visitPush_in_set(setGrammarParser.Push_in_setContext ctx) {
        String name = ctx.id.getText();
        checkVariable(name);
        String push = this.visit(ctx.push_more());
        return name + push;
    }

    @Override
    public String visitPushMore(setGrammarParser.PushMoreContext ctx) {
        String push = ctx.ID().getText();
        checkVariable(push);
        return ".add(" + push + ")" + this.visit(ctx.push_more());
    }

    @Override
    public String visitPushOne(setGrammarParser.PushOneContext ctx) {
        String push = ctx.ID().getText();
        checkVariable(push);
        return ".add(" + push + ");";
    }

    @Override
    public String visitPull_from_set(setGrammarParser.Pull_from_setContext ctx) {
        String name = ctx.id.getText();
        checkVariable(name);
        String push = this.visit(ctx.pull_more());
        return name + push;
    }

    @Override
    public String visitPullMore(setGrammarParser.PullMoreContext ctx) {
        String pull = ctx.ID().getText();
        checkVariable(pull);
        return ".remove(" + pull + ")" + this.visit(ctx.pull_more());
    }

    @Override
    public String visitPullOne(setGrammarParser.PullOneContext ctx) {
        String pull = ctx.ID().getText();
        checkVariable(pull);
        return ".remove(" + pull + ");";
    }

    @Override
    public String visitPrint(setGrammarParser.PrintContext ctx){
        return "System.out.println(" + this.visit(ctx.print_expr()) + ");";
    }

    @Override
    public String visitConcatString(setGrammarParser.ConcatStringContext ctx) {
        String string1 = this.visit(ctx.print_expr(0));
        String string2 = this.visit(ctx.print_expr(1));
        return string1 + " + " + string2;
    }

    @Override
    public String visitPrintId(setGrammarParser.PrintIdContext ctx) {
        String name = ctx.ID().toString();
        checkVariable(name);
        return name;
    }

    @Override
    public String visitPrintInt(setGrammarParser.PrintIntContext ctx) {
        return ctx.INT().getText();
    }

    @Override
    public String visitPrintString(setGrammarParser.PrintStringContext ctx) {
        return ctx.STRING().getText();
    }


    @Override public String visitStat_block(setGrammarParser.Stat_blockContext ctx) {
        Map<String, Type> beforeStatBlock = new HashMap(localVariable);
        String block = "{\n" + this.visit(ctx.start()) +"}";
        localVariable = beforeStatBlock;
        return block;
    }

    @Override
    public String visitSwitch_stat(setGrammarParser.Switch_statContext ctx) {
        String id = ctx.ID().getText();
        checkVariable(id);
        String buffer = "switch (" + id + ") " + " { \n";
        String caseBuffer = "";
        List<setGrammarParser.Case_blockContext> cases = ctx.case_block();
        for (int i = 0; i < cases.size(); i++) {
            if(cases.get(i).CASE() != null) {
               String caseStr = "\t" + "case " + this.visit(cases.get(i).value()) + ": " + "\n";
               String block = "\t\t" + this.visit(cases.get(i).start());
               caseBuffer = caseBuffer + caseStr + block + "\t\t" + "break;\n";
            } else if (cases.get(i).DEFAULT() != null) {
                String defaultStr = "\t" +  "default: " + "\n";
                String block = "\t\t" + this.visit(cases.get(i).start());
                caseBuffer = caseBuffer + defaultStr + block + "break;\n";
            }
        }
        buffer += caseBuffer + "}";
        System.out.println(buffer);
        return  buffer;
    }

    @Override
    public String visitCase_block(setGrammarParser.Case_blockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitCaseInt(setGrammarParser.CaseIntContext ctx) {
        String buffer = "";
        String val = ctx.INT().getText();
        buffer += val;
        return buffer;
    }

    @Override
    public String visitCaseStr(setGrammarParser.CaseStrContext ctx) {
        String buffer = "";
        String str = ctx.STRING().getText();
        buffer += str;
        return buffer;
    }

    @Override
    public String visitCaseId(setGrammarParser.CaseIdContext ctx) {
        String buffer = "";
        checkVariable(ctx.ID().getText());
        String str = ctx.ID().getText();
        buffer += str;
        return buffer;
    }

    @Override
    public String visitIf_stat(setGrammarParser.If_statContext ctx) {
        String buffer = "";
            List<setGrammarParser.Condition_blockContext> conditions =  ctx.condition_block();
            for(int index = 0; index < conditions.size(); index++) {
                String conditionString = this.visit(conditions.get(index).condition());
                String negation ="";
                if (conditions.get(index).NEGATION() != null){
                    negation = "!";
                }
                buffer += "if (" + negation + conditionString + ")";
                buffer += this.visit(conditions.get(index).stat_block());
                if ((index + 1) < conditions.size()){
                    buffer += "else ";
                }
            }
            if(ctx.stat_block() != null) {
                buffer += "else" + this.visit(ctx.stat_block());
        }
        return buffer;
    }

    @Override public String visitCondition_block(setGrammarParser.Condition_blockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitEqualityExpr(setGrammarParser.EqualityExprContext ctx) {
        String left = ctx.ID(0).getText();
        checkVariable(left);
        String right = ctx.ID(1).getText();
        checkVariable(right);
        switch (ctx.op.getType()) {
            case setGrammarParser.EQ:
                return left + ".equals("+ right + ")";
            case setGrammarParser.NEQ:
                return "!" + left + ".equals("+ right + ")";
            default:
                throw new RuntimeException("Unknown operator: " + ctx.op.getText());
        }
    }

    @Override public String visitContain(setGrammarParser.ContainContext ctx) {
        String left = ctx.ID(0).getText();
        checkVariable(left);
        checkCast(left, Type.SET);
        String right = ctx.ID(1).getText();
        checkVariable(right);
        return left + ".contains("+ right + ")";
    }

    @Override public String visitCheckType(setGrammarParser.CheckTypeContext ctx) {
        String left = ctx.ID().getText();
        checkVariable(left);
        String right = ctx.type().getText();
        right = getStringWithFirstCapital(right);
        return left + ".getClass().getSimpleName().equals(\"" + right + "\")";
    }

    @Override
    public String visitWhile_stat(setGrammarParser.While_statContext ctx) {
        return "while (" + this.visit(ctx.condition_block().condition()) + ")" +
                this.visit(ctx.condition_block().stat_block());
    }

    @Override
    public String visitForeach_stat(setGrammarParser.Foreach_statContext ctx) {
        Map<String, Type> beforeStatBlock = new HashMap(localVariable);
        String forBlock = "for (" + this.visit(ctx.condition_for_each()) + ")" + this.visit(ctx.stat_block());
        localVariable = beforeStatBlock;
        return forBlock;
    }

    @Override
    public String visitForEachElement(setGrammarParser.ForEachElementContext ctx) {
        String left = ctx.ID(0).getText();
        addToLocalVariableList(left, Type.ELEMENT);
        String right = ctx.ID(1).getText();
        checkVariable(right);
        checkCast(right, Type.SET);
        return "Element " + left + " : "+ right + ".getElements()";
    }

    @Override
    public String visitVoidFunction(setGrammarParser.VoidFunctionContext ctx) {
        clearLocalVariableList();
        String name = ctx.ID().getText();
        addToFunctionList(name, Type.VOID);
        return "private static void " + name + this.visit(ctx.param()) + this.visit(ctx.stat_block());
    }

    @Override
    public String visitReturnFunction(setGrammarParser.ReturnFunctionContext ctx) {
        clearLocalVariableList();
        String name = ctx.ID().getText();
        String returnType = ctx.type().getText();
        returnType = getStringWithFirstCapital(returnType);
        addToFunctionList(name, Type.getTypeByString(returnType));
        return "private static " + returnType + " " + name +
                this.visit(ctx.param()) +
                this.visit(ctx.stat_block_with_return());
    }

    @Override
    public String visitStat_block_with_return(setGrammarParser.Stat_block_with_returnContext ctx) {
        return "{\n" + this.visit(ctx.start()) + this.visit(ctx.return_id()) +"}";
    }

    @Override
    public String visitReturn_id(setGrammarParser.Return_idContext ctx) {
        String id = ctx.ID().getText();
        checkVariable(id);
        setGrammarParser.ReturnFunctionContext context = (setGrammarParser.ReturnFunctionContext) ctx.getParent().getParent();
        checkCast(id, Type.getTypeByString(getStringWithFirstCapital(context.type().getText())));
        return "return " + id + ";\n";
    }

    @Override
    public String visitFunction_call(setGrammarParser.Function_callContext ctx) {
        String name = ctx.ID().getText();
        checkFunction(name);
        return name + this.visit(ctx.param_call());
    }


    @Override
    public String visitParam_call(setGrammarParser.Param_callContext ctx) {
        String args = "";
        if (ctx.arg_call() != null){
            args = this.visit(ctx.arg_call());
        }
        return "(" + args + ");";
    }

    @Override
    public String visitParamCallArgs(setGrammarParser.ParamCallArgsContext ctx) {
        String name = ctx.ID().getText();
        checkVariable(name);
        return name + ", " + this.visit(ctx.arg_call());
    }

    @Override
    public String visitParamCallArg(setGrammarParser.ParamCallArgContext ctx) {
        String name = ctx.ID().getText();
        checkVariable(name);
        return name;
    }

    @Override
    public String visitParam(setGrammarParser.ParamContext ctx) {
        String args = "";
        if (ctx.arg() != null){
            args = this.visit(ctx.arg());
        }
        return "(" + args + ")";
    }

    @Override
    public String visitParamArgs(setGrammarParser.ParamArgsContext ctx) {
        String type = ctx.type().getText();
        type = getStringWithFirstCapital(type);
        String name = ctx.ID().getText();
        addToLocalVariableList(name, Type.getTypeByString(type));
        return type + " " + name + ", " + this.visit(ctx.arg());
    }

    @Override
    public String visitParamArg(setGrammarParser.ParamArgContext ctx) {
        String type = ctx.type().getText();
        type = getStringWithFirstCapital(type);
        String name = ctx.ID().getText();
        addToLocalVariableList(name, Type.getTypeByString(type));
        return type + " " + name;
    }
}
