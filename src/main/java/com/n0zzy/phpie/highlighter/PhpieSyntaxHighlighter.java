package com.n0zzy.phpie.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.tree.IElementType;
import com.n0zzy.phpie.lexer.PhpieLexerAdapter;
import com.n0zzy.sdk.language.psi.PhpieTypes;
import org.jetbrains.annotations.NotNull;


import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class PhpieSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey TAG = createTextAttributesKey("PHPIE_TAG",
            DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("PHPIE_KEYWORD",
            DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey MODIFIER = createTextAttributesKey("PHPIE_MODIFIER",
            DefaultLanguageHighlighterColors.CLASS_REFERENCE);
    public static final TextAttributesKey ASSIGN = createTextAttributesKey("PHPIE_ASSIGN",
            DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey EXPRESSION = createTextAttributesKey("PHPIE_EXPRESSION",
            DefaultLanguageHighlighterColors.TEMPLATE_LANGUAGE_COLOR);
    public static final TextAttributesKey THIS = createTextAttributesKey("PHPIE_THIS",
            DefaultLanguageHighlighterColors.DOT);
    public static final TextAttributesKey VARIABLE = createTextAttributesKey("PHPIE_VARIABLE",
            DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    public static final TextAttributesKey ALIAS = createTextAttributesKey("PHPIE_ALIAS",
            DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey STRING = createTextAttributesKey("PHPIE_STRING",
            DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey SEPARATOR = createTextAttributesKey("PHPIE_SEPARATOR",
            DefaultLanguageHighlighterColors.MARKUP_ENTITY);
    public static final TextAttributesKey BAD_CHARS = createTextAttributesKey("PHPIE_BAD_CHARS",
            HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey BRACES = createTextAttributesKey("PHPIE_BRACES",
            DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey BRACKETS = createTextAttributesKey("PHPIE_BRACKETS",
            DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey PARENTHESES = createTextAttributesKey("PHPIE_PARENTHESES",
            DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("PHPIE_NUMBER",
            DefaultLanguageHighlighterColors.NUMBER);

    private static final TextAttributesKey[] TAG_KEYS = new TextAttributesKey[]{TAG};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] MODIFIER_KEYS = new TextAttributesKey[]{MODIFIER};
    private static final TextAttributesKey[] ASSIGN_KEYS = new TextAttributesKey[]{ASSIGN};
    private static final TextAttributesKey[] ALIAS_KEYS = new TextAttributesKey[]{ALIAS};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARS};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] EXPRESSION_KEYS = new TextAttributesKey[]{EXPRESSION};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] THIS_KEYS = new TextAttributesKey[]{THIS};
    private static final TextAttributesKey[] VARIABLE_KEYS = new TextAttributesKey[]{VARIABLE};
    private static final TextAttributesKey[] BRACES_KEYS = new TextAttributesKey[]{BRACES};
    private static final TextAttributesKey[] BRACKETS_KEYS = new TextAttributesKey[]{BRACKETS};
    private static final TextAttributesKey[] PARENTHESES_KEYS = new TextAttributesKey[]{PARENTHESES};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};




    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new PhpieLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if( tokenType.equals(PhpieTypes.T_OPEN_TAG) || tokenType.equals(PhpieTypes.T_CLOSE_TAG) ) {
            return TAG_KEYS;
        }
        else if( tokenType.equals(PhpieTypes.K_NAMESPACE) ||
                tokenType.equals(PhpieTypes.K_USE) ||
                tokenType.equals(PhpieTypes.K_CLASS) ||
                tokenType.equals(PhpieTypes.K_FUNCTION) ||
                tokenType.equals(PhpieTypes.K_ENUM) ||
                tokenType.equals(PhpieTypes.K_INTERFACE) ||
                tokenType.equals(PhpieTypes.K_TRAIT) ||
                tokenType.equals(PhpieTypes.K_NEW)
        ) {
            return KEYWORD_KEYS;
        }
        else if( tokenType.equals(PhpieTypes.A_AS) ||
                tokenType.equals(PhpieTypes.A_EXTENDS) ||
                tokenType.equals(PhpieTypes.A_IMPLEMENTS))
        {
            return ALIAS_KEYS;
        }
        else if( tokenType.equals(PhpieTypes.M_ABSTRACT) ||
                tokenType.equals(PhpieTypes.M_FINAL) ||
                tokenType.equals(PhpieTypes.M_PRIVATE) ||
                tokenType.equals(PhpieTypes.M_PROTECTED) ||
                tokenType.equals(PhpieTypes.M_PUBLIC) ||
                tokenType.equals(PhpieTypes.M_STATIC) ||
                tokenType.equals(PhpieTypes.M_SELF)
        ) {
            return MODIFIER_KEYS;
        }
        else if( tokenType.equals(PhpieTypes.C_PIPE) ||
                tokenType.equals(PhpieTypes.C_QUESTION) ||
                tokenType.equals(PhpieTypes.C_ARROW) ||
                tokenType.equals(PhpieTypes.C_DARROW) ||
                tokenType.equals(PhpieTypes.C_COLON) ||
                tokenType.equals(PhpieTypes.C_DCOLON) ||
                tokenType.equals(PhpieTypes.C_BACKSLASH)
        ) {
            return SEPARATOR_KEYS;
        }
        else if( tokenType.equals(PhpieTypes.E_CATCH) ||
                tokenType.equals(PhpieTypes.E_FINALLY) ||
                tokenType.equals(PhpieTypes.E_THROW) ||
                tokenType.equals(PhpieTypes.E_BREAK) ||
                tokenType.equals(PhpieTypes.E_CONTINUE) ||
                tokenType.equals(PhpieTypes.E_RETURN) ||
                tokenType.equals(PhpieTypes.E_GOTO) ||
                tokenType.equals(PhpieTypes.E_DO) ||
                tokenType.equals(PhpieTypes.E_IF) ||
                tokenType.equals(PhpieTypes.E_ELSE) ||
                tokenType.equals(PhpieTypes.E_SWITCH) ||
                tokenType.equals(PhpieTypes.E_CASE) ||
                tokenType.equals(PhpieTypes.E_DEFAULT) ||
                tokenType.equals(PhpieTypes.E_FOR) ||
                tokenType.equals(PhpieTypes.E_FOREACH) ||
                tokenType.equals(PhpieTypes.E_WHILE) )
        {
            return EXPRESSION_KEYS;
        }
        else if( tokenType.equals(PhpieTypes.T_THIS)) {
            return THIS_KEYS;
        }
        else if( tokenType.equals(PhpieTypes.T_VARIABLE)) {
            return VARIABLE_KEYS;
        }
        else if( tokenType.equals(PhpieTypes.C_LBRACE) || tokenType.equals(PhpieTypes.C_RBRACE)) {
            return BRACES_KEYS;
        }
        else if( tokenType.equals(PhpieTypes.C_LBRACKET) || tokenType.equals(PhpieTypes.C_RBRACKET)) {
            return BRACKETS_KEYS;
        }
        else if( tokenType.equals(PhpieTypes.C_LPAREN) || tokenType.equals(PhpieTypes.C_RPAREN)) {
            return PARENTHESES_KEYS;
        }
        else if( tokenType.equals(PhpieTypes.T_DIGIT)) {
            return NUMBER_KEYS;
        }
        return EMPTY_KEYS;
    }
}
