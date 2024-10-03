package com.n0zzy.process.methods;

import com.intellij.openapi.project.Project;
import com.n0zzy.phpie.notification.PhpieErrorNotification;
import com.n0zzy.phpie.notification.PhpieMessageNotification;
import com.n0zzy.process.LanguageClient;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.StringReader;

abstract public class BaseMethod {
    protected LanguageClient client;
    protected String _response = "";

    protected String method;
    protected String message = null;
    protected String file = null;
    protected String position = null;


    abstract protected void send();

    abstract public Object getResponseAsObject();

    BaseMethod(String method) {
        this.method = method;
        execute();
    }

    BaseMethod(String method, String file) {
        this.method = method;
        this.file = file;
        execute();
    }

    protected JSONObject jsonObject = null;

    public String getResponseAsString() {
        return _response;
    }

    public void notification(Project project, String message, Boolean error) {
        if( error ) {
            new PhpieErrorNotification(project, "error: " + message);
        }
        else {
            new PhpieMessageNotification(project, message);
        }
    }

    private void execute() {
        client = new LanguageClient();
        send();
        _response = client.response();
        jsonObject = new JSONObject(new JSONTokener(new StringReader(_response)));
    }
}
