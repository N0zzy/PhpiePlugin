package com.n0zzy.phpie.parser.defenition;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.n0zzy.phpie.language.PhpieFile;
import com.n0zzy.phpie.language.PhpieLanguage;
import com.n0zzy.phpie.lexer.PhpieLexerAdapter;
import com.n0zzy.sdk.language.psi.PhpieTypes;
import com.n0zzy.phpie.parser.PhpieParser;
import org.jetbrains.annotations.NotNull;

public class PhpieParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(PhpieLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new PhpieLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new PhpieParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new PhpieFile(viewProvider);
    }


    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return PhpieTypes.Factory.createElement(node);
    }
}
