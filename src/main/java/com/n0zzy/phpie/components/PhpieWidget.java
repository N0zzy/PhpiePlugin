package com.n0zzy.phpie.components;

import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.popup.ListPopup;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.StatusBarWidget;
import com.intellij.openapi.wm.impl.status.EditorBasedStatusBarPopup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PhpieWidget extends EditorBasedStatusBarPopup {

    public PhpieWidget(@NotNull Project project) {
        super( project, false);
    }

    @Override
    protected @NotNull StatusBarWidget createInstance(@NotNull Project project) {
        return null;
    }

    @Override
    protected @NotNull WidgetState getWidgetState(@Nullable VirtualFile virtualFile) {
        return new WidgetState("Phpie", "Phpie", true);
    }

    @Override
    protected @Nullable ListPopup createPopup(@NotNull DataContext dataContext) {
        return null;
    }

    @Override
    public @NotNull String ID() {
        return "Phpie";
    }
}
