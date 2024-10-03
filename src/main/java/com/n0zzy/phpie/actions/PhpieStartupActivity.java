package com.n0zzy.phpie.actions;

import com.intellij.ide.plugins.IdeaPluginDescriptor;
import com.intellij.ide.plugins.PluginManagerCore;
import com.intellij.openapi.extensions.PluginId;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import com.n0zzy.phpie.notification.PhpieErrorNotification;
import com.n0zzy.phpie.notification.PhpieMessageNotification;
import com.n0zzy.phpie.notification.PhpieStartupNotification;
import com.n0zzy.process.LanguageClient;
import com.n0zzy.process.LanguageServer;
import com.n0zzy.process.methods.ConnectMethod;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.*;

public class PhpieStartupActivity implements StartupActivity {
    private PluginId pluginId = PluginId.getId("com.n0zzy.phpie");
    private String response;

    @Override
    public void runActivity(@NotNull Project project) {
        try {
            init(project);
            //run(project);
            new PhpieStartupNotification(project);
            var m = new ConnectMethod();
            var r = m.getResponseAsObject();
            m.notification(project, "connecting to server", r.getError());

        } catch (IOException  e) {
            new PhpieErrorNotification(project, e.getMessage());
        }
    }

    private void init(@NotNull Project project) throws IOException {
        IdeaPluginDescriptor pluginDescriptor = PluginManagerCore.getPlugin(pluginId);
        if (pluginDescriptor != null) {

            // Получаем путь к плагину
            var pluginPath = pluginDescriptor.getPluginPath().toUri().getPath();
            String zipFileName = LanguageServer.name +".zip";
            String outputDir = String.valueOf(pluginDescriptor.getPluginPath().getParent()) +
                    "/" +  LanguageServer.name;

            if( checkFolderExists( outputDir ) ) {
                return;
            }

            LanguageServer.setPath( outputDir );
            InputStream zipStream = getClass().getClassLoader().getResourceAsStream(zipFileName);

            File tempZipFile = File.createTempFile("temp", ".zip");
            try (OutputStream out = new FileOutputStream(tempZipFile)) {
                byte[] buffer = new byte[1024];
                int len;
                while ((len = zipStream.read(buffer)) > 0) {
                    out.write(buffer, 0, len);
                }
            }
            unzip(tempZipFile.getAbsolutePath(), outputDir);
            tempZipFile.delete();
            new PhpieMessageNotification(project,
                 "Plugin founded\n" + pluginPath
            );

        } else {
            new PhpieErrorNotification(project, "Plugin not found");
        }
    }

    private void run(@NotNull Project project) {
        LanguageServer.start();
        if(LanguageServer.process() != null) {
            new PhpieMessageNotification(project, "Language Server is running...");
        }
        else {
            new PhpieErrorNotification(project, "Language Server not running...");
        }
        LanguageServer.remove();
    }

    private static void unzip(String zipFilePath, String destDirectory) throws IOException {
        File destDir = new File(destDirectory);
        if (!destDir.exists()) {
            destDir.mkdir();
        }

        try (ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry entry = zipIn.getNextEntry();
            while (entry != null) {
                String filePath = destDirectory + File.separator + entry.getName();
                if (!entry.isDirectory()) {
                    extractFile(zipIn, filePath);
                } else {
                    File dir = new File(filePath);
                    dir.mkdirs();
                }
                zipIn.closeEntry();
                entry = zipIn.getNextEntry();
            }
        }
    }

    private static void extractFile(ZipInputStream zipIn, String filePath) throws IOException {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            byte[] bytesIn = new byte[1024];
            int read;
            while ((read = zipIn.read(bytesIn)) != -1) {
                bos.write(bytesIn, 0, read);
            }
        }
    }

    private Boolean checkFolderExists(String folderPath) {
        Path path = Paths.get(folderPath);
        return Files.exists(path) && Files.isDirectory(path);
    }
}
