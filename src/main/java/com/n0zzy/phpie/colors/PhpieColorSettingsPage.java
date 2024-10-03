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
            new AttributesDescriptor("Keyword", PhpieSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Modifier", PhpieSyntaxHighlighter.MODIFIER),
            new AttributesDescriptor("Alias", PhpieSyntaxHighlighter.ALIAS),
            new AttributesDescriptor("Operator", PhpieSyntaxHighlighter.ASSIGN),
            new AttributesDescriptor("String", PhpieSyntaxHighlighter.STRING),
            new AttributesDescriptor("Separator", PhpieSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Expression", PhpieSyntaxHighlighter.EXPRESSION),
            new AttributesDescriptor("$this", PhpieSyntaxHighlighter.THIS),
            new AttributesDescriptor("Variable", PhpieSyntaxHighlighter.VARIABLE),
            new AttributesDescriptor("Braces", PhpieSyntaxHighlighter.BRACES),
            new AttributesDescriptor("Brackets", PhpieSyntaxHighlighter.BRACKETS),
            new AttributesDescriptor("Parentheses", PhpieSyntaxHighlighter.PARENTHESES),
            new AttributesDescriptor("Number", PhpieSyntaxHighlighter.NUMBER),
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
            namespace N0zzy\\PhpieName;
            use N0zzy\\PhpieClass as N0zzyPhpie;
            class A extends B implements C, D 
            {   
                public static $a = 1;
                public $b = 1;
                public function method() : void {
                    $this->a = 1;
                    self::$b = 1;
                    if(self::$b < 1){
                        do{
                            try {} catch(\\Exception $e) {}
                        } while(self::$b < 1);                  
                    }
                    return;
                }
            }
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
