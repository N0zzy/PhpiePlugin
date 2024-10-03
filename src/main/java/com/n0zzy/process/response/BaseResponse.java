package com.n0zzy.process.response;

import org.json.JSONObject;

abstract public class BaseResponse {
    protected String method = null;
    protected String message = null;
    protected String file = null;
    protected Boolean error = false;

    abstract public Object fromJson(JSONObject json);

    public String getMethod() {
        return method;
    }

    public String getMessage() {
        return message;
    }

    public String getFile() {
        return file;
    }

    public Boolean getError() {
        return error;
    }
}
