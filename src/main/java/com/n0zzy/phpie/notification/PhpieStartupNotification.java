package com.n0zzy.phpie.notification;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import org.jetbrains.annotations.NotNull;


@SuppressWarnings("ALL")
public class PhpieStartupNotification implements StartupActivity {
    @Override
    public void runActivity(@NotNull Project project) {
        final Notification notification = new Notification(
                "ProjectOpenNotification",
                "Phpie",
                "Phpie is running",
                NotificationType.INFORMATION);
        notification.notify(project);
    }
}