package com.n0zzy.phpie.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import com.n0zzy.phpie.icons.PhpiePhpIcon;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class PhpieFileType extends LanguageFileType {

    public static final PhpieFileType INSTANCE = new PhpieFileType();

    protected PhpieFileType() {
        super(PhpieLanguage.INSTANCE);
    }


    @Override
    public @NonNls @NotNull String getName() {
        return "Phpie(PHP)";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "Phpie";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "php";
    }

    @Override
    public Icon getIcon() {
        return PhpiePhpIcon.FILE;
    }
}
