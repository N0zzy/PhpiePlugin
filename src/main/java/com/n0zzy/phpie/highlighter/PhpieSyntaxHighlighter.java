package com.n0zzy.phpie.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.n0zzy.phpie.lexer.PhpieLexerAdapter;
import com.n0zzy.sdk.language.psi.PhpieTypes;
import org.jetbrains.annotations.NotNull;


import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class PhpieSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey TAG = createTextAttributesKey("PHPIE_TAG");
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("PHPIE_KEYWORD",
            DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("PHPIE_NUMBER",
            DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey ASSIGN = createTextAttributesKey("PHPIE_ASSIGN",
            DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey ALIAS = createTextAttributesKey("PHPIE_ALIAS",
            DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey OPERATOR = createTextAttributesKey("PHPIE_OPERATOR",
            DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey STRING = createTextAttributesKey("PHPIE_STRING",
            DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey REGEXP = createTextAttributesKey("PHPIE_REGEXP",
            DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey RULE = createTextAttributesKey("PHPIE_RULE",
            DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    public static final TextAttributesKey TOKEN = createTextAttributesKey("PHPIE_TOKEN",
            DefaultLanguageHighlighterColors.GLOBAL_VARIABLE);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("PHPIE_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARS = createTextAttributesKey("PHPIE_BAD_CHARS",
            HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] TAG_KEYS = new TextAttributesKey[]{TAG};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] ASSIGN_KEYS = new TextAttributesKey[]{ASSIGN};
    private static final TextAttributesKey[] ALIAS_KEYS = new TextAttributesKey[]{ALIAS};
    private static final TextAttributesKey[] OPERATORS_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] REGEXP_KEYS = new TextAttributesKey[]{REGEXP};
    private static final TextAttributesKey[] RULE_KEYS = new TextAttributesKey[]{RULE};
    private static final TextAttributesKey[] TOKEN_KEYS = new TextAttributesKey[]{TOKEN};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARS};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new PhpieLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if( tokenType.equals(PhpieTypes.TAG_OPEN) ) {
            return TAG_KEYS;
        }
        else if( tokenType.equals(PhpieTypes.IDENTIFIER) ) {
            return TOKEN_KEYS;
        }
        else if (
            tokenType.equals(PhpieTypes.NAMESPACE_KEYWORD) ||
            tokenType.equals(PhpieTypes.USE_KEYWORD) ||
            tokenType.equals(PhpieTypes.AS_KEYWORD)
        ) {
            return KEYWORD_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }
}
