package com.n0zzy.phpie.templates;

import com.intellij.codeInsight.template.postfix.templates.PostfixTemplate;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class PhpieClassSimplePostfixTemplate extends PostfixTemplate {
    public PhpieClassSimplePostfixTemplate(PhpiePostfixTemplateProvider phpiePostfixTemplateProvider) {
        super( "!class", "!class", "class Name {}", phpiePostfixTemplateProvider);
    }

    @Override
    public boolean isApplicable(@NotNull PsiElement context, @NotNull Document copyDocument, int newOffset) {
        return true;
    }

    @Override
    public void expand(@NotNull PsiElement context, @NotNull Editor editor) {
        String expression = context.getText();
        String newCode = expression + "namespace Name {}";
        editor.getDocument().replaceString(context.getTextRange().getStartOffset(), context.getTextRange().getEndOffset(), newCode);
    }
}
