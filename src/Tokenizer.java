import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Tokenizer {
    public static void main(String[] args) throws IOException, ParseCancellationException {
        CharStream stream = fromFileName("parser_test_3.txt");
        javaLexer lexer = new javaLexer(stream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

//        TokenStream tokens = new CommonTokenStream(lexer);

        int id;
        String token_name, id_lower;

//        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
//            id = token.getType();
//            token_name = token.getText();
//            print_id(lexer, token_name, id);
//        }

//        TokenStream tokenStream = new CommonTokenStream(lexer);
//        javaParser parser = new javaParser(tokens);
//        parser.removeErrorListeners();
//        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
////
//        ParserRuleContext tree1 = parser.expression();
//        javaBaseVisitor rules = new javaBaseVisitor();
//
//        rules.visit(tree1);

//        ParseTree tree = parser.compilationUnit();
//        System.out.println(tree.toStringTree(parser));
//        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
//        viewer.open();


        TokenStream tokenStream = new CommonTokenStream(lexer);
        javaParser parser = new javaParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);


        ParseTree tree = parser.compilationUnit();
//        System.out.println(tree.toStringTree(parser));
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.open();
    }


    public static void print_id(javaLexer lexer, String token_name, int id){
        String id_lower = lexer.VOCABULARY.getSymbolicName(id).toLowerCase();
        if(id_lower.contains("paren")||id_lower.contains("brace")||id_lower.contains("semi"))
            System.out.println(token_name+" - separator");
        else if(id_lower.contains("literal"))
            System.out.println(token_name+" - literal");
        else if(id_lower.contains("identifier"))
            System.out.println(token_name+" - identifier");
        else if(id_lower.equals("public")|| id_lower.equals("private")|| id_lower.equals("void")||id_lower.equals("class")||
                id_lower.equals("int")|| id_lower.equals("float") || id_lower.equals("new")|| id_lower.equals("if")||
                id_lower.equals("else") || id_lower.equals("while") || id_lower.equals("for") || id_lower.equals("return") || id_lower.equals("boolean"))
            System.out.println(token_name+" - keyword");
        else if(id_lower.equals("dot") || id_lower.equals("assign") || id_lower.equals("and") || id_lower.equals("or") || id_lower.equals("bang")
                || id_lower.contains("brack") ||id_lower.equals("add") || id_lower.equals("gt") || id_lower.equals("lt"))
            System.out.println(token_name+" - operator");
        else
            System.out.println(token_name+" - other");
    }

}

class ThrowingErrorListener extends ConsoleErrorListener {

    public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
//        if(msg.contains("expecting {'++', '--'}"))
//            System.out.println("line " + line + ":" + charPositionInLine + "mismatched input expecting {';'}");
//        else if(msg.replace(' ', '\0').contains(",,"))
//            System.out.println("line " + line + ":" + charPositionInLine + " expecting {')', value");
//        else if(msg.matches("[0-9]* \\(\\+\\+\\) [0-9a-zA-Z]+ \\(\\+\\+\\) ") ||
//                msg.matches("[0-9]* \\(\\+\\+\\) [0-9a-zA-Z]+ \\(\\+\\+\\) ")) {
//
//        }
//        else System.out.println("line " + line + ":" + charPositionInLine + " " + msg);
        String message = msg;

        String error = msg.split("'")[1];

        if(msg.contains("missing"))
            System.out.println("Syntax Error at Line " + line + " missing " + error);
        else if(msg.contains("extraneous input"))
            System.out.println("Syntax Error at Line " + line + " extra character/s " + "before input " + error);
        else if(msg.contains("mismatched input"))
            System.out.println("Syntax Error at Line " + line + " unexpected " + error);
        else if(msg.contains("no viable alternative at input")){
            System.out.println("Syntax Error at Line " + line + " " + message);
        }
        else if(msg.contains("cannot find symbol")){
            System.out.println("Logical Error at Line " + line + " missing symbol " + error);
        }
        else if(msg.contains("variable might not have been initialized")){
            System.out.println("Syntax Error at Line" + line + "variable " + error + " is missing initialization");
        }

        else if(msg.contains("Cannot resolve symbol")){
            System.out.println("The variable " + error + " does not exist yet and cannot be accessed");
        }
        else
            System.out.println("line " + line + ":" + charPositionInLine + " " + msg);

        //outofbounds

    }

}
