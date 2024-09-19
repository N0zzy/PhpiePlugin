package com.n0zzy.phpie.colors;

import com.esotericsoftware.kryo.kryo5.util.Null;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.n0zzy.phpie.highlighter.PhpieSyntaxHighlighter;
import com.n0zzy.phpie.icons.PhpiePhpIcon;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Map;

public class PhpieColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Tag", PhpieSyntaxHighlighter.TAG),
            new AttributesDescriptor("Token", PhpieSyntaxHighlighter.TOKEN),
            new AttributesDescriptor("Keyword", PhpieSyntaxHighlighter.KEYWORD),
    };

    @Override
    public Icon getIcon() {
        return PhpiePhpIcon.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new PhpieSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return """
            <?php
            namespace N0zzy;
            use N0zzy\\Phpie;

        """;
    }

    @Null
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Phpie";
    }
}
