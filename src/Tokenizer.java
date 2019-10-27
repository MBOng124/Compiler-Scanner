import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.ArrayList;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Tokenizer {
    public static void main(String[] args) throws IOException {
        CharStream stream = fromFileName("input.txt");
        javaLexer lexer = new javaLexer(stream);
        int id;
        String token_name, id_lower;
        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
            id = token.getType();
            token_name = token.getText();
            print_id(lexer, token_name, id);
        }
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
