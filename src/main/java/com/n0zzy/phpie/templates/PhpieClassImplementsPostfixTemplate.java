package com.n0zzy.phpie.templates;

import com.intellij.codeInsight.template.postfix.templates.PostfixTemplate;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class PhpieClassImplementsPostfixTemplate extends PostfixTemplate {
    public PhpieClassImplementsPostfixTemplate(PhpiePostfixTemplateProvider phpiePostfixTemplateProvider) {
        super( "!classi", "!classi", "class Name implements Interface1, Interface2 {}", phpiePostfixTemplateProvider);
    }

    @Override
    public boolean isApplicable(@NotNull PsiElement context, @NotNull Document copyDocument, int newOffset) {
        return true;
    }

    @Override
    public void expand(@NotNull PsiElement context, @NotNull Editor editor) {
        String expression = context.getText();
        String newCode = expression + "class Name implements Interface1, Interface2 {}";
        editor.getDocument().replaceString(context.getTextRange().getStartOffset(), context.getTextRange().getEndOffset(), newCode);
    }
}
