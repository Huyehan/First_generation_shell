package com.example.sourceapk;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {

    private static String TAG="MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "source apk onCreate: "+this);
    }
}
