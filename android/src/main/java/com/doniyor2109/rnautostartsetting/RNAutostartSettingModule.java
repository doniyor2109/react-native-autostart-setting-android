package com.doniyor2109.rnautostartsetting;

import android.content.ComponentName;
import android.content.Intent;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;
import java.util.HashMap;

public class RNAutostartSettingModule extends ReactContextBaseJavaModule {
    @Override
    public String getName() {
        return "RNAutostartSetting";
    }
    public RNAutostartSettingModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void openSetting() {
        Intent intent = new Intent();

        intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        this.getReactApplicationContext().startActivity(intent);
    }
}