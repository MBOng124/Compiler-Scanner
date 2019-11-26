// Generated from D:/Baya/COMPILER MP/Compiler-Scanner/src\java.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class javaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ABSTRACT=15, ASSERT=16, 
		BOOLEAN=17, BREAK=18, BYTE=19, CASE=20, CATCH=21, CHAR=22, CLASS=23, CONST=24, 
		CONTINUE=25, DEFAULT=26, DO=27, DOUBLE=28, ELSE=29, ENUM=30, EXTENDS=31, 
		FINAL=32, FINALLY=33, FLOAT=34, FOR=35, IF=36, GOTO=37, IMPLEMENTS=38, 
		IMPORT=39, INSTANCEOF=40, INT=41, INTERFACE=42, LONG=43, NATIVE=44, NEW=45, 
		PACKAGE=46, PRIVATE=47, PROTECTED=48, PUBLIC=49, RETURN=50, SHORT=51, 
		STATIC=52, STRICTFP=53, SUPER=54, SWITCH=55, SYNCHRONIZED=56, THIS=57, 
		THROW=58, THROWS=59, TRANSIENT=60, TRY=61, VOID=62, VOLATILE=63, WHILE=64, 
		DISP=65, SIN=66, NEWLINE=67, UNDER_SCORE=68, IntegerLiteral=69, FloatingPointLiteral=70, 
		BooleanLiteral=71, CharacterLiteral=72, StringLiteral=73, NullLiteral=74, 
		LPAREN=75, RPAREN=76, LBRACE=77, RBRACE=78, LBRACK=79, RBRACK=80, SEMI=81, 
		COMMA=82, DOT=83, ELLIPSIS=84, AT=85, COLONCOLON=86, ASSIGN=87, GT=88, 
		LT=89, BANG=90, TILDE=91, QUESTION=92, COLON=93, ARROW=94, EQUAL=95, LE=96, 
		GE=97, NOTEQUAL=98, AND=99, OR=100, INC=101, DEC=102, ADD=103, SUB=104, 
		MUL=105, DIV=106, BITAND=107, BITOR=108, CARET=109, MOD=110, ADD_ASSIGN=111, 
		SUB_ASSIGN=112, MUL_ASSIGN=113, DIV_ASSIGN=114, AND_ASSIGN=115, OR_ASSIGN=116, 
		XOR_ASSIGN=117, MOD_ASSIGN=118, LSHIFT_ASSIGN=119, RSHIFT_ASSIGN=120, 
		URSHIFT_ASSIGN=121, Identifier=122, WS=123, COMMENT=124, LINE_COMMENT=125;
	public static final int
		RULE_literal = 0, RULE_primitiveType = 1, RULE_numericType = 2, RULE_integralType = 3, 
		RULE_floatingPointType = 4, RULE_referenceType = 5, RULE_classOrInterfaceType = 6, 
		RULE_classType = 7, RULE_classType_lf_classOrInterfaceType = 8, RULE_classType_lfno_classOrInterfaceType = 9, 
		RULE_interfaceType = 10, RULE_interfaceType_lf_classOrInterfaceType = 11, 
		RULE_interfaceType_lfno_classOrInterfaceType = 12, RULE_typeVariable = 13, 
		RULE_arrayType = 14, RULE_dims = 15, RULE_typeParameter = 16, RULE_typeParameterModifier = 17, 
		RULE_typeBound = 18, RULE_additionalBound = 19, RULE_typeArguments = 20, 
		RULE_typeArgumentList = 21, RULE_typeArgument = 22, RULE_wildcard = 23, 
		RULE_wildcardBounds = 24, RULE_moduleName = 25, RULE_packageName = 26, 
		RULE_typeName = 27, RULE_packageOrTypeName = 28, RULE_expressionName = 29, 
		RULE_methodName = 30, RULE_ambiguousName = 31, RULE_compilationUnit = 32, 
		RULE_ordinaryCompilation = 33, RULE_modularCompilation = 34, RULE_packageDeclaration = 35, 
		RULE_packageModifier = 36, RULE_importDeclaration = 37, RULE_singleTypeImportDeclaration = 38, 
		RULE_typeImportOnDemandDeclaration = 39, RULE_singleStaticImportDeclaration = 40, 
		RULE_staticImportOnDemandDeclaration = 41, RULE_typeDeclaration = 42, 
		RULE_moduleDeclaration = 43, RULE_moduleDirective = 44, RULE_requiresModifier = 45, 
		RULE_classDeclaration = 46, RULE_normalClassDeclaration = 47, RULE_classModifier = 48, 
		RULE_typeParameters = 49, RULE_typeParameterList = 50, RULE_superclass = 51, 
		RULE_superinterfaces = 52, RULE_interfaceTypeList = 53, RULE_classBody = 54, 
		RULE_classBodyDeclaration = 55, RULE_classMemberDeclaration = 56, RULE_fieldDeclaration = 57, 
		RULE_fieldModifier = 58, RULE_variableDeclaratorList = 59, RULE_variableDeclarator = 60, 
		RULE_variableDeclaratorId = 61, RULE_variableInitializer = 62, RULE_unannType = 63, 
		RULE_unannPrimitiveType = 64, RULE_unannReferenceType = 65, RULE_unannClassOrInterfaceType = 66, 
		RULE_unannClassType = 67, RULE_unannClassType_lf_unannClassOrInterfaceType = 68, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 69, RULE_unannInterfaceType = 70, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 71, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 72, 
		RULE_unannTypeVariable = 73, RULE_unannArrayType = 74, RULE_methodDeclaration = 75, 
		RULE_methodModifier = 76, RULE_methodHeader = 77, RULE_result = 78, RULE_methodDeclarator = 79, 
		RULE_formalParameterList = 80, RULE_formalParameters = 81, RULE_formalParameter = 82, 
		RULE_variableModifier = 83, RULE_lastFormalParameter = 84, RULE_receiverParameter = 85, 
		RULE_throws_ = 86, RULE_exceptionTypeList = 87, RULE_exceptionType = 88, 
		RULE_methodBody = 89, RULE_instanceInitializer = 90, RULE_staticInitializer = 91, 
		RULE_constructorDeclaration = 92, RULE_constructorModifier = 93, RULE_constructorDeclarator = 94, 
		RULE_simpleTypeName = 95, RULE_constructorBody = 96, RULE_explicitConstructorInvocation = 97, 
		RULE_enumDeclaration = 98, RULE_enumBody = 99, RULE_enumConstantList = 100, 
		RULE_enumConstant = 101, RULE_enumConstantModifier = 102, RULE_enumBodyDeclarations = 103, 
		RULE_interfaceDeclaration = 104, RULE_normalInterfaceDeclaration = 105, 
		RULE_interfaceModifier = 106, RULE_extendsInterfaces = 107, RULE_interfaceBody = 108, 
		RULE_interfaceMemberDeclaration = 109, RULE_constantDeclaration = 110, 
		RULE_constantModifier = 111, RULE_interfaceMethodDeclaration = 112, RULE_interfaceMethodModifier = 113, 
		RULE_annotationTypeDeclaration = 114, RULE_annotationTypeBody = 115, RULE_annotationTypeMemberDeclaration = 116, 
		RULE_annotationTypeElementDeclaration = 117, RULE_annotationTypeElementModifier = 118, 
		RULE_defaultValue = 119, RULE_annotation = 120, RULE_normalAnnotation = 121, 
		RULE_elementValuePairList = 122, RULE_elementValuePair = 123, RULE_elementValue = 124, 
		RULE_elementValueArrayInitializer = 125, RULE_elementValueList = 126, 
		RULE_markerAnnotation = 127, RULE_singleElementAnnotation = 128, RULE_arrayInitializer = 129, 
		RULE_variableInitializerList = 130, RULE_block = 131, RULE_blockStatements = 132, 
		RULE_blockStatement = 133, RULE_localVariableDeclarationStatement = 134, 
		RULE_localVariableDeclaration = 135, RULE_statement = 136, RULE_statementNoShortIf = 137, 
		RULE_statementWithoutTrailingSubstatement = 138, RULE_emptyStatement = 139, 
		RULE_labeledStatement = 140, RULE_labeledStatementNoShortIf = 141, RULE_expressionStatement = 142, 
		RULE_displayStatement = 143, RULE_readStatement = 144, RULE_statementExpression = 145, 
		RULE_ifThenStatement = 146, RULE_ifThenElseStatement = 147, RULE_ifThenElseStatementNoShortIf = 148, 
		RULE_assertStatement = 149, RULE_switchStatement = 150, RULE_switchBlock = 151, 
		RULE_switchBlockStatementGroup = 152, RULE_switchLabels = 153, RULE_switchLabel = 154, 
		RULE_enumConstantName = 155, RULE_whileStatement = 156, RULE_whileStatementNoShortIf = 157, 
		RULE_doStatement = 158, RULE_forStatement = 159, RULE_forStatementNoShortIf = 160, 
		RULE_basicForStatement = 161, RULE_basicForStatementNoShortIf = 162, RULE_forInit = 163, 
		RULE_forUpdate = 164, RULE_statementExpressionList = 165, RULE_enhancedForStatement = 166, 
		RULE_enhancedForStatementNoShortIf = 167, RULE_breakStatement = 168, RULE_continueStatement = 169, 
		RULE_returnStatement = 170, RULE_throwStatement = 171, RULE_synchronizedStatement = 172, 
		RULE_tryStatement = 173, RULE_catches = 174, RULE_catchClause = 175, RULE_catchFormalParameter = 176, 
		RULE_catchType = 177, RULE_finally_ = 178, RULE_tryWithResourcesStatement = 179, 
		RULE_resourceSpecification = 180, RULE_resourceList = 181, RULE_resource = 182, 
		RULE_variableAccess = 183, RULE_primary = 184, RULE_primaryNoNewArray = 185, 
		RULE_primaryNoNewArray_lf_arrayAccess = 186, RULE_primaryNoNewArray_lfno_arrayAccess = 187, 
		RULE_primaryNoNewArray_lf_primary = 188, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 189, 
		RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 190, RULE_primaryNoNewArray_lfno_primary = 191, 
		RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 192, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 193, 
		RULE_classLiteral = 194, RULE_classInstanceCreationExpression = 195, RULE_classInstanceCreationExpression_lf_primary = 196, 
		RULE_classInstanceCreationExpression_lfno_primary = 197, RULE_typeArgumentsOrDiamond = 198, 
		RULE_fieldAccess = 199, RULE_fieldAccess_lf_primary = 200, RULE_fieldAccess_lfno_primary = 201, 
		RULE_arrayAccess = 202, RULE_arrayAccess_lf_primary = 203, RULE_arrayAccess_lfno_primary = 204, 
		RULE_methodInvocation = 205, RULE_methodInvocation_lf_primary = 206, RULE_methodInvocation_lfno_primary = 207, 
		RULE_argumentList = 208, RULE_methodReference = 209, RULE_methodReference_lf_primary = 210, 
		RULE_methodReference_lfno_primary = 211, RULE_arrayCreationExpression = 212, 
		RULE_dimExprs = 213, RULE_dimExpr = 214, RULE_constantExpression = 215, 
		RULE_expression = 216, RULE_lambdaExpression = 217, RULE_lambdaParameters = 218, 
		RULE_inferredFormalParameterList = 219, RULE_lambdaBody = 220, RULE_assignmentExpression = 221, 
		RULE_assignment = 222, RULE_leftHandSide = 223, RULE_assignmentOperator = 224, 
		RULE_conditionalExpression = 225, RULE_conditionalOrExpression = 226, 
		RULE_conditionalAndExpression = 227, RULE_inclusiveOrExpression = 228, 
		RULE_exclusiveOrExpression = 229, RULE_andExpression = 230, RULE_equalityExpression = 231, 
		RULE_relationalExpression = 232, RULE_shiftExpression = 233, RULE_additiveExpression = 234, 
		RULE_multiplicativeExpression = 235, RULE_unaryExpression = 236, RULE_preIncrementExpression = 237, 
		RULE_preDecrementExpression = 238, RULE_unaryExpressionNotPlusMinus = 239, 
		RULE_postfixExpression = 240, RULE_postIncrementExpression = 241, RULE_postIncrementExpression_lf_postfixExpression = 242, 
		RULE_postDecrementExpression = 243, RULE_postDecrementExpression_lf_postfixExpression = 244, 
		RULE_castExpression = 245, RULE_newline = 246, RULE_identifier = 247;
	private static String[] makeRuleNames() {
		return new String[] {
			"literal", "primitiveType", "numericType", "integralType", "floatingPointType", 
			"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
			"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
			"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", 
			"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", 
			"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
			"moduleName", "packageName", "typeName", "packageOrTypeName", "expressionName", 
			"methodName", "ambiguousName", "compilationUnit", "ordinaryCompilation", 
			"modularCompilation", "packageDeclaration", "packageModifier", "importDeclaration", 
			"singleTypeImportDeclaration", "typeImportOnDemandDeclaration", "singleStaticImportDeclaration", 
			"staticImportOnDemandDeclaration", "typeDeclaration", "moduleDeclaration", 
			"moduleDirective", "requiresModifier", "classDeclaration", "normalClassDeclaration", 
			"classModifier", "typeParameters", "typeParameterList", "superclass", 
			"superinterfaces", "interfaceTypeList", "classBody", "classBodyDeclaration", 
			"classMemberDeclaration", "fieldDeclaration", "fieldModifier", "variableDeclaratorList", 
			"variableDeclarator", "variableDeclaratorId", "variableInitializer", 
			"unannType", "unannPrimitiveType", "unannReferenceType", "unannClassOrInterfaceType", 
			"unannClassType", "unannClassType_lf_unannClassOrInterfaceType", "unannClassType_lfno_unannClassOrInterfaceType", 
			"unannInterfaceType", "unannInterfaceType_lf_unannClassOrInterfaceType", 
			"unannInterfaceType_lfno_unannClassOrInterfaceType", "unannTypeVariable", 
			"unannArrayType", "methodDeclaration", "methodModifier", "methodHeader", 
			"result", "methodDeclarator", "formalParameterList", "formalParameters", 
			"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
			"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
			"staticInitializer", "constructorDeclaration", "constructorModifier", 
			"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
			"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
			"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
			"interfaceModifier", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", 
			"constantDeclaration", "constantModifier", "interfaceMethodDeclaration", 
			"interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", 
			"annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
			"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
			"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
			"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
			"variableInitializerList", "block", "blockStatements", "blockStatement", 
			"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
			"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", 
			"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
			"displayStatement", "readStatement", "statementExpression", "ifThenStatement", 
			"ifThenElseStatement", "ifThenElseStatementNoShortIf", "assertStatement", 
			"switchStatement", "switchBlock", "switchBlockStatementGroup", "switchLabels", 
			"switchLabel", "enumConstantName", "whileStatement", "whileStatementNoShortIf", 
			"doStatement", "forStatement", "forStatementNoShortIf", "basicForStatement", 
			"basicForStatementNoShortIf", "forInit", "forUpdate", "statementExpressionList", 
			"enhancedForStatement", "enhancedForStatementNoShortIf", "breakStatement", 
			"continueStatement", "returnStatement", "throwStatement", "synchronizedStatement", 
			"tryStatement", "catches", "catchClause", "catchFormalParameter", "catchType", 
			"finally_", "tryWithResourcesStatement", "resourceSpecification", "resourceList", 
			"resource", "variableAccess", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
			"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
			"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
			"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
			"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classLiteral", 
			"classInstanceCreationExpression", "classInstanceCreationExpression_lf_primary", 
			"classInstanceCreationExpression_lfno_primary", "typeArgumentsOrDiamond", 
			"fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
			"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", 
			"methodInvocation", "methodInvocation_lf_primary", "methodInvocation_lfno_primary", 
			"argumentList", "methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
			"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
			"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
			"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
			"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
			"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
			"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
			"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
			"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
			"postDecrementExpression_lf_postfixExpression", "castExpression", "newline", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'open'", "'module'", "'requires'", "'exports'", "'to'", "'opens'", 
			"'uses'", "'provides'", "'with'", "'transitive'", "');'", "'String'", 
			"'();'", "'()'", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
			"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'disp'", 
			"'sin'", "'newline'", "'_'", null, null, null, null, null, "'null'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'...'", 
			"'@'", "'::'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'->'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
			"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
			"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", 
			"GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", 
			"NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
			"SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", 
			"THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "DISP", 
			"SIN", "NEWLINE", "UNDER_SCORE", "IntegerLiteral", "FloatingPointLiteral", 
			"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ELLIPSIS", "AT", "COLONCOLON", "ASSIGN", "GT", "LT", "BANG", 
			"TILDE", "QUESTION", "COLON", "ARROW", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
			"CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public javaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(javaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(javaParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(javaParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(javaParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(javaParser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(javaParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(javaParser.BOOLEAN, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primitiveType);
		int _la;
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(498);
					annotation();
					}
					}
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(504);
				numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(505);
					annotation();
					}
					}
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(511);
				match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numericType);
		try {
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(javaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(javaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(javaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(javaParser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(javaParser.CHAR, 0); }
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitIntegralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(javaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(javaParser.DOUBLE, 0); }
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitFloatingPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_referenceType);
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(527);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(528);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(533);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(531);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(532);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classType);
		int _la;
		try {
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(538);
					annotation();
					}
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(544);
				identifier();
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(545);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				classOrInterfaceType();
				setState(549);
				match(DOT);
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(550);
					annotation();
					}
					}
					setState(555);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(556);
				identifier();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(557);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClassType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(DOT);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(563);
				annotation();
				}
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(569);
			identifier();
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(570);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClassType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(573);
				annotation();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579);
			identifier();
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(580);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitInterfaceType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			classType_lf_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitInterfaceType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			classType_lfno_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(589);
				annotation();
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayType);
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				primitiveType();
				setState(598);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				classOrInterfaceType();
				setState(601);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				typeVariable();
				setState(604);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(javaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(javaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(javaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(javaParser.RBRACK, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(608);
				annotation();
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
			match(LBRACK);
			setState(615);
			match(RBRACK);
			setState(626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(616);
						annotation();
						}
						}
						setState(621);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(622);
					match(LBRACK);
					setState(623);
					match(RBRACK);
					}
					} 
				}
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(629);
				typeParameterModifier();
				}
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(635);
			identifier();
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(636);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTypeParameterModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTypeParameterModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(javaParser.EXTENDS, 0); }
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeBound);
		int _la;
		try {
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				match(EXTENDS);
				setState(642);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				match(EXTENDS);
				setState(644);
				classOrInterfaceType();
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(645);
					additionalBound();
					}
					}
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(javaParser.BITAND, 0); }
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAdditionalBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAdditionalBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(BITAND);
			setState(654);
			interfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(javaParser.LT, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode GT() { return getToken(javaParser.GT, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(LT);
			setState(657);
			typeArgumentList();
			setState(658);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(javaParser.COMMA, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			typeArgument();
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(661);
				match(COMMA);
				setState(662);
				typeArgument();
				}
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgument);
		try {
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				wildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(javaParser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(672);
				annotation();
				}
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678);
			match(QUESTION);
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(679);
				wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(javaParser.EXTENDS, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(javaParser.SUPER, 0); }
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitWildcardBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcardBounds);
		try {
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				match(EXTENDS);
				setState(683);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(SUPER);
				setState(685);
				referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public ModuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterModuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitModuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitModuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleNameContext moduleName() throws RecognitionException {
		return moduleName(0);
	}

	private ModuleNameContext moduleName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ModuleNameContext _localctx = new ModuleNameContext(_ctx, _parentState);
		ModuleNameContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_moduleName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(689);
			identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ModuleNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_moduleName);
					setState(691);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(692);
					match(DOT);
					setState(693);
					identifier();
					}
					} 
				}
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(700);
			identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(702);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(703);
					match(DOT);
					setState(704);
					identifier();
					}
					} 
				}
				setState(709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				packageOrTypeName(0);
				setState(712);
				match(DOT);
				setState(713);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPackageOrTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(718);
			identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(725);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(720);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(721);
					match(DOT);
					setState(722);
					identifier();
					}
					} 
				}
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionName);
		try {
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				ambiguousName(0);
				setState(730);
				match(DOT);
				setState(731);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAmbiguousName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAmbiguousName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(738);
			identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(740);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(741);
					match(DOT);
					setState(742);
					identifier();
					}
					} 
				}
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public OrdinaryCompilationContext ordinaryCompilation() {
			return getRuleContext(OrdinaryCompilationContext.class,0);
		}
		public ModularCompilationContext modularCompilation() {
			return getRuleContext(ModularCompilationContext.class,0);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_compilationUnit);
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				ordinaryCompilation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				modularCompilation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(750);
				displayStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(751);
				readStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(752);
				newline();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrdinaryCompilationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(javaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public OrdinaryCompilationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinaryCompilation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterOrdinaryCompilation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitOrdinaryCompilation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitOrdinaryCompilation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdinaryCompilationContext ordinaryCompilation() throws RecognitionException {
		OrdinaryCompilationContext _localctx = new OrdinaryCompilationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ordinaryCompilation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(755);
				packageDeclaration();
				}
				break;
			}
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(758);
				importDeclaration();
				}
				}
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(764);
				typeDeclaration();
				}
				}
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(770);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModularCompilationContext extends ParserRuleContext {
		public ModuleDeclarationContext moduleDeclaration() {
			return getRuleContext(ModuleDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ModularCompilationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modularCompilation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterModularCompilation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitModularCompilation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitModularCompilation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModularCompilationContext modularCompilation() throws RecognitionException {
		ModularCompilationContext _localctx = new ModularCompilationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_modularCompilation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(772);
				importDeclaration();
				}
				}
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(778);
			moduleDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(javaParser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(780);
				packageModifier();
				}
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(786);
			match(PACKAGE);
			setState(787);
			packageName(0);
			setState(788);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPackageModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPackageModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_importDeclaration);
		try {
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(794);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(795);
				staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(javaParser.IMPORT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitSingleTypeImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitSingleTypeImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(IMPORT);
			setState(799);
			typeName();
			setState(800);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(javaParser.IMPORT, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(javaParser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTypeImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTypeImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(IMPORT);
			setState(803);
			packageOrTypeName(0);
			setState(804);
			match(DOT);
			setState(805);
			match(MUL);
			setState(806);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(javaParser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(javaParser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitSingleStaticImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitSingleStaticImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(IMPORT);
			setState(809);
			match(STATIC);
			setState(810);
			typeName();
			setState(811);
			match(DOT);
			setState(812);
			identifier();
			setState(813);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(javaParser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(javaParser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(javaParser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitStaticImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitStaticImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(IMPORT);
			setState(816);
			match(STATIC);
			setState(817);
			typeName();
			setState(818);
			match(DOT);
			setState(819);
			match(MUL);
			setState(820);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeDeclaration);
		try {
			setState(825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(824);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDeclarationContext extends ParserRuleContext {
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(javaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(javaParser.RBRACE, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModuleDirectiveContext> moduleDirective() {
			return getRuleContexts(ModuleDirectiveContext.class);
		}
		public ModuleDirectiveContext moduleDirective(int i) {
			return getRuleContext(ModuleDirectiveContext.class,i);
		}
		public ModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterModuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitModuleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitModuleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclarationContext moduleDeclaration() throws RecognitionException {
		ModuleDeclarationContext _localctx = new ModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_moduleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(827);
				annotation();
				}
				}
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(833);
				match(T__0);
				}
			}

			setState(836);
			match(T__1);
			setState(837);
			moduleName(0);
			setState(838);
			match(LBRACE);
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				{
				setState(839);
				moduleDirective();
				}
				}
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(845);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDirectiveContext extends ParserRuleContext {
		public List<ModuleNameContext> moduleName() {
			return getRuleContexts(ModuleNameContext.class);
		}
		public ModuleNameContext moduleName(int i) {
			return getRuleContext(ModuleNameContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public List<RequiresModifierContext> requiresModifier() {
			return getRuleContexts(RequiresModifierContext.class);
		}
		public RequiresModifierContext requiresModifier(int i) {
			return getRuleContext(RequiresModifierContext.class,i);
		}
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(javaParser.COMMA, i);
		}
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public ModuleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterModuleDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitModuleDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitModuleDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDirectiveContext moduleDirective() throws RecognitionException {
		ModuleDirectiveContext _localctx = new ModuleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_moduleDirective);
		int _la;
		try {
			setState(904);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				match(T__2);
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9 || _la==STATIC) {
					{
					{
					setState(848);
					requiresModifier();
					}
					}
					setState(853);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(854);
				moduleName(0);
				setState(855);
				match(SEMI);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
				match(T__3);
				setState(858);
				packageName(0);
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(859);
					match(T__4);
					setState(860);
					moduleName(0);
					setState(865);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(861);
						match(COMMA);
						setState(862);
						moduleName(0);
						}
						}
						setState(867);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(870);
				match(SEMI);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(872);
				match(T__5);
				setState(873);
				packageName(0);
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(874);
					match(T__4);
					setState(875);
					moduleName(0);
					setState(880);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(876);
						match(COMMA);
						setState(877);
						moduleName(0);
						}
						}
						setState(882);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(885);
				match(SEMI);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(887);
				match(T__6);
				setState(888);
				typeName();
				setState(889);
				match(SEMI);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(891);
				match(T__7);
				setState(892);
				typeName();
				setState(893);
				match(T__8);
				setState(894);
				typeName();
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(895);
					match(COMMA);
					setState(896);
					typeName();
					}
					}
					setState(901);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(902);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiresModifierContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(javaParser.STATIC, 0); }
		public RequiresModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiresModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterRequiresModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitRequiresModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitRequiresModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequiresModifierContext requiresModifier() throws RecognitionException {
		RequiresModifierContext _localctx = new RequiresModifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_requiresModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==STATIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classDeclaration);
		try {
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(javaParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(912);
				classModifier();
				}
				}
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(918);
			match(CLASS);
			setState(919);
			identifier();
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(920);
				typeParameters();
				}
			}

			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(923);
				superclass();
				}
			}

			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(926);
				superinterfaces();
				}
			}

			setState(929);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(javaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(javaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(javaParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(javaParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(javaParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(javaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(javaParser.STRICTFP, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_classModifier);
		try {
			setState(939);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(933);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(934);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(935);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(936);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(937);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(938);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(javaParser.LT, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode GT() { return getToken(javaParser.GT, 0); }
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(LT);
			setState(942);
			typeParameterList();
			setState(943);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(javaParser.COMMA, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			typeParameter();
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(946);
				match(COMMA);
				setState(947);
				typeParameter();
				}
				}
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(javaParser.EXTENDS, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitSuperclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			match(EXTENDS);
			setState(954);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(javaParser.IMPLEMENTS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitSuperinterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitSuperinterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(IMPLEMENTS);
			setState(957);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(javaParser.COMMA, i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitInterfaceTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitInterfaceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			interfaceType();
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(960);
				match(COMMA);
				setState(961);
				interfaceType();
				}
				}
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(javaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(javaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(LBRACE);
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DISP - 65)) | (1L << (SIN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)) | (1L << (LT - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(968);
				classBodyDeclaration();
				}
				}
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(974);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_classBodyDeclaration);
		try {
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(976);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(977);
				instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(978);
				staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(979);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_classMemberDeclaration);
		try {
			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(984);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(985);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(986);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (FINAL - 32)) | (1L << (PRIVATE - 32)) | (1L << (PROTECTED - 32)) | (1L << (PUBLIC - 32)) | (1L << (STATIC - 32)) | (1L << (TRANSIENT - 32)) | (1L << (VOLATILE - 32)) | (1L << (AT - 32)))) != 0)) {
				{
				{
				setState(989);
				fieldModifier();
				}
				}
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(995);
			unannType();
			setState(996);
			variableDeclaratorList();
			setState(997);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(javaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(javaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(javaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(javaParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(javaParser.FINAL, 0); }
		public TerminalNode TRANSIENT() { return getToken(javaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(javaParser.VOLATILE, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitFieldModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fieldModifier);
		try {
			setState(1007);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(999);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1001);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1002);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1003);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1004);
				match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1005);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1006);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(javaParser.COMMA, i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitVariableDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			variableDeclarator();
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1010);
				match(COMMA);
				setState(1011);
				variableDeclarator();
				}
				}
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(javaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			variableDeclaratorId();
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1018);
				match(ASSIGN);
				setState(1019);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			identifier();
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1023);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_variableInitializer);
		try {
			setState(1028);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case AT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1026);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1027);
				arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnannType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnannType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannType);
		try {
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
				unannReferenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(javaParser.BOOLEAN, 0); }
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnannPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnannPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannPrimitiveType);
		try {
			setState(1036);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnannReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnannReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannReferenceType);
		try {
			setState(1041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1040);
				unannArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(1043);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(1044);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(1051);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1049);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						setState(1047);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(1048);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(1053);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnannClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnannClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannClassType);
		int _la;
		try {
			setState(1070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				identifier();
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1055);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				unannClassOrInterfaceType();
				setState(1059);
				match(DOT);
				setState(1063);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1060);
					annotation();
					}
					}
					setState(1065);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1066);
				identifier();
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1067);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnannClassType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			match(DOT);
			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1073);
				annotation();
				}
				}
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1079);
			identifier();
			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1080);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnannClassType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			identifier();
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1084);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnannInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnannInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			unannClassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			unannClassType_lf_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			unannClassType_lfno_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnannTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnannTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnannArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnannArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_unannArrayType);
		try {
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1095);
				unannPrimitiveType();
				setState(1096);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
				unannClassOrInterfaceType();
				setState(1099);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1101);
				unannTypeVariable();
				setState(1102);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(1106);
				methodModifier();
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1112);
			methodHeader();
			setState(1113);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(javaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(javaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(javaParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(javaParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(javaParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(javaParser.FINAL, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(javaParser.SYNCHRONIZED, 0); }
		public TerminalNode NATIVE() { return getToken(javaParser.NATIVE, 0); }
		public TerminalNode STRICTFP() { return getToken(javaParser.STRICTFP, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_methodModifier);
		try {
			setState(1125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1115);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1116);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1117);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1118);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1119);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1120);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1121);
				match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1122);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1123);
				match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1124);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMethodHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_methodHeader);
		int _la;
		try {
			setState(1144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1127);
				result();
				setState(1128);
				methodDeclarator();
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1129);
					throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				typeParameters();
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1133);
					annotation();
					}
					}
					setState(1138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1139);
				result();
				setState(1140);
				methodDeclarator();
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1141);
					throws_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(javaParser.VOID, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_result);
		try {
			setState(1148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1146);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMethodDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			identifier();
			setState(1151);
			match(LPAREN);
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==Identifier) {
				{
				setState(1152);
				formalParameterList();
				}
			}

			setState(1155);
			match(RPAREN);
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1156);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(javaParser.COMMA, 0); }
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_formalParameterList);
		try {
			setState(1165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1159);
				formalParameters();
				setState(1160);
				match(COMMA);
				setState(1161);
				lastFormalParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1163);
				lastFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1164);
				receiverParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(javaParser.COMMA, i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_formalParameters);
		try {
			int _alt;
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167);
				formalParameter();
				setState(1172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1168);
						match(COMMA);
						setState(1169);
						formalParameter();
						}
						} 
					}
					setState(1174);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1175);
				receiverParameter();
				setState(1180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1176);
						match(COMMA);
						setState(1177);
						formalParameter();
						}
						} 
					}
					setState(1182);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1185);
				variableModifier();
				}
				}
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1191);
			unannType();
			setState(1192);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(javaParser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_variableModifier);
		try {
			setState(1196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1194);
				annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(javaParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1198);
					variableModifier();
					}
					}
					setState(1203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1204);
				unannType();
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1205);
					annotation();
					}
					}
					setState(1210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1211);
				match(ELLIPSIS);
				setState(1212);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1214);
				formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(javaParser.THIS, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitReceiverParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1217);
				annotation();
				}
				}
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1223);
			unannType();
			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==Identifier) {
				{
				setState(1224);
				identifier();
				setState(1225);
				match(DOT);
				}
			}

			setState(1229);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(javaParser.THROWS, 0); }
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitThrows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitThrows_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 172, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			match(THROWS);
			setState(1232);
			exceptionTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(javaParser.COMMA, i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExceptionTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExceptionTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			exceptionType();
			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1235);
				match(COMMA);
				setState(1236);
				exceptionType();
				}
				}
				setState(1241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExceptionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExceptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_exceptionType);
		try {
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1242);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1243);
				typeVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_methodBody);
		try {
			setState(1248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISP:
			case SIN:
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1247);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitInstanceInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitInstanceInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(javaParser.STATIC, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitStaticInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitStaticInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			match(STATIC);
			setState(1253);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (PRIVATE - 47)) | (1L << (PROTECTED - 47)) | (1L << (PUBLIC - 47)) | (1L << (AT - 47)))) != 0)) {
				{
				{
				setState(1255);
				constructorModifier();
				}
				}
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1261);
			constructorDeclarator();
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1262);
				throws_();
				}
			}

			setState(1265);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(javaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(javaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(javaParser.PRIVATE, 0); }
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitConstructorModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitConstructorModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_constructorModifier);
		try {
			setState(1271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1268);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1269);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1270);
				match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitConstructorDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitConstructorDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1273);
				typeParameters();
				}
			}

			setState(1276);
			simpleTypeName();
			setState(1277);
			match(LPAREN);
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==Identifier) {
				{
				setState(1278);
				formalParameterList();
				}
			}

			setState(1281);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitSimpleTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitSimpleTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(javaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(javaParser.RBRACE, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			match(LBRACE);
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1286);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (DISP - 64)) | (1L << (SIN - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (AT - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1289);
				blockStatements();
				}
			}

			setState(1292);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(javaParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(javaParser.SUPER, 0); }
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExplicitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1294);
					typeArguments();
					}
				}

				setState(1297);
				match(THIS);
				setState(1298);
				match(LPAREN);
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1299);
					argumentList();
					}
				}

				setState(1302);
				match(RPAREN);
				setState(1303);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1304);
					typeArguments();
					}
				}

				setState(1307);
				match(SUPER);
				setState(1308);
				match(LPAREN);
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1309);
					argumentList();
					}
				}

				setState(1312);
				match(RPAREN);
				setState(1313);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1314);
				expressionName();
				setState(1315);
				match(DOT);
				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1316);
					typeArguments();
					}
				}

				setState(1319);
				match(SUPER);
				setState(1320);
				match(LPAREN);
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1321);
					argumentList();
					}
				}

				setState(1324);
				match(RPAREN);
				setState(1325);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1327);
				primary();
				setState(1328);
				match(DOT);
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1329);
					typeArguments();
					}
				}

				setState(1332);
				match(SUPER);
				setState(1333);
				match(LPAREN);
				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1334);
					argumentList();
					}
				}

				setState(1337);
				match(RPAREN);
				setState(1338);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(javaParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1342);
				classModifier();
				}
				}
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1348);
			match(ENUM);
			setState(1349);
			identifier();
			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1350);
				superinterfaces();
				}
			}

			setState(1353);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(javaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(javaParser.RBRACE, 0); }
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(javaParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			match(LBRACE);
			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==AT || _la==Identifier) {
				{
				setState(1356);
				enumConstantList();
				}
			}

			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1359);
				match(COMMA);
				}
			}

			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1362);
				enumBodyDeclarations();
				}
			}

			setState(1365);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(javaParser.COMMA, i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitEnumConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitEnumConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			enumConstant();
			setState(1372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1368);
					match(COMMA);
					setState(1369);
					enumConstant();
					}
					} 
				}
				setState(1374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1375);
				enumConstantModifier();
				}
				}
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1381);
			identifier();
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1382);
				match(LPAREN);
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1383);
					argumentList();
					}
				}

				setState(1386);
				match(RPAREN);
				}
			}

			setState(1390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1389);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitEnumConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitEnumConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			match(SEMI);
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DISP - 65)) | (1L << (SIN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)) | (1L << (LT - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(1395);
				classBodyDeclaration();
				}
				}
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceDeclaration);
		try {
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1401);
				normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1402);
				annotationTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(javaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitNormalInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1405);
				interfaceModifier();
				}
				}
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1411);
			match(INTERFACE);
			setState(1412);
			identifier();
			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1413);
				typeParameters();
				}
			}

			setState(1417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1416);
				extendsInterfaces();
				}
			}

			setState(1419);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(javaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(javaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(javaParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(javaParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(javaParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(javaParser.STRICTFP, 0); }
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_interfaceModifier);
		try {
			setState(1428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1421);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1422);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1423);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1424);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1425);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1426);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1427);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(javaParser.EXTENDS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExtendsInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExtendsInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			match(EXTENDS);
			setState(1431);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(javaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(javaParser.RBRACE, 0); }
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			match(LBRACE);
			setState(1437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (SEMI - 81)) | (1L << (AT - 81)) | (1L << (LT - 81)) | (1L << (Identifier - 81)))) != 0)) {
				{
				{
				setState(1434);
				interfaceMemberDeclaration();
				}
				}
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1440);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_interfaceMemberDeclaration);
		try {
			setState(1447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1444);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1445);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1446);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (FINAL - 32)) | (1L << (PUBLIC - 32)) | (1L << (STATIC - 32)) | (1L << (AT - 32)))) != 0)) {
				{
				{
				setState(1449);
				constantModifier();
				}
				}
				setState(1454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1455);
			unannType();
			setState(1456);
			variableDeclaratorList();
			setState(1457);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(javaParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(javaParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(javaParser.FINAL, 0); }
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_constantModifier);
		try {
			setState(1463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1459);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1460);
				match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1461);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1462);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1465);
				interfaceMethodModifier();
				}
				}
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1471);
			methodHeader();
			setState(1472);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(javaParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(javaParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(javaParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(javaParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(javaParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(javaParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_interfaceMethodModifier);
		try {
			setState(1481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1474);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1475);
				match(PUBLIC);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1476);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1477);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1478);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1479);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1480);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(javaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(javaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1483);
					interfaceModifier();
					}
					} 
				}
				setState(1488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			setState(1489);
			match(AT);
			setState(1490);
			match(INTERFACE);
			setState(1491);
			identifier();
			setState(1492);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(javaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(javaParser.RBRACE, 0); }
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			match(LBRACE);
			setState(1498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (SEMI - 81)) | (1L << (AT - 81)) | (1L << (Identifier - 81)))) != 0)) {
				{
				{
				setState(1495);
				annotationTypeMemberDeclaration();
				}
				}
				setState(1500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1501);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAnnotationTypeMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503);
				annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1504);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1505);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1506);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1507);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1510);
				annotationTypeElementModifier();
				}
				}
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1516);
			unannType();
			setState(1517);
			identifier();
			setState(1518);
			match(LPAREN);
			setState(1519);
			match(RPAREN);
			setState(1521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1520);
				dims();
				}
			}

			setState(1524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1523);
				defaultValue();
				}
			}

			setState(1526);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(javaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(javaParser.ABSTRACT, 0); }
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAnnotationTypeElementModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAnnotationTypeElementModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_annotationTypeElementModifier);
		try {
			setState(1531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1528);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1529);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1530);
				match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(javaParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			match(DEFAULT);
			setState(1534);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_annotation);
		try {
			setState(1539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1536);
				normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1537);
				markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1538);
				singleElementAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(javaParser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitNormalAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitNormalAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			match(AT);
			setState(1542);
			typeName();
			setState(1543);
			match(LPAREN);
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==Identifier) {
				{
				setState(1544);
				elementValuePairList();
				}
			}

			setState(1547);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(javaParser.COMMA, i);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitElementValuePairList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitElementValuePairList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			elementValuePair();
			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1550);
				match(COMMA);
				setState(1551);
				elementValuePair();
				}
				}
				setState(1556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(javaParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			identifier();
			setState(1558);
			match(ASSIGN);
			setState(1559);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_elementValue);
		try {
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1562);
				elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1563);
				annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(javaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(javaParser.RBRACE, 0); }
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(javaParser.COMMA, 0); }
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566);
			match(LBRACE);
			setState(1568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (LBRACE - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1567);
				elementValueList();
				}
			}

			setState(1571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1570);
				match(COMMA);
				}
			}

			setState(1573);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(javaParser.COMMA, i);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitElementValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitElementValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			elementValue();
			setState(1580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1576);
					match(COMMA);
					setState(1577);
					elementValue();
					}
					} 
				}
				setState(1582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(javaParser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMarkerAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMarkerAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			match(AT);
			setState(1584);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(javaParser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitSingleElementAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitSingleElementAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			match(AT);
			setState(1587);
			typeName();
			setState(1588);
			match(LPAREN);
			setState(1589);
			elementValue();
			setState(1590);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(javaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(javaParser.RBRACE, 0); }
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(javaParser.COMMA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			match(LBRACE);
			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (LBRACE - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1593);
				variableInitializerList();
				}
			}

			setState(1597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1596);
				match(COMMA);
				}
			}

			setState(1599);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(javaParser.COMMA, i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitVariableInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitVariableInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
			variableInitializer();
			setState(1606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1602);
					match(COMMA);
					setState(1603);
					variableInitializer();
					}
					} 
				}
				setState(1608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(javaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(javaParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_block);
		int _la;
		try {
			setState(1616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1609);
				match(LBRACE);
				setState(1611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (DISP - 64)) | (1L << (SIN - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (AT - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1610);
					blockStatements();
					}
				}

				setState(1613);
				match(RBRACE);
				}
				break;
			case DISP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1614);
				displayStatement();
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1615);
				readStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_blockStatements);
		int _la;
		try {
			setState(1625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1619); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1618);
					blockStatement();
					}
					}
					setState(1621); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (DISP - 64)) | (1L << (SIN - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (AT - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1623);
				displayStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1624);
				readStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_blockStatement);
		try {
			setState(1630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1628);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1629);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			localVariableDeclaration();
			setState(1633);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1635);
				variableModifier();
				}
				}
				setState(1640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1641);
			unannType();
			setState(1642);
			variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_statement);
		try {
			setState(1650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1644);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1645);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1646);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1647);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1648);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1649);
				forStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_statementNoShortIf);
		try {
			setState(1657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1652);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1653);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1654);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1655);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1656);
				forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISP:
			case SIN:
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1659);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1660);
				emptyStatement();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case AT:
			case INC:
			case DEC:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(1661);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1662);
				assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1663);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1664);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1665);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1666);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1667);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1668);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1669);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1670);
				tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(javaParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			identifier();
			setState(1676);
			match(COLON);
			setState(1677);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(javaParser.COLON, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitLabeledStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitLabeledStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			identifier();
			setState(1680);
			match(COLON);
			setState(1681);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			statementExpression();
			setState(1684);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayStatementContext extends ParserRuleContext {
		public TerminalNode DISP() { return getToken(javaParser.DISP, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public DisplayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterDisplayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitDisplayStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitDisplayStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayStatementContext displayStatement() throws RecognitionException {
		DisplayStatementContext _localctx = new DisplayStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_displayStatement);
		int _la;
		try {
			setState(1702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1686);
				match(DISP);
				setState(1687);
				match(LPAREN);
				setState(1688);
				argumentList();
				setState(1690); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1689);
					argumentList();
					}
					}
					setState(1692); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0) );
				setState(1694);
				match(T__10);
				notifyErrorListeners("Expected '+' or ')' after expression.");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1697);
				match(DISP);
				setState(1698);
				match(LPAREN);
				setState(1699);
				argumentList();
				setState(1700);
				match(T__10);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(javaParser.SIN, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitReadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			match(SIN);
			setState(1705);
			match(LPAREN);
			setState(1706);
			identifier();
			setState(1707);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_statementExpression);
		try {
			setState(1716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1709);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1710);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1711);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1712);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1713);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1714);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1715);
				classInstanceCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(javaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitIfThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitIfThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			match(IF);
			setState(1719);
			match(LPAREN);
			setState(1720);
			expression();
			setState(1721);
			match(RPAREN);
			setState(1722);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(javaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(javaParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitIfThenElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitIfThenElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			match(IF);
			setState(1725);
			match(LPAREN);
			setState(1726);
			expression();
			setState(1727);
			match(RPAREN);
			setState(1728);
			statementNoShortIf();
			setState(1729);
			match(ELSE);
			setState(1730);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(javaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(javaParser.ELSE, 0); }
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitIfThenElseStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitIfThenElseStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			match(IF);
			setState(1733);
			match(LPAREN);
			setState(1734);
			expression();
			setState(1735);
			match(RPAREN);
			setState(1736);
			statementNoShortIf();
			setState(1737);
			match(ELSE);
			setState(1738);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(javaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(javaParser.COLON, 0); }
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_assertStatement);
		try {
			setState(1750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1740);
				match(ASSERT);
				setState(1741);
				expression();
				setState(1742);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1744);
				match(ASSERT);
				setState(1745);
				expression();
				setState(1746);
				match(COLON);
				setState(1747);
				expression();
				setState(1748);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(javaParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			match(SWITCH);
			setState(1753);
			match(LPAREN);
			setState(1754);
			expression();
			setState(1755);
			match(RPAREN);
			setState(1756);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(javaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(javaParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			match(LBRACE);
			setState(1762);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1759);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			setState(1768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1765);
				switchLabel();
				}
				}
				setState(1770);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1771);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			switchLabels();
			setState(1774);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitSwitchLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitSwitchLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1776);
				switchLabel();
				}
				}
				setState(1779); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(javaParser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(javaParser.COLON, 0); }
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(javaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_switchLabel);
		try {
			setState(1791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1781);
				match(CASE);
				setState(1782);
				constantExpression();
				setState(1783);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1785);
				match(CASE);
				setState(1786);
				enumConstantName();
				setState(1787);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1789);
				match(DEFAULT);
				setState(1790);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1793);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(javaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			match(WHILE);
			setState(1796);
			match(LPAREN);
			setState(1797);
			expression();
			setState(1798);
			match(RPAREN);
			setState(1799);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(javaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitWhileStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitWhileStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801);
			match(WHILE);
			setState(1802);
			match(LPAREN);
			setState(1803);
			expression();
			setState(1804);
			match(RPAREN);
			setState(1805);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(javaParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(javaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807);
			match(DO);
			setState(1808);
			statement();
			setState(1809);
			match(WHILE);
			setState(1810);
			match(LPAREN);
			setState(1811);
			expression();
			setState(1812);
			match(RPAREN);
			setState(1813);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_forStatement);
		try {
			setState(1817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1815);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1816);
				enhancedForStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_forStatementNoShortIf);
		try {
			setState(1821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1819);
				basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1820);
				enhancedForStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(javaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(javaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(javaParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitBasicForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitBasicForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			match(FOR);
			setState(1824);
			match(LPAREN);
			setState(1826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1825);
				forInit();
				}
			}

			setState(1828);
			match(SEMI);
			setState(1830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1829);
				expression();
				}
			}

			setState(1832);
			match(SEMI);
			setState(1834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1833);
				forUpdate();
				}
			}

			setState(1836);
			match(RPAREN);
			setState(1837);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(javaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(javaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(javaParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitBasicForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitBasicForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			match(FOR);
			setState(1840);
			match(LPAREN);
			setState(1842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1841);
				forInit();
				}
			}

			setState(1844);
			match(SEMI);
			setState(1846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1845);
				expression();
				}
			}

			setState(1848);
			match(SEMI);
			setState(1850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1849);
				forUpdate();
				}
			}

			setState(1852);
			match(RPAREN);
			setState(1853);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_forInit);
		try {
			setState(1857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1855);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1856);
				localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			statementExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(javaParser.COMMA, i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitStatementExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitStatementExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1861);
			statementExpression();
			setState(1866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1862);
				match(COMMA);
				setState(1863);
				statementExpression();
				}
				}
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(javaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(javaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitEnhancedForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitEnhancedForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			match(FOR);
			setState(1870);
			match(LPAREN);
			setState(1874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1871);
				variableModifier();
				}
				}
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1877);
			unannType();
			setState(1878);
			variableDeclaratorId();
			setState(1879);
			match(COLON);
			setState(1880);
			expression();
			setState(1881);
			match(RPAREN);
			setState(1882);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(javaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(javaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitEnhancedForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitEnhancedForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			match(FOR);
			setState(1885);
			match(LPAREN);
			setState(1889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1886);
				variableModifier();
				}
				}
				setState(1891);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1892);
			unannType();
			setState(1893);
			variableDeclaratorId();
			setState(1894);
			match(COLON);
			setState(1895);
			expression();
			setState(1896);
			match(RPAREN);
			setState(1897);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(javaParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			match(BREAK);
			setState(1901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==Identifier) {
				{
				setState(1900);
				identifier();
				}
			}

			setState(1903);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(javaParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1905);
			match(CONTINUE);
			setState(1907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==Identifier) {
				{
				setState(1906);
				identifier();
				}
			}

			setState(1909);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(javaParser.RETURN, 0); }
		public TerminalNode INT() { return getToken(javaParser.INT, 0); }
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public TerminalNode FLOAT() { return getToken(javaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(javaParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(javaParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(javaParser.BOOLEAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_returnStatement);
		int _la;
		try {
			setState(1945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1911);
				match(RETURN);
				setState(1912);
				match(INT);
				setState(1913);
				match(SEMI);
				notifyErrorListeners("cannot return INT please replace with an expression");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1915);
				match(RETURN);
				setState(1916);
				match(FLOAT);
				setState(1917);
				match(SEMI);
				notifyErrorListeners("cannot return FLOAT please replace with an expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1919);
				match(RETURN);
				setState(1920);
				match(DOUBLE);
				setState(1921);
				match(SEMI);
				notifyErrorListeners("cannot return DOUBLE please replace with an expression");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1923);
				match(RETURN);
				setState(1924);
				match(T__11);
				setState(1925);
				match(SEMI);
				notifyErrorListeners("cannot return String please replace with an expression");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1927);
				match(RETURN);
				setState(1928);
				match(CHAR);
				setState(1929);
				match(SEMI);
				notifyErrorListeners("cannot return CHAR please replace with an expression");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1931);
				match(RETURN);
				setState(1932);
				match(BOOLEAN);
				setState(1933);
				match(SEMI);
				notifyErrorListeners("cannot return BOOL please replace with an expression");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1935);
				match(RETURN);
				setState(1937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1936);
					expression();
					}
				}

				setState(1939);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1940);
				match(RETURN);
				setState(1942);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1941);
					expression();
					}
					break;
				}
				notifyErrorListeners("Missing ';'");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(javaParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			match(THROW);
			setState(1948);
			expression();
			setState(1949);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(javaParser.SYNCHRONIZED, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
			match(SYNCHRONIZED);
			setState(1952);
			match(LPAREN);
			setState(1953);
			expression();
			setState(1954);
			match(RPAREN);
			setState(1955);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(javaParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_tryStatement);
		int _la;
		try {
			setState(1969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1957);
				match(TRY);
				setState(1958);
				block();
				setState(1959);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1961);
				match(TRY);
				setState(1962);
				block();
				setState(1964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1963);
					catches();
					}
				}

				setState(1966);
				finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1968);
				tryWithResourcesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1971);
				catchClause();
				}
				}
				setState(1974); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CATCH );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(javaParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976);
			match(CATCH);
			setState(1977);
			match(LPAREN);
			setState(1978);
			catchFormalParameter();
			setState(1979);
			match(RPAREN);
			setState(1980);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitCatchFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitCatchFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1982);
				variableModifier();
				}
				}
				setState(1987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1988);
			catchType();
			setState(1989);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<TerminalNode> BITOR() { return getTokens(javaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(javaParser.BITOR, i);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1991);
			unannClassType();
			setState(1996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1992);
				match(BITOR);
				setState(1993);
				classType();
				}
				}
				setState(1998);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(javaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitFinally_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitFinally_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 356, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1999);
			match(FINALLY);
			setState(2000);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(javaParser.TRY, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTryWithResourcesStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTryWithResourcesStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			match(TRY);
			setState(2003);
			resourceSpecification();
			setState(2004);
			block();
			setState(2006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(2005);
				catches();
				}
			}

			setState(2009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(2008);
				finally_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			match(LPAREN);
			setState(2012);
			resourceList();
			setState(2014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2013);
				match(SEMI);
				}
			}

			setState(2016);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(javaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(javaParser.SEMI, i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitResourceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitResourceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			resource();
			setState(2023);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2019);
					match(SEMI);
					setState(2020);
					resource();
					}
					} 
				}
				setState(2025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(javaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_resource);
		int _la;
		try {
			setState(2038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(2026);
					variableModifier();
					}
					}
					setState(2031);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2032);
				unannType();
				setState(2033);
				variableDeclaratorId();
				setState(2034);
				match(ASSIGN);
				setState(2035);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2037);
				variableAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public VariableAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterVariableAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitVariableAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitVariableAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAccessContext variableAccess() throws RecognitionException {
		VariableAccessContext _localctx = new VariableAccessContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_variableAccess);
		try {
			setState(2042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2040);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2041);
				fieldAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(2044);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(2045);
				arrayCreationExpression();
				}
				break;
			}
			setState(2051);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2048);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(2053);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ClassLiteralContext classLiteral() {
			return getRuleContext(ClassLiteralContext.class,0);
		}
		public TerminalNode THIS() { return getToken(javaParser.THIS, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPrimaryNoNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPrimaryNoNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_primaryNoNewArray);
		try {
			setState(2070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2054);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2055);
				classLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2056);
				match(THIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2057);
				typeName();
				setState(2058);
				match(DOT);
				setState(2059);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2061);
				match(LPAREN);
				setState(2062);
				expression();
				setState(2063);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2065);
				classInstanceCreationExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2066);
				fieldAccess();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2067);
				arrayAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2068);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2069);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(javaParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(javaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(javaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(javaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(javaParser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(javaParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(javaParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(2102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2074);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2075);
				typeName();
				setState(2080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2076);
					match(LBRACK);
					setState(2077);
					match(RBRACK);
					}
					}
					setState(2082);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2083);
				match(DOT);
				setState(2084);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2086);
				match(VOID);
				setState(2087);
				match(DOT);
				setState(2088);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2089);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2090);
				typeName();
				setState(2091);
				match(DOT);
				setState(2092);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2094);
				match(LPAREN);
				setState(2095);
				expression();
				setState(2096);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2098);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2099);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2100);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2101);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(2109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2104);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2105);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2106);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2107);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2108);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(2117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2113);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2114);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2115);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2116);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(javaParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(javaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(javaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(javaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(javaParser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(javaParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(javaParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(javaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(javaParser.RPAREN, i);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			int _alt;
			setState(2173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2119);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2120);
				typeName();
				setState(2125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2121);
					match(LBRACK);
					setState(2122);
					match(RBRACK);
					}
					}
					setState(2127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2128);
				match(DOT);
				setState(2129);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2131);
				unannPrimitiveType();
				setState(2136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2132);
					match(LBRACK);
					setState(2133);
					match(RBRACK);
					}
					}
					setState(2138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2139);
				match(DOT);
				setState(2140);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2142);
				match(VOID);
				setState(2143);
				match(DOT);
				setState(2144);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2145);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2146);
				typeName();
				setState(2147);
				match(DOT);
				setState(2148);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2150);
				match(LPAREN);
				setState(2151);
				expression();
				setState(2152);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2154);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2155);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2156);
				arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2157);
				methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2158);
				methodReference_lfno_primary();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2159);
				match(LPAREN);
				setState(2160);
				expression();
				setState(2161);
				match(RPAREN);
				setState(2163); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2162);
						match(RPAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2165); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many ')'. Please reduce trailing ')'.");
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2169);
				match(LPAREN);
				setState(2170);
				expression();
				notifyErrorListeners("Missing ')'");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(javaParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(javaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(javaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(javaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(javaParser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(javaParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(javaParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2177);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2178);
				typeName();
				setState(2183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2179);
					match(LBRACK);
					setState(2180);
					match(RBRACK);
					}
					}
					setState(2185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2186);
				match(DOT);
				setState(2187);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2189);
				unannPrimitiveType();
				setState(2194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2190);
					match(LBRACK);
					setState(2191);
					match(RBRACK);
					}
					}
					setState(2196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2197);
				match(DOT);
				setState(2198);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2200);
				match(VOID);
				setState(2201);
				match(DOT);
				setState(2202);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2203);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2204);
				typeName();
				setState(2205);
				match(DOT);
				setState(2206);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2208);
				match(LPAREN);
				setState(2209);
				expression();
				setState(2210);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2212);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2213);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2214);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2215);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassLiteralContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(javaParser.CLASS, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(javaParser.BOOLEAN, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(javaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(javaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(javaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(javaParser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(javaParser.VOID, 0); }
		public ClassLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClassLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClassLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClassLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassLiteralContext classLiteral() throws RecognitionException {
		ClassLiteralContext _localctx = new ClassLiteralContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_classLiteral);
		int _la;
		try {
			setState(2235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2221);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case Identifier:
					{
					setState(2218);
					typeName();
					}
					break;
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
					{
					setState(2219);
					numericType();
					}
					break;
				case BOOLEAN:
					{
					setState(2220);
					match(BOOLEAN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2223);
					match(LBRACK);
					setState(2224);
					match(RBRACK);
					}
					}
					setState(2229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2230);
				match(DOT);
				setState(2231);
				match(CLASS);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2232);
				match(VOID);
				setState(2233);
				match(DOT);
				setState(2234);
				match(CLASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(javaParser.NEW, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(javaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(javaParser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClassInstanceCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClassInstanceCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2237);
				match(NEW);
				setState(2239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2238);
					typeArguments();
					}
				}

				setState(2244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2241);
					annotation();
					}
					}
					setState(2246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2247);
				identifier();
				setState(2258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2248);
					match(DOT);
					setState(2252);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2249);
						annotation();
						}
						}
						setState(2254);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2255);
					identifier();
					}
					}
					setState(2260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2261);
					typeArgumentsOrDiamond();
					}
				}

				setState(2264);
				match(LPAREN);
				setState(2266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2265);
					argumentList();
					}
				}

				setState(2268);
				match(RPAREN);
				setState(2270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2269);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2272);
				expressionName();
				setState(2273);
				match(DOT);
				setState(2274);
				match(NEW);
				setState(2276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2275);
					typeArguments();
					}
				}

				setState(2281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2278);
					annotation();
					}
					}
					setState(2283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2284);
				identifier();
				setState(2286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2285);
					typeArgumentsOrDiamond();
					}
				}

				setState(2288);
				match(LPAREN);
				setState(2290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2289);
					argumentList();
					}
				}

				setState(2292);
				match(RPAREN);
				setState(2294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2293);
					classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2296);
				primary();
				setState(2297);
				match(DOT);
				setState(2298);
				match(NEW);
				setState(2300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2299);
					typeArguments();
					}
				}

				setState(2305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2302);
					annotation();
					}
					}
					setState(2307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2308);
				identifier();
				setState(2310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2309);
					typeArgumentsOrDiamond();
					}
				}

				setState(2312);
				match(LPAREN);
				setState(2314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2313);
					argumentList();
					}
				}

				setState(2316);
				match(RPAREN);
				setState(2318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2317);
					classBody();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public TerminalNode NEW() { return getToken(javaParser.NEW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClassInstanceCreationExpression_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2322);
			match(DOT);
			setState(2323);
			match(NEW);
			setState(2325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2324);
				typeArguments();
				}
			}

			setState(2330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2327);
				annotation();
				}
				}
				setState(2332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2333);
			identifier();
			setState(2335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2334);
				typeArgumentsOrDiamond();
				}
			}

			setState(2337);
			match(LPAREN);
			setState(2339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(2338);
				argumentList();
				}
			}

			setState(2341);
			match(RPAREN);
			setState(2343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(2342);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(javaParser.NEW, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(javaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(javaParser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClassInstanceCreationExpression_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2345);
				match(NEW);
				setState(2347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2346);
					typeArguments();
					}
				}

				setState(2352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2349);
					annotation();
					}
					}
					setState(2354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2355);
				identifier();
				setState(2366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2356);
					match(DOT);
					setState(2360);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2357);
						annotation();
						}
						}
						setState(2362);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2363);
					identifier();
					}
					}
					setState(2368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2369);
					typeArgumentsOrDiamond();
					}
				}

				setState(2372);
				match(LPAREN);
				setState(2374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2373);
					argumentList();
					}
				}

				setState(2376);
				match(RPAREN);
				setState(2378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(2377);
					classBody();
					}
					break;
				}
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2380);
				expressionName();
				setState(2381);
				match(DOT);
				setState(2382);
				match(NEW);
				setState(2384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2383);
					typeArguments();
					}
				}

				setState(2389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2386);
					annotation();
					}
					}
					setState(2391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2392);
				identifier();
				setState(2394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2393);
					typeArgumentsOrDiamond();
					}
				}

				setState(2396);
				match(LPAREN);
				setState(2398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2397);
					argumentList();
					}
				}

				setState(2400);
				match(RPAREN);
				setState(2402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(2401);
					classBody();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode LT() { return getToken(javaParser.LT, 0); }
		public TerminalNode GT() { return getToken(javaParser.GT, 0); }
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_typeArgumentsOrDiamond);
		try {
			setState(2409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2406);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2407);
				match(LT);
				setState(2408);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(javaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(javaParser.DOT, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(javaParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_fieldAccess);
		try {
			setState(2424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2411);
				primary();
				setState(2412);
				match(DOT);
				setState(2413);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2415);
				match(SUPER);
				setState(2416);
				match(DOT);
				setState(2417);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2418);
				typeName();
				setState(2419);
				match(DOT);
				setState(2420);
				match(SUPER);
				setState(2421);
				match(DOT);
				setState(2422);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitFieldAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitFieldAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			match(DOT);
			setState(2427);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(javaParser.SUPER, 0); }
		public List<TerminalNode> DOT() { return getTokens(javaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(javaParser.DOT, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitFieldAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitFieldAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_fieldAccess_lfno_primary);
		try {
			setState(2438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2429);
				match(SUPER);
				setState(2430);
				match(DOT);
				setState(2431);
				identifier();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2432);
				typeName();
				setState(2433);
				match(DOT);
				setState(2434);
				match(SUPER);
				setState(2435);
				match(DOT);
				setState(2436);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(javaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(javaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(javaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(javaParser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(2440);
				expressionName();
				setState(2441);
				match(LBRACK);
				setState(2442);
				expression();
				setState(2443);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2445);
				primaryNoNewArray_lfno_arrayAccess();
				setState(2446);
				match(LBRACK);
				setState(2447);
				expression();
				setState(2448);
				match(RBRACK);
				}
				break;
			}
			setState(2459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2452);
				primaryNoNewArray_lf_arrayAccess();
				setState(2453);
				match(LBRACK);
				setState(2454);
				expression();
				setState(2455);
				match(RBRACK);
				}
				}
				setState(2461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(javaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(javaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(javaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(javaParser.RBRACK, i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitArrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitArrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2462);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2463);
			match(LBRACK);
			setState(2464);
			expression();
			setState(2465);
			match(RBRACK);
			}
			setState(2474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2467);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2468);
					match(LBRACK);
					setState(2469);
					expression();
					setState(2470);
					match(RBRACK);
					}
					} 
				}
				setState(2476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(javaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(javaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(javaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(javaParser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitArrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitArrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				setState(2477);
				expressionName();
				setState(2478);
				match(LBRACK);
				setState(2479);
				expression();
				setState(2480);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2482);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2483);
				match(LBRACK);
				setState(2484);
				expression();
				setState(2485);
				match(RBRACK);
				}
				break;
			}
			setState(2496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2489);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2490);
					match(LBRACK);
					setState(2491);
					expression();
					setState(2492);
					match(RBRACK);
					}
					} 
				}
				setState(2498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(javaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(javaParser.DOT, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(javaParser.SUPER, 0); }
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_methodInvocation);
		int _la;
		try {
			setState(2568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2499);
				methodName();
				setState(2500);
				match(LPAREN);
				setState(2502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2501);
					argumentList();
					}
				}

				setState(2504);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2506);
				typeName();
				setState(2507);
				match(DOT);
				setState(2509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2508);
					typeArguments();
					}
				}

				setState(2511);
				identifier();
				setState(2512);
				match(LPAREN);
				setState(2514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2513);
					argumentList();
					}
				}

				setState(2516);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2518);
				expressionName();
				setState(2519);
				match(DOT);
				setState(2521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2520);
					typeArguments();
					}
				}

				setState(2523);
				identifier();
				setState(2524);
				match(LPAREN);
				setState(2526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2525);
					argumentList();
					}
				}

				setState(2528);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2530);
				primary();
				setState(2531);
				match(DOT);
				setState(2533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2532);
					typeArguments();
					}
				}

				setState(2535);
				identifier();
				setState(2536);
				match(LPAREN);
				setState(2538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2537);
					argumentList();
					}
				}

				setState(2540);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2542);
				match(SUPER);
				setState(2543);
				match(DOT);
				setState(2545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2544);
					typeArguments();
					}
				}

				setState(2547);
				identifier();
				setState(2548);
				match(LPAREN);
				setState(2550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2549);
					argumentList();
					}
				}

				setState(2552);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2554);
				typeName();
				setState(2555);
				match(DOT);
				setState(2556);
				match(SUPER);
				setState(2557);
				match(DOT);
				setState(2559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2558);
					typeArguments();
					}
				}

				setState(2561);
				identifier();
				setState(2562);
				match(LPAREN);
				setState(2564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2563);
					argumentList();
					}
				}

				setState(2566);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMethodInvocation_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMethodInvocation_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2570);
			match(DOT);
			setState(2572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2571);
				typeArguments();
				}
			}

			setState(2574);
			identifier();
			setState(2575);
			match(LPAREN);
			setState(2577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(2576);
				argumentList();
				}
			}

			setState(2579);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(javaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(javaParser.DOT, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(javaParser.SUPER, 0); }
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMethodInvocation_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMethodInvocation_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2581);
				methodName();
				setState(2582);
				match(LPAREN);
				setState(2584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2583);
					argumentList();
					}
				}

				setState(2586);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2588);
				typeName();
				setState(2589);
				match(DOT);
				setState(2591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2590);
					typeArguments();
					}
				}

				setState(2593);
				identifier();
				setState(2594);
				match(LPAREN);
				setState(2596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2595);
					argumentList();
					}
				}

				setState(2598);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2600);
				expressionName();
				setState(2601);
				match(DOT);
				setState(2603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2602);
					typeArguments();
					}
				}

				setState(2605);
				identifier();
				setState(2606);
				match(LPAREN);
				setState(2608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2607);
					argumentList();
					}
				}

				setState(2610);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2612);
				match(SUPER);
				setState(2613);
				match(DOT);
				setState(2615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2614);
					typeArguments();
					}
				}

				setState(2617);
				identifier();
				setState(2618);
				match(LPAREN);
				setState(2620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2619);
					argumentList();
					}
				}

				setState(2622);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2624);
				typeName();
				setState(2625);
				match(DOT);
				setState(2626);
				match(SUPER);
				setState(2627);
				match(DOT);
				setState(2629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2628);
					typeArguments();
					}
				}

				setState(2631);
				identifier();
				setState(2632);
				match(LPAREN);
				setState(2634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(2633);
					argumentList();
					}
				}

				setState(2636);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(javaParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2640);
			expression();
			setState(2645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2641);
				match(COMMA);
				setState(2642);
				expression();
				}
				}
				setState(2647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(javaParser.COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(javaParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(javaParser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_methodReference);
		int _la;
		try {
			setState(2695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2648);
				expressionName();
				setState(2649);
				match(COLONCOLON);
				setState(2651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2650);
					typeArguments();
					}
				}

				setState(2653);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2655);
				referenceType();
				setState(2656);
				match(COLONCOLON);
				setState(2658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2657);
					typeArguments();
					}
				}

				setState(2660);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2662);
				primary();
				setState(2663);
				match(COLONCOLON);
				setState(2665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2664);
					typeArguments();
					}
				}

				setState(2667);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2669);
				match(SUPER);
				setState(2670);
				match(COLONCOLON);
				setState(2672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2671);
					typeArguments();
					}
				}

				setState(2674);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2675);
				typeName();
				setState(2676);
				match(DOT);
				setState(2677);
				match(SUPER);
				setState(2678);
				match(COLONCOLON);
				setState(2680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2679);
					typeArguments();
					}
				}

				setState(2682);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2684);
				classType();
				setState(2685);
				match(COLONCOLON);
				setState(2687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2686);
					typeArguments();
					}
				}

				setState(2689);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2691);
				arrayType();
				setState(2692);
				match(COLONCOLON);
				setState(2693);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(javaParser.COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMethodReference_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMethodReference_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2697);
			match(COLONCOLON);
			setState(2699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2698);
				typeArguments();
				}
			}

			setState(2701);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(javaParser.COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(javaParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(javaParser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(javaParser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMethodReference_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMethodReference_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2703);
				expressionName();
				setState(2704);
				match(COLONCOLON);
				setState(2706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2705);
					typeArguments();
					}
				}

				setState(2708);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2710);
				referenceType();
				setState(2711);
				match(COLONCOLON);
				setState(2713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2712);
					typeArguments();
					}
				}

				setState(2715);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2717);
				match(SUPER);
				setState(2718);
				match(COLONCOLON);
				setState(2720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2719);
					typeArguments();
					}
				}

				setState(2722);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2723);
				typeName();
				setState(2724);
				match(DOT);
				setState(2725);
				match(SUPER);
				setState(2726);
				match(COLONCOLON);
				setState(2728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2727);
					typeArguments();
					}
				}

				setState(2730);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2732);
				classType();
				setState(2733);
				match(COLONCOLON);
				setState(2735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2734);
					typeArguments();
					}
				}

				setState(2737);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2739);
				arrayType();
				setState(2740);
				match(COLONCOLON);
				setState(2741);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(javaParser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_arrayCreationExpression);
		try {
			setState(2767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2745);
				match(NEW);
				setState(2746);
				primitiveType();
				setState(2747);
				dimExprs();
				setState(2749);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
				case 1:
					{
					setState(2748);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2751);
				match(NEW);
				setState(2752);
				classOrInterfaceType();
				setState(2753);
				dimExprs();
				setState(2755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
				case 1:
					{
					setState(2754);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2757);
				match(NEW);
				setState(2758);
				primitiveType();
				setState(2759);
				dims();
				setState(2760);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2762);
				match(NEW);
				setState(2763);
				classOrInterfaceType();
				setState(2764);
				dims();
				setState(2765);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2770); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2769);
					dimExpr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2772); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(javaParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(javaParser.RBRACK, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitDimExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2774);
				annotation();
				}
				}
				setState(2779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2780);
			match(LBRACK);
			setState(2781);
			expression();
			setState(2782);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_constantExpression);
		try {
			setState(2795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2784);
				expression();
				setState(2785);
				assignmentOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2787);
				postIncrementExpression();
				setState(2788);
				expression();
				notifyErrorListeners("unexpected expression after '++'. Replace expression with ';'");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2791);
				postDecrementExpression();
				setState(2792);
				expression();
				notifyErrorListeners("unexpected expression after '--'. Replace expression with ';'");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_expression);
		try {
			setState(2799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2797);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2798);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(javaParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2801);
			lambdaParameters();
			setState(2802);
			match(ARROW);
			setState(2803);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_lambdaParameters);
		int _la;
		try {
			setState(2815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2805);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2806);
				match(LPAREN);
				setState(2808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==Identifier) {
					{
					setState(2807);
					formalParameterList();
					}
				}

				setState(2810);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2811);
				match(LPAREN);
				setState(2812);
				inferredFormalParameterList();
				setState(2813);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(javaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(javaParser.COMMA, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitInferredFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitInferredFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2817);
			identifier();
			setState(2822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2818);
				match(COMMA);
				setState(2819);
				identifier();
				}
				}
				setState(2824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_lambdaBody);
		try {
			setState(2827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case AT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2825);
				expression();
				}
				break;
			case DISP:
			case SIN:
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2826);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_assignmentExpression);
		try {
			setState(2831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2829);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2830);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2833);
			leftHandSide();
			setState(2834);
			assignmentOperator();
			setState(2835);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitLeftHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_leftHandSide);
		try {
			setState(2840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2837);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2838);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2839);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(javaParser.ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(javaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(javaParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(javaParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(javaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(javaParser.SUB_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(javaParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(javaParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(javaParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(javaParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(javaParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(javaParser.OR_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2842);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (ASSIGN - 87)) | (1L << (ADD_ASSIGN - 87)) | (1L << (SUB_ASSIGN - 87)) | (1L << (MUL_ASSIGN - 87)) | (1L << (DIV_ASSIGN - 87)) | (1L << (AND_ASSIGN - 87)) | (1L << (OR_ASSIGN - 87)) | (1L << (XOR_ASSIGN - 87)) | (1L << (MOD_ASSIGN - 87)) | (1L << (LSHIFT_ASSIGN - 87)) | (1L << (RSHIFT_ASSIGN - 87)) | (1L << (URSHIFT_ASSIGN - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(javaParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(javaParser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_conditionalExpression);
		try {
			setState(2853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2844);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2845);
				conditionalOrExpression(0);
				setState(2846);
				match(QUESTION);
				setState(2847);
				expression();
				setState(2848);
				match(COLON);
				setState(2851);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(2849);
					conditionalExpression();
					}
					break;
				case 2:
					{
					setState(2850);
					lambdaExpression();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(javaParser.OR, 0); }
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2856);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2863);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2858);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2859);
					match(OR);
					setState(2860);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(javaParser.AND, 0); }
		public List<TerminalNode> BITAND() { return getTokens(javaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(javaParser.BITAND, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 454;
		enterRecursionRule(_localctx, 454, RULE_conditionalAndExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2867);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2884);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2882);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
						setState(2869);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2870);
						match(AND);
						setState(2871);
						inclusiveOrExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
						setState(2872);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2873);
						match(AND);
						setState(2875); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2874);
							match(BITAND);
							}
							}
							setState(2877); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==BITAND );
						setState(2879);
						inclusiveOrExpression(0);
						notifyErrorListeners("Too many '&'. Please reduce trsiling '&' to '&&'");
						}
						break;
					}
					} 
				}
				setState(2886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode BITOR() { return getToken(javaParser.BITOR, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 456;
		enterRecursionRule(_localctx, 456, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2888);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2895);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2890);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2891);
					match(BITOR);
					setState(2892);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(2897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode CARET() { return getToken(javaParser.CARET, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 458;
		enterRecursionRule(_localctx, 458, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2899);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2906);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2901);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2902);
					match(CARET);
					setState(2903);
					andExpression(0);
					}
					} 
				}
				setState(2908);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode BITAND() { return getToken(javaParser.BITAND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 460;
		enterRecursionRule(_localctx, 460, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2910);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2917);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2912);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2913);
					match(BITAND);
					setState(2914);
					equalityExpression(0);
					}
					} 
				}
				setState(2919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(javaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(javaParser.NOTEQUAL, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 462;
		enterRecursionRule(_localctx, 462, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2921);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2931);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2929);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2923);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2924);
						match(EQUAL);
						setState(2925);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2926);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2927);
						match(NOTEQUAL);
						setState(2928);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2933);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(javaParser.LT, 0); }
		public TerminalNode GT() { return getToken(javaParser.GT, 0); }
		public TerminalNode LE() { return getToken(javaParser.LE, 0); }
		public TerminalNode GE() { return getToken(javaParser.GE, 0); }
		public TerminalNode INSTANCEOF() { return getToken(javaParser.INSTANCEOF, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 464;
		enterRecursionRule(_localctx, 464, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2935);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2954);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2952);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2937);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2938);
						match(LT);
						setState(2939);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2940);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2941);
						match(GT);
						setState(2942);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2943);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2944);
						match(LE);
						setState(2945);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2946);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2947);
						match(GE);
						setState(2948);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2949);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2950);
						match(INSTANCEOF);
						setState(2951);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(2956);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public List<TerminalNode> LT() { return getTokens(javaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(javaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(javaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(javaParser.GT, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 466;
		enterRecursionRule(_localctx, 466, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2958);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2975);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2973);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2960);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2961);
						match(LT);
						setState(2962);
						match(LT);
						setState(2963);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2964);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2965);
						match(GT);
						setState(2966);
						match(GT);
						setState(2967);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2968);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2969);
						match(GT);
						setState(2970);
						match(GT);
						setState(2971);
						match(GT);
						setState(2972);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2977);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(javaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(javaParser.SUB, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 468;
		enterRecursionRule(_localctx, 468, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2979);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2989);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2987);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2981);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2982);
						match(ADD);
						setState(2983);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2984);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2985);
						match(SUB);
						setState(2986);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(javaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(javaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(javaParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(javaParser.ADD, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 470;
		enterRecursionRule(_localctx, 470, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2993);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(3009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3007);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2995);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2996);
						match(MUL);
						setState(2997);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2998);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2999);
						match(DIV);
						setState(3000);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(3001);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3002);
						match(MOD);
						setState(3003);
						unaryExpression();
						}
						break;
					case 4:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(3004);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3005);
						match(ADD);
						notifyErrorListeners("Expected expression after '+'");
						}
						break;
					}
					} 
				}
				setState(3011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(javaParser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(javaParser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_unaryExpression);
		try {
			setState(3019);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(3012);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(3013);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(3014);
				match(ADD);
				setState(3015);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(3016);
				match(SUB);
				setState(3017);
				unaryExpression();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case AT:
			case BANG:
			case TILDE:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(3018);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(javaParser.INC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3021);
			match(INC);
			setState(3022);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(javaParser.DEC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPreDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPreDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3024);
			match(DEC);
			setState(3025);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(javaParser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(javaParser.BANG, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(3033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3027);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3028);
				match(TILDE);
				setState(3029);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3030);
				match(BANG);
				setState(3031);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3032);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				{
				setState(3035);
				primary();
				}
				break;
			case 2:
				{
				setState(3036);
				expressionName();
				}
				break;
			}
			setState(3043);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(3041);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(3039);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(3040);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(3045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(javaParser.INC, 0); }
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3046);
			postfixExpression();
			setState(3047);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(javaParser.INC, 0); }
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPostIncrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3049);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(javaParser.DEC, 0); }
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPostDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3051);
			postfixExpression();
			setState(3052);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(javaParser.DEC, 0); }
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitPostDecrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3054);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(javaParser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_castExpression);
		int _la;
		try {
			setState(3083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3056);
				match(LPAREN);
				setState(3057);
				primitiveType();
				setState(3058);
				match(RPAREN);
				setState(3059);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3061);
				match(LPAREN);
				setState(3062);
				referenceType();
				setState(3066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3063);
					additionalBound();
					}
					}
					setState(3068);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3069);
				match(RPAREN);
				setState(3070);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3072);
				match(LPAREN);
				setState(3073);
				referenceType();
				setState(3077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3074);
					additionalBound();
					}
					}
					setState(3079);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3080);
				match(RPAREN);
				setState(3081);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(javaParser.NEWLINE, 0); }
		public TerminalNode SEMI() { return getToken(javaParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(javaParser.LPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_newline);
		try {
			setState(3101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3085);
				match(NEWLINE);
				setState(3086);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3087);
				match(NEWLINE);
				notifyErrorListeners("Expected '()' and/or ';' after expression.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3089);
				match(NEWLINE);
				setState(3090);
				match(SEMI);
				notifyErrorListeners("Expected '()' in expression.");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3092);
				match(NEWLINE);
				setState(3093);
				match(T__13);
				notifyErrorListeners("Expected ';' after expression.");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3095);
				match(NEWLINE);
				setState(3096);
				match(LPAREN);
				setState(3097);
				argumentList();
				setState(3098);
				match(T__10);
				notifyErrorListeners("Expected '+' or ')' after expression.");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(javaParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return moduleName_sempred((ModuleNameContext)_localctx, predIndex);
		case 26:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 28:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 31:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 226:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 227:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 228:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 229:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 230:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 231:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 232:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 233:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 234:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 235:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean moduleName_sempred(ModuleNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 3);
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 4);
		case 23:
			return precpred(_ctx, 3);
		case 24:
			return precpred(_ctx, 2);
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\177\u0c24\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\3\2\3"+
		"\2\3\3\7\3\u01f6\n\3\f\3\16\3\u01f9\13\3\3\3\3\3\7\3\u01fd\n\3\f\3\16"+
		"\3\u0200\13\3\3\3\5\3\u0203\n\3\3\4\3\4\5\4\u0207\n\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\5\7\u0210\n\7\3\b\3\b\5\b\u0214\n\b\3\b\3\b\7\b\u0218\n\b"+
		"\f\b\16\b\u021b\13\b\3\t\7\t\u021e\n\t\f\t\16\t\u0221\13\t\3\t\3\t\5\t"+
		"\u0225\n\t\3\t\3\t\3\t\7\t\u022a\n\t\f\t\16\t\u022d\13\t\3\t\3\t\5\t\u0231"+
		"\n\t\5\t\u0233\n\t\3\n\3\n\7\n\u0237\n\n\f\n\16\n\u023a\13\n\3\n\3\n\5"+
		"\n\u023e\n\n\3\13\7\13\u0241\n\13\f\13\16\13\u0244\13\13\3\13\3\13\5\13"+
		"\u0248\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\7\17\u0251\n\17\f\17\16\17"+
		"\u0254\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u0261\n\20\3\21\7\21\u0264\n\21\f\21\16\21\u0267\13\21\3\21\3\21\3"+
		"\21\7\21\u026c\n\21\f\21\16\21\u026f\13\21\3\21\3\21\7\21\u0273\n\21\f"+
		"\21\16\21\u0276\13\21\3\22\7\22\u0279\n\22\f\22\16\22\u027c\13\22\3\22"+
		"\3\22\5\22\u0280\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0289\n"+
		"\24\f\24\16\24\u028c\13\24\5\24\u028e\n\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\7\27\u029a\n\27\f\27\16\27\u029d\13\27\3\30\3"+
		"\30\5\30\u02a1\n\30\3\31\7\31\u02a4\n\31\f\31\16\31\u02a7\13\31\3\31\3"+
		"\31\5\31\u02ab\n\31\3\32\3\32\3\32\3\32\5\32\u02b1\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u02b9\n\33\f\33\16\33\u02bc\13\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\7\34\u02c4\n\34\f\34\16\34\u02c7\13\34\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u02ce\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02d6\n"+
		"\36\f\36\16\36\u02d9\13\36\3\37\3\37\3\37\3\37\3\37\5\37\u02e0\n\37\3"+
		" \3 \3!\3!\3!\3!\3!\3!\7!\u02ea\n!\f!\16!\u02ed\13!\3\"\3\"\3\"\3\"\3"+
		"\"\5\"\u02f4\n\"\3#\5#\u02f7\n#\3#\7#\u02fa\n#\f#\16#\u02fd\13#\3#\7#"+
		"\u0300\n#\f#\16#\u0303\13#\3#\3#\3$\7$\u0308\n$\f$\16$\u030b\13$\3$\3"+
		"$\3%\7%\u0310\n%\f%\16%\u0313\13%\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\5"+
		"\'\u031f\n\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3+\3+\3+\3,\3,\3,\5,\u033c\n,\3-\7-\u033f\n-\f-\16-\u0342\13-\3"+
		"-\5-\u0345\n-\3-\3-\3-\3-\7-\u034b\n-\f-\16-\u034e\13-\3-\3-\3.\3.\7."+
		"\u0354\n.\f.\16.\u0357\13.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0362\n.\f.\16"+
		".\u0365\13.\5.\u0367\n.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0371\n.\f.\16.\u0374"+
		"\13.\5.\u0376\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0384\n.\f.\16"+
		".\u0387\13.\3.\3.\5.\u038b\n.\3/\3/\3\60\3\60\5\60\u0391\n\60\3\61\7\61"+
		"\u0394\n\61\f\61\16\61\u0397\13\61\3\61\3\61\3\61\5\61\u039c\n\61\3\61"+
		"\5\61\u039f\n\61\3\61\5\61\u03a2\n\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\5\62\u03ae\n\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\7\64\u03b7\n\64\f\64\16\64\u03ba\13\64\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\7\67\u03c5\n\67\f\67\16\67\u03c8\13\67\38\38\78\u03cc"+
		"\n8\f8\168\u03cf\138\38\38\39\39\39\39\59\u03d7\n9\3:\3:\3:\3:\3:\5:\u03de"+
		"\n:\3;\7;\u03e1\n;\f;\16;\u03e4\13;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\5<\u03f2\n<\3=\3=\3=\7=\u03f7\n=\f=\16=\u03fa\13=\3>\3>\3>\5>\u03ff"+
		"\n>\3?\3?\5?\u0403\n?\3@\3@\5@\u0407\n@\3A\3A\5A\u040b\nA\3B\3B\5B\u040f"+
		"\nB\3C\3C\3C\5C\u0414\nC\3D\3D\5D\u0418\nD\3D\3D\7D\u041c\nD\fD\16D\u041f"+
		"\13D\3E\3E\5E\u0423\nE\3E\3E\3E\7E\u0428\nE\fE\16E\u042b\13E\3E\3E\5E"+
		"\u042f\nE\5E\u0431\nE\3F\3F\7F\u0435\nF\fF\16F\u0438\13F\3F\3F\5F\u043c"+
		"\nF\3G\3G\5G\u0440\nG\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\5L\u0453\nL\3M\7M\u0456\nM\fM\16M\u0459\13M\3M\3M\3M\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\5N\u0468\nN\3O\3O\3O\5O\u046d\nO\3O\3O\7O\u0471\nO\f"+
		"O\16O\u0474\13O\3O\3O\3O\5O\u0479\nO\5O\u047b\nO\3P\3P\5P\u047f\nP\3Q"+
		"\3Q\3Q\5Q\u0484\nQ\3Q\3Q\5Q\u0488\nQ\3R\3R\3R\3R\3R\3R\5R\u0490\nR\3S"+
		"\3S\3S\7S\u0495\nS\fS\16S\u0498\13S\3S\3S\3S\7S\u049d\nS\fS\16S\u04a0"+
		"\13S\5S\u04a2\nS\3T\7T\u04a5\nT\fT\16T\u04a8\13T\3T\3T\3T\3U\3U\5U\u04af"+
		"\nU\3V\7V\u04b2\nV\fV\16V\u04b5\13V\3V\3V\7V\u04b9\nV\fV\16V\u04bc\13"+
		"V\3V\3V\3V\3V\5V\u04c2\nV\3W\7W\u04c5\nW\fW\16W\u04c8\13W\3W\3W\3W\3W"+
		"\5W\u04ce\nW\3W\3W\3X\3X\3X\3Y\3Y\3Y\7Y\u04d8\nY\fY\16Y\u04db\13Y\3Z\3"+
		"Z\5Z\u04df\nZ\3[\3[\5[\u04e3\n[\3\\\3\\\3]\3]\3]\3^\7^\u04eb\n^\f^\16"+
		"^\u04ee\13^\3^\3^\5^\u04f2\n^\3^\3^\3_\3_\3_\3_\5_\u04fa\n_\3`\5`\u04fd"+
		"\n`\3`\3`\3`\5`\u0502\n`\3`\3`\3a\3a\3b\3b\5b\u050a\nb\3b\5b\u050d\nb"+
		"\3b\3b\3c\5c\u0512\nc\3c\3c\3c\5c\u0517\nc\3c\3c\3c\5c\u051c\nc\3c\3c"+
		"\3c\5c\u0521\nc\3c\3c\3c\3c\3c\5c\u0528\nc\3c\3c\3c\5c\u052d\nc\3c\3c"+
		"\3c\3c\3c\3c\5c\u0535\nc\3c\3c\3c\5c\u053a\nc\3c\3c\3c\5c\u053f\nc\3d"+
		"\7d\u0542\nd\fd\16d\u0545\13d\3d\3d\3d\5d\u054a\nd\3d\3d\3e\3e\5e\u0550"+
		"\ne\3e\5e\u0553\ne\3e\5e\u0556\ne\3e\3e\3f\3f\3f\7f\u055d\nf\ff\16f\u0560"+
		"\13f\3g\7g\u0563\ng\fg\16g\u0566\13g\3g\3g\3g\5g\u056b\ng\3g\5g\u056e"+
		"\ng\3g\5g\u0571\ng\3h\3h\3i\3i\7i\u0577\ni\fi\16i\u057a\13i\3j\3j\5j\u057e"+
		"\nj\3k\7k\u0581\nk\fk\16k\u0584\13k\3k\3k\3k\5k\u0589\nk\3k\5k\u058c\n"+
		"k\3k\3k\3l\3l\3l\3l\3l\3l\3l\5l\u0597\nl\3m\3m\3m\3n\3n\7n\u059e\nn\f"+
		"n\16n\u05a1\13n\3n\3n\3o\3o\3o\3o\3o\5o\u05aa\no\3p\7p\u05ad\np\fp\16"+
		"p\u05b0\13p\3p\3p\3p\3p\3q\3q\3q\3q\5q\u05ba\nq\3r\7r\u05bd\nr\fr\16r"+
		"\u05c0\13r\3r\3r\3r\3s\3s\3s\3s\3s\3s\3s\5s\u05cc\ns\3t\7t\u05cf\nt\f"+
		"t\16t\u05d2\13t\3t\3t\3t\3t\3t\3u\3u\7u\u05db\nu\fu\16u\u05de\13u\3u\3"+
		"u\3v\3v\3v\3v\3v\5v\u05e7\nv\3w\7w\u05ea\nw\fw\16w\u05ed\13w\3w\3w\3w"+
		"\3w\3w\5w\u05f4\nw\3w\5w\u05f7\nw\3w\3w\3x\3x\3x\5x\u05fe\nx\3y\3y\3y"+
		"\3z\3z\3z\5z\u0606\nz\3{\3{\3{\3{\5{\u060c\n{\3{\3{\3|\3|\3|\7|\u0613"+
		"\n|\f|\16|\u0616\13|\3}\3}\3}\3}\3~\3~\3~\5~\u061f\n~\3\177\3\177\5\177"+
		"\u0623\n\177\3\177\5\177\u0626\n\177\3\177\3\177\3\u0080\3\u0080\3\u0080"+
		"\7\u0080\u062d\n\u0080\f\u0080\16\u0080\u0630\13\u0080\3\u0081\3\u0081"+
		"\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\5\u0083\u063d\n\u0083\3\u0083\5\u0083\u0640\n\u0083\3\u0083\3\u0083\3"+
		"\u0084\3\u0084\3\u0084\7\u0084\u0647\n\u0084\f\u0084\16\u0084\u064a\13"+
		"\u0084\3\u0085\3\u0085\5\u0085\u064e\n\u0085\3\u0085\3\u0085\3\u0085\5"+
		"\u0085\u0653\n\u0085\3\u0086\6\u0086\u0656\n\u0086\r\u0086\16\u0086\u0657"+
		"\3\u0086\3\u0086\5\u0086\u065c\n\u0086\3\u0087\3\u0087\3\u0087\5\u0087"+
		"\u0661\n\u0087\3\u0088\3\u0088\3\u0088\3\u0089\7\u0089\u0667\n\u0089\f"+
		"\u0089\16\u0089\u066a\13\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0675\n\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\5\u008b\u067c\n\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\5\u008c\u068a\n\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\6\u0091\u069d\n\u0091\r\u0091\16\u0091\u069e\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u06a9"+
		"\n\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u06b7\n\u0093\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\5\u0097\u06d9\n\u0097\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\7\u0099\u06e3\n\u0099\f\u0099"+
		"\16\u0099\u06e6\13\u0099\3\u0099\7\u0099\u06e9\n\u0099\f\u0099\16\u0099"+
		"\u06ec\13\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009b\6\u009b"+
		"\u06f4\n\u009b\r\u009b\16\u009b\u06f5\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0702\n\u009c"+
		"\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\5\u00a1\u071c\n\u00a1"+
		"\3\u00a2\3\u00a2\5\u00a2\u0720\n\u00a2\3\u00a3\3\u00a3\3\u00a3\5\u00a3"+
		"\u0725\n\u00a3\3\u00a3\3\u00a3\5\u00a3\u0729\n\u00a3\3\u00a3\3\u00a3\5"+
		"\u00a3\u072d\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\5"+
		"\u00a4\u0735\n\u00a4\3\u00a4\3\u00a4\5\u00a4\u0739\n\u00a4\3\u00a4\3\u00a4"+
		"\5\u00a4\u073d\n\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\5\u00a5"+
		"\u0744\n\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u074b\n"+
		"\u00a7\f\u00a7\16\u00a7\u074e\13\u00a7\3\u00a8\3\u00a8\3\u00a8\7\u00a8"+
		"\u0753\n\u00a8\f\u00a8\16\u00a8\u0756\13\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u0762"+
		"\n\u00a9\f\u00a9\16\u00a9\u0765\13\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\5\u00aa\u0770\n\u00aa\3\u00aa"+
		"\3\u00aa\3\u00ab\3\u00ab\5\u00ab\u0776\n\u00ab\3\u00ab\3\u00ab\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0794"+
		"\n\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0799\n\u00ac\3\u00ac\5\u00ac"+
		"\u079c\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\5\u00af\u07af\n\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u07b4\n"+
		"\u00af\3\u00b0\6\u00b0\u07b7\n\u00b0\r\u00b0\16\u00b0\u07b8\3\u00b1\3"+
		"\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2\7\u00b2\u07c2\n\u00b2\f"+
		"\u00b2\16\u00b2\u07c5\13\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3"+
		"\3\u00b3\7\u00b3\u07cd\n\u00b3\f\u00b3\16\u00b3\u07d0\13\u00b3\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u07d9\n\u00b5"+
		"\3\u00b5\5\u00b5\u07dc\n\u00b5\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u07e1\n"+
		"\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u07e8\n\u00b7\f"+
		"\u00b7\16\u00b7\u07eb\13\u00b7\3\u00b8\7\u00b8\u07ee\n\u00b8\f\u00b8\16"+
		"\u00b8\u07f1\13\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\5\u00b8\u07f9\n\u00b8\3\u00b9\3\u00b9\5\u00b9\u07fd\n\u00b9\3\u00ba\3"+
		"\u00ba\5\u00ba\u0801\n\u00ba\3\u00ba\7\u00ba\u0804\n\u00ba\f\u00ba\16"+
		"\u00ba\u0807\13\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\5\u00bb\u0819\n\u00bb\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\7\u00bd\u0821\n\u00bd\f\u00bd\16\u00bd\u0824\13\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u0839\n\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be"+
		"\u0840\n\u00be\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0"+
		"\u0848\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\7\u00c1\u084e\n\u00c1\f"+
		"\u00c1\16\u00c1\u0851\13\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\7\u00c1\u0859\n\u00c1\f\u00c1\16\u00c1\u085c\13\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\6\u00c1\u0876\n\u00c1\r\u00c1"+
		"\16\u00c1\u0877\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1"+
		"\u0880\n\u00c1\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3"+
		"\u0888\n\u00c3\f\u00c3\16\u00c3\u088b\13\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u0893\n\u00c3\f\u00c3\16\u00c3\u0896"+
		"\13\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\5\u00c3\u08ab\n\u00c3\3\u00c4\3\u00c4\3\u00c4\5\u00c4"+
		"\u08b0\n\u00c4\3\u00c4\3\u00c4\7\u00c4\u08b4\n\u00c4\f\u00c4\16\u00c4"+
		"\u08b7\13\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u08be"+
		"\n\u00c4\3\u00c5\3\u00c5\5\u00c5\u08c2\n\u00c5\3\u00c5\7\u00c5\u08c5\n"+
		"\u00c5\f\u00c5\16\u00c5\u08c8\13\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5"+
		"\u08cd\n\u00c5\f\u00c5\16\u00c5\u08d0\13\u00c5\3\u00c5\7\u00c5\u08d3\n"+
		"\u00c5\f\u00c5\16\u00c5\u08d6\13\u00c5\3\u00c5\5\u00c5\u08d9\n\u00c5\3"+
		"\u00c5\3\u00c5\5\u00c5\u08dd\n\u00c5\3\u00c5\3\u00c5\5\u00c5\u08e1\n\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u08e7\n\u00c5\3\u00c5\7\u00c5"+
		"\u08ea\n\u00c5\f\u00c5\16\u00c5\u08ed\13\u00c5\3\u00c5\3\u00c5\5\u00c5"+
		"\u08f1\n\u00c5\3\u00c5\3\u00c5\5\u00c5\u08f5\n\u00c5\3\u00c5\3\u00c5\5"+
		"\u00c5\u08f9\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u08ff\n\u00c5"+
		"\3\u00c5\7\u00c5\u0902\n\u00c5\f\u00c5\16\u00c5\u0905\13\u00c5\3\u00c5"+
		"\3\u00c5\5\u00c5\u0909\n\u00c5\3\u00c5\3\u00c5\5\u00c5\u090d\n\u00c5\3"+
		"\u00c5\3\u00c5\5\u00c5\u0911\n\u00c5\5\u00c5\u0913\n\u00c5\3\u00c6\3\u00c6"+
		"\3\u00c6\5\u00c6\u0918\n\u00c6\3\u00c6\7\u00c6\u091b\n\u00c6\f\u00c6\16"+
		"\u00c6\u091e\13\u00c6\3\u00c6\3\u00c6\5\u00c6\u0922\n\u00c6\3\u00c6\3"+
		"\u00c6\5\u00c6\u0926\n\u00c6\3\u00c6\3\u00c6\5\u00c6\u092a\n\u00c6\3\u00c7"+
		"\3\u00c7\5\u00c7\u092e\n\u00c7\3\u00c7\7\u00c7\u0931\n\u00c7\f\u00c7\16"+
		"\u00c7\u0934\13\u00c7\3\u00c7\3\u00c7\3\u00c7\7\u00c7\u0939\n\u00c7\f"+
		"\u00c7\16\u00c7\u093c\13\u00c7\3\u00c7\7\u00c7\u093f\n\u00c7\f\u00c7\16"+
		"\u00c7\u0942\13\u00c7\3\u00c7\5\u00c7\u0945\n\u00c7\3\u00c7\3\u00c7\5"+
		"\u00c7\u0949\n\u00c7\3\u00c7\3\u00c7\5\u00c7\u094d\n\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\5\u00c7\u0953\n\u00c7\3\u00c7\7\u00c7\u0956\n\u00c7\f"+
		"\u00c7\16\u00c7\u0959\13\u00c7\3\u00c7\3\u00c7\5\u00c7\u095d\n\u00c7\3"+
		"\u00c7\3\u00c7\5\u00c7\u0961\n\u00c7\3\u00c7\3\u00c7\5\u00c7\u0965\n\u00c7"+
		"\5\u00c7\u0967\n\u00c7\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u096c\n\u00c8\3"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u097b\n\u00c9\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\5\u00cb\u0989\n\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0995\n\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\7\u00cc\u099c\n\u00cc\f\u00cc\16\u00cc"+
		"\u099f\13\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\7\u00cd\u09ab\n\u00cd\f\u00cd\16\u00cd\u09ae"+
		"\13\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u09ba\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\7\u00ce\u09c1\n\u00ce\f\u00ce\16\u00ce\u09c4\13\u00ce\3\u00cf"+
		"\3\u00cf\3\u00cf\5\u00cf\u09c9\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\5\u00cf\u09d0\n\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09d5\n"+
		"\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09dc\n\u00cf\3"+
		"\u00cf\3\u00cf\3\u00cf\5\u00cf\u09e1\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3"+
		"\u00cf\3\u00cf\5\u00cf\u09e8\n\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09ed"+
		"\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09f4\n\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09f9\n\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0a02\n\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\5\u00cf\u0a07\n\u00cf\3\u00cf\3\u00cf\5\u00cf\u0a0b\n\u00cf\3"+
		"\u00d0\3\u00d0\5\u00d0\u0a0f\n\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0a14"+
		"\n\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u0a1b\n\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u0a22\n\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d1\5\u00d1\u0a27\n\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d1\5\u00d1\u0a2e\n\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u0a33\n"+
		"\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u0a3a\n\u00d1\3"+
		"\u00d1\3\u00d1\3\u00d1\5\u00d1\u0a3f\n\u00d1\3\u00d1\3\u00d1\3\u00d1\3"+
		"\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u0a48\n\u00d1\3\u00d1\3\u00d1\3"+
		"\u00d1\5\u00d1\u0a4d\n\u00d1\3\u00d1\3\u00d1\5\u00d1\u0a51\n\u00d1\3\u00d2"+
		"\3\u00d2\3\u00d2\7\u00d2\u0a56\n\u00d2\f\u00d2\16\u00d2\u0a59\13\u00d2"+
		"\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a5e\n\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d3\5\u00d3\u0a65\n\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\5\u00d3\u0a6c\n\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\5\u00d3\u0a73\n\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\5\u00d3\u0a7b\n\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3"+
		"\u0a82\n\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3"+
		"\u0a8a\n\u00d3\3\u00d4\3\u00d4\5\u00d4\u0a8e\n\u00d4\3\u00d4\3\u00d4\3"+
		"\u00d5\3\u00d5\3\u00d5\5\u00d5\u0a95\n\u00d5\3\u00d5\3\u00d5\3\u00d5\3"+
		"\u00d5\3\u00d5\5\u00d5\u0a9c\n\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3"+
		"\u00d5\5\u00d5\u0aa3\n\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3"+
		"\u00d5\5\u00d5\u0aab\n\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5"+
		"\u00d5\u0ab2\n\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5"+
		"\u00d5\u0aba\n\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0ac0\n\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0ac6\n\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6"+
		"\u0ad2\n\u00d6\3\u00d7\6\u00d7\u0ad5\n\u00d7\r\u00d7\16\u00d7\u0ad6\3"+
		"\u00d8\7\u00d8\u0ada\n\u00d8\f\u00d8\16\u00d8\u0add\13\u00d8\3\u00d8\3"+
		"\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0aee\n\u00d9\3\u00da"+
		"\3\u00da\5\u00da\u0af2\n\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00dc"+
		"\3\u00dc\3\u00dc\5\u00dc\u0afb\n\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\5\u00dc\u0b02\n\u00dc\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0b07\n"+
		"\u00dd\f\u00dd\16\u00dd\u0b0a\13\u00dd\3\u00de\3\u00de\5\u00de\u0b0e\n"+
		"\u00de\3\u00df\3\u00df\5\u00df\u0b12\n\u00df\3\u00e0\3\u00e0\3\u00e0\3"+
		"\u00e0\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0b1b\n\u00e1\3\u00e2\3\u00e2\3"+
		"\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0b26\n"+
		"\u00e3\5\u00e3\u0b28\n\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3"+
		"\u00e4\7\u00e4\u0b30\n\u00e4\f\u00e4\16\u00e4\u0b33\13\u00e4\3\u00e5\3"+
		"\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\6\u00e5"+
		"\u0b3e\n\u00e5\r\u00e5\16\u00e5\u0b3f\3\u00e5\3\u00e5\3\u00e5\7\u00e5"+
		"\u0b45\n\u00e5\f\u00e5\16\u00e5\u0b48\13\u00e5\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\7\u00e6\u0b50\n\u00e6\f\u00e6\16\u00e6\u0b53"+
		"\13\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\7\u00e7\u0b5b"+
		"\n\u00e7\f\u00e7\16\u00e7\u0b5e\13\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\7\u00e8\u0b66\n\u00e8\f\u00e8\16\u00e8\u0b69\13\u00e8"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\7\u00e9\u0b74\n\u00e9\f\u00e9\16\u00e9\u0b77\13\u00e9\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\7\u00ea\u0b8b"+
		"\n\u00ea\f\u00ea\16\u00ea\u0b8e\13\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\7\u00eb\u0ba0\n\u00eb\f\u00eb\16\u00eb\u0ba3"+
		"\13\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\7\u00ec\u0bae\n\u00ec\f\u00ec\16\u00ec\u0bb1\13\u00ec\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\7\u00ed\u0bc2\n\u00ed\f\u00ed"+
		"\16\u00ed\u0bc5\13\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\5\u00ee\u0bce\n\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00f0\3\u00f0"+
		"\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\5\u00f1\u0bdc"+
		"\n\u00f1\3\u00f2\3\u00f2\5\u00f2\u0be0\n\u00f2\3\u00f2\3\u00f2\7\u00f2"+
		"\u0be4\n\u00f2\f\u00f2\16\u00f2\u0be7\13\u00f2\3\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f4\3\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f6\3\u00f6\3\u00f7\3\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\7\u00f7\u0bfb\n\u00f7"+
		"\f\u00f7\16\u00f7\u0bfe\13\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7"+
		"\3\u00f7\7\u00f7\u0c06\n\u00f7\f\u00f7\16\u00f7\u0c09\13\u00f7\3\u00f7"+
		"\3\u00f7\3\u00f7\5\u00f7\u0c0e\n\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f8\3\u00f8\3\u00f8\5\u00f8\u0c20\n\u00f8\3\u00f9\3\u00f9\3\u00f9"+
		"\2\20\64\66:@\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8"+
		"\u00fa\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132"+
		"\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a"+
		"\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162"+
		"\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a"+
		"\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192"+
		"\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa"+
		"\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2"+
		"\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da"+
		"\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\2\b"+
		"\3\2GL\7\2\25\25\30\30++--\65\65\4\2\36\36$$\4\2\f\f\66\66\4\2YYq{\4\2"+
		"\3\13||\2\u0d3c\2\u01f2\3\2\2\2\4\u0202\3\2\2\2\6\u0206\3\2\2\2\b\u0208"+
		"\3\2\2\2\n\u020a\3\2\2\2\f\u020f\3\2\2\2\16\u0213\3\2\2\2\20\u0232\3\2"+
		"\2\2\22\u0234\3\2\2\2\24\u0242\3\2\2\2\26\u0249\3\2\2\2\30\u024b\3\2\2"+
		"\2\32\u024d\3\2\2\2\34\u0252\3\2\2\2\36\u0260\3\2\2\2 \u0265\3\2\2\2\""+
		"\u027a\3\2\2\2$\u0281\3\2\2\2&\u028d\3\2\2\2(\u028f\3\2\2\2*\u0292\3\2"+
		"\2\2,\u0296\3\2\2\2.\u02a0\3\2\2\2\60\u02a5\3\2\2\2\62\u02b0\3\2\2\2\64"+
		"\u02b2\3\2\2\2\66\u02bd\3\2\2\28\u02cd\3\2\2\2:\u02cf\3\2\2\2<\u02df\3"+
		"\2\2\2>\u02e1\3\2\2\2@\u02e3\3\2\2\2B\u02f3\3\2\2\2D\u02f6\3\2\2\2F\u0309"+
		"\3\2\2\2H\u0311\3\2\2\2J\u0318\3\2\2\2L\u031e\3\2\2\2N\u0320\3\2\2\2P"+
		"\u0324\3\2\2\2R\u032a\3\2\2\2T\u0331\3\2\2\2V\u033b\3\2\2\2X\u0340\3\2"+
		"\2\2Z\u038a\3\2\2\2\\\u038c\3\2\2\2^\u0390\3\2\2\2`\u0395\3\2\2\2b\u03ad"+
		"\3\2\2\2d\u03af\3\2\2\2f\u03b3\3\2\2\2h\u03bb\3\2\2\2j\u03be\3\2\2\2l"+
		"\u03c1\3\2\2\2n\u03c9\3\2\2\2p\u03d6\3\2\2\2r\u03dd\3\2\2\2t\u03e2\3\2"+
		"\2\2v\u03f1\3\2\2\2x\u03f3\3\2\2\2z\u03fb\3\2\2\2|\u0400\3\2\2\2~\u0406"+
		"\3\2\2\2\u0080\u040a\3\2\2\2\u0082\u040e\3\2\2\2\u0084\u0413\3\2\2\2\u0086"+
		"\u0417\3\2\2\2\u0088\u0430\3\2\2\2\u008a\u0432\3\2\2\2\u008c\u043d\3\2"+
		"\2\2\u008e\u0441\3\2\2\2\u0090\u0443\3\2\2\2\u0092\u0445\3\2\2\2\u0094"+
		"\u0447\3\2\2\2\u0096\u0452\3\2\2\2\u0098\u0457\3\2\2\2\u009a\u0467\3\2"+
		"\2\2\u009c\u047a\3\2\2\2\u009e\u047e\3\2\2\2\u00a0\u0480\3\2\2\2\u00a2"+
		"\u048f\3\2\2\2\u00a4\u04a1\3\2\2\2\u00a6\u04a6\3\2\2\2\u00a8\u04ae\3\2"+
		"\2\2\u00aa\u04c1\3\2\2\2\u00ac\u04c6\3\2\2\2\u00ae\u04d1\3\2\2\2\u00b0"+
		"\u04d4\3\2\2\2\u00b2\u04de\3\2\2\2\u00b4\u04e2\3\2\2\2\u00b6\u04e4\3\2"+
		"\2\2\u00b8\u04e6\3\2\2\2\u00ba\u04ec\3\2\2\2\u00bc\u04f9\3\2\2\2\u00be"+
		"\u04fc\3\2\2\2\u00c0\u0505\3\2\2\2\u00c2\u0507\3\2\2\2\u00c4\u053e\3\2"+
		"\2\2\u00c6\u0543\3\2\2\2\u00c8\u054d\3\2\2\2\u00ca\u0559\3\2\2\2\u00cc"+
		"\u0564\3\2\2\2\u00ce\u0572\3\2\2\2\u00d0\u0574\3\2\2\2\u00d2\u057d\3\2"+
		"\2\2\u00d4\u0582\3\2\2\2\u00d6\u0596\3\2\2\2\u00d8\u0598\3\2\2\2\u00da"+
		"\u059b\3\2\2\2\u00dc\u05a9\3\2\2\2\u00de\u05ae\3\2\2\2\u00e0\u05b9\3\2"+
		"\2\2\u00e2\u05be\3\2\2\2\u00e4\u05cb\3\2\2\2\u00e6\u05d0\3\2\2\2\u00e8"+
		"\u05d8\3\2\2\2\u00ea\u05e6\3\2\2\2\u00ec\u05eb\3\2\2\2\u00ee\u05fd\3\2"+
		"\2\2\u00f0\u05ff\3\2\2\2\u00f2\u0605\3\2\2\2\u00f4\u0607\3\2\2\2\u00f6"+
		"\u060f\3\2\2\2\u00f8\u0617\3\2\2\2\u00fa\u061e\3\2\2\2\u00fc\u0620\3\2"+
		"\2\2\u00fe\u0629\3\2\2\2\u0100\u0631\3\2\2\2\u0102\u0634\3\2\2\2\u0104"+
		"\u063a\3\2\2\2\u0106\u0643\3\2\2\2\u0108\u0652\3\2\2\2\u010a\u065b\3\2"+
		"\2\2\u010c\u0660\3\2\2\2\u010e\u0662\3\2\2\2\u0110\u0668\3\2\2\2\u0112"+
		"\u0674\3\2\2\2\u0114\u067b\3\2\2\2\u0116\u0689\3\2\2\2\u0118\u068b\3\2"+
		"\2\2\u011a\u068d\3\2\2\2\u011c\u0691\3\2\2\2\u011e\u0695\3\2\2\2\u0120"+
		"\u06a8\3\2\2\2\u0122\u06aa\3\2\2\2\u0124\u06b6\3\2\2\2\u0126\u06b8\3\2"+
		"\2\2\u0128\u06be\3\2\2\2\u012a\u06c6\3\2\2\2\u012c\u06d8\3\2\2\2\u012e"+
		"\u06da\3\2\2\2\u0130\u06e0\3\2\2\2\u0132\u06ef\3\2\2\2\u0134\u06f3\3\2"+
		"\2\2\u0136\u0701\3\2\2\2\u0138\u0703\3\2\2\2\u013a\u0705\3\2\2\2\u013c"+
		"\u070b\3\2\2\2\u013e\u0711\3\2\2\2\u0140\u071b\3\2\2\2\u0142\u071f\3\2"+
		"\2\2\u0144\u0721\3\2\2\2\u0146\u0731\3\2\2\2\u0148\u0743\3\2\2\2\u014a"+
		"\u0745\3\2\2\2\u014c\u0747\3\2\2\2\u014e\u074f\3\2\2\2\u0150\u075e\3\2"+
		"\2\2\u0152\u076d\3\2\2\2\u0154\u0773\3\2\2\2\u0156\u079b\3\2\2\2\u0158"+
		"\u079d\3\2\2\2\u015a\u07a1\3\2\2\2\u015c\u07b3\3\2\2\2\u015e\u07b6\3\2"+
		"\2\2\u0160\u07ba\3\2\2\2\u0162\u07c3\3\2\2\2\u0164\u07c9\3\2\2\2\u0166"+
		"\u07d1\3\2\2\2\u0168\u07d4\3\2\2\2\u016a\u07dd\3\2\2\2\u016c\u07e4\3\2"+
		"\2\2\u016e\u07f8\3\2\2\2\u0170\u07fc\3\2\2\2\u0172\u0800\3\2\2\2\u0174"+
		"\u0818\3\2\2\2\u0176\u081a\3\2\2\2\u0178\u0838\3\2\2\2\u017a\u083f\3\2"+
		"\2\2\u017c\u0841\3\2\2\2\u017e\u0847\3\2\2\2\u0180\u087f\3\2\2\2\u0182"+
		"\u0881\3\2\2\2\u0184\u08aa\3\2\2\2\u0186\u08bd\3\2\2\2\u0188\u0912\3\2"+
		"\2\2\u018a\u0914\3\2\2\2\u018c\u0966\3\2\2\2\u018e\u096b\3\2\2\2\u0190"+
		"\u097a\3\2\2\2\u0192\u097c\3\2\2\2\u0194\u0988\3\2\2\2\u0196\u0994\3\2"+
		"\2\2\u0198\u09a0\3\2\2\2\u019a\u09b9\3\2\2\2\u019c\u0a0a\3\2\2\2\u019e"+
		"\u0a0c\3\2\2\2\u01a0\u0a50\3\2\2\2\u01a2\u0a52\3\2\2\2\u01a4\u0a89\3\2"+
		"\2\2\u01a6\u0a8b\3\2\2\2\u01a8\u0ab9\3\2\2\2\u01aa\u0ad1\3\2\2\2\u01ac"+
		"\u0ad4\3\2\2\2\u01ae\u0adb\3\2\2\2\u01b0\u0aed\3\2\2\2\u01b2\u0af1\3\2"+
		"\2\2\u01b4\u0af3\3\2\2\2\u01b6\u0b01\3\2\2\2\u01b8\u0b03\3\2\2\2\u01ba"+
		"\u0b0d\3\2\2\2\u01bc\u0b11\3\2\2\2\u01be\u0b13\3\2\2\2\u01c0\u0b1a\3\2"+
		"\2\2\u01c2\u0b1c\3\2\2\2\u01c4\u0b27\3\2\2\2\u01c6\u0b29\3\2\2\2\u01c8"+
		"\u0b34\3\2\2\2\u01ca\u0b49\3\2\2\2\u01cc\u0b54\3\2\2\2\u01ce\u0b5f\3\2"+
		"\2\2\u01d0\u0b6a\3\2\2\2\u01d2\u0b78\3\2\2\2\u01d4\u0b8f\3\2\2\2\u01d6"+
		"\u0ba4\3\2\2\2\u01d8\u0bb2\3\2\2\2\u01da\u0bcd\3\2\2\2\u01dc\u0bcf\3\2"+
		"\2\2\u01de\u0bd2\3\2\2\2\u01e0\u0bdb\3\2\2\2\u01e2\u0bdf\3\2\2\2\u01e4"+
		"\u0be8\3\2\2\2\u01e6\u0beb\3\2\2\2\u01e8\u0bed\3\2\2\2\u01ea\u0bf0\3\2"+
		"\2\2\u01ec\u0c0d\3\2\2\2\u01ee\u0c1f\3\2\2\2\u01f0\u0c21\3\2\2\2\u01f2"+
		"\u01f3\t\2\2\2\u01f3\3\3\2\2\2\u01f4\u01f6\5\u00f2z\2\u01f5\u01f4\3\2"+
		"\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u0203\5\6\4\2\u01fb\u01fd\5\u00f2"+
		"z\2\u01fc\u01fb\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0203\7\23"+
		"\2\2\u0202\u01f7\3\2\2\2\u0202\u01fe\3\2\2\2\u0203\5\3\2\2\2\u0204\u0207"+
		"\5\b\5\2\u0205\u0207\5\n\6\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207"+
		"\7\3\2\2\2\u0208\u0209\t\3\2\2\u0209\t\3\2\2\2\u020a\u020b\t\4\2\2\u020b"+
		"\13\3\2\2\2\u020c\u0210\5\16\b\2\u020d\u0210\5\34\17\2\u020e\u0210\5\36"+
		"\20\2\u020f\u020c\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210"+
		"\r\3\2\2\2\u0211\u0214\5\24\13\2\u0212\u0214\5\32\16\2\u0213\u0211\3\2"+
		"\2\2\u0213\u0212\3\2\2\2\u0214\u0219\3\2\2\2\u0215\u0218\5\22\n\2\u0216"+
		"\u0218\5\30\r\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218\u021b\3"+
		"\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\17\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021c\u021e\5\u00f2z\2\u021d\u021c\3\2\2\2\u021e\u0221"+
		"\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0222\u0224\5\u01f0\u00f9\2\u0223\u0225\5*\26\2\u0224\u0223"+
		"\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0233\3\2\2\2\u0226\u0227\5\16\b\2"+
		"\u0227\u022b\7U\2\2\u0228\u022a\5\u00f2z\2\u0229\u0228\3\2\2\2\u022a\u022d"+
		"\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022e\u0230\5\u01f0\u00f9\2\u022f\u0231\5*\26\2\u0230\u022f"+
		"\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u021f\3\2\2\2\u0232"+
		"\u0226\3\2\2\2\u0233\21\3\2\2\2\u0234\u0238\7U\2\2\u0235\u0237\5\u00f2"+
		"z\2\u0236\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023d\5\u01f0"+
		"\u00f9\2\u023c\u023e\5*\26\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\23\3\2\2\2\u023f\u0241\5\u00f2z\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2"+
		"\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244"+
		"\u0242\3\2\2\2\u0245\u0247\5\u01f0\u00f9\2\u0246\u0248\5*\26\2\u0247\u0246"+
		"\3\2\2\2\u0247\u0248\3\2\2\2\u0248\25\3\2\2\2\u0249\u024a\5\20\t\2\u024a"+
		"\27\3\2\2\2\u024b\u024c\5\22\n\2\u024c\31\3\2\2\2\u024d\u024e\5\24\13"+
		"\2\u024e\33\3\2\2\2\u024f\u0251\5\u00f2z\2\u0250\u024f\3\2\2\2\u0251\u0254"+
		"\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0255\u0256\5\u01f0\u00f9\2\u0256\35\3\2\2\2\u0257\u0258"+
		"\5\4\3\2\u0258\u0259\5 \21\2\u0259\u0261\3\2\2\2\u025a\u025b\5\16\b\2"+
		"\u025b\u025c\5 \21\2\u025c\u0261\3\2\2\2\u025d\u025e\5\34\17\2\u025e\u025f"+
		"\5 \21\2\u025f\u0261\3\2\2\2\u0260\u0257\3\2\2\2\u0260\u025a\3\2\2\2\u0260"+
		"\u025d\3\2\2\2\u0261\37\3\2\2\2\u0262\u0264\5\u00f2z\2\u0263\u0262\3\2"+
		"\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269\7Q\2\2\u0269\u0274\7R\2"+
		"\2\u026a\u026c\5\u00f2z\2\u026b\u026a\3\2\2\2\u026c\u026f\3\2\2\2\u026d"+
		"\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u026d\3\2"+
		"\2\2\u0270\u0271\7Q\2\2\u0271\u0273\7R\2\2\u0272\u026d\3\2\2\2\u0273\u0276"+
		"\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275!\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0277\u0279\5$\23\2\u0278\u0277\3\2\2\2\u0279\u027c\3\2"+
		"\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c"+
		"\u027a\3\2\2\2\u027d\u027f\5\u01f0\u00f9\2\u027e\u0280\5&\24\2\u027f\u027e"+
		"\3\2\2\2\u027f\u0280\3\2\2\2\u0280#\3\2\2\2\u0281\u0282\5\u00f2z\2\u0282"+
		"%\3\2\2\2\u0283\u0284\7!\2\2\u0284\u028e\5\34\17\2\u0285\u0286\7!\2\2"+
		"\u0286\u028a\5\16\b\2\u0287\u0289\5(\25\2\u0288\u0287\3\2\2\2\u0289\u028c"+
		"\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028e\3\2\2\2\u028c"+
		"\u028a\3\2\2\2\u028d\u0283\3\2\2\2\u028d\u0285\3\2\2\2\u028e\'\3\2\2\2"+
		"\u028f\u0290\7m\2\2\u0290\u0291\5\26\f\2\u0291)\3\2\2\2\u0292\u0293\7"+
		"[\2\2\u0293\u0294\5,\27\2\u0294\u0295\7Z\2\2\u0295+\3\2\2\2\u0296\u029b"+
		"\5.\30\2\u0297\u0298\7T\2\2\u0298\u029a\5.\30\2\u0299\u0297\3\2\2\2\u029a"+
		"\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c-\3\2\2\2"+
		"\u029d\u029b\3\2\2\2\u029e\u02a1\5\f\7\2\u029f\u02a1\5\60\31\2\u02a0\u029e"+
		"\3\2\2\2\u02a0\u029f\3\2\2\2\u02a1/\3\2\2\2\u02a2\u02a4\5\u00f2z\2\u02a3"+
		"\u02a2\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2"+
		"\2\2\u02a6\u02a8\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02aa\7^\2\2\u02a9"+
		"\u02ab\5\62\32\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\61\3\2"+
		"\2\2\u02ac\u02ad\7!\2\2\u02ad\u02b1\5\f\7\2\u02ae\u02af\78\2\2\u02af\u02b1"+
		"\5\f\7\2\u02b0\u02ac\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\63\3\2\2\2\u02b2"+
		"\u02b3\b\33\1\2\u02b3\u02b4\5\u01f0\u00f9\2\u02b4\u02ba\3\2\2\2\u02b5"+
		"\u02b6\f\3\2\2\u02b6\u02b7\7U\2\2\u02b7\u02b9\5\u01f0\u00f9\2\u02b8\u02b5"+
		"\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb"+
		"\65\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\b\34\1\2\u02be\u02bf\5\u01f0"+
		"\u00f9\2\u02bf\u02c5\3\2\2\2\u02c0\u02c1\f\3\2\2\u02c1\u02c2\7U\2\2\u02c2"+
		"\u02c4\5\u01f0\u00f9\2\u02c3\u02c0\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3"+
		"\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\67\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8"+
		"\u02ce\5\u01f0\u00f9\2\u02c9\u02ca\5:\36\2\u02ca\u02cb\7U\2\2\u02cb\u02cc"+
		"\5\u01f0\u00f9\2\u02cc\u02ce\3\2\2\2\u02cd\u02c8\3\2\2\2\u02cd\u02c9\3"+
		"\2\2\2\u02ce9\3\2\2\2\u02cf\u02d0\b\36\1\2\u02d0\u02d1\5\u01f0\u00f9\2"+
		"\u02d1\u02d7\3\2\2\2\u02d2\u02d3\f\3\2\2\u02d3\u02d4\7U\2\2\u02d4\u02d6"+
		"\5\u01f0\u00f9\2\u02d5\u02d2\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3"+
		"\2\2\2\u02d7\u02d8\3\2\2\2\u02d8;\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02e0"+
		"\5\u01f0\u00f9\2\u02db\u02dc\5@!\2\u02dc\u02dd\7U\2\2\u02dd\u02de\5\u01f0"+
		"\u00f9\2\u02de\u02e0\3\2\2\2\u02df\u02da\3\2\2\2\u02df\u02db\3\2\2\2\u02e0"+
		"=\3\2\2\2\u02e1\u02e2\5\u01f0\u00f9\2\u02e2?\3\2\2\2\u02e3\u02e4\b!\1"+
		"\2\u02e4\u02e5\5\u01f0\u00f9\2\u02e5\u02eb\3\2\2\2\u02e6\u02e7\f\3\2\2"+
		"\u02e7\u02e8\7U\2\2\u02e8\u02ea\5\u01f0\u00f9\2\u02e9\u02e6\3\2\2\2\u02ea"+
		"\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ecA\3\2\2\2"+
		"\u02ed\u02eb\3\2\2\2\u02ee\u02f4\5D#\2\u02ef\u02f4\5F$\2\u02f0\u02f4\5"+
		"\u0120\u0091\2\u02f1\u02f4\5\u0122\u0092\2\u02f2\u02f4\5\u01ee\u00f8\2"+
		"\u02f3\u02ee\3\2\2\2\u02f3\u02ef\3\2\2\2\u02f3\u02f0\3\2\2\2\u02f3\u02f1"+
		"\3\2\2\2\u02f3\u02f2\3\2\2\2\u02f4C\3\2\2\2\u02f5\u02f7\5H%\2\u02f6\u02f5"+
		"\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fb\3\2\2\2\u02f8\u02fa\5L\'\2\u02f9"+
		"\u02f8\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2"+
		"\2\2\u02fc\u0301\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u0300\5V,\2\u02ff\u02fe"+
		"\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"\u0304\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0305\7\2\2\3\u0305E\3\2\2\2"+
		"\u0306\u0308\5L\'\2\u0307\u0306\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307"+
		"\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\3\2\2\2\u030b\u0309\3\2\2\2\u030c"+
		"\u030d\5X-\2\u030dG\3\2\2\2\u030e\u0310\5J&\2\u030f\u030e\3\2\2\2\u0310"+
		"\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\3\2"+
		"\2\2\u0313\u0311\3\2\2\2\u0314\u0315\7\60\2\2\u0315\u0316\5\66\34\2\u0316"+
		"\u0317\7S\2\2\u0317I\3\2\2\2\u0318\u0319\5\u00f2z\2\u0319K\3\2\2\2\u031a"+
		"\u031f\5N(\2\u031b\u031f\5P)\2\u031c\u031f\5R*\2\u031d\u031f\5T+\2\u031e"+
		"\u031a\3\2\2\2\u031e\u031b\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031d\3\2"+
		"\2\2\u031fM\3\2\2\2\u0320\u0321\7)\2\2\u0321\u0322\58\35\2\u0322\u0323"+
		"\7S\2\2\u0323O\3\2\2\2\u0324\u0325\7)\2\2\u0325\u0326\5:\36\2\u0326\u0327"+
		"\7U\2\2\u0327\u0328\7k\2\2\u0328\u0329\7S\2\2\u0329Q\3\2\2\2\u032a\u032b"+
		"\7)\2\2\u032b\u032c\7\66\2\2\u032c\u032d\58\35\2\u032d\u032e\7U\2\2\u032e"+
		"\u032f\5\u01f0\u00f9\2\u032f\u0330\7S\2\2\u0330S\3\2\2\2\u0331\u0332\7"+
		")\2\2\u0332\u0333\7\66\2\2\u0333\u0334\58\35\2\u0334\u0335\7U\2\2\u0335"+
		"\u0336\7k\2\2\u0336\u0337\7S\2\2\u0337U\3\2\2\2\u0338\u033c\5^\60\2\u0339"+
		"\u033c\5\u00d2j\2\u033a\u033c\7S\2\2\u033b\u0338\3\2\2\2\u033b\u0339\3"+
		"\2\2\2\u033b\u033a\3\2\2\2\u033cW\3\2\2\2\u033d\u033f\5\u00f2z\2\u033e"+
		"\u033d\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2"+
		"\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0343\u0345\7\3\2\2\u0344"+
		"\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\7\4"+
		"\2\2\u0347\u0348\5\64\33\2\u0348\u034c\7O\2\2\u0349\u034b\5Z.\2\u034a"+
		"\u0349\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2"+
		"\2\2\u034d\u034f\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0350\7P\2\2\u0350"+
		"Y\3\2\2\2\u0351\u0355\7\5\2\2\u0352\u0354\5\\/\2\u0353\u0352\3\2\2\2\u0354"+
		"\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0358\3\2"+
		"\2\2\u0357\u0355\3\2\2\2\u0358\u0359\5\64\33\2\u0359\u035a\7S\2\2\u035a"+
		"\u038b\3\2\2\2\u035b\u035c\7\6\2\2\u035c\u0366\5\66\34\2\u035d\u035e\7"+
		"\7\2\2\u035e\u0363\5\64\33\2\u035f\u0360\7T\2\2\u0360\u0362\5\64\33\2"+
		"\u0361\u035f\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364"+
		"\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0366\u035d\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\7S\2\2\u0369\u038b\3\2"+
		"\2\2\u036a\u036b\7\b\2\2\u036b\u0375\5\66\34\2\u036c\u036d\7\7\2\2\u036d"+
		"\u0372\5\64\33\2\u036e\u036f\7T\2\2\u036f\u0371\5\64\33\2\u0370\u036e"+
		"\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373"+
		"\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0375\u036c\3\2\2\2\u0375\u0376\3\2"+
		"\2\2\u0376\u0377\3\2\2\2\u0377\u0378\7S\2\2\u0378\u038b\3\2\2\2\u0379"+
		"\u037a\7\t\2\2\u037a\u037b\58\35\2\u037b\u037c\7S\2\2\u037c\u038b\3\2"+
		"\2\2\u037d\u037e\7\n\2\2\u037e\u037f\58\35\2\u037f\u0380\7\13\2\2\u0380"+
		"\u0385\58\35\2\u0381\u0382\7T\2\2\u0382\u0384\58\35\2\u0383\u0381\3\2"+
		"\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0388\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u0389\7S\2\2\u0389\u038b\3\2"+
		"\2\2\u038a\u0351\3\2\2\2\u038a\u035b\3\2\2\2\u038a\u036a\3\2\2\2\u038a"+
		"\u0379\3\2\2\2\u038a\u037d\3\2\2\2\u038b[\3\2\2\2\u038c\u038d\t\5\2\2"+
		"\u038d]\3\2\2\2\u038e\u0391\5`\61\2\u038f\u0391\5\u00c6d\2\u0390\u038e"+
		"\3\2\2\2\u0390\u038f\3\2\2\2\u0391_\3\2\2\2\u0392\u0394\5b\62\2\u0393"+
		"\u0392\3\2\2\2\u0394\u0397\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2"+
		"\2\2\u0396\u0398\3\2\2\2\u0397\u0395\3\2\2\2\u0398\u0399\7\31\2\2\u0399"+
		"\u039b\5\u01f0\u00f9\2\u039a\u039c\5d\63\2\u039b\u039a\3\2\2\2\u039b\u039c"+
		"\3\2\2\2\u039c\u039e\3\2\2\2\u039d\u039f\5h\65\2\u039e\u039d\3\2\2\2\u039e"+
		"\u039f\3\2\2\2\u039f\u03a1\3\2\2\2\u03a0\u03a2\5j\66\2\u03a1\u03a0\3\2"+
		"\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\5n8\2\u03a4a"+
		"\3\2\2\2\u03a5\u03ae\5\u00f2z\2\u03a6\u03ae\7\63\2\2\u03a7\u03ae\7\62"+
		"\2\2\u03a8\u03ae\7\61\2\2\u03a9\u03ae\7\21\2\2\u03aa\u03ae\7\66\2\2\u03ab"+
		"\u03ae\7\"\2\2\u03ac\u03ae\7\67\2\2\u03ad\u03a5\3\2\2\2\u03ad\u03a6\3"+
		"\2\2\2\u03ad\u03a7\3\2\2\2\u03ad\u03a8\3\2\2\2\u03ad\u03a9\3\2\2\2\u03ad"+
		"\u03aa\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ac\3\2\2\2\u03aec\3\2\2\2"+
		"\u03af\u03b0\7[\2\2\u03b0\u03b1\5f\64\2\u03b1\u03b2\7Z\2\2\u03b2e\3\2"+
		"\2\2\u03b3\u03b8\5\"\22\2\u03b4\u03b5\7T\2\2\u03b5\u03b7\5\"\22\2\u03b6"+
		"\u03b4\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2"+
		"\2\2\u03b9g\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb\u03bc\7!\2\2\u03bc\u03bd"+
		"\5\20\t\2\u03bdi\3\2\2\2\u03be\u03bf\7(\2\2\u03bf\u03c0\5l\67\2\u03c0"+
		"k\3\2\2\2\u03c1\u03c6\5\26\f\2\u03c2\u03c3\7T\2\2\u03c3\u03c5\5\26\f\2"+
		"\u03c4\u03c2\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7"+
		"\3\2\2\2\u03c7m\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03cd\7O\2\2\u03ca\u03cc"+
		"\5p9\2\u03cb\u03ca\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd"+
		"\u03ce\3\2\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03cd\3\2\2\2\u03d0\u03d1\7P"+
		"\2\2\u03d1o\3\2\2\2\u03d2\u03d7\5r:\2\u03d3\u03d7\5\u00b6\\\2\u03d4\u03d7"+
		"\5\u00b8]\2\u03d5\u03d7\5\u00ba^\2\u03d6\u03d2\3\2\2\2\u03d6\u03d3\3\2"+
		"\2\2\u03d6\u03d4\3\2\2\2\u03d6\u03d5\3\2\2\2\u03d7q\3\2\2\2\u03d8\u03de"+
		"\5t;\2\u03d9\u03de\5\u0098M\2\u03da\u03de\5^\60\2\u03db\u03de\5\u00d2"+
		"j\2\u03dc\u03de\7S\2\2\u03dd\u03d8\3\2\2\2\u03dd\u03d9\3\2\2\2\u03dd\u03da"+
		"\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd\u03dc\3\2\2\2\u03des\3\2\2\2\u03df"+
		"\u03e1\5v<\2\u03e0\u03df\3\2\2\2\u03e1\u03e4\3\2\2\2\u03e2\u03e0\3\2\2"+
		"\2\u03e2\u03e3\3\2\2\2\u03e3\u03e5\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e5\u03e6"+
		"\5\u0080A\2\u03e6\u03e7\5x=\2\u03e7\u03e8\7S\2\2\u03e8u\3\2\2\2\u03e9"+
		"\u03f2\5\u00f2z\2\u03ea\u03f2\7\63\2\2\u03eb\u03f2\7\62\2\2\u03ec\u03f2"+
		"\7\61\2\2\u03ed\u03f2\7\66\2\2\u03ee\u03f2\7\"\2\2\u03ef\u03f2\7>\2\2"+
		"\u03f0\u03f2\7A\2\2\u03f1\u03e9\3\2\2\2\u03f1\u03ea\3\2\2\2\u03f1\u03eb"+
		"\3\2\2\2\u03f1\u03ec\3\2\2\2\u03f1\u03ed\3\2\2\2\u03f1\u03ee\3\2\2\2\u03f1"+
		"\u03ef\3\2\2\2\u03f1\u03f0\3\2\2\2\u03f2w\3\2\2\2\u03f3\u03f8\5z>\2\u03f4"+
		"\u03f5\7T\2\2\u03f5\u03f7\5z>\2\u03f6\u03f4\3\2\2\2\u03f7\u03fa\3\2\2"+
		"\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9y\3\2\2\2\u03fa\u03f8"+
		"\3\2\2\2\u03fb\u03fe\5|?\2\u03fc\u03fd\7Y\2\2\u03fd\u03ff\5~@\2\u03fe"+
		"\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff{\3\2\2\2\u0400\u0402\5\u01f0"+
		"\u00f9\2\u0401\u0403\5 \21\2\u0402\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403"+
		"}\3\2\2\2\u0404\u0407\5\u01b2\u00da\2\u0405\u0407\5\u0104\u0083\2\u0406"+
		"\u0404\3\2\2\2\u0406\u0405\3\2\2\2\u0407\177\3\2\2\2\u0408\u040b\5\u0082"+
		"B\2\u0409\u040b\5\u0084C\2\u040a\u0408\3\2\2\2\u040a\u0409\3\2\2\2\u040b"+
		"\u0081\3\2\2\2\u040c\u040f\5\6\4\2\u040d\u040f\7\23\2\2\u040e\u040c\3"+
		"\2\2\2\u040e\u040d\3\2\2\2\u040f\u0083\3\2\2\2\u0410\u0414\5\u0086D\2"+
		"\u0411\u0414\5\u0094K\2\u0412\u0414\5\u0096L\2\u0413\u0410\3\2\2\2\u0413"+
		"\u0411\3\2\2\2\u0413\u0412\3\2\2\2\u0414\u0085\3\2\2\2\u0415\u0418\5\u008c"+
		"G\2\u0416\u0418\5\u0092J\2\u0417\u0415\3\2\2\2\u0417\u0416\3\2\2\2\u0418"+
		"\u041d\3\2\2\2\u0419\u041c\5\u008aF\2\u041a\u041c\5\u0090I\2\u041b\u0419"+
		"\3\2\2\2\u041b\u041a\3\2\2\2\u041c\u041f\3\2\2\2\u041d\u041b\3\2\2\2\u041d"+
		"\u041e\3\2\2\2\u041e\u0087\3\2\2\2\u041f\u041d\3\2\2\2\u0420\u0422\5\u01f0"+
		"\u00f9\2\u0421\u0423\5*\26\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2\2\2\u0423"+
		"\u0431\3\2\2\2\u0424\u0425\5\u0086D\2\u0425\u0429\7U\2\2\u0426\u0428\5"+
		"\u00f2z\2\u0427\u0426\3\2\2\2\u0428\u042b\3\2\2\2\u0429\u0427\3\2\2\2"+
		"\u0429\u042a\3\2\2\2\u042a\u042c\3\2\2\2\u042b\u0429\3\2\2\2\u042c\u042e"+
		"\5\u01f0\u00f9\2\u042d\u042f\5*\26\2\u042e\u042d\3\2\2\2\u042e\u042f\3"+
		"\2\2\2\u042f\u0431\3\2\2\2\u0430\u0420\3\2\2\2\u0430\u0424\3\2\2\2\u0431"+
		"\u0089\3\2\2\2\u0432\u0436\7U\2\2\u0433\u0435\5\u00f2z\2\u0434\u0433\3"+
		"\2\2\2\u0435\u0438\3\2\2\2\u0436\u0434\3\2\2\2\u0436\u0437\3\2\2\2\u0437"+
		"\u0439\3\2\2\2\u0438\u0436\3\2\2\2\u0439\u043b\5\u01f0\u00f9\2\u043a\u043c"+
		"\5*\26\2\u043b\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u008b\3\2\2\2\u043d"+
		"\u043f\5\u01f0\u00f9\2\u043e\u0440\5*\26\2\u043f\u043e\3\2\2\2\u043f\u0440"+
		"\3\2\2\2\u0440\u008d\3\2\2\2\u0441\u0442\5\u0088E\2\u0442\u008f\3\2\2"+
		"\2\u0443\u0444\5\u008aF\2\u0444\u0091\3\2\2\2\u0445\u0446\5\u008cG\2\u0446"+
		"\u0093\3\2\2\2\u0447\u0448\5\u01f0\u00f9\2\u0448\u0095\3\2\2\2\u0449\u044a"+
		"\5\u0082B\2\u044a\u044b\5 \21\2\u044b\u0453\3\2\2\2\u044c\u044d\5\u0086"+
		"D\2\u044d\u044e\5 \21\2\u044e\u0453\3\2\2\2\u044f\u0450\5\u0094K\2\u0450"+
		"\u0451\5 \21\2\u0451\u0453\3\2\2\2\u0452\u0449\3\2\2\2\u0452\u044c\3\2"+
		"\2\2\u0452\u044f\3\2\2\2\u0453\u0097\3\2\2\2\u0454\u0456\5\u009aN\2\u0455"+
		"\u0454\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2"+
		"\2\2\u0458\u045a\3\2\2\2\u0459\u0457\3\2\2\2\u045a\u045b\5\u009cO\2\u045b"+
		"\u045c\5\u00b4[\2\u045c\u0099\3\2\2\2\u045d\u0468\5\u00f2z\2\u045e\u0468"+
		"\7\63\2\2\u045f\u0468\7\62\2\2\u0460\u0468\7\61\2\2\u0461\u0468\7\21\2"+
		"\2\u0462\u0468\7\66\2\2\u0463\u0468\7\"\2\2\u0464\u0468\7:\2\2\u0465\u0468"+
		"\7.\2\2\u0466\u0468\7\67\2\2\u0467\u045d\3\2\2\2\u0467\u045e\3\2\2\2\u0467"+
		"\u045f\3\2\2\2\u0467\u0460\3\2\2\2\u0467\u0461\3\2\2\2\u0467\u0462\3\2"+
		"\2\2\u0467\u0463\3\2\2\2\u0467\u0464\3\2\2\2\u0467\u0465\3\2\2\2\u0467"+
		"\u0466\3\2\2\2\u0468\u009b\3\2\2\2\u0469\u046a\5\u009eP\2\u046a\u046c"+
		"\5\u00a0Q\2\u046b\u046d\5\u00aeX\2\u046c\u046b\3\2\2\2\u046c\u046d\3\2"+
		"\2\2\u046d\u047b\3\2\2\2\u046e\u0472\5d\63\2\u046f\u0471\5\u00f2z\2\u0470"+
		"\u046f\3\2\2\2\u0471\u0474\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2"+
		"\2\2\u0473\u0475\3\2\2\2\u0474\u0472\3\2\2\2\u0475\u0476\5\u009eP\2\u0476"+
		"\u0478\5\u00a0Q\2\u0477\u0479\5\u00aeX\2\u0478\u0477\3\2\2\2\u0478\u0479"+
		"\3\2\2\2\u0479\u047b\3\2\2\2\u047a\u0469\3\2\2\2\u047a\u046e\3\2\2\2\u047b"+
		"\u009d\3\2\2\2\u047c\u047f\5\u0080A\2\u047d\u047f\7@\2\2\u047e\u047c\3"+
		"\2\2\2\u047e\u047d\3\2\2\2\u047f\u009f\3\2\2\2\u0480\u0481\5\u01f0\u00f9"+
		"\2\u0481\u0483\7M\2\2\u0482\u0484\5\u00a2R\2\u0483\u0482\3\2\2\2\u0483"+
		"\u0484\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0487\7N\2\2\u0486\u0488\5 \21"+
		"\2\u0487\u0486\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u00a1\3\2\2\2\u0489\u048a"+
		"\5\u00a4S\2\u048a\u048b\7T\2\2\u048b\u048c\5\u00aaV\2\u048c\u0490\3\2"+
		"\2\2\u048d\u0490\5\u00aaV\2\u048e\u0490\5\u00acW\2\u048f\u0489\3\2\2\2"+
		"\u048f\u048d\3\2\2\2\u048f\u048e\3\2\2\2\u0490\u00a3\3\2\2\2\u0491\u0496"+
		"\5\u00a6T\2\u0492\u0493\7T\2\2\u0493\u0495\5\u00a6T\2\u0494\u0492\3\2"+
		"\2\2\u0495\u0498\3\2\2\2\u0496\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497"+
		"\u04a2\3\2\2\2\u0498\u0496\3\2\2\2\u0499\u049e\5\u00acW\2\u049a\u049b"+
		"\7T\2\2\u049b\u049d\5\u00a6T\2\u049c\u049a\3\2\2\2\u049d\u04a0\3\2\2\2"+
		"\u049e\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a2\3\2\2\2\u04a0\u049e"+
		"\3\2\2\2\u04a1\u0491\3\2\2\2\u04a1\u0499\3\2\2\2\u04a2\u00a5\3\2\2\2\u04a3"+
		"\u04a5\5\u00a8U\2\u04a4\u04a3\3\2\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a4"+
		"\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a9\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a9"+
		"\u04aa\5\u0080A\2\u04aa\u04ab\5|?\2\u04ab\u00a7\3\2\2\2\u04ac\u04af\5"+
		"\u00f2z\2\u04ad\u04af\7\"\2\2\u04ae\u04ac\3\2\2\2\u04ae\u04ad\3\2\2\2"+
		"\u04af\u00a9\3\2\2\2\u04b0\u04b2\5\u00a8U\2\u04b1\u04b0\3\2\2\2\u04b2"+
		"\u04b5\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b6\3\2"+
		"\2\2\u04b5\u04b3\3\2\2\2\u04b6\u04ba\5\u0080A\2\u04b7\u04b9\5\u00f2z\2"+
		"\u04b8\u04b7\3\2\2\2\u04b9\u04bc\3\2\2\2\u04ba\u04b8\3\2\2\2\u04ba\u04bb"+
		"\3\2\2\2\u04bb\u04bd\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bd\u04be\7V\2\2\u04be"+
		"\u04bf\5|?\2\u04bf\u04c2\3\2\2\2\u04c0\u04c2\5\u00a6T\2\u04c1\u04b3\3"+
		"\2\2\2\u04c1\u04c0\3\2\2\2\u04c2\u00ab\3\2\2\2\u04c3\u04c5\5\u00f2z\2"+
		"\u04c4\u04c3\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7"+
		"\3\2\2\2\u04c7\u04c9\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04cd\5\u0080A"+
		"\2\u04ca\u04cb\5\u01f0\u00f9\2\u04cb\u04cc\7U\2\2\u04cc\u04ce\3\2\2\2"+
		"\u04cd\u04ca\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0"+
		"\7;\2\2\u04d0\u00ad\3\2\2\2\u04d1\u04d2\7=\2\2\u04d2\u04d3\5\u00b0Y\2"+
		"\u04d3\u00af\3\2\2\2\u04d4\u04d9\5\u00b2Z\2\u04d5\u04d6\7T\2\2\u04d6\u04d8"+
		"\5\u00b2Z\2\u04d7\u04d5\3\2\2\2\u04d8\u04db\3\2\2\2\u04d9\u04d7\3\2\2"+
		"\2\u04d9\u04da\3\2\2\2\u04da\u00b1\3\2\2\2\u04db\u04d9\3\2\2\2\u04dc\u04df"+
		"\5\20\t\2\u04dd\u04df\5\34\17\2\u04de\u04dc\3\2\2\2\u04de\u04dd\3\2\2"+
		"\2\u04df\u00b3\3\2\2\2\u04e0\u04e3\5\u0108\u0085\2\u04e1\u04e3\7S\2\2"+
		"\u04e2\u04e0\3\2\2\2\u04e2\u04e1\3\2\2\2\u04e3\u00b5\3\2\2\2\u04e4\u04e5"+
		"\5\u0108\u0085\2\u04e5\u00b7\3\2\2\2\u04e6\u04e7\7\66\2\2\u04e7\u04e8"+
		"\5\u0108\u0085\2\u04e8\u00b9\3\2\2\2\u04e9\u04eb\5\u00bc_\2\u04ea\u04e9"+
		"\3\2\2\2\u04eb\u04ee\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"\u04ef\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ef\u04f1\5\u00be`\2\u04f0\u04f2"+
		"\5\u00aeX\2\u04f1\u04f0\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\3\2\2"+
		"\2\u04f3\u04f4\5\u00c2b\2\u04f4\u00bb\3\2\2\2\u04f5\u04fa\5\u00f2z\2\u04f6"+
		"\u04fa\7\63\2\2\u04f7\u04fa\7\62\2\2\u04f8\u04fa\7\61\2\2\u04f9\u04f5"+
		"\3\2\2\2\u04f9\u04f6\3\2\2\2\u04f9\u04f7\3\2\2\2\u04f9\u04f8\3\2\2\2\u04fa"+
		"\u00bd\3\2\2\2\u04fb\u04fd\5d\63\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd\3\2"+
		"\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\5\u00c0a\2\u04ff\u0501\7M\2\2\u0500"+
		"\u0502\5\u00a2R\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0503"+
		"\3\2\2\2\u0503\u0504\7N\2\2\u0504\u00bf\3\2\2\2\u0505\u0506\5\u01f0\u00f9"+
		"\2\u0506\u00c1\3\2\2\2\u0507\u0509\7O\2\2\u0508\u050a\5\u00c4c\2\u0509"+
		"\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050c\3\2\2\2\u050b\u050d\5\u010a"+
		"\u0086\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\3\2\2\2\u050e"+
		"\u050f\7P\2\2\u050f\u00c3\3\2\2\2\u0510\u0512\5*\26\2\u0511\u0510\3\2"+
		"\2\2\u0511\u0512\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\7;\2\2\u0514"+
		"\u0516\7M\2\2\u0515\u0517\5\u01a2\u00d2\2\u0516\u0515\3\2\2\2\u0516\u0517"+
		"\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\7N\2\2\u0519\u053f\7S\2\2\u051a"+
		"\u051c\5*\26\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051d\3\2"+
		"\2\2\u051d\u051e\78\2\2\u051e\u0520\7M\2\2\u051f\u0521\5\u01a2\u00d2\2"+
		"\u0520\u051f\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523"+
		"\7N\2\2\u0523\u053f\7S\2\2\u0524\u0525\5<\37\2\u0525\u0527\7U\2\2\u0526"+
		"\u0528\5*\26\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529\3\2"+
		"\2\2\u0529\u052a\78\2\2\u052a\u052c\7M\2\2\u052b\u052d\5\u01a2\u00d2\2"+
		"\u052c\u052b\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u052f"+
		"\7N\2\2\u052f\u0530\7S\2\2\u0530\u053f\3\2\2\2\u0531\u0532\5\u0172\u00ba"+
		"\2\u0532\u0534\7U\2\2\u0533\u0535\5*\26\2\u0534\u0533\3\2\2\2\u0534\u0535"+
		"\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0537\78\2\2\u0537\u0539\7M\2\2\u0538"+
		"\u053a\5\u01a2\u00d2\2\u0539\u0538\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053b"+
		"\3\2\2\2\u053b\u053c\7N\2\2\u053c\u053d\7S\2\2\u053d\u053f\3\2\2\2\u053e"+
		"\u0511\3\2\2\2\u053e\u051b\3\2\2\2\u053e\u0524\3\2\2\2\u053e\u0531\3\2"+
		"\2\2\u053f\u00c5\3\2\2\2\u0540\u0542\5b\62\2\u0541\u0540\3\2\2\2\u0542"+
		"\u0545\3\2\2\2\u0543\u0541\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0546\3\2"+
		"\2\2\u0545\u0543\3\2\2\2\u0546\u0547\7 \2\2\u0547\u0549\5\u01f0\u00f9"+
		"\2\u0548\u054a\5j\66\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b"+
		"\3\2\2\2\u054b\u054c\5\u00c8e\2\u054c\u00c7\3\2\2\2\u054d\u054f\7O\2\2"+
		"\u054e\u0550\5\u00caf\2\u054f\u054e\3\2\2\2\u054f\u0550\3\2\2\2\u0550"+
		"\u0552\3\2\2\2\u0551\u0553\7T\2\2\u0552\u0551\3\2\2\2\u0552\u0553\3\2"+
		"\2\2\u0553\u0555\3\2\2\2\u0554\u0556\5\u00d0i\2\u0555\u0554\3\2\2\2\u0555"+
		"\u0556\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0558\7P\2\2\u0558\u00c9\3\2"+
		"\2\2\u0559\u055e\5\u00ccg\2\u055a\u055b\7T\2\2\u055b\u055d\5\u00ccg\2"+
		"\u055c\u055a\3\2\2\2\u055d\u0560\3\2\2\2\u055e\u055c\3\2\2\2\u055e\u055f"+
		"\3\2\2\2\u055f\u00cb\3\2\2\2\u0560\u055e\3\2\2\2\u0561\u0563\5\u00ceh"+
		"\2\u0562\u0561\3\2\2\2\u0563\u0566\3\2\2\2\u0564\u0562\3\2\2\2\u0564\u0565"+
		"\3\2\2\2\u0565\u0567\3\2\2\2\u0566\u0564\3\2\2\2\u0567\u056d\5\u01f0\u00f9"+
		"\2\u0568\u056a\7M\2\2\u0569\u056b\5\u01a2\u00d2\2\u056a\u0569\3\2\2\2"+
		"\u056a\u056b\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056e\7N\2\2\u056d\u0568"+
		"\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0570\3\2\2\2\u056f\u0571\5n8\2\u0570"+
		"\u056f\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u00cd\3\2\2\2\u0572\u0573\5\u00f2"+
		"z\2\u0573\u00cf\3\2\2\2\u0574\u0578\7S\2\2\u0575\u0577\5p9\2\u0576\u0575"+
		"\3\2\2\2\u0577\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u0579"+
		"\u00d1\3\2\2\2\u057a\u0578\3\2\2\2\u057b\u057e\5\u00d4k\2\u057c\u057e"+
		"\5\u00e6t\2\u057d\u057b\3\2\2\2\u057d\u057c\3\2\2\2\u057e\u00d3\3\2\2"+
		"\2\u057f\u0581\5\u00d6l\2\u0580\u057f\3\2\2\2\u0581\u0584\3\2\2\2\u0582"+
		"\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0585\3\2\2\2\u0584\u0582\3\2"+
		"\2\2\u0585\u0586\7,\2\2\u0586\u0588\5\u01f0\u00f9\2\u0587\u0589\5d\63"+
		"\2\u0588\u0587\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058b\3\2\2\2\u058a\u058c"+
		"\5\u00d8m\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\3\2\2"+
		"\2\u058d\u058e\5\u00dan\2\u058e\u00d5\3\2\2\2\u058f\u0597\5\u00f2z\2\u0590"+
		"\u0597\7\63\2\2\u0591\u0597\7\62\2\2\u0592\u0597\7\61\2\2\u0593\u0597"+
		"\7\21\2\2\u0594\u0597\7\66\2\2\u0595\u0597\7\67\2\2\u0596\u058f\3\2\2"+
		"\2\u0596\u0590\3\2\2\2\u0596\u0591\3\2\2\2\u0596\u0592\3\2\2\2\u0596\u0593"+
		"\3\2\2\2\u0596\u0594\3\2\2\2\u0596\u0595\3\2\2\2\u0597\u00d7\3\2\2\2\u0598"+
		"\u0599\7!\2\2\u0599\u059a\5l\67\2\u059a\u00d9\3\2\2\2\u059b\u059f\7O\2"+
		"\2\u059c\u059e\5\u00dco\2\u059d\u059c\3\2\2\2\u059e\u05a1\3\2\2\2\u059f"+
		"\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\3\2\2\2\u05a1\u059f\3\2"+
		"\2\2\u05a2\u05a3\7P\2\2\u05a3\u00db\3\2\2\2\u05a4\u05aa\5\u00dep\2\u05a5"+
		"\u05aa\5\u00e2r\2\u05a6\u05aa\5^\60\2\u05a7\u05aa\5\u00d2j\2\u05a8\u05aa"+
		"\7S\2\2\u05a9\u05a4\3\2\2\2\u05a9\u05a5\3\2\2\2\u05a9\u05a6\3\2\2\2\u05a9"+
		"\u05a7\3\2\2\2\u05a9\u05a8\3\2\2\2\u05aa\u00dd\3\2\2\2\u05ab\u05ad\5\u00e0"+
		"q\2\u05ac\u05ab\3\2\2\2\u05ad\u05b0\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae"+
		"\u05af\3\2\2\2\u05af\u05b1\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b1\u05b2\5\u0080"+
		"A\2\u05b2\u05b3\5x=\2\u05b3\u05b4\7S\2\2\u05b4\u00df\3\2\2\2\u05b5\u05ba"+
		"\5\u00f2z\2\u05b6\u05ba\7\63\2\2\u05b7\u05ba\7\66\2\2\u05b8\u05ba\7\""+
		"\2\2\u05b9\u05b5\3\2\2\2\u05b9\u05b6\3\2\2\2\u05b9\u05b7\3\2\2\2\u05b9"+
		"\u05b8\3\2\2\2\u05ba\u00e1\3\2\2\2\u05bb\u05bd\5\u00e4s\2\u05bc\u05bb"+
		"\3\2\2\2\u05bd\u05c0\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf"+
		"\u05c1\3\2\2\2\u05c0\u05be\3\2\2\2\u05c1\u05c2\5\u009cO\2\u05c2\u05c3"+
		"\5\u00b4[\2\u05c3\u00e3\3\2\2\2\u05c4\u05cc\5\u00f2z\2\u05c5\u05cc\7\63"+
		"\2\2\u05c6\u05cc\7\61\2\2\u05c7\u05cc\7\21\2\2\u05c8\u05cc\7\34\2\2\u05c9"+
		"\u05cc\7\66\2\2\u05ca\u05cc\7\67\2\2\u05cb\u05c4\3\2\2\2\u05cb\u05c5\3"+
		"\2\2\2\u05cb\u05c6\3\2\2\2\u05cb\u05c7\3\2\2\2\u05cb\u05c8\3\2\2\2\u05cb"+
		"\u05c9\3\2\2\2\u05cb\u05ca\3\2\2\2\u05cc\u00e5\3\2\2\2\u05cd\u05cf\5\u00d6"+
		"l\2\u05ce\u05cd\3\2\2\2\u05cf\u05d2\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d0"+
		"\u05d1\3\2\2\2\u05d1\u05d3\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d3\u05d4\7W"+
		"\2\2\u05d4\u05d5\7,\2\2\u05d5\u05d6\5\u01f0\u00f9\2\u05d6\u05d7\5\u00e8"+
		"u\2\u05d7\u00e7\3\2\2\2\u05d8\u05dc\7O\2\2\u05d9\u05db\5\u00eav\2\u05da"+
		"\u05d9\3\2\2\2\u05db\u05de\3\2\2\2\u05dc\u05da\3\2\2\2\u05dc\u05dd\3\2"+
		"\2\2\u05dd\u05df\3\2\2\2\u05de\u05dc\3\2\2\2\u05df\u05e0\7P\2\2\u05e0"+
		"\u00e9\3\2\2\2\u05e1\u05e7\5\u00ecw\2\u05e2\u05e7\5\u00dep\2\u05e3\u05e7"+
		"\5^\60\2\u05e4\u05e7\5\u00d2j\2\u05e5\u05e7\7S\2\2\u05e6\u05e1\3\2\2\2"+
		"\u05e6\u05e2\3\2\2\2\u05e6\u05e3\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e6\u05e5"+
		"\3\2\2\2\u05e7\u00eb\3\2\2\2\u05e8\u05ea\5\u00eex\2\u05e9\u05e8\3\2\2"+
		"\2\u05ea\u05ed\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ee"+
		"\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ee\u05ef\5\u0080A\2\u05ef\u05f0\5\u01f0"+
		"\u00f9\2\u05f0\u05f1\7M\2\2\u05f1\u05f3\7N\2\2\u05f2\u05f4\5 \21\2\u05f3"+
		"\u05f2\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f6\3\2\2\2\u05f5\u05f7\5\u00f0"+
		"y\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8"+
		"\u05f9\7S\2\2\u05f9\u00ed\3\2\2\2\u05fa\u05fe\5\u00f2z\2\u05fb\u05fe\7"+
		"\63\2\2\u05fc\u05fe\7\21\2\2\u05fd\u05fa\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fd"+
		"\u05fc\3\2\2\2\u05fe\u00ef\3\2\2\2\u05ff\u0600\7\34\2\2\u0600\u0601\5"+
		"\u00fa~\2\u0601\u00f1\3\2\2\2\u0602\u0606\5\u00f4{\2\u0603\u0606\5\u0100"+
		"\u0081\2\u0604\u0606\5\u0102\u0082\2\u0605\u0602\3\2\2\2\u0605\u0603\3"+
		"\2\2\2\u0605\u0604\3\2\2\2\u0606\u00f3\3\2\2\2\u0607\u0608\7W\2\2\u0608"+
		"\u0609\58\35\2\u0609\u060b\7M\2\2\u060a\u060c\5\u00f6|\2\u060b\u060a\3"+
		"\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060e\7N\2\2\u060e"+
		"\u00f5\3\2\2\2\u060f\u0614\5\u00f8}\2\u0610\u0611\7T\2\2\u0611\u0613\5"+
		"\u00f8}\2\u0612\u0610\3\2\2\2\u0613\u0616\3\2\2\2\u0614\u0612\3\2\2\2"+
		"\u0614\u0615\3\2\2\2\u0615\u00f7\3\2\2\2\u0616\u0614\3\2\2\2\u0617\u0618"+
		"\5\u01f0\u00f9\2\u0618\u0619\7Y\2\2\u0619\u061a\5\u00fa~\2\u061a\u00f9"+
		"\3\2\2\2\u061b\u061f\5\u01c4\u00e3\2\u061c\u061f\5\u00fc\177\2\u061d\u061f"+
		"\5\u00f2z\2\u061e\u061b\3\2\2\2\u061e\u061c\3\2\2\2\u061e\u061d\3\2\2"+
		"\2\u061f\u00fb\3\2\2\2\u0620\u0622\7O\2\2\u0621\u0623\5\u00fe\u0080\2"+
		"\u0622\u0621\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0625\3\2\2\2\u0624\u0626"+
		"\7T\2\2\u0625\u0624\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0627\3\2\2\2\u0627"+
		"\u0628\7P\2\2\u0628\u00fd\3\2\2\2\u0629\u062e\5\u00fa~\2\u062a\u062b\7"+
		"T\2\2\u062b\u062d\5\u00fa~\2\u062c\u062a\3\2\2\2\u062d\u0630\3\2\2\2\u062e"+
		"\u062c\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u00ff\3\2\2\2\u0630\u062e\3\2"+
		"\2\2\u0631\u0632\7W\2\2\u0632\u0633\58\35\2\u0633\u0101\3\2\2\2\u0634"+
		"\u0635\7W\2\2\u0635\u0636\58\35\2\u0636\u0637\7M\2\2\u0637\u0638\5\u00fa"+
		"~\2\u0638\u0639\7N\2\2\u0639\u0103\3\2\2\2\u063a\u063c\7O\2\2\u063b\u063d"+
		"\5\u0106\u0084\2\u063c\u063b\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063f\3"+
		"\2\2\2\u063e\u0640\7T\2\2\u063f\u063e\3\2\2\2\u063f\u0640\3\2\2\2\u0640"+
		"\u0641\3\2\2\2\u0641\u0642\7P\2\2\u0642\u0105\3\2\2\2\u0643\u0648\5~@"+
		"\2\u0644\u0645\7T\2\2\u0645\u0647\5~@\2\u0646\u0644\3\2\2\2\u0647\u064a"+
		"\3\2\2\2\u0648\u0646\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u0107\3\2\2\2\u064a"+
		"\u0648\3\2\2\2\u064b\u064d\7O\2\2\u064c\u064e\5\u010a\u0086\2\u064d\u064c"+
		"\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0653\7P\2\2\u0650"+
		"\u0653\5\u0120\u0091\2\u0651\u0653\5\u0122\u0092\2\u0652\u064b\3\2\2\2"+
		"\u0652\u0650\3\2\2\2\u0652\u0651\3\2\2\2\u0653\u0109\3\2\2\2\u0654\u0656"+
		"\5\u010c\u0087\2\u0655\u0654\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0655\3"+
		"\2\2\2\u0657\u0658\3\2\2\2\u0658\u065c\3\2\2\2\u0659\u065c\5\u0120\u0091"+
		"\2\u065a\u065c\5\u0122\u0092\2\u065b\u0655\3\2\2\2\u065b\u0659\3\2\2\2"+
		"\u065b\u065a\3\2\2\2\u065c\u010b\3\2\2\2\u065d\u0661\5\u010e\u0088\2\u065e"+
		"\u0661\5^\60\2\u065f\u0661\5\u0112\u008a\2\u0660\u065d\3\2\2\2\u0660\u065e"+
		"\3\2\2\2\u0660\u065f\3\2\2\2\u0661\u010d\3\2\2\2\u0662\u0663\5\u0110\u0089"+
		"\2\u0663\u0664\7S\2\2\u0664\u010f\3\2\2\2\u0665\u0667\5\u00a8U\2\u0666"+
		"\u0665\3\2\2\2\u0667\u066a\3\2\2\2\u0668\u0666\3\2\2\2\u0668\u0669\3\2"+
		"\2\2\u0669\u066b\3\2\2\2\u066a\u0668\3\2\2\2\u066b\u066c\5\u0080A\2\u066c"+
		"\u066d\5x=\2\u066d\u0111\3\2\2\2\u066e\u0675\5\u0116\u008c\2\u066f\u0675"+
		"\5\u011a\u008e\2\u0670\u0675\5\u0126\u0094\2\u0671\u0675\5\u0128\u0095"+
		"\2\u0672\u0675\5\u013a\u009e\2\u0673\u0675\5\u0140\u00a1\2\u0674\u066e"+
		"\3\2\2\2\u0674\u066f\3\2\2\2\u0674\u0670\3\2\2\2\u0674\u0671\3\2\2\2\u0674"+
		"\u0672\3\2\2\2\u0674\u0673\3\2\2\2\u0675\u0113\3\2\2\2\u0676\u067c\5\u0116"+
		"\u008c\2\u0677\u067c\5\u011c\u008f\2\u0678\u067c\5\u012a\u0096\2\u0679"+
		"\u067c\5\u013c\u009f\2\u067a\u067c\5\u0142\u00a2\2\u067b\u0676\3\2\2\2"+
		"\u067b\u0677\3\2\2\2\u067b\u0678\3\2\2\2\u067b\u0679\3\2\2\2\u067b\u067a"+
		"\3\2\2\2\u067c\u0115\3\2\2\2\u067d\u068a\5\u0108\u0085\2\u067e\u068a\5"+
		"\u0118\u008d\2\u067f\u068a\5\u011e\u0090\2\u0680\u068a\5\u012c\u0097\2"+
		"\u0681\u068a\5\u012e\u0098\2\u0682\u068a\5\u013e\u00a0\2\u0683\u068a\5"+
		"\u0152\u00aa\2\u0684\u068a\5\u0154\u00ab\2\u0685\u068a\5\u0156\u00ac\2"+
		"\u0686\u068a\5\u015a\u00ae\2\u0687\u068a\5\u0158\u00ad\2\u0688\u068a\5"+
		"\u015c\u00af\2\u0689\u067d\3\2\2\2\u0689\u067e\3\2\2\2\u0689\u067f\3\2"+
		"\2\2\u0689\u0680\3\2\2\2\u0689\u0681\3\2\2\2\u0689\u0682\3\2\2\2\u0689"+
		"\u0683\3\2\2\2\u0689\u0684\3\2\2\2\u0689\u0685\3\2\2\2\u0689\u0686\3\2"+
		"\2\2\u0689\u0687\3\2\2\2\u0689\u0688\3\2\2\2\u068a\u0117\3\2\2\2\u068b"+
		"\u068c\7S\2\2\u068c\u0119\3\2\2\2\u068d\u068e\5\u01f0\u00f9\2\u068e\u068f"+
		"\7_\2\2\u068f\u0690\5\u0112\u008a\2\u0690\u011b\3\2\2\2\u0691\u0692\5"+
		"\u01f0\u00f9\2\u0692\u0693\7_\2\2\u0693\u0694\5\u0114\u008b\2\u0694\u011d"+
		"\3\2\2\2\u0695\u0696\5\u0124\u0093\2\u0696\u0697\7S\2\2\u0697\u011f\3"+
		"\2\2\2\u0698\u0699\7C\2\2\u0699\u069a\7M\2\2\u069a\u069c\5\u01a2\u00d2"+
		"\2\u069b\u069d\5\u01a2\u00d2\2\u069c\u069b\3\2\2\2\u069d\u069e\3\2\2\2"+
		"\u069e\u069c\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a1"+
		"\7\r\2\2\u06a1\u06a2\b\u0091\1\2\u06a2\u06a9\3\2\2\2\u06a3\u06a4\7C\2"+
		"\2\u06a4\u06a5\7M\2\2\u06a5\u06a6\5\u01a2\u00d2\2\u06a6\u06a7\7\r\2\2"+
		"\u06a7\u06a9\3\2\2\2\u06a8\u0698\3\2\2\2\u06a8\u06a3\3\2\2\2\u06a9\u0121"+
		"\3\2\2\2\u06aa\u06ab\7D\2\2\u06ab\u06ac\7M\2\2\u06ac\u06ad\5\u01f0\u00f9"+
		"\2\u06ad\u06ae\7\r\2\2\u06ae\u0123\3\2\2\2\u06af\u06b7\5\u01be\u00e0\2"+
		"\u06b0\u06b7\5\u01dc\u00ef\2\u06b1\u06b7\5\u01de\u00f0\2\u06b2\u06b7\5"+
		"\u01e4\u00f3\2\u06b3\u06b7\5\u01e8\u00f5\2\u06b4\u06b7\5\u019c\u00cf\2"+
		"\u06b5\u06b7\5\u0188\u00c5\2\u06b6\u06af\3\2\2\2\u06b6\u06b0\3\2\2\2\u06b6"+
		"\u06b1\3\2\2\2\u06b6\u06b2\3\2\2\2\u06b6\u06b3\3\2\2\2\u06b6\u06b4\3\2"+
		"\2\2\u06b6\u06b5\3\2\2\2\u06b7\u0125\3\2\2\2\u06b8\u06b9\7&\2\2\u06b9"+
		"\u06ba\7M\2\2\u06ba\u06bb\5\u01b2\u00da\2\u06bb\u06bc\7N\2\2\u06bc\u06bd"+
		"\5\u0112\u008a\2\u06bd\u0127\3\2\2\2\u06be\u06bf\7&\2\2\u06bf\u06c0\7"+
		"M\2\2\u06c0\u06c1\5\u01b2\u00da\2\u06c1\u06c2\7N\2\2\u06c2\u06c3\5\u0114"+
		"\u008b\2\u06c3\u06c4\7\37\2\2\u06c4\u06c5\5\u0112\u008a\2\u06c5\u0129"+
		"\3\2\2\2\u06c6\u06c7\7&\2\2\u06c7\u06c8\7M\2\2\u06c8\u06c9\5\u01b2\u00da"+
		"\2\u06c9\u06ca\7N\2\2\u06ca\u06cb\5\u0114\u008b\2\u06cb\u06cc\7\37\2\2"+
		"\u06cc\u06cd\5\u0114\u008b\2\u06cd\u012b\3\2\2\2\u06ce\u06cf\7\22\2\2"+
		"\u06cf\u06d0\5\u01b2\u00da\2\u06d0\u06d1\7S\2\2\u06d1\u06d9\3\2\2\2\u06d2"+
		"\u06d3\7\22\2\2\u06d3\u06d4\5\u01b2\u00da\2\u06d4\u06d5\7_\2\2\u06d5\u06d6"+
		"\5\u01b2\u00da\2\u06d6\u06d7\7S\2\2\u06d7\u06d9\3\2\2\2\u06d8\u06ce\3"+
		"\2\2\2\u06d8\u06d2\3\2\2\2\u06d9\u012d\3\2\2\2\u06da\u06db\79\2\2\u06db"+
		"\u06dc\7M\2\2\u06dc\u06dd\5\u01b2\u00da\2\u06dd\u06de\7N\2\2\u06de\u06df"+
		"\5\u0130\u0099\2\u06df\u012f\3\2\2\2\u06e0\u06e4\7O\2\2\u06e1\u06e3\5"+
		"\u0132\u009a\2\u06e2\u06e1\3\2\2\2\u06e3\u06e6\3\2\2\2\u06e4\u06e2\3\2"+
		"\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06ea\3\2\2\2\u06e6\u06e4\3\2\2\2\u06e7"+
		"\u06e9\5\u0136\u009c\2\u06e8\u06e7\3\2\2\2\u06e9\u06ec\3\2\2\2\u06ea\u06e8"+
		"\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ed\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ed"+
		"\u06ee\7P\2\2\u06ee\u0131\3\2\2\2\u06ef\u06f0\5\u0134\u009b\2\u06f0\u06f1"+
		"\5\u010a\u0086\2\u06f1\u0133\3\2\2\2\u06f2\u06f4\5\u0136\u009c\2\u06f3"+
		"\u06f2\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f5\u06f6\3\2"+
		"\2\2\u06f6\u0135\3\2\2\2\u06f7\u06f8\7\26\2\2\u06f8\u06f9\5\u01b0\u00d9"+
		"\2\u06f9\u06fa\7_\2\2\u06fa\u0702\3\2\2\2\u06fb\u06fc\7\26\2\2\u06fc\u06fd"+
		"\5\u0138\u009d\2\u06fd\u06fe\7_\2\2\u06fe\u0702\3\2\2\2\u06ff\u0700\7"+
		"\34\2\2\u0700\u0702\7_\2\2\u0701\u06f7\3\2\2\2\u0701\u06fb\3\2\2\2\u0701"+
		"\u06ff\3\2\2\2\u0702\u0137\3\2\2\2\u0703\u0704\5\u01f0\u00f9\2\u0704\u0139"+
		"\3\2\2\2\u0705\u0706\7B\2\2\u0706\u0707\7M\2\2\u0707\u0708\5\u01b2\u00da"+
		"\2\u0708\u0709\7N\2\2\u0709\u070a\5\u0112\u008a\2\u070a\u013b\3\2\2\2"+
		"\u070b\u070c\7B\2\2\u070c\u070d\7M\2\2\u070d\u070e\5\u01b2\u00da\2\u070e"+
		"\u070f\7N\2\2\u070f\u0710\5\u0114\u008b\2\u0710\u013d\3\2\2\2\u0711\u0712"+
		"\7\35\2\2\u0712\u0713\5\u0112\u008a\2\u0713\u0714\7B\2\2\u0714\u0715\7"+
		"M\2\2\u0715\u0716\5\u01b2\u00da\2\u0716\u0717\7N\2\2\u0717\u0718\7S\2"+
		"\2\u0718\u013f\3\2\2\2\u0719\u071c\5\u0144\u00a3\2\u071a\u071c\5\u014e"+
		"\u00a8\2\u071b\u0719\3\2\2\2\u071b\u071a\3\2\2\2\u071c\u0141\3\2\2\2\u071d"+
		"\u0720\5\u0146\u00a4\2\u071e\u0720\5\u0150\u00a9\2\u071f\u071d\3\2\2\2"+
		"\u071f\u071e\3\2\2\2\u0720\u0143\3\2\2\2\u0721\u0722\7%\2\2\u0722\u0724"+
		"\7M\2\2\u0723\u0725\5\u0148\u00a5\2\u0724\u0723\3\2\2\2\u0724\u0725\3"+
		"\2\2\2\u0725\u0726\3\2\2\2\u0726\u0728\7S\2\2\u0727\u0729\5\u01b2\u00da"+
		"\2\u0728\u0727\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u072c"+
		"\7S\2\2\u072b\u072d\5\u014a\u00a6\2\u072c\u072b\3\2\2\2\u072c\u072d\3"+
		"\2\2\2\u072d\u072e\3\2\2\2\u072e\u072f\7N\2\2\u072f\u0730\5\u0112\u008a"+
		"\2\u0730\u0145\3\2\2\2\u0731\u0732\7%\2\2\u0732\u0734\7M\2\2\u0733\u0735"+
		"\5\u0148\u00a5\2\u0734\u0733\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0736\3"+
		"\2\2\2\u0736\u0738\7S\2\2\u0737\u0739\5\u01b2\u00da\2\u0738\u0737\3\2"+
		"\2\2\u0738\u0739\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073c\7S\2\2\u073b"+
		"\u073d\5\u014a\u00a6\2\u073c\u073b\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073e"+
		"\3\2\2\2\u073e\u073f\7N\2\2\u073f\u0740\5\u0114\u008b\2\u0740\u0147\3"+
		"\2\2\2\u0741\u0744\5\u014c\u00a7\2\u0742\u0744\5\u0110\u0089\2\u0743\u0741"+
		"\3\2\2\2\u0743\u0742\3\2\2\2\u0744\u0149\3\2\2\2\u0745\u0746\5\u014c\u00a7"+
		"\2\u0746\u014b\3\2\2\2\u0747\u074c\5\u0124\u0093\2\u0748\u0749\7T\2\2"+
		"\u0749\u074b\5\u0124\u0093\2\u074a\u0748\3\2\2\2\u074b\u074e\3\2\2\2\u074c"+
		"\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u014d\3\2\2\2\u074e\u074c\3\2"+
		"\2\2\u074f\u0750\7%\2\2\u0750\u0754\7M\2\2\u0751\u0753\5\u00a8U\2\u0752"+
		"\u0751\3\2\2\2\u0753\u0756\3\2\2\2\u0754\u0752\3\2\2\2\u0754\u0755\3\2"+
		"\2\2\u0755\u0757\3\2\2\2\u0756\u0754\3\2\2\2\u0757\u0758\5\u0080A\2\u0758"+
		"\u0759\5|?\2\u0759\u075a\7_\2\2\u075a\u075b\5\u01b2\u00da\2\u075b\u075c"+
		"\7N\2\2\u075c\u075d\5\u0112\u008a\2\u075d\u014f\3\2\2\2\u075e\u075f\7"+
		"%\2\2\u075f\u0763\7M\2\2\u0760\u0762\5\u00a8U\2\u0761\u0760\3\2\2\2\u0762"+
		"\u0765\3\2\2\2\u0763\u0761\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0766\3\2"+
		"\2\2\u0765\u0763\3\2\2\2\u0766\u0767\5\u0080A\2\u0767\u0768\5|?\2\u0768"+
		"\u0769\7_\2\2\u0769\u076a\5\u01b2\u00da\2\u076a\u076b\7N\2\2\u076b\u076c"+
		"\5\u0114\u008b\2\u076c\u0151\3\2\2\2\u076d\u076f\7\24\2\2\u076e\u0770"+
		"\5\u01f0\u00f9\2\u076f\u076e\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0771\3"+
		"\2\2\2\u0771\u0772\7S\2\2\u0772\u0153\3\2\2\2\u0773\u0775\7\33\2\2\u0774"+
		"\u0776\5\u01f0\u00f9\2\u0775\u0774\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777"+
		"\3\2\2\2\u0777\u0778\7S\2\2\u0778\u0155\3\2\2\2\u0779\u077a\7\64\2\2\u077a"+
		"\u077b\7+\2\2\u077b\u077c\7S\2\2\u077c\u079c\b\u00ac\1\2\u077d\u077e\7"+
		"\64\2\2\u077e\u077f\7$\2\2\u077f\u0780\7S\2\2\u0780\u079c\b\u00ac\1\2"+
		"\u0781\u0782\7\64\2\2\u0782\u0783\7\36\2\2\u0783\u0784\7S\2\2\u0784\u079c"+
		"\b\u00ac\1\2\u0785\u0786\7\64\2\2\u0786\u0787\7\16\2\2\u0787\u0788\7S"+
		"\2\2\u0788\u079c\b\u00ac\1\2\u0789\u078a\7\64\2\2\u078a\u078b\7\30\2\2"+
		"\u078b\u078c\7S\2\2\u078c\u079c\b\u00ac\1\2\u078d\u078e\7\64\2\2\u078e"+
		"\u078f\7\23\2\2\u078f\u0790\7S\2\2\u0790\u079c\b\u00ac\1\2\u0791\u0793"+
		"\7\64\2\2\u0792\u0794\5\u01b2\u00da\2\u0793\u0792\3\2\2\2\u0793\u0794"+
		"\3\2\2\2\u0794\u0795\3\2\2\2\u0795\u079c\7S\2\2\u0796\u0798\7\64\2\2\u0797"+
		"\u0799\5\u01b2\u00da\2\u0798\u0797\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u079a"+
		"\3\2\2\2\u079a\u079c\b\u00ac\1\2\u079b\u0779\3\2\2\2\u079b\u077d\3\2\2"+
		"\2\u079b\u0781\3\2\2\2\u079b\u0785\3\2\2\2\u079b\u0789\3\2\2\2\u079b\u078d"+
		"\3\2\2\2\u079b\u0791\3\2\2\2\u079b\u0796\3\2\2\2\u079c\u0157\3\2\2\2\u079d"+
		"\u079e\7<\2\2\u079e\u079f\5\u01b2\u00da\2\u079f\u07a0\7S\2\2\u07a0\u0159"+
		"\3\2\2\2\u07a1\u07a2\7:\2\2\u07a2\u07a3\7M\2\2\u07a3\u07a4\5\u01b2\u00da"+
		"\2\u07a4\u07a5\7N\2\2\u07a5\u07a6\5\u0108\u0085\2\u07a6\u015b\3\2\2\2"+
		"\u07a7\u07a8\7?\2\2\u07a8\u07a9\5\u0108\u0085\2\u07a9\u07aa\5\u015e\u00b0"+
		"\2\u07aa\u07b4\3\2\2\2\u07ab\u07ac\7?\2\2\u07ac\u07ae\5\u0108\u0085\2"+
		"\u07ad\u07af\5\u015e\u00b0\2\u07ae\u07ad\3\2\2\2\u07ae\u07af\3\2\2\2\u07af"+
		"\u07b0\3\2\2\2\u07b0\u07b1\5\u0166\u00b4\2\u07b1\u07b4\3\2\2\2\u07b2\u07b4"+
		"\5\u0168\u00b5\2\u07b3\u07a7\3\2\2\2\u07b3\u07ab\3\2\2\2\u07b3\u07b2\3"+
		"\2\2\2\u07b4\u015d\3\2\2\2\u07b5\u07b7\5\u0160\u00b1\2\u07b6\u07b5\3\2"+
		"\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07b6\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9"+
		"\u015f\3\2\2\2\u07ba\u07bb\7\27\2\2\u07bb\u07bc\7M\2\2\u07bc\u07bd\5\u0162"+
		"\u00b2\2\u07bd\u07be\7N\2\2\u07be\u07bf\5\u0108\u0085\2\u07bf\u0161\3"+
		"\2\2\2\u07c0\u07c2\5\u00a8U\2\u07c1\u07c0\3\2\2\2\u07c2\u07c5\3\2\2\2"+
		"\u07c3\u07c1\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c6\3\2\2\2\u07c5\u07c3"+
		"\3\2\2\2\u07c6\u07c7\5\u0164\u00b3\2\u07c7\u07c8\5|?\2\u07c8\u0163\3\2"+
		"\2\2\u07c9\u07ce\5\u0088E\2\u07ca\u07cb\7n\2\2\u07cb\u07cd\5\20\t\2\u07cc"+
		"\u07ca\3\2\2\2\u07cd\u07d0\3\2\2\2\u07ce\u07cc\3\2\2\2\u07ce\u07cf\3\2"+
		"\2\2\u07cf\u0165\3\2\2\2\u07d0\u07ce\3\2\2\2\u07d1\u07d2\7#\2\2\u07d2"+
		"\u07d3\5\u0108\u0085\2\u07d3\u0167\3\2\2\2\u07d4\u07d5\7?\2\2\u07d5\u07d6"+
		"\5\u016a\u00b6\2\u07d6\u07d8\5\u0108\u0085\2\u07d7\u07d9\5\u015e\u00b0"+
		"\2\u07d8\u07d7\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07db\3\2\2\2\u07da\u07dc"+
		"\5\u0166\u00b4\2\u07db\u07da\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u0169\3"+
		"\2\2\2\u07dd\u07de\7M\2\2\u07de\u07e0\5\u016c\u00b7\2\u07df\u07e1\7S\2"+
		"\2\u07e0\u07df\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e3"+
		"\7N\2\2\u07e3\u016b\3\2\2\2\u07e4\u07e9\5\u016e\u00b8\2\u07e5\u07e6\7"+
		"S\2\2\u07e6\u07e8\5\u016e\u00b8\2\u07e7\u07e5\3\2\2\2\u07e8\u07eb\3\2"+
		"\2\2\u07e9\u07e7\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u016d\3\2\2\2\u07eb"+
		"\u07e9\3\2\2\2\u07ec\u07ee\5\u00a8U\2\u07ed\u07ec\3\2\2\2\u07ee\u07f1"+
		"\3\2\2\2\u07ef\u07ed\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f2\3\2\2\2\u07f1"+
		"\u07ef\3\2\2\2\u07f2\u07f3\5\u0080A\2\u07f3\u07f4\5|?\2\u07f4\u07f5\7"+
		"Y\2\2\u07f5\u07f6\5\u01b2\u00da\2\u07f6\u07f9\3\2\2\2\u07f7\u07f9\5\u0170"+
		"\u00b9\2\u07f8\u07ef\3\2\2\2\u07f8\u07f7\3\2\2\2\u07f9\u016f\3\2\2\2\u07fa"+
		"\u07fd\5<\37\2\u07fb\u07fd\5\u0190\u00c9\2\u07fc\u07fa\3\2\2\2\u07fc\u07fb"+
		"\3\2\2\2\u07fd\u0171\3\2\2\2\u07fe\u0801\5\u0180\u00c1\2\u07ff\u0801\5"+
		"\u01aa\u00d6\2\u0800\u07fe\3\2\2\2\u0800\u07ff\3\2\2\2\u0801\u0805\3\2"+
		"\2\2\u0802\u0804\5\u017a\u00be\2\u0803\u0802\3\2\2\2\u0804\u0807\3\2\2"+
		"\2\u0805\u0803\3\2\2\2\u0805\u0806\3\2\2\2\u0806\u0173\3\2\2\2\u0807\u0805"+
		"\3\2\2\2\u0808\u0819\5\2\2\2\u0809\u0819\5\u0186\u00c4\2\u080a\u0819\7"+
		";\2\2\u080b\u080c\58\35\2\u080c\u080d\7U\2\2\u080d\u080e\7;\2\2\u080e"+
		"\u0819\3\2\2\2\u080f\u0810\7M\2\2\u0810\u0811\5\u01b2\u00da\2\u0811\u0812"+
		"\7N\2\2\u0812\u0819\3\2\2\2\u0813\u0819\5\u0188\u00c5\2\u0814\u0819\5"+
		"\u0190\u00c9\2\u0815\u0819\5\u0196\u00cc\2\u0816\u0819\5\u019c\u00cf\2"+
		"\u0817\u0819\5\u01a4\u00d3\2\u0818\u0808\3\2\2\2\u0818\u0809\3\2\2\2\u0818"+
		"\u080a\3\2\2\2\u0818\u080b\3\2\2\2\u0818\u080f\3\2\2\2\u0818\u0813\3\2"+
		"\2\2\u0818\u0814\3\2\2\2\u0818\u0815\3\2\2\2\u0818\u0816\3\2\2\2\u0818"+
		"\u0817\3\2\2\2\u0819\u0175\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u0177\3\2"+
		"\2\2\u081c\u0839\5\2\2\2\u081d\u0822\58\35\2\u081e\u081f\7Q\2\2\u081f"+
		"\u0821\7R\2\2\u0820\u081e\3\2\2\2\u0821\u0824\3\2\2\2\u0822\u0820\3\2"+
		"\2\2\u0822\u0823\3\2\2\2\u0823\u0825\3\2\2\2\u0824\u0822\3\2\2\2\u0825"+
		"\u0826\7U\2\2\u0826\u0827\7\31\2\2\u0827\u0839\3\2\2\2\u0828\u0829\7@"+
		"\2\2\u0829\u082a\7U\2\2\u082a\u0839\7\31\2\2\u082b\u0839\7;\2\2\u082c"+
		"\u082d\58\35\2\u082d\u082e\7U\2\2\u082e\u082f\7;\2\2\u082f\u0839\3\2\2"+
		"\2\u0830\u0831\7M\2\2\u0831\u0832\5\u01b2\u00da\2\u0832\u0833\7N\2\2\u0833"+
		"\u0839\3\2\2\2\u0834\u0839\5\u0188\u00c5\2\u0835\u0839\5\u0190\u00c9\2"+
		"\u0836\u0839\5\u019c\u00cf\2\u0837\u0839\5\u01a4\u00d3\2\u0838\u081c\3"+
		"\2\2\2\u0838\u081d\3\2\2\2\u0838\u0828\3\2\2\2\u0838\u082b\3\2\2\2\u0838"+
		"\u082c\3\2\2\2\u0838\u0830\3\2\2\2\u0838\u0834\3\2\2\2\u0838\u0835\3\2"+
		"\2\2\u0838\u0836\3\2\2\2\u0838\u0837\3\2\2\2\u0839\u0179\3\2\2\2\u083a"+
		"\u0840\5\u018a\u00c6\2\u083b\u0840\5\u0192\u00ca\2\u083c\u0840\5\u0198"+
		"\u00cd\2\u083d\u0840\5\u019e\u00d0\2\u083e\u0840\5\u01a6\u00d4\2\u083f"+
		"\u083a\3\2\2\2\u083f\u083b\3\2\2\2\u083f\u083c\3\2\2\2\u083f\u083d\3\2"+
		"\2\2\u083f\u083e\3\2\2\2\u0840\u017b\3\2\2\2\u0841\u0842\3\2\2\2\u0842"+
		"\u017d\3\2\2\2\u0843\u0848\5\u018a\u00c6\2\u0844\u0848\5\u0192\u00ca\2"+
		"\u0845\u0848\5\u019e\u00d0\2\u0846\u0848\5\u01a6\u00d4\2\u0847\u0843\3"+
		"\2\2\2\u0847\u0844\3\2\2\2\u0847\u0845\3\2\2\2\u0847\u0846\3\2\2\2\u0848"+
		"\u017f\3\2\2\2\u0849\u0880\5\2\2\2\u084a\u084f\58\35\2\u084b\u084c\7Q"+
		"\2\2\u084c\u084e\7R\2\2\u084d\u084b\3\2\2\2\u084e\u0851\3\2\2\2\u084f"+
		"\u084d\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0852\3\2\2\2\u0851\u084f\3\2"+
		"\2\2\u0852\u0853\7U\2\2\u0853\u0854\7\31\2\2\u0854\u0880\3\2\2\2\u0855"+
		"\u085a\5\u0082B\2\u0856\u0857\7Q\2\2\u0857\u0859\7R\2\2\u0858\u0856\3"+
		"\2\2\2\u0859\u085c\3\2\2\2\u085a\u0858\3\2\2\2\u085a\u085b\3\2\2\2\u085b"+
		"\u085d\3\2\2\2\u085c\u085a\3\2\2\2\u085d\u085e\7U\2\2\u085e\u085f\7\31"+
		"\2\2\u085f\u0880\3\2\2\2\u0860\u0861\7@\2\2\u0861\u0862\7U\2\2\u0862\u0880"+
		"\7\31\2\2\u0863\u0880\7;\2\2\u0864\u0865\58\35\2\u0865\u0866\7U\2\2\u0866"+
		"\u0867\7;\2\2\u0867\u0880\3\2\2\2\u0868\u0869\7M\2\2\u0869\u086a\5\u01b2"+
		"\u00da\2\u086a\u086b\7N\2\2\u086b\u0880\3\2\2\2\u086c\u0880\5\u018c\u00c7"+
		"\2\u086d\u0880\5\u0194\u00cb\2\u086e\u0880\5\u019a\u00ce\2\u086f\u0880"+
		"\5\u01a0\u00d1\2\u0870\u0880\5\u01a8\u00d5\2\u0871\u0872\7M\2\2\u0872"+
		"\u0873\5\u01b2\u00da\2\u0873\u0875\7N\2\2\u0874\u0876\7N\2\2\u0875\u0874"+
		"\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u0875\3\2\2\2\u0877\u0878\3\2\2\2\u0878"+
		"\u0879\3\2\2\2\u0879\u087a\b\u00c1\1\2\u087a\u0880\3\2\2\2\u087b\u087c"+
		"\7M\2\2\u087c\u087d\5\u01b2\u00da\2\u087d\u087e\b\u00c1\1\2\u087e\u0880"+
		"\3\2\2\2\u087f\u0849\3\2\2\2\u087f\u084a\3\2\2\2\u087f\u0855\3\2\2\2\u087f"+
		"\u0860\3\2\2\2\u087f\u0863\3\2\2\2\u087f\u0864\3\2\2\2\u087f\u0868\3\2"+
		"\2\2\u087f\u086c\3\2\2\2\u087f\u086d\3\2\2\2\u087f\u086e\3\2\2\2\u087f"+
		"\u086f\3\2\2\2\u087f\u0870\3\2\2\2\u087f\u0871\3\2\2\2\u087f\u087b\3\2"+
		"\2\2\u0880\u0181\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u0183\3\2\2\2\u0883"+
		"\u08ab\5\2\2\2\u0884\u0889\58\35\2\u0885\u0886\7Q\2\2\u0886\u0888\7R\2"+
		"\2\u0887\u0885\3\2\2\2\u0888\u088b\3\2\2\2\u0889\u0887\3\2\2\2\u0889\u088a"+
		"\3\2\2\2\u088a\u088c\3\2\2\2\u088b\u0889\3\2\2\2\u088c\u088d\7U\2\2\u088d"+
		"\u088e\7\31\2\2\u088e\u08ab\3\2\2\2\u088f\u0894\5\u0082B\2\u0890\u0891"+
		"\7Q\2\2\u0891\u0893\7R\2\2\u0892\u0890\3\2\2\2\u0893\u0896\3\2\2\2\u0894"+
		"\u0892\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u0897\3\2\2\2\u0896\u0894\3\2"+
		"\2\2\u0897\u0898\7U\2\2\u0898\u0899\7\31\2\2\u0899\u08ab\3\2\2\2\u089a"+
		"\u089b\7@\2\2\u089b\u089c\7U\2\2\u089c\u08ab\7\31\2\2\u089d\u08ab\7;\2"+
		"\2\u089e\u089f\58\35\2\u089f\u08a0\7U\2\2\u08a0\u08a1\7;\2\2\u08a1\u08ab"+
		"\3\2\2\2\u08a2\u08a3\7M\2\2\u08a3\u08a4\5\u01b2\u00da\2\u08a4\u08a5\7"+
		"N\2\2\u08a5\u08ab\3\2\2\2\u08a6\u08ab\5\u018c\u00c7\2\u08a7\u08ab\5\u0194"+
		"\u00cb\2\u08a8\u08ab\5\u01a0\u00d1\2\u08a9\u08ab\5\u01a8\u00d5\2\u08aa"+
		"\u0883\3\2\2\2\u08aa\u0884\3\2\2\2\u08aa\u088f\3\2\2\2\u08aa\u089a\3\2"+
		"\2\2\u08aa\u089d\3\2\2\2\u08aa\u089e\3\2\2\2\u08aa\u08a2\3\2\2\2\u08aa"+
		"\u08a6\3\2\2\2\u08aa\u08a7\3\2\2\2\u08aa\u08a8\3\2\2\2\u08aa\u08a9\3\2"+
		"\2\2\u08ab\u0185\3\2\2\2\u08ac\u08b0\58\35\2\u08ad\u08b0\5\6\4\2\u08ae"+
		"\u08b0\7\23\2\2\u08af\u08ac\3\2\2\2\u08af\u08ad\3\2\2\2\u08af\u08ae\3"+
		"\2\2\2\u08b0\u08b5\3\2\2\2\u08b1\u08b2\7Q\2\2\u08b2\u08b4\7R\2\2\u08b3"+
		"\u08b1\3\2\2\2\u08b4\u08b7\3\2\2\2\u08b5\u08b3\3\2\2\2\u08b5\u08b6\3\2"+
		"\2\2\u08b6\u08b8\3\2\2\2\u08b7\u08b5\3\2\2\2\u08b8\u08b9\7U\2\2\u08b9"+
		"\u08be\7\31\2\2\u08ba\u08bb\7@\2\2\u08bb\u08bc\7U\2\2\u08bc\u08be\7\31"+
		"\2\2\u08bd\u08af\3\2\2\2\u08bd\u08ba\3\2\2\2\u08be\u0187\3\2\2\2\u08bf"+
		"\u08c1\7/\2\2\u08c0\u08c2\5*\26\2\u08c1\u08c0\3\2\2\2\u08c1\u08c2\3\2"+
		"\2\2\u08c2\u08c6\3\2\2\2\u08c3\u08c5\5\u00f2z\2\u08c4\u08c3\3\2\2\2\u08c5"+
		"\u08c8\3\2\2\2\u08c6\u08c4\3\2\2\2\u08c6\u08c7\3\2\2\2\u08c7\u08c9\3\2"+
		"\2\2\u08c8\u08c6\3\2\2\2\u08c9\u08d4\5\u01f0\u00f9\2\u08ca\u08ce\7U\2"+
		"\2\u08cb\u08cd\5\u00f2z\2\u08cc\u08cb\3\2\2\2\u08cd\u08d0\3\2\2\2\u08ce"+
		"\u08cc\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d1\3\2\2\2\u08d0\u08ce\3\2"+
		"\2\2\u08d1\u08d3\5\u01f0\u00f9\2\u08d2\u08ca\3\2\2\2\u08d3\u08d6\3\2\2"+
		"\2\u08d4\u08d2\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08d8\3\2\2\2\u08d6\u08d4"+
		"\3\2\2\2\u08d7\u08d9\5\u018e\u00c8\2\u08d8\u08d7\3\2\2\2\u08d8\u08d9\3"+
		"\2\2\2\u08d9\u08da\3\2\2\2\u08da\u08dc\7M\2\2\u08db\u08dd\5\u01a2\u00d2"+
		"\2\u08dc\u08db\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u08e0"+
		"\7N\2\2\u08df\u08e1\5n8\2\u08e0\u08df\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1"+
		"\u0913\3\2\2\2\u08e2\u08e3\5<\37\2\u08e3\u08e4\7U\2\2\u08e4\u08e6\7/\2"+
		"\2\u08e5\u08e7\5*\26\2\u08e6\u08e5\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08eb"+
		"\3\2\2\2\u08e8\u08ea\5\u00f2z\2\u08e9\u08e8\3\2\2\2\u08ea\u08ed\3\2\2"+
		"\2\u08eb\u08e9\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08ee\3\2\2\2\u08ed\u08eb"+
		"\3\2\2\2\u08ee\u08f0\5\u01f0\u00f9\2\u08ef\u08f1\5\u018e\u00c8\2\u08f0"+
		"\u08ef\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2\u08f4\7M"+
		"\2\2\u08f3\u08f5\5\u01a2\u00d2\2\u08f4\u08f3\3\2\2\2\u08f4\u08f5\3\2\2"+
		"\2\u08f5\u08f6\3\2\2\2\u08f6\u08f8\7N\2\2\u08f7\u08f9\5n8\2\u08f8\u08f7"+
		"\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u0913\3\2\2\2\u08fa\u08fb\5\u0172\u00ba"+
		"\2\u08fb\u08fc\7U\2\2\u08fc\u08fe\7/\2\2\u08fd\u08ff\5*\26\2\u08fe\u08fd"+
		"\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0903\3\2\2\2\u0900\u0902\5\u00f2z"+
		"\2\u0901\u0900\3\2\2\2\u0902\u0905\3\2\2\2\u0903\u0901\3\2\2\2\u0903\u0904"+
		"\3\2\2\2\u0904\u0906\3\2\2\2\u0905\u0903\3\2\2\2\u0906\u0908\5\u01f0\u00f9"+
		"\2\u0907\u0909\5\u018e\u00c8\2\u0908\u0907\3\2\2\2\u0908\u0909\3\2\2\2"+
		"\u0909\u090a\3\2\2\2\u090a\u090c\7M\2\2\u090b\u090d\5\u01a2\u00d2\2\u090c"+
		"\u090b\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u0910\7N"+
		"\2\2\u090f\u0911\5n8\2\u0910\u090f\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0913"+
		"\3\2\2\2\u0912\u08bf\3\2\2\2\u0912\u08e2\3\2\2\2\u0912\u08fa\3\2\2\2\u0913"+
		"\u0189\3\2\2\2\u0914\u0915\7U\2\2\u0915\u0917\7/\2\2\u0916\u0918\5*\26"+
		"\2\u0917\u0916\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u091c\3\2\2\2\u0919\u091b"+
		"\5\u00f2z\2\u091a\u0919\3\2\2\2\u091b\u091e\3\2\2\2\u091c\u091a\3\2\2"+
		"\2\u091c\u091d\3\2\2\2\u091d\u091f\3\2\2\2\u091e\u091c\3\2\2\2\u091f\u0921"+
		"\5\u01f0\u00f9\2\u0920\u0922\5\u018e\u00c8\2\u0921\u0920\3\2\2";
	private static final String _serializedATNSegment1 =
		"\2\u0921\u0922\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0925\7M\2\2\u0924\u0926"+
		"\5\u01a2\u00d2\2\u0925\u0924\3\2\2\2\u0925\u0926\3\2\2\2\u0926\u0927\3"+
		"\2\2\2\u0927\u0929\7N\2\2\u0928\u092a\5n8\2\u0929\u0928\3\2\2\2\u0929"+
		"\u092a\3\2\2\2\u092a\u018b\3\2\2\2\u092b\u092d\7/\2\2\u092c\u092e\5*\26"+
		"\2\u092d\u092c\3\2\2\2\u092d\u092e\3\2\2\2\u092e\u0932\3\2\2\2\u092f\u0931"+
		"\5\u00f2z\2\u0930\u092f\3\2\2\2\u0931\u0934\3\2\2\2\u0932\u0930\3\2\2"+
		"\2\u0932\u0933\3\2\2\2\u0933\u0935\3\2\2\2\u0934\u0932\3\2\2\2\u0935\u0940"+
		"\5\u01f0\u00f9\2\u0936\u093a\7U\2\2\u0937\u0939\5\u00f2z\2\u0938\u0937"+
		"\3\2\2\2\u0939\u093c\3\2\2\2\u093a\u0938\3\2\2\2\u093a\u093b\3\2\2\2\u093b"+
		"\u093d\3\2\2\2\u093c\u093a\3\2\2\2\u093d\u093f\5\u01f0\u00f9\2\u093e\u0936"+
		"\3\2\2\2\u093f\u0942\3\2\2\2\u0940\u093e\3\2\2\2\u0940\u0941\3\2\2\2\u0941"+
		"\u0944\3\2\2\2\u0942\u0940\3\2\2\2\u0943\u0945\5\u018e\u00c8\2\u0944\u0943"+
		"\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u0946\3\2\2\2\u0946\u0948\7M\2\2\u0947"+
		"\u0949\5\u01a2\u00d2\2\u0948\u0947\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094a"+
		"\3\2\2\2\u094a\u094c\7N\2\2\u094b\u094d\5n8\2\u094c\u094b\3\2\2\2\u094c"+
		"\u094d\3\2\2\2\u094d\u0967\3\2\2\2\u094e\u094f\5<\37\2\u094f\u0950\7U"+
		"\2\2\u0950\u0952\7/\2\2\u0951\u0953\5*\26\2\u0952\u0951\3\2\2\2\u0952"+
		"\u0953\3\2\2\2\u0953\u0957\3\2\2\2\u0954\u0956\5\u00f2z\2\u0955\u0954"+
		"\3\2\2\2\u0956\u0959\3\2\2\2\u0957\u0955\3\2\2\2\u0957\u0958\3\2\2\2\u0958"+
		"\u095a\3\2\2\2\u0959\u0957\3\2\2\2\u095a\u095c\5\u01f0\u00f9\2\u095b\u095d"+
		"\5\u018e\u00c8\2\u095c\u095b\3\2\2\2\u095c\u095d\3\2\2\2\u095d\u095e\3"+
		"\2\2\2\u095e\u0960\7M\2\2\u095f\u0961\5\u01a2\u00d2\2\u0960\u095f\3\2"+
		"\2\2\u0960\u0961\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u0964\7N\2\2\u0963"+
		"\u0965\5n8\2\u0964\u0963\3\2\2\2\u0964\u0965\3\2\2\2\u0965\u0967\3\2\2"+
		"\2\u0966\u092b\3\2\2\2\u0966\u094e\3\2\2\2\u0967\u018d\3\2\2\2\u0968\u096c"+
		"\5*\26\2\u0969\u096a\7[\2\2\u096a\u096c\7Z\2\2\u096b\u0968\3\2\2\2\u096b"+
		"\u0969\3\2\2\2\u096c\u018f\3\2\2\2\u096d\u096e\5\u0172\u00ba\2\u096e\u096f"+
		"\7U\2\2\u096f\u0970\5\u01f0\u00f9\2\u0970\u097b\3\2\2\2\u0971\u0972\7"+
		"8\2\2\u0972\u0973\7U\2\2\u0973\u097b\5\u01f0\u00f9\2\u0974\u0975\58\35"+
		"\2\u0975\u0976\7U\2\2\u0976\u0977\78\2\2\u0977\u0978\7U\2\2\u0978\u0979"+
		"\5\u01f0\u00f9\2\u0979\u097b\3\2\2\2\u097a\u096d\3\2\2\2\u097a\u0971\3"+
		"\2\2\2\u097a\u0974\3\2\2\2\u097b\u0191\3\2\2\2\u097c\u097d\7U\2\2\u097d"+
		"\u097e\5\u01f0\u00f9\2\u097e\u0193\3\2\2\2\u097f\u0980\78\2\2\u0980\u0981"+
		"\7U\2\2\u0981\u0989\5\u01f0\u00f9\2\u0982\u0983\58\35\2\u0983\u0984\7"+
		"U\2\2\u0984\u0985\78\2\2\u0985\u0986\7U\2\2\u0986\u0987\5\u01f0\u00f9"+
		"\2\u0987\u0989\3\2\2\2\u0988\u097f\3\2\2\2\u0988\u0982\3\2\2\2\u0989\u0195"+
		"\3\2\2\2\u098a\u098b\5<\37\2\u098b\u098c\7Q\2\2\u098c\u098d\5\u01b2\u00da"+
		"\2\u098d\u098e\7R\2\2\u098e\u0995\3\2\2\2\u098f\u0990\5\u0178\u00bd\2"+
		"\u0990\u0991\7Q\2\2\u0991\u0992\5\u01b2\u00da\2\u0992\u0993\7R\2\2\u0993"+
		"\u0995\3\2\2\2\u0994\u098a\3\2\2\2\u0994\u098f\3\2\2\2\u0995\u099d\3\2"+
		"\2\2\u0996\u0997\5\u0176\u00bc\2\u0997\u0998\7Q\2\2\u0998\u0999\5\u01b2"+
		"\u00da\2\u0999\u099a\7R\2\2\u099a\u099c\3\2\2\2\u099b\u0996\3\2\2\2\u099c"+
		"\u099f\3\2\2\2\u099d\u099b\3\2\2\2\u099d\u099e\3\2\2\2\u099e\u0197\3\2"+
		"\2\2\u099f\u099d\3\2\2\2\u09a0\u09a1\5\u017e\u00c0\2\u09a1\u09a2\7Q\2"+
		"\2\u09a2\u09a3\5\u01b2\u00da\2\u09a3\u09a4\7R\2\2\u09a4\u09ac\3\2\2\2"+
		"\u09a5\u09a6\5\u017c\u00bf\2\u09a6\u09a7\7Q\2\2\u09a7\u09a8\5\u01b2\u00da"+
		"\2\u09a8\u09a9\7R\2\2\u09a9\u09ab\3\2\2\2\u09aa\u09a5\3\2\2\2\u09ab\u09ae"+
		"\3\2\2\2\u09ac\u09aa\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad\u0199\3\2\2\2\u09ae"+
		"\u09ac\3\2\2\2\u09af\u09b0\5<\37\2\u09b0\u09b1\7Q\2\2\u09b1\u09b2\5\u01b2"+
		"\u00da\2\u09b2\u09b3\7R\2\2\u09b3\u09ba\3\2\2\2\u09b4\u09b5\5\u0184\u00c3"+
		"\2\u09b5\u09b6\7Q\2\2\u09b6\u09b7\5\u01b2\u00da\2\u09b7\u09b8\7R\2\2\u09b8"+
		"\u09ba\3\2\2\2\u09b9\u09af\3\2\2\2\u09b9\u09b4\3\2\2\2\u09ba\u09c2\3\2"+
		"\2\2\u09bb\u09bc\5\u0182\u00c2\2\u09bc\u09bd\7Q\2\2\u09bd\u09be\5\u01b2"+
		"\u00da\2\u09be\u09bf\7R\2\2\u09bf\u09c1\3\2\2\2\u09c0\u09bb\3\2\2\2\u09c1"+
		"\u09c4\3\2\2\2\u09c2\u09c0\3\2\2\2\u09c2\u09c3\3\2\2\2\u09c3\u019b\3\2"+
		"\2\2\u09c4\u09c2\3\2\2\2\u09c5\u09c6\5> \2\u09c6\u09c8\7M\2\2\u09c7\u09c9"+
		"\5\u01a2\u00d2\2\u09c8\u09c7\3\2\2\2\u09c8\u09c9\3\2\2\2\u09c9\u09ca\3"+
		"\2\2\2\u09ca\u09cb\7N\2\2\u09cb\u0a0b\3\2\2\2\u09cc\u09cd\58\35\2\u09cd"+
		"\u09cf\7U\2\2\u09ce\u09d0\5*\26\2\u09cf\u09ce\3\2\2\2\u09cf\u09d0\3\2"+
		"\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09d2\5\u01f0\u00f9\2\u09d2\u09d4\7M\2"+
		"\2\u09d3\u09d5\5\u01a2\u00d2\2\u09d4\u09d3\3\2\2\2\u09d4\u09d5\3\2\2\2"+
		"\u09d5\u09d6\3\2\2\2\u09d6\u09d7\7N\2\2\u09d7\u0a0b\3\2\2\2\u09d8\u09d9"+
		"\5<\37\2\u09d9\u09db\7U\2\2\u09da\u09dc\5*\26\2\u09db\u09da\3\2\2\2\u09db"+
		"\u09dc\3\2\2\2\u09dc\u09dd\3\2\2\2\u09dd\u09de\5\u01f0\u00f9\2\u09de\u09e0"+
		"\7M\2\2\u09df\u09e1\5\u01a2\u00d2\2\u09e0\u09df\3\2\2\2\u09e0\u09e1\3"+
		"\2\2\2\u09e1\u09e2\3\2\2\2\u09e2\u09e3\7N\2\2\u09e3\u0a0b\3\2\2\2\u09e4"+
		"\u09e5\5\u0172\u00ba\2\u09e5\u09e7\7U\2\2\u09e6\u09e8\5*\26\2\u09e7\u09e6"+
		"\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09ea\5\u01f0\u00f9"+
		"\2\u09ea\u09ec\7M\2\2\u09eb\u09ed\5\u01a2\u00d2\2\u09ec\u09eb\3\2\2\2"+
		"\u09ec\u09ed\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u09ef\7N\2\2\u09ef\u0a0b"+
		"\3\2\2\2\u09f0\u09f1\78\2\2\u09f1\u09f3\7U\2\2\u09f2\u09f4\5*\26\2\u09f3"+
		"\u09f2\3\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u09f5\3\2\2\2\u09f5\u09f6\5\u01f0"+
		"\u00f9\2\u09f6\u09f8\7M\2\2\u09f7\u09f9\5\u01a2\u00d2\2\u09f8\u09f7\3"+
		"\2\2\2\u09f8\u09f9\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u09fb\7N\2\2\u09fb"+
		"\u0a0b\3\2\2\2\u09fc\u09fd\58\35\2\u09fd\u09fe\7U\2\2\u09fe\u09ff\78\2"+
		"\2\u09ff\u0a01\7U\2\2\u0a00\u0a02\5*\26\2\u0a01\u0a00\3\2\2\2\u0a01\u0a02"+
		"\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a04\5\u01f0\u00f9\2\u0a04\u0a06\7"+
		"M\2\2\u0a05\u0a07\5\u01a2\u00d2\2\u0a06\u0a05\3\2\2\2\u0a06\u0a07\3\2"+
		"\2\2\u0a07\u0a08\3\2\2\2\u0a08\u0a09\7N\2\2\u0a09\u0a0b\3\2\2\2\u0a0a"+
		"\u09c5\3\2\2\2\u0a0a\u09cc\3\2\2\2\u0a0a\u09d8\3\2\2\2\u0a0a\u09e4\3\2"+
		"\2\2\u0a0a\u09f0\3\2\2\2\u0a0a\u09fc\3\2\2\2\u0a0b\u019d\3\2\2\2\u0a0c"+
		"\u0a0e\7U\2\2\u0a0d\u0a0f\5*\26\2\u0a0e\u0a0d\3\2\2\2\u0a0e\u0a0f\3\2"+
		"\2\2\u0a0f\u0a10\3\2\2\2\u0a10\u0a11\5\u01f0\u00f9\2\u0a11\u0a13\7M\2"+
		"\2\u0a12\u0a14\5\u01a2\u00d2\2\u0a13\u0a12\3\2\2\2\u0a13\u0a14\3\2\2\2"+
		"\u0a14\u0a15\3\2\2\2\u0a15\u0a16\7N\2\2\u0a16\u019f\3\2\2\2\u0a17\u0a18"+
		"\5> \2\u0a18\u0a1a\7M\2\2\u0a19\u0a1b\5\u01a2\u00d2\2\u0a1a\u0a19\3\2"+
		"\2\2\u0a1a\u0a1b\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c\u0a1d\7N\2\2\u0a1d"+
		"\u0a51\3\2\2\2\u0a1e\u0a1f\58\35\2\u0a1f\u0a21\7U\2\2\u0a20\u0a22\5*\26"+
		"\2\u0a21\u0a20\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0a24"+
		"\5\u01f0\u00f9\2\u0a24\u0a26\7M\2\2\u0a25\u0a27\5\u01a2\u00d2\2\u0a26"+
		"\u0a25\3\2\2\2\u0a26\u0a27\3\2\2\2\u0a27\u0a28\3\2\2\2\u0a28\u0a29\7N"+
		"\2\2\u0a29\u0a51\3\2\2\2\u0a2a\u0a2b\5<\37\2\u0a2b\u0a2d\7U\2\2\u0a2c"+
		"\u0a2e\5*\26\2\u0a2d\u0a2c\3\2\2\2\u0a2d\u0a2e\3\2\2\2\u0a2e\u0a2f\3\2"+
		"\2\2\u0a2f\u0a30\5\u01f0\u00f9\2\u0a30\u0a32\7M\2\2\u0a31\u0a33\5\u01a2"+
		"\u00d2\2\u0a32\u0a31\3\2\2\2\u0a32\u0a33\3\2\2\2\u0a33\u0a34\3\2\2\2\u0a34"+
		"\u0a35\7N\2\2\u0a35\u0a51\3\2\2\2\u0a36\u0a37\78\2\2\u0a37\u0a39\7U\2"+
		"\2\u0a38\u0a3a\5*\26\2\u0a39\u0a38\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u0a3b"+
		"\3\2\2\2\u0a3b\u0a3c\5\u01f0\u00f9\2\u0a3c\u0a3e\7M\2\2\u0a3d\u0a3f\5"+
		"\u01a2\u00d2\2\u0a3e\u0a3d\3\2\2\2\u0a3e\u0a3f\3\2\2\2\u0a3f\u0a40\3\2"+
		"\2\2\u0a40\u0a41\7N\2\2\u0a41\u0a51\3\2\2\2\u0a42\u0a43\58\35\2\u0a43"+
		"\u0a44\7U\2\2\u0a44\u0a45\78\2\2\u0a45\u0a47\7U\2\2\u0a46\u0a48\5*\26"+
		"\2\u0a47\u0a46\3\2\2\2\u0a47\u0a48\3\2\2\2\u0a48\u0a49\3\2\2\2\u0a49\u0a4a"+
		"\5\u01f0\u00f9\2\u0a4a\u0a4c\7M\2\2\u0a4b\u0a4d\5\u01a2\u00d2\2\u0a4c"+
		"\u0a4b\3\2\2\2\u0a4c\u0a4d\3\2\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e\u0a4f\7N"+
		"\2\2\u0a4f\u0a51\3\2\2\2\u0a50\u0a17\3\2\2\2\u0a50\u0a1e\3\2\2\2\u0a50"+
		"\u0a2a\3\2\2\2\u0a50\u0a36\3\2\2\2\u0a50\u0a42\3\2\2\2\u0a51\u01a1\3\2"+
		"\2\2\u0a52\u0a57\5\u01b2\u00da\2\u0a53\u0a54\7T\2\2\u0a54\u0a56\5\u01b2"+
		"\u00da\2\u0a55\u0a53\3\2\2\2\u0a56\u0a59\3\2\2\2\u0a57\u0a55\3\2\2\2\u0a57"+
		"\u0a58\3\2\2\2\u0a58\u01a3\3\2\2\2\u0a59\u0a57\3\2\2\2\u0a5a\u0a5b\5<"+
		"\37\2\u0a5b\u0a5d\7X\2\2\u0a5c\u0a5e\5*\26\2\u0a5d\u0a5c\3\2\2\2\u0a5d"+
		"\u0a5e\3\2\2\2\u0a5e\u0a5f\3\2\2\2\u0a5f\u0a60\5\u01f0\u00f9\2\u0a60\u0a8a"+
		"\3\2\2\2\u0a61\u0a62\5\f\7\2\u0a62\u0a64\7X\2\2\u0a63\u0a65\5*\26\2\u0a64"+
		"\u0a63\3\2\2\2\u0a64\u0a65\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66\u0a67\5\u01f0"+
		"\u00f9\2\u0a67\u0a8a\3\2\2\2\u0a68\u0a69\5\u0172\u00ba\2\u0a69\u0a6b\7"+
		"X\2\2\u0a6a\u0a6c\5*\26\2\u0a6b\u0a6a\3\2\2\2\u0a6b\u0a6c\3\2\2\2\u0a6c"+
		"\u0a6d\3\2\2\2\u0a6d\u0a6e\5\u01f0\u00f9\2\u0a6e\u0a8a\3\2\2\2\u0a6f\u0a70"+
		"\78\2\2\u0a70\u0a72\7X\2\2\u0a71\u0a73\5*\26\2\u0a72\u0a71\3\2\2\2\u0a72"+
		"\u0a73\3\2\2\2\u0a73\u0a74\3\2\2\2\u0a74\u0a8a\5\u01f0\u00f9\2\u0a75\u0a76"+
		"\58\35\2\u0a76\u0a77\7U\2\2\u0a77\u0a78\78\2\2\u0a78\u0a7a\7X\2\2\u0a79"+
		"\u0a7b\5*\26\2\u0a7a\u0a79\3\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u0a7c\3\2"+
		"\2\2\u0a7c\u0a7d\5\u01f0\u00f9\2\u0a7d\u0a8a\3\2\2\2\u0a7e\u0a7f\5\20"+
		"\t\2\u0a7f\u0a81\7X\2\2\u0a80\u0a82\5*\26\2\u0a81\u0a80\3\2\2\2\u0a81"+
		"\u0a82\3\2\2\2\u0a82\u0a83\3\2\2\2\u0a83\u0a84\7/\2\2\u0a84\u0a8a\3\2"+
		"\2\2\u0a85\u0a86\5\36\20\2\u0a86\u0a87\7X\2\2\u0a87\u0a88\7/\2\2\u0a88"+
		"\u0a8a\3\2\2\2\u0a89\u0a5a\3\2\2\2\u0a89\u0a61\3\2\2\2\u0a89\u0a68\3\2"+
		"\2\2\u0a89\u0a6f\3\2\2\2\u0a89\u0a75\3\2\2\2\u0a89\u0a7e\3\2\2\2\u0a89"+
		"\u0a85\3\2\2\2\u0a8a\u01a5\3\2\2\2\u0a8b\u0a8d\7X\2\2\u0a8c\u0a8e\5*\26"+
		"\2\u0a8d\u0a8c\3\2\2\2\u0a8d\u0a8e\3\2\2\2\u0a8e\u0a8f\3\2\2\2\u0a8f\u0a90"+
		"\5\u01f0\u00f9\2\u0a90\u01a7\3\2\2\2\u0a91\u0a92\5<\37\2\u0a92\u0a94\7"+
		"X\2\2\u0a93\u0a95\5*\26\2\u0a94\u0a93\3\2\2\2\u0a94\u0a95\3\2\2\2\u0a95"+
		"\u0a96\3\2\2\2\u0a96\u0a97\5\u01f0\u00f9\2\u0a97\u0aba\3\2\2\2\u0a98\u0a99"+
		"\5\f\7\2\u0a99\u0a9b\7X\2\2\u0a9a\u0a9c\5*\26\2\u0a9b\u0a9a\3\2\2\2\u0a9b"+
		"\u0a9c\3\2\2\2\u0a9c\u0a9d\3\2\2\2\u0a9d\u0a9e\5\u01f0\u00f9\2\u0a9e\u0aba"+
		"\3\2\2\2\u0a9f\u0aa0\78\2\2\u0aa0\u0aa2\7X\2\2\u0aa1\u0aa3\5*\26\2\u0aa2"+
		"\u0aa1\3\2\2\2\u0aa2\u0aa3\3\2\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4\u0aba\5\u01f0"+
		"\u00f9\2\u0aa5\u0aa6\58\35\2\u0aa6\u0aa7\7U\2\2\u0aa7\u0aa8\78\2\2\u0aa8"+
		"\u0aaa\7X\2\2\u0aa9\u0aab\5*\26\2\u0aaa\u0aa9\3\2\2\2\u0aaa\u0aab\3\2"+
		"\2\2\u0aab\u0aac\3\2\2\2\u0aac\u0aad\5\u01f0\u00f9\2\u0aad\u0aba\3\2\2"+
		"\2\u0aae\u0aaf\5\20\t\2\u0aaf\u0ab1\7X\2\2\u0ab0\u0ab2\5*\26\2\u0ab1\u0ab0"+
		"\3\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2\u0ab3\3\2\2\2\u0ab3\u0ab4\7/\2\2\u0ab4"+
		"\u0aba\3\2\2\2\u0ab5\u0ab6\5\36\20\2\u0ab6\u0ab7\7X\2\2\u0ab7\u0ab8\7"+
		"/\2\2\u0ab8\u0aba\3\2\2\2\u0ab9\u0a91\3\2\2\2\u0ab9\u0a98\3\2\2\2\u0ab9"+
		"\u0a9f\3\2\2\2\u0ab9\u0aa5\3\2\2\2\u0ab9\u0aae\3\2\2\2\u0ab9\u0ab5\3\2"+
		"\2\2\u0aba\u01a9\3\2\2\2\u0abb\u0abc\7/\2\2\u0abc\u0abd\5\4\3\2\u0abd"+
		"\u0abf\5\u01ac\u00d7\2\u0abe\u0ac0\5 \21\2\u0abf\u0abe\3\2\2\2\u0abf\u0ac0"+
		"\3\2\2\2\u0ac0\u0ad2\3\2\2\2\u0ac1\u0ac2\7/\2\2\u0ac2\u0ac3\5\16\b\2\u0ac3"+
		"\u0ac5\5\u01ac\u00d7\2\u0ac4\u0ac6\5 \21\2\u0ac5\u0ac4\3\2\2\2\u0ac5\u0ac6"+
		"\3\2\2\2\u0ac6\u0ad2\3\2\2\2\u0ac7\u0ac8\7/\2\2\u0ac8\u0ac9\5\4\3\2\u0ac9"+
		"\u0aca\5 \21\2\u0aca\u0acb\5\u0104\u0083\2\u0acb\u0ad2\3\2\2\2\u0acc\u0acd"+
		"\7/\2\2\u0acd\u0ace\5\16\b\2\u0ace\u0acf\5 \21\2\u0acf\u0ad0\5\u0104\u0083"+
		"\2\u0ad0\u0ad2\3\2\2\2\u0ad1\u0abb\3\2\2\2\u0ad1\u0ac1\3\2\2\2\u0ad1\u0ac7"+
		"\3\2\2\2\u0ad1\u0acc\3\2\2\2\u0ad2\u01ab\3\2\2\2\u0ad3\u0ad5\5\u01ae\u00d8"+
		"\2\u0ad4\u0ad3\3\2\2\2\u0ad5\u0ad6\3\2\2\2\u0ad6\u0ad4\3\2\2\2\u0ad6\u0ad7"+
		"\3\2\2\2\u0ad7\u01ad\3\2\2\2\u0ad8\u0ada\5\u00f2z\2\u0ad9\u0ad8\3\2\2"+
		"\2\u0ada\u0add\3\2\2\2\u0adb\u0ad9\3\2\2\2\u0adb\u0adc\3\2\2\2\u0adc\u0ade"+
		"\3\2\2\2\u0add\u0adb\3\2\2\2\u0ade\u0adf\7Q\2\2\u0adf\u0ae0\5\u01b2\u00da"+
		"\2\u0ae0\u0ae1\7R\2\2\u0ae1\u01af\3\2\2\2\u0ae2\u0ae3\5\u01b2\u00da\2"+
		"\u0ae3\u0ae4\5\u01c2\u00e2\2\u0ae4\u0aee\3\2\2\2\u0ae5\u0ae6\5\u01e4\u00f3"+
		"\2\u0ae6\u0ae7\5\u01b2\u00da\2\u0ae7\u0ae8\b\u00d9\1\2\u0ae8\u0aee\3\2"+
		"\2\2\u0ae9\u0aea\5\u01e8\u00f5\2\u0aea\u0aeb\5\u01b2\u00da\2\u0aeb\u0aec"+
		"\b\u00d9\1\2\u0aec\u0aee\3\2\2\2\u0aed\u0ae2\3\2\2\2\u0aed\u0ae5\3\2\2"+
		"\2\u0aed\u0ae9\3\2\2\2\u0aee\u01b1\3\2\2\2\u0aef\u0af2\5\u01b4\u00db\2"+
		"\u0af0\u0af2\5\u01bc\u00df\2\u0af1\u0aef\3\2\2\2\u0af1\u0af0\3\2\2\2\u0af2"+
		"\u01b3\3\2\2\2\u0af3\u0af4\5\u01b6\u00dc\2\u0af4\u0af5\7`\2\2\u0af5\u0af6"+
		"\5\u01ba\u00de\2\u0af6\u01b5\3\2\2\2\u0af7\u0b02\5\u01f0\u00f9\2\u0af8"+
		"\u0afa\7M\2\2\u0af9\u0afb\5\u00a2R\2\u0afa\u0af9\3\2\2\2\u0afa\u0afb\3"+
		"\2\2\2\u0afb\u0afc\3\2\2\2\u0afc\u0b02\7N\2\2\u0afd\u0afe\7M\2\2\u0afe"+
		"\u0aff\5\u01b8\u00dd\2\u0aff\u0b00\7N\2\2\u0b00\u0b02\3\2\2\2\u0b01\u0af7"+
		"\3\2\2\2\u0b01\u0af8\3\2\2\2\u0b01\u0afd\3\2\2\2\u0b02\u01b7\3\2\2\2\u0b03"+
		"\u0b08\5\u01f0\u00f9\2\u0b04\u0b05\7T\2\2\u0b05\u0b07\5\u01f0\u00f9\2"+
		"\u0b06\u0b04\3\2\2\2\u0b07\u0b0a\3\2\2\2\u0b08\u0b06\3\2\2\2\u0b08\u0b09"+
		"\3\2\2\2\u0b09\u01b9\3\2\2\2\u0b0a\u0b08\3\2\2\2\u0b0b\u0b0e\5\u01b2\u00da"+
		"\2\u0b0c\u0b0e\5\u0108\u0085\2\u0b0d\u0b0b\3\2\2\2\u0b0d\u0b0c\3\2\2\2"+
		"\u0b0e\u01bb\3\2\2\2\u0b0f\u0b12\5\u01c4\u00e3\2\u0b10\u0b12\5\u01be\u00e0"+
		"\2\u0b11\u0b0f\3\2\2\2\u0b11\u0b10\3\2\2\2\u0b12\u01bd\3\2\2\2\u0b13\u0b14"+
		"\5\u01c0\u00e1\2\u0b14\u0b15\5\u01c2\u00e2\2\u0b15\u0b16\5\u01b2\u00da"+
		"\2\u0b16\u01bf\3\2\2\2\u0b17\u0b1b\5<\37\2\u0b18\u0b1b\5\u0190\u00c9\2"+
		"\u0b19\u0b1b\5\u0196\u00cc\2\u0b1a\u0b17\3\2\2\2\u0b1a\u0b18\3\2\2\2\u0b1a"+
		"\u0b19\3\2\2\2\u0b1b\u01c1\3\2\2\2\u0b1c\u0b1d\t\6\2\2\u0b1d\u01c3\3\2"+
		"\2\2\u0b1e\u0b28\5\u01c6\u00e4\2\u0b1f\u0b20\5\u01c6\u00e4\2\u0b20\u0b21"+
		"\7^\2\2\u0b21\u0b22\5\u01b2\u00da\2\u0b22\u0b25\7_\2\2\u0b23\u0b26\5\u01c4"+
		"\u00e3\2\u0b24\u0b26\5\u01b4\u00db\2\u0b25\u0b23\3\2\2\2\u0b25\u0b24\3"+
		"\2\2\2\u0b26\u0b28\3\2\2\2\u0b27\u0b1e\3\2\2\2\u0b27\u0b1f\3\2\2\2\u0b28"+
		"\u01c5\3\2\2\2\u0b29\u0b2a\b\u00e4\1\2\u0b2a\u0b2b\5\u01c8\u00e5\2\u0b2b"+
		"\u0b31\3\2\2\2\u0b2c\u0b2d\f\3\2\2\u0b2d\u0b2e\7f\2\2\u0b2e\u0b30\5\u01c8"+
		"\u00e5\2\u0b2f\u0b2c\3\2\2\2\u0b30\u0b33\3\2\2\2\u0b31\u0b2f\3\2\2\2\u0b31"+
		"\u0b32\3\2\2\2\u0b32\u01c7\3\2\2\2\u0b33\u0b31\3\2\2\2\u0b34\u0b35\b\u00e5"+
		"\1\2\u0b35\u0b36\5\u01ca\u00e6\2\u0b36\u0b46\3\2\2\2\u0b37\u0b38\f\4\2"+
		"\2\u0b38\u0b39\7e\2\2\u0b39\u0b45\5\u01ca\u00e6\2\u0b3a\u0b3b\f\3\2\2"+
		"\u0b3b\u0b3d\7e\2\2\u0b3c\u0b3e\7m\2\2\u0b3d\u0b3c\3\2\2\2\u0b3e\u0b3f"+
		"\3\2\2\2\u0b3f\u0b3d\3\2\2\2\u0b3f\u0b40\3\2\2\2\u0b40\u0b41\3\2\2\2\u0b41"+
		"\u0b42\5\u01ca\u00e6\2\u0b42\u0b43\b\u00e5\1\2\u0b43\u0b45\3\2\2\2\u0b44"+
		"\u0b37\3\2\2\2\u0b44\u0b3a\3\2\2\2\u0b45\u0b48\3\2\2\2\u0b46\u0b44\3\2"+
		"\2\2\u0b46\u0b47\3\2\2\2\u0b47\u01c9\3\2\2\2\u0b48\u0b46\3\2\2\2\u0b49"+
		"\u0b4a\b\u00e6\1\2\u0b4a\u0b4b\5\u01cc\u00e7\2\u0b4b\u0b51\3\2\2\2\u0b4c"+
		"\u0b4d\f\3\2\2\u0b4d\u0b4e\7n\2\2\u0b4e\u0b50\5\u01cc\u00e7\2\u0b4f\u0b4c"+
		"\3\2\2\2\u0b50\u0b53\3\2\2\2\u0b51\u0b4f\3\2\2\2\u0b51\u0b52\3\2\2\2\u0b52"+
		"\u01cb\3\2\2\2\u0b53\u0b51\3\2\2\2\u0b54\u0b55\b\u00e7\1\2\u0b55\u0b56"+
		"\5\u01ce\u00e8\2\u0b56\u0b5c\3\2\2\2\u0b57\u0b58\f\3\2\2\u0b58\u0b59\7"+
		"o\2\2\u0b59\u0b5b\5\u01ce\u00e8\2\u0b5a\u0b57\3\2\2\2\u0b5b\u0b5e\3\2"+
		"\2\2\u0b5c\u0b5a\3\2\2\2\u0b5c\u0b5d\3\2\2\2\u0b5d\u01cd\3\2\2\2\u0b5e"+
		"\u0b5c\3\2\2\2\u0b5f\u0b60\b\u00e8\1\2\u0b60\u0b61\5\u01d0\u00e9\2\u0b61"+
		"\u0b67\3\2\2\2\u0b62\u0b63\f\3\2\2\u0b63\u0b64\7m\2\2\u0b64\u0b66\5\u01d0"+
		"\u00e9\2\u0b65\u0b62\3\2\2\2\u0b66\u0b69\3\2\2\2\u0b67\u0b65\3\2\2\2\u0b67"+
		"\u0b68\3\2\2\2\u0b68\u01cf\3\2\2\2\u0b69\u0b67\3\2\2\2\u0b6a\u0b6b\b\u00e9"+
		"\1\2\u0b6b\u0b6c\5\u01d2\u00ea\2\u0b6c\u0b75\3\2\2\2\u0b6d\u0b6e\f\4\2"+
		"\2\u0b6e\u0b6f\7a\2\2\u0b6f\u0b74\5\u01d2\u00ea\2\u0b70\u0b71\f\3\2\2"+
		"\u0b71\u0b72\7d\2\2\u0b72\u0b74\5\u01d2\u00ea\2\u0b73\u0b6d\3\2\2\2\u0b73"+
		"\u0b70\3\2\2\2\u0b74\u0b77\3\2\2\2\u0b75\u0b73\3\2\2\2\u0b75\u0b76\3\2"+
		"\2\2\u0b76\u01d1\3\2\2\2\u0b77\u0b75\3\2\2\2\u0b78\u0b79\b\u00ea\1\2\u0b79"+
		"\u0b7a\5\u01d4\u00eb\2\u0b7a\u0b8c\3\2\2\2\u0b7b\u0b7c\f\7\2\2\u0b7c\u0b7d"+
		"\7[\2\2\u0b7d\u0b8b\5\u01d4\u00eb\2\u0b7e\u0b7f\f\6\2\2\u0b7f\u0b80\7"+
		"Z\2\2\u0b80\u0b8b\5\u01d4\u00eb\2\u0b81\u0b82\f\5\2\2\u0b82\u0b83\7b\2"+
		"\2\u0b83\u0b8b\5\u01d4\u00eb\2\u0b84\u0b85\f\4\2\2\u0b85\u0b86\7c\2\2"+
		"\u0b86\u0b8b\5\u01d4\u00eb\2\u0b87\u0b88\f\3\2\2\u0b88\u0b89\7*\2\2\u0b89"+
		"\u0b8b\5\f\7\2\u0b8a\u0b7b\3\2\2\2\u0b8a\u0b7e\3\2\2\2\u0b8a\u0b81\3\2"+
		"\2\2\u0b8a\u0b84\3\2\2\2\u0b8a\u0b87\3\2\2\2\u0b8b\u0b8e\3\2\2\2\u0b8c"+
		"\u0b8a\3\2\2\2\u0b8c\u0b8d\3\2\2\2\u0b8d\u01d3\3\2\2\2\u0b8e\u0b8c\3\2"+
		"\2\2\u0b8f\u0b90\b\u00eb\1\2\u0b90\u0b91\5\u01d6\u00ec\2\u0b91\u0ba1\3"+
		"\2\2\2\u0b92\u0b93\f\5\2\2\u0b93\u0b94\7[\2\2\u0b94\u0b95\7[\2\2\u0b95"+
		"\u0ba0\5\u01d6\u00ec\2\u0b96\u0b97\f\4\2\2\u0b97\u0b98\7Z\2\2\u0b98\u0b99"+
		"\7Z\2\2\u0b99\u0ba0\5\u01d6\u00ec\2\u0b9a\u0b9b\f\3\2\2\u0b9b\u0b9c\7"+
		"Z\2\2\u0b9c\u0b9d\7Z\2\2\u0b9d\u0b9e\7Z\2\2\u0b9e\u0ba0\5\u01d6\u00ec"+
		"\2\u0b9f\u0b92\3\2\2\2\u0b9f\u0b96\3\2\2\2\u0b9f\u0b9a\3\2\2\2\u0ba0\u0ba3"+
		"\3\2\2\2\u0ba1\u0b9f\3\2\2\2\u0ba1\u0ba2\3\2\2\2\u0ba2\u01d5\3\2\2\2\u0ba3"+
		"\u0ba1\3\2\2\2\u0ba4\u0ba5\b\u00ec\1\2\u0ba5\u0ba6\5\u01d8\u00ed\2\u0ba6"+
		"\u0baf\3\2\2\2\u0ba7\u0ba8\f\4\2\2\u0ba8\u0ba9\7i\2\2\u0ba9\u0bae\5\u01d8"+
		"\u00ed\2\u0baa\u0bab\f\3\2\2\u0bab\u0bac\7j\2\2\u0bac\u0bae\5\u01d8\u00ed"+
		"\2\u0bad\u0ba7\3\2\2\2\u0bad\u0baa\3\2\2\2\u0bae\u0bb1\3\2\2\2\u0baf\u0bad"+
		"\3\2\2\2\u0baf\u0bb0\3\2\2\2\u0bb0\u01d7\3\2\2\2\u0bb1\u0baf\3\2\2\2\u0bb2"+
		"\u0bb3\b\u00ed\1\2\u0bb3\u0bb4\5\u01da\u00ee\2\u0bb4\u0bc3\3\2\2\2\u0bb5"+
		"\u0bb6\f\6\2\2\u0bb6\u0bb7\7k\2\2\u0bb7\u0bc2\5\u01da\u00ee\2\u0bb8\u0bb9"+
		"\f\5\2\2\u0bb9\u0bba\7l\2\2\u0bba\u0bc2\5\u01da\u00ee\2\u0bbb\u0bbc\f"+
		"\4\2\2\u0bbc\u0bbd\7p\2\2\u0bbd\u0bc2\5\u01da\u00ee\2\u0bbe\u0bbf\f\3"+
		"\2\2\u0bbf\u0bc0\7i\2\2\u0bc0\u0bc2\b\u00ed\1\2\u0bc1\u0bb5\3\2\2\2\u0bc1"+
		"\u0bb8\3\2\2\2\u0bc1\u0bbb\3\2\2\2\u0bc1\u0bbe\3\2\2\2\u0bc2\u0bc5\3\2"+
		"\2\2\u0bc3\u0bc1\3\2\2\2\u0bc3\u0bc4\3\2\2\2\u0bc4\u01d9\3\2\2\2\u0bc5"+
		"\u0bc3\3\2\2\2\u0bc6\u0bce\5\u01dc\u00ef\2\u0bc7\u0bce\5\u01de\u00f0\2"+
		"\u0bc8\u0bc9\7i\2\2\u0bc9\u0bce\5\u01da\u00ee\2\u0bca\u0bcb\7j\2\2\u0bcb"+
		"\u0bce\5\u01da\u00ee\2\u0bcc\u0bce\5\u01e0\u00f1\2\u0bcd\u0bc6\3\2\2\2"+
		"\u0bcd\u0bc7\3\2\2\2\u0bcd\u0bc8\3\2\2\2\u0bcd\u0bca\3\2\2\2\u0bcd\u0bcc"+
		"\3\2\2\2\u0bce\u01db\3\2\2\2\u0bcf\u0bd0\7g\2\2\u0bd0\u0bd1\5\u01da\u00ee"+
		"\2\u0bd1\u01dd\3\2\2\2\u0bd2\u0bd3\7h\2\2\u0bd3\u0bd4\5\u01da\u00ee\2"+
		"\u0bd4\u01df\3\2\2\2\u0bd5\u0bdc\5\u01e2\u00f2\2\u0bd6\u0bd7\7]\2\2\u0bd7"+
		"\u0bdc\5\u01da\u00ee\2\u0bd8\u0bd9\7\\\2\2\u0bd9\u0bdc\5\u01da\u00ee\2"+
		"\u0bda\u0bdc\5\u01ec\u00f7\2\u0bdb\u0bd5\3\2\2\2\u0bdb\u0bd6\3\2\2\2\u0bdb"+
		"\u0bd8\3\2\2\2\u0bdb\u0bda\3\2\2\2\u0bdc\u01e1\3\2\2\2\u0bdd\u0be0\5\u0172"+
		"\u00ba\2\u0bde\u0be0\5<\37\2\u0bdf\u0bdd\3\2\2\2\u0bdf\u0bde\3\2\2\2\u0be0"+
		"\u0be5\3\2\2\2\u0be1\u0be4\5\u01e6\u00f4\2\u0be2\u0be4\5\u01ea\u00f6\2"+
		"\u0be3\u0be1\3\2\2\2\u0be3\u0be2\3\2\2\2\u0be4\u0be7\3\2\2\2\u0be5\u0be3"+
		"\3\2\2\2\u0be5\u0be6\3\2\2\2\u0be6\u01e3\3\2\2\2\u0be7\u0be5\3\2\2\2\u0be8"+
		"\u0be9\5\u01e2\u00f2\2\u0be9\u0bea\7g\2\2\u0bea\u01e5\3\2\2\2\u0beb\u0bec"+
		"\7g\2\2\u0bec\u01e7\3\2\2\2\u0bed\u0bee\5\u01e2\u00f2\2\u0bee\u0bef\7"+
		"h\2\2\u0bef\u01e9\3\2\2\2\u0bf0\u0bf1\7h\2\2\u0bf1\u01eb\3\2\2\2\u0bf2"+
		"\u0bf3\7M\2\2\u0bf3\u0bf4\5\4\3\2\u0bf4\u0bf5\7N\2\2\u0bf5\u0bf6\5\u01da"+
		"\u00ee\2\u0bf6\u0c0e\3\2\2\2\u0bf7\u0bf8\7M\2\2\u0bf8\u0bfc\5\f\7\2\u0bf9"+
		"\u0bfb\5(\25\2\u0bfa\u0bf9\3\2\2\2\u0bfb\u0bfe\3\2\2\2\u0bfc\u0bfa\3\2"+
		"\2\2\u0bfc\u0bfd\3\2\2\2\u0bfd\u0bff\3\2\2\2\u0bfe\u0bfc\3\2\2\2\u0bff"+
		"\u0c00\7N\2\2\u0c00\u0c01\5\u01e0\u00f1\2\u0c01\u0c0e\3\2\2\2\u0c02\u0c03"+
		"\7M\2\2\u0c03\u0c07\5\f\7\2\u0c04\u0c06\5(\25\2\u0c05\u0c04\3\2\2\2\u0c06"+
		"\u0c09\3\2\2\2\u0c07\u0c05\3\2\2\2\u0c07\u0c08\3\2\2\2\u0c08\u0c0a\3\2"+
		"\2\2\u0c09\u0c07\3\2\2\2\u0c0a\u0c0b\7N\2\2\u0c0b\u0c0c\5\u01b4\u00db"+
		"\2\u0c0c\u0c0e\3\2\2\2\u0c0d\u0bf2\3\2\2\2\u0c0d\u0bf7\3\2\2\2\u0c0d\u0c02"+
		"\3\2\2\2\u0c0e\u01ed\3\2\2\2\u0c0f\u0c10\7E\2\2\u0c10\u0c20\7\17\2\2\u0c11"+
		"\u0c12\7E\2\2\u0c12\u0c20\b\u00f8\1\2\u0c13\u0c14\7E\2\2\u0c14\u0c15\7"+
		"S\2\2\u0c15\u0c20\b\u00f8\1\2\u0c16\u0c17\7E\2\2\u0c17\u0c18\7\20\2\2"+
		"\u0c18\u0c20\b\u00f8\1\2\u0c19\u0c1a\7E\2\2\u0c1a\u0c1b\7M\2\2\u0c1b\u0c1c"+
		"\5\u01a2\u00d2\2\u0c1c\u0c1d\7\r\2\2\u0c1d\u0c1e\b\u00f8\1\2\u0c1e\u0c20"+
		"\3\2\2\2\u0c1f\u0c0f\3\2\2\2\u0c1f\u0c11\3\2\2\2\u0c1f\u0c13\3\2\2\2\u0c1f"+
		"\u0c16\3\2\2\2\u0c1f\u0c19\3\2\2\2\u0c20\u01ef\3\2\2\2\u0c21\u0c22\t\7"+
		"\2\2\u0c22\u01f1\3\2\2\2\u0161\u01f7\u01fe\u0202\u0206\u020f\u0213\u0217"+
		"\u0219\u021f\u0224\u022b\u0230\u0232\u0238\u023d\u0242\u0247\u0252\u0260"+
		"\u0265\u026d\u0274\u027a\u027f\u028a\u028d\u029b\u02a0\u02a5\u02aa\u02b0"+
		"\u02ba\u02c5\u02cd\u02d7\u02df\u02eb\u02f3\u02f6\u02fb\u0301\u0309\u0311"+
		"\u031e\u033b\u0340\u0344\u034c\u0355\u0363\u0366\u0372\u0375\u0385\u038a"+
		"\u0390\u0395\u039b\u039e\u03a1\u03ad\u03b8\u03c6\u03cd\u03d6\u03dd\u03e2"+
		"\u03f1\u03f8\u03fe\u0402\u0406\u040a\u040e\u0413\u0417\u041b\u041d\u0422"+
		"\u0429\u042e\u0430\u0436\u043b\u043f\u0452\u0457\u0467\u046c\u0472\u0478"+
		"\u047a\u047e\u0483\u0487\u048f\u0496\u049e\u04a1\u04a6\u04ae\u04b3\u04ba"+
		"\u04c1\u04c6\u04cd\u04d9\u04de\u04e2\u04ec\u04f1\u04f9\u04fc\u0501\u0509"+
		"\u050c\u0511\u0516\u051b\u0520\u0527\u052c\u0534\u0539\u053e\u0543\u0549"+
		"\u054f\u0552\u0555\u055e\u0564\u056a\u056d\u0570\u0578\u057d\u0582\u0588"+
		"\u058b\u0596\u059f\u05a9\u05ae\u05b9\u05be\u05cb\u05d0\u05dc\u05e6\u05eb"+
		"\u05f3\u05f6\u05fd\u0605\u060b\u0614\u061e\u0622\u0625\u062e\u063c\u063f"+
		"\u0648\u064d\u0652\u0657\u065b\u0660\u0668\u0674\u067b\u0689\u069e\u06a8"+
		"\u06b6\u06d8\u06e4\u06ea\u06f5\u0701\u071b\u071f\u0724\u0728\u072c\u0734"+
		"\u0738\u073c\u0743\u074c\u0754\u0763\u076f\u0775\u0793\u0798\u079b\u07ae"+
		"\u07b3\u07b8\u07c3\u07ce\u07d8\u07db\u07e0\u07e9\u07ef\u07f8\u07fc\u0800"+
		"\u0805\u0818\u0822\u0838\u083f\u0847\u084f\u085a\u0877\u087f\u0889\u0894"+
		"\u08aa\u08af\u08b5\u08bd\u08c1\u08c6\u08ce\u08d4\u08d8\u08dc\u08e0\u08e6"+
		"\u08eb\u08f0\u08f4\u08f8\u08fe\u0903\u0908\u090c\u0910\u0912\u0917\u091c"+
		"\u0921\u0925\u0929\u092d\u0932\u093a\u0940\u0944\u0948\u094c\u0952\u0957"+
		"\u095c\u0960\u0964\u0966\u096b\u097a\u0988\u0994\u099d\u09ac\u09b9\u09c2"+
		"\u09c8\u09cf\u09d4\u09db\u09e0\u09e7\u09ec\u09f3\u09f8\u0a01\u0a06\u0a0a"+
		"\u0a0e\u0a13\u0a1a\u0a21\u0a26\u0a2d\u0a32\u0a39\u0a3e\u0a47\u0a4c\u0a50"+
		"\u0a57\u0a5d\u0a64\u0a6b\u0a72\u0a7a\u0a81\u0a89\u0a8d\u0a94\u0a9b\u0aa2"+
		"\u0aaa\u0ab1\u0ab9\u0abf\u0ac5\u0ad1\u0ad6\u0adb\u0aed\u0af1\u0afa\u0b01"+
		"\u0b08\u0b0d\u0b11\u0b1a\u0b25\u0b27\u0b31\u0b3f\u0b44\u0b46\u0b51\u0b5c"+
		"\u0b67\u0b73\u0b75\u0b8a\u0b8c\u0b9f\u0ba1\u0bad\u0baf\u0bc1\u0bc3\u0bcd"+
		"\u0bdb\u0bdf\u0be3\u0be5\u0bfc\u0c07\u0c0d\u0c1f";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}