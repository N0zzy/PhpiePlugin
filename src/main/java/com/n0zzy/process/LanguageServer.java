package com.n0zzy.process;

import java.io.*;

public class LanguageServer {
    public static final Boolean DEBUG = true;
    public final static String name = "PhpieLanguageServer";
    private static String os = System.getProperty("os.name").toLowerCase();

    private static final LanguageServer LanguageServer = new LanguageServer();

    private static final String command = "dotnet run --project ";
    private static ProcessBuilder processBuilder = new ProcessBuilder();
    private static Process process = null;
    private static String projectPath = null;


    private static PrintWriter out;
    private static BufferedReader in;

    public static void setPath(String path) {
        projectPath = path + "/" + name + ".csproj";
    }

    public static void start() {
        if(DEBUG) return;

        var processBuilderCommand = (command + projectPath).replace("\\", "/");
        stop();
        if (os.contains("win")) {
            processBuilder.command("cmd", "/c", processBuilderCommand);
        } else {
            processBuilder.command("bash", "-с", command + projectPath);
        }
        try {
            process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void remove() {
        process.destroy();
        process = null;
    }

    public static Process process() {
        return process;
    }

    public static void stop() {
        try {
            if (os.contains("win")) {
                processBuilder.command("cmd.exe", "/c", "taskkill /IM " + name + ".exe /F").start().waitFor();
            } else {
                processBuilder.command("/bin/sh", "-c", "pkill -f dotnet run " + name).start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Boolean isProcessRunning() {
        return process != null && process.isAlive();
    }
}