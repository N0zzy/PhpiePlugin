package com.n0zzy.phpie.contributors;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.n0zzy.sdk.language.psi.PhpieTypes;
import org.jetbrains.annotations.NotNull;

public class PhpieCompletionContributor  extends CompletionContributor {
    private final String[] KEYWORDS = new String[]{
            "namespace ", "use ", "class ", "function ", "interface ", "extends ", "implements ",
            "public ", "protected", "private ", "final ", "abstract ", "const ",
            "if ", "else ", "elseif ", "else if ", "switch ", "case ", "default:", "break;", "continue;"
    };
    public PhpieCompletionContributor() {
        addBrace();
        addSemicolon();
        addKeywords();

    }

    private void addBrace() {
        extend(CompletionType.SMART, PlatformPatterns.psiElement( PhpieTypes.C_LBRACE ), new CompletionProvider<CompletionParameters>() {

            @Override
            protected void addCompletions(@NotNull CompletionParameters parameters, @NotNull ProcessingContext context, @NotNull CompletionResultSet result) {
                result.addElement(LookupElementBuilder.create("{}"));
            }
        });
    }

    private void addSemicolon() {
        extend(CompletionType.SMART, PlatformPatterns.psiElement( PhpieTypes.C_RBRACE  ), new CompletionProvider<CompletionParameters>() {

            @Override
            protected void addCompletions(@NotNull CompletionParameters parameters, @NotNull ProcessingContext context, @NotNull CompletionResultSet result) {
                result.addElement(LookupElementBuilder.create("::"));
            }
        });
    }

    private void addKeywords() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(), new CompletionProvider<CompletionParameters>() {
            public void addCompletions(@NotNull CompletionParameters parameters,
                                       @NotNull ProcessingContext context,
                                       @NotNull CompletionResultSet resultSet) {
                for (String a : KEYWORDS) {
                    resultSet.addElement(LookupElementBuilder.create(a));
                }
            }
        });
    }
}
