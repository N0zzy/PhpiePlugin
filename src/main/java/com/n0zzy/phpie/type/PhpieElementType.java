package com.n0zzy.phpie.type;

import com.intellij.psi.tree.IElementType;
import com.n0zzy.phpie.language.PhpieLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PhpieElementType extends IElementType {

    public PhpieElementType(@NotNull @NonNls String debugName) {
        super(debugName, PhpieLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "element: " + super.toString();
    }
}