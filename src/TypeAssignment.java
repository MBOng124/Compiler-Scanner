import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.HashMap;

public class TypeAssignment<T> extends javaBaseVisitor<T> {
    HashMap<String, String> var_types;
    HashMap<String, String> variables;
    HashMap<String, String> function_declaration;
    HashMap<String, String> function_definition;
    /*FOR OOP*/
    HashMap<String, String> class_functions;
    HashMap<String, String> classes;

    public TypeAssignment() {
        var_types = new HashMap<>();
        variables = new HashMap<>();
        function_declaration = new HashMap<>();
        function_definition = new HashMap<>();
        classes = new HashMap<>();
        class_functions = new HashMap<>();
    }

    public HashMap<String, String> getVar_types() {
        return var_types;
    }

    public HashMap<String, String> getVariables() {
        return variables;
    }

    public HashMap<String, String> getFunction_declaration() {
        return function_declaration;
    }

    public HashMap<String, String> getFunction_definition() {
        return function_definition;
    }

    public HashMap<String, String> getClass_functions() {
        return class_functions;
    }

    public HashMap<String, String> getClasses() {
        return classes;
    }

    @Override
    public T visitMethodDeclaration(javaParser.MethodDeclarationContext ctx) {
        if(ctx != null){
            javaParser.MethodHeaderContext temp = ctx.methodHeader();
            String type, name, body;
            type = temp.getChild(0).getText();
            name = temp.getChild(1).getText();
            body = ctx.methodBody().getText();
            if(!function_declaration.containsKey(name)){
                function_definition.put(name, body);
                function_declaration.put(name, type);
            }else if(!type.equalsIgnoreCase(function_declaration.get(name))){
                function_definition.put(name, body);
                function_declaration.put(name, type);
            }else{
                //print error message
            }

        }
        return visitChildren(ctx);
    }

    @Override public T visitAssignment(javaParser.AssignmentContext ctx) {
        if(ctx != null){
            String var_name = ctx.getChild(0).getText();
            String operator = ctx.getChild(1).getText();
            String expression = ctx.getChild(2).getText();
//            System.out.println(var_name + operator + expression);
            if (operator.equals('=')) {
//                String[] expr = expression.split();
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public T visitLocalVariableDeclarationStatement(javaParser.LocalVariableDeclarationStatementContext ctx) {
        if(ctx != null){
            String var = ctx.localVariableDeclaration().getChild(1).getText();
            String dtype = ctx.localVariableDeclaration().getChild(0).getText();
            if(var.contains("=")){//variable is initialized
                String[] split = var.split("=");
                if(!variables.containsKey(split[0])){
                    var_types.put(split[0], dtype);
                    variables.put(split[0], split[1]);
                }else{
                    if(!dtype.equalsIgnoreCase(var_types.get(split[0]))){
                        var_types.put(split[0], dtype);
                        variables.put(split[0], split[1]);
                    }else{
                        //print error message
                    }
                }

            }else{//variable is not initialized
                var_types.put(var, dtype);
                variables.put(var, null);
            }
        }
        return visitChildren(ctx);
    }





}
