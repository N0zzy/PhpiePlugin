package com.n0zzy.phpie.components;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.wm.StatusBarWidget;
import com.intellij.openapi.wm.impl.status.widget.StatusBarEditorBasedWidgetFactory;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PhpieWidgetFactory extends StatusBarEditorBasedWidgetFactory {
    @Override
    public @NotNull @NonNls String getId() {
        return "Phpie";
    }

    @Override
    public @NotNull @NlsContexts.ConfigurableName String getDisplayName() {
        return "Phpie";
    }

    @Override
    public @NotNull StatusBarWidget createWidget(@NotNull Project project) {
        return new PhpieWidget( project );
    }

    @Override
    public void disposeWidget(@NotNull StatusBarWidget widget) {
        super.disposeWidget(widget);
    }
}
