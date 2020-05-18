package com.tronpc.loginapp;

import com.parse.Parse;
import android.app.Application;

public class application extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YwmrdU17Sp5Yy37MXI6qzl4H7TAZVG06JBlRJffl") // insert your own app ID
                .clientKey("SyeesbISJPBjLRnHuMGsKNqWYiLhgzbPe71rgw10") // insert your own client key
                .server("https://parseapi.back4app.com")  // insert your own server
                .build()
        );
    }
}