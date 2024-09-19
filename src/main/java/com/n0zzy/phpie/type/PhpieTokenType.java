package com.n0zzy.phpie.type;

import com.intellij.psi.tree.IElementType;
import com.n0zzy.phpie.language.PhpieLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PhpieTokenType extends IElementType {

    public int start = 0;
    public int len = 0;

    public PhpieTokenType(@NonNls @NotNull String debugName) {
        super(debugName, PhpieLanguage.INSTANCE);
    }

    public PhpieTokenType(IElementType elementType,  int start, int len ) {
        super(elementType.toString(), PhpieLanguage.INSTANCE);
        this.start = start;
        this.len = len;
    }

    @Override
    public String toString() {
        return "token: " + super.toString();
    }
}
