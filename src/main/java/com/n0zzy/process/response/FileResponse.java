package com.n0zzy.process.response;

import org.json.JSONObject;

public class FileResponse extends BaseResponse {
    private String line = null;
    private String start = null;
    private String end = null;
    @Override
    public FileResponse fromJson(JSONObject json) {
        file = json.getString("file");
        message = json.getString("message");
        error = json.getBoolean("error");
        line = json.getString("line");
        start = json.getString("start");
        end = json.getString("end");
        return this;
    }
}
