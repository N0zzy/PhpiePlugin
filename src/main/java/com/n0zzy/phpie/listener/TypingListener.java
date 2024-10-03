package com.n0zzy.phpie.listener;

import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.event.DocumentEvent;
import com.intellij.openapi.editor.event.DocumentListener;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.FileEditorManagerEvent;
import com.intellij.openapi.fileEditor.FileEditorManagerListener;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.n0zzy.phpie.notification.PhpieMessageNotification;
import com.n0zzy.process.methods.FileMethod;
import org.jetbrains.annotations.NotNull;

public class TypingListener implements DocumentListener, FileEditorManagerListener {
    private final Project project;
    public TypingListener(Project project) {
        this.project = project;
    }

    @Override
    public void beforeDocumentChange(@NotNull DocumentEvent event) {
        DocumentListener.super.beforeDocumentChange(event);
        new PhpieMessageNotification( project, "beforeDocumentChange" );
    }

    @Override
    public void documentChanged(@NotNull DocumentEvent event) {
        DocumentListener.super.documentChanged(event);
        new PhpieMessageNotification( project, "documentChanged" );
    }

    @Override
    public void bulkUpdateStarting(@NotNull Document document) {
        DocumentListener.super.bulkUpdateStarting(document);
        new PhpieMessageNotification( project, "bulkUpdateStarting" );
    }

    @Override
    public void bulkUpdateFinished(@NotNull Document document) {
        DocumentListener.super.bulkUpdateFinished(document);
        new PhpieMessageNotification( project, "bulkUpdateFinished" );
    }

    @Override
    public void fileOpened(@NotNull FileEditorManager source, @NotNull VirtualFile file) {
        FileEditorManagerListener.super.fileOpened(source, file);
        new PhpieMessageNotification( project, "fileOpened" );
    }

    @Override
    public void fileClosed(@NotNull FileEditorManager source, @NotNull VirtualFile file) {
        FileEditorManagerListener.super.fileClosed(source, file);
        new PhpieMessageNotification( project, "fileClosed" );
    }

    @Override
    public void selectionChanged(@NotNull FileEditorManagerEvent event) {
        FileEditorManagerListener.super.selectionChanged(event);
        new PhpieMessageNotification( project, "selectionChanged" );
    }

    private FileMethod getFileMethod(String filePath) {
//        VirtualFile file = FileDocumentManager.getInstance().getFile(listener.getDocument());
//        if (file != null) {
//            String filePath = file.getPath();
//            var method = getFileMethod(filePath);
//            method.notification( project, "Typing: " + filePath, false );
//        }
        return new FileMethod(filePath);
    }
}
