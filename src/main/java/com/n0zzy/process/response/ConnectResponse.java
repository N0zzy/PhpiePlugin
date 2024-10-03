package com.n0zzy.process.response;

import org.json.JSONObject;

public class ConnectResponse extends BaseResponse {
    @Override
    public ConnectResponse fromJson(JSONObject json) {
        method = json.getString("method");
        error = json.getBoolean("error");
        return this;
    }
}
