package com.n0zzy.process.methods;

import com.n0zzy.process.response.ConnectResponse;

public class ConnectMethod extends BaseMethod {
    public ConnectMethod() {
        super("connect");
    }

    @Override
    protected void send(){
        client.sendConnect();
    }

    @Override
    public ConnectResponse getResponseAsObject() {
        return new ConnectResponse().fromJson(jsonObject);
    }
}
