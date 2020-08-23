package com.plugin.jniecho;

import android.util.Log;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class JniEcho extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {

            String jniString = EchoJni.stringFromJNI();
            String name = data.getString(0);
            String message = "Hello, " + name + ". JNI says: " + jniString;
            callbackContext.success(message);

            return true;

        } else {
            
            return false;

        }
    }
}