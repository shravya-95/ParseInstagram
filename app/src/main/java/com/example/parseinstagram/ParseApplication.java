package com.example.parseinstagram;

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
                .applicationId("9kabRiQHAd1czn8mINRejNgbDAV71kQn8g10u277")
                .clientKey("g18zoVTCl1WwdWZrGOBbuFcJsFfksHlUhGbHo9aJ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
