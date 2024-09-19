package com.n0zzy.phpie.lexer;

import com.intellij.lexer.FlexAdapter;
public class PhpieLexerAdapter  extends FlexAdapter {
    public PhpieLexerAdapter() {
        super(new _PhpieLexer(null));
    }
}
