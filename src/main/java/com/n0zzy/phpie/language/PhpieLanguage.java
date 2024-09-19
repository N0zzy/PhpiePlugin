package com.n0zzy.phpie.language;

import com.intellij.lang.Language;

public class PhpieLanguage extends Language {

    public static final PhpieLanguage INSTANCE = new PhpieLanguage();
    public PhpieLanguage() {
        super("Phpie");
    }
}
