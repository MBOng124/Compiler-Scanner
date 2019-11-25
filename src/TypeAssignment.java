import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.HashMap;

public class TypeAssignment<T> extends javaBaseVisitor<T> {
    HashMap<String, String> data_types;
    HashMap<String, String> values;
    HashMap<String, String> functions;
    /*FOR OOP*/
    HashMap<String, String> class_functions;
    HashMap<String, String> classes;

    public TypeAssignment() {
        data_types = new HashMap<>();
        values = new HashMap<>();
        functions = new HashMap<>();
        classes = new HashMap<>();
        class_functions = new HashMap<>();
    }

    @Override
    public T visitMethodDeclaration(javaParser.MethodDeclarationContext ctx) {
        if(ctx != null){
            String type = ctx.getChild(0).toString();
        }
        return visitChildren(ctx);
    }

    @Override
    public T visitLiteral(javaParser.LiteralContext ctx){
        return visitChildren(ctx);
    }

}
