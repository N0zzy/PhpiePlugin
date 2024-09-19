package com.n0zzy.phpie.templates;

import com.intellij.codeInsight.template.postfix.templates.PostfixTemplate;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class PhpieOpenTagPostfixTemplate extends PostfixTemplate {
    public PhpieOpenTagPostfixTemplate(PhpiePostfixTemplateProvider phpiePostfixTemplateProvider) {
        super( "!php", "!php", "<?php ", phpiePostfixTemplateProvider);
    }

    @Override
    public boolean isApplicable(@NotNull PsiElement context, @NotNull Document copyDocument, int newOffset) {
        return true;
    }

    @Override
    public void expand(@NotNull PsiElement context, @NotNull Editor editor) {
        //String expression = context.getText();
        String newCode = "<?php\n";
        editor.getDocument().replaceString(context.getTextRange().getStartOffset(), context.getTextRange().getEndOffset(), newCode);
    }
}
