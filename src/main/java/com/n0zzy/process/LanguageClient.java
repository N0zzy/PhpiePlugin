package com.n0zzy.process;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.*;

public class LanguageClient {
    private DatagramSocket socket;
    private InetAddress host;
    private final int port = 9999;
    private String _response = "";
    public LanguageClient() {
        try {
            socket = new DatagramSocket();
            host = InetAddress.getByName("127.0.0.1");
        } catch (SocketException | UnknownHostException e) {
            System.out.println("Error creating socket");
        }
    }
    public void sendConnect(){
        send(message("connect", null, null));
    }

    public void sendFile(String file) {
        send(message("file", null, file));
    }

    public String response() {
        return _response;
    }

    private void send(@NotNull String message) {
        if(LanguageServer.DEBUG) return;
        try {
            byte[] sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, host, port);
            socket.send(sendPacket);
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);
            _response = new String(receivePacket.getData(), 0, receivePacket.getLength());
        } catch (IOException e) {
            System.out.println("Error Language Server "  + e.getMessage());
        }

        close();
    }


    private String message(String method, String message, String file) {
        return String.format("{\"method\":\"%s\", \"message\":\"%s\", \"file\":\"%s\"}", method, message, file);
    }

    private void close() {
        if (socket != null && !socket.isClosed()) {
            socket.close();
        }
    }
}
