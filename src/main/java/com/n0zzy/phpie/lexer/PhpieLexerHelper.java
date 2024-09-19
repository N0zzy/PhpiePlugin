package com.n0zzy.phpie.lexer;

import com.intellij.psi.tree.IElementType;

abstract public class PhpieLexerHelper {
    protected int tokenStart = 0;
    protected int tokenLength = 0;


    public IElementType token(IElementType type, int start, int length) {
        tokenStart = start;
        tokenLength = length;
        return type;
    }
}
