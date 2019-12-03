import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.udojava.evalex.Expression;
import com.udojava.evalex.Expression.*;
import static com.udojava.evalex.Expression.e;

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

                System.out.print(text.substring(1, text.length() - 1));

            } else if(text.matches("^\\d+(.\\d+)?$")) {
                text = text.replaceAll(" ", "");
                try {
                    Double.parseDouble(text);
                    System.out.println(text);
                } catch (Exception e) {
                    throw new Error("Invalid parameter for disp(). Expected String or numerals.");
                }
            } else {
                System.out.print(variables.get(text));
            }
        }
        return visitChildren(ctx);
    }



    @Override public T visitNewline(javaParser.NewlineContext ctx) {
        System.out.println();
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

    @Override
    public T visitAdditiveExpression(javaParser.AdditiveExpressionContext ctx) {
        String text = ctx.getText();
        if(text.contains("+")||text.contains("*") || text.contains("-") || text.contains("/")) {
            evalMath(ctx);
        }
        return visitChildren(ctx);
    }

    public BigDecimal evalMath(javaParser.AdditiveExpressionContext ctx){
        BigDecimal result;
        String text = ctx.getText();
        StringBuilder chars = new StringBuilder();
        ArrayList<String> operands, operators;
        operands = new ArrayList<>();
        operators = new ArrayList<>();
        for(int i = 0; i < text.length(); i++){
            char ins = text.charAt(i);
            if(ins != '+' && ins != '-' && ins != '*' && ins != '/'){
                chars.append(ins);
            }else if(ins == '+' || ins == '-' || ins == '*' || ins == '/') {
                String operand = chars.toString();
                operands.add(operand);
                operators.add(Character.toString(ins));
                chars = new StringBuilder();
            }
        }
        operands.add(chars.toString());
        StringBuilder expression = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i < operands.size()){
            if(isNumeric(operands.get(i))){
                expression.append(operands.get(i));
                i++;
            }else{
                if(variables.containsKey(operands.get(i))){
                    expression.append(variables.get(operands.get(i)));
                    i++;
                }
            }
            if(j < operators.size()){
                expression.append(operators.get(j));
                j++;
            }
        }
        String exp = expression.toString();
        Expression eval = new Expression(exp);
        eval.setPrecision(2);
        result = eval.eval();
        return result;
    }

    public static boolean isNumeric(String str) {
        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(str, pos);
        return str.length() == pos.getIndex();
    }


}
