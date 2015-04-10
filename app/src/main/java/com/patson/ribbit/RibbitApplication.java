package com.patson.ribbit;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;

/**
 * Created by patrick on 4/8/15.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "d4Dp0rTy8bfJj1GNfptaL5VfhICZr6e5fEzDLXFl", "1z39pblMeMXjRcQ1AUnZYu8sHUDcpXaI6wBg5J0I");
        Log.d("RibbitApplication", "Success?");

    }

}
