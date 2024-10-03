package com.n0zzy.process.methods;

import com.n0zzy.process.response.FileResponse;

public class FileMethod extends BaseMethod {

    public FileMethod(String file) {
        super("file", file);
    }

    @Override
    protected void send() {
        client.sendFile(file);
    }

    @Override
    public FileResponse getResponseAsObject() {
        return new FileResponse().fromJson(jsonObject);
    }
}
