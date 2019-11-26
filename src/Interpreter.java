import java.util.HashMap;
import java.util.Scanner;

public class Interpreter<T> extends javaBaseVisitor<T>{
    HashMap<String, String> var_types;
    HashMap<String, String> variables;
    HashMap<String, String> function_declaration;
    HashMap<String, String> function_definition;
    /*FOR OOP*/
    HashMap<String, String> class_functions;
    HashMap<String, String> classes;


    public Interpreter(HashMap<String, String> var_types, HashMap<String, String> variables,
                            HashMap<String, String> function_declaration, HashMap<String,
            String> function_definition) {
        this.var_types = var_types;
        this.variables = variables;
        this.function_declaration = function_declaration;
        this.function_definition = function_definition;
    }

    @Override public T visitDisplayStatement(javaParser.DisplayStatementContext ctx) {
        if(ctx != null) {
            String text = ctx.argumentList(0).getChild(0).getText();
            if(text.charAt(0) == '"' && text.charAt(text.length()-1) == '"') {
                    System.out.println(text.substring(1, text.length() - 1));
            } else {
                System.out.println(variables.get(text));
            }
        }
        return visitChildren(ctx);
    }

    @Override public T visitReadStatement(javaParser.ReadStatementContext ctx) {
        String var = ctx.identifier().Identifier().getSymbol().getText();
        String dt = var_types.get(var);
        Scanner s = new Scanner(System.in);
        try {
            String a = s.nextLine();
            if (dt.equalsIgnoreCase("int")) {
                Integer.parseInt(a);
            } else if (dt.equalsIgnoreCase("float")) {
                Float.parseFloat(a);
            } else if (dt.equalsIgnoreCase("Double")) {
                Double.parseDouble(a);
            }
            variables.put(var, a);
        } catch (Exception e) {
            throw new Error("Incompatible Data type " + var_types.get(var)+" expected!");
        }

        return visitChildren(ctx);
    }
}
