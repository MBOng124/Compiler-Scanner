// Generated from /Users/rachs/Documents/GitHub/Compiler-Scanner/src/java.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link javaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface javaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link javaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(javaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(javaParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(javaParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(javaParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(javaParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(javaParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(javaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(javaParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(javaParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(javaParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(javaParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(javaParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(javaParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(javaParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(javaParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(javaParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(javaParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(javaParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(javaParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(javaParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(javaParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(javaParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(javaParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(javaParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(javaParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#moduleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleName(javaParser.ModuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(javaParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(javaParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(javaParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(javaParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(javaParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(javaParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(javaParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinaryCompilation(javaParser.OrdinaryCompilationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#modularCompilation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModularCompilation(javaParser.ModularCompilationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(javaParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(javaParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(javaParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(javaParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(javaParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(javaParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(javaParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(javaParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(javaParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective(javaParser.ModuleDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#requiresModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiresModifier(javaParser.RequiresModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(javaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(javaParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(javaParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(javaParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(javaParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(javaParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(javaParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(javaParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(javaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(javaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(javaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(javaParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(javaParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(javaParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(javaParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(javaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(javaParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(javaParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(javaParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(javaParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(javaParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(javaParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(javaParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(javaParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(javaParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(javaParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(javaParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(javaParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(javaParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(javaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(javaParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(javaParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(javaParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(javaParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(javaParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(javaParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(javaParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(javaParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(javaParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(javaParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(javaParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(javaParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(javaParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(javaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(javaParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(javaParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(javaParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(javaParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(javaParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(javaParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(javaParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(javaParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(javaParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(javaParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(javaParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(javaParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(javaParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(javaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(javaParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(javaParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(javaParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(javaParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(javaParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(javaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(javaParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(javaParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(javaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(javaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(javaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(javaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(javaParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(javaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(javaParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(javaParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(javaParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(javaParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(javaParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(javaParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(javaParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(javaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(javaParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(javaParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(javaParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(javaParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(javaParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(javaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(javaParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(javaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(javaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(javaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(javaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(javaParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(javaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(javaParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(javaParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(javaParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(javaParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#displayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayStatement(javaParser.DisplayStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(javaParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(javaParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(javaParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(javaParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(javaParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(javaParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(javaParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(javaParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(javaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(javaParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(javaParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(javaParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(javaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(javaParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(javaParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(javaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(javaParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(javaParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(javaParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(javaParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(javaParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(javaParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(javaParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(javaParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(javaParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(javaParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(javaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(javaParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(javaParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(javaParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(javaParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(javaParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(javaParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(javaParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(javaParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(javaParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(javaParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(javaParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(javaParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#variableAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAccess(javaParser.VariableAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(javaParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(javaParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(javaParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(javaParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(javaParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(javaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(javaParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassLiteral(javaParser.ClassLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(javaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(javaParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(javaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(javaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(javaParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(javaParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(javaParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(javaParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(javaParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(javaParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(javaParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(javaParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(javaParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(javaParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(javaParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(javaParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(javaParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(javaParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(javaParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(javaParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(javaParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(javaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(javaParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(javaParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(javaParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(javaParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(javaParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(javaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(javaParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(javaParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(javaParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(javaParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(javaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(javaParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(javaParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(javaParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(javaParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(javaParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(javaParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(javaParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(javaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(javaParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(javaParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(javaParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(javaParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(javaParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(javaParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(javaParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(javaParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(javaParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(javaParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(javaParser.IdentifierContext ctx);
}