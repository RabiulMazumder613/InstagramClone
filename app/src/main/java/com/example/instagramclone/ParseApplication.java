package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("NRbkz0BvMme5KBNqzuicV364aN9uL8nkbva14o3G")
                .clientKey("GRkiiudkBD5flSGz6XDhUPHMXbau2ux5JTIBQ5VS")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
