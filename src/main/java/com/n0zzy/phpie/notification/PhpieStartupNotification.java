package com.n0zzy.phpie.notification;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.Project;


@SuppressWarnings("ALL")
public class PhpieStartupNotification  {
    public PhpieStartupNotification(Project project){
        final Notification notification = new Notification(
                "ProjectOpenNotification",
                "Phpie",
                "Phpie is running",
                NotificationType.INFORMATION);
        notification.notify(project);
    }
}