package com.n0zzy.phpie.language;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class PhpieFile extends PsiFileBase {
    public PhpieFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, PhpieLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return PhpieFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Phpie(PHP)";
    }
}
