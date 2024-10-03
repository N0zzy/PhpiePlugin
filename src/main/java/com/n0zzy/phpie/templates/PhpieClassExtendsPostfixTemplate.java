package com.n0zzy.phpie.templates;

import com.intellij.codeInsight.template.postfix.templates.PostfixTemplate;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class PhpieClassExtendsPostfixTemplate extends PostfixTemplate {
    public PhpieClassExtendsPostfixTemplate(PhpiePostfixTemplateProvider phpiePostfixTemplateProvider) {
        super( "!classe", "!classe", "class Child extends Parent {}", phpiePostfixTemplateProvider);
    }

    @Override
    public boolean isApplicable(@NotNull PsiElement context, @NotNull Document copyDocument, int newOffset) {
        return true;
    }

    @Override
    public void expand(@NotNull PsiElement context, @NotNull Editor editor) {
        String expression = context.getText();
        String newCode = expression + "class Child extends Parent {}";
        editor.getDocument().replaceString(context.getTextRange().getStartOffset(), context.getTextRange().getEndOffset(), newCode);
    }
}
