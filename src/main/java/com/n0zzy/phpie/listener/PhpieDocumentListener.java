package com.n0zzy.phpie.listener;

import com.intellij.lang.Language;
import com.intellij.lang.LanguageUtil;
import com.intellij.openapi.editor.event.DocumentEvent;
import com.intellij.openapi.editor.event.DocumentListener;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.FileTypeManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.StatusBar;
import com.intellij.openapi.wm.StatusBarWidget;
import com.intellij.openapi.wm.WindowManager;
import com.n0zzy.process.methods.FileMethod;
import com.n0zzy.process.response.FileResponse;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.diagnostic.Logger;

import java.util.Objects;

public class PhpieDocumentListener implements DocumentListener {
    private static final Logger LOG = Logger.getInstance(PhpieDocumentListener.class);
    private Boolean isSending = false;
    private VirtualFile file = null;
    private String filePath = null;
    private FileResponse analyze = null;

    @Override
    public void documentChanged(@NotNull DocumentEvent event) {
        setVirtualFile(event);
        if (!isPhpFile(file))  return;
        sendFile();

        DocumentListener.super.documentChanged(event);
    }

    // Записываем путь к файлу
    private void setVirtualFile(DocumentEvent event) {
        file = FileDocumentManager.getInstance().getFile(event.getDocument());
        if (file != null) {
            filePath = file.getPath().replaceAll("\\\\", "/");
        } else {
            LOG.warn("FileDocumentManager returned null for document: " + event.getDocument());
        }
    }

    private void sendFile() {
        analyze = new FileMethod(filePath).getResponseAsObject();
        if (analyze.getError()) {
            Messages.showMessageDialog("Script not found\n" + filePath, "Phpie", Messages.getErrorIcon());
        }
    }

    private boolean isPhpFile(VirtualFile file) {
        if (file == null) return false;
        FileTypeManager fileTypeManager = FileTypeManager.getInstance();
        FileType fileType = fileTypeManager.getFileTypeByFileName(file.getName());
        return fileType.getDefaultExtension().equals("php");
    }

    private void updateStatusBar(String text) {
        Project project = ProjectManager.getInstance().getDefaultProject();
        StatusBar statusBar = WindowManager.getInstance().getStatusBar(project);
        if (statusBar == null) {
            return;
        }
        statusBar.setInfo(text);
    }
}