package com.n0zzy.phpie.templates;

import com.intellij.codeInsight.template.postfix.templates.PostfixTemplate;
import com.intellij.codeInsight.template.postfix.templates.PostfixTemplateProvider;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class PhpiePostfixTemplateProvider  implements PostfixTemplateProvider {

    private final Set<PostfixTemplate> templates = new HashSet<>();

    public PhpiePostfixTemplateProvider() {
        templates.add(new PhpieOpenTagPostfixTemplate(this));
        templates.add(new PhpieNamespaceInlinePostfixTemplate(this));
        templates.add(new PhpieNamespaceBlockPostfixTemplate(this));
        templates.add(new PhpieClassSimplePostfixTemplate(this));
        templates.add(new PhpieClassExtendsPostfixTemplate(this));
        templates.add(new PhpieClassImplementsPostfixTemplate(this));
        templates.add(new PhpieClassFullPostfixTemplate(this));
    }


    @NotNull
    @Override
    public Set<PostfixTemplate> getTemplates() {
        return templates;
    }

    @Override
    public boolean isTerminalSymbol(char currentChar) {
        return currentChar == '!';
    }

    @Override
    public void preExpand(@NotNull PsiFile file, @NotNull Editor editor) {

    }

    @Override
    public void afterExpand(@NotNull PsiFile file, @NotNull Editor editor) {

    }

    @Override
    public @NotNull PsiFile preCheck(@NotNull PsiFile copyFile, @NotNull Editor realEditor, int currentOffset) {
        return copyFile;
    }
}
