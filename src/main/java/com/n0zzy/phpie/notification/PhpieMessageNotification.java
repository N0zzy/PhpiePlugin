package com.n0zzy.phpie.notification;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.Project;


@SuppressWarnings("ALL")
public class PhpieMessageNotification {
    public PhpieMessageNotification(Project project, String message){
        final Notification notification = new Notification(
                "ProjectOpenNotification",
                "Phpie",
                message,
                NotificationType.INFORMATION);
        notification.notify(project);
    }
}