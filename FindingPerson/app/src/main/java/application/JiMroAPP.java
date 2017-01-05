package application;

import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * base Application for this app
 * Created by lixichang on 2017/1/4.
 */

public class JiMroAPP extends Application {
    private static Context application;

    public synchronized static Context getContext() {
        return application.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        Fresco.initialize(getContext());
    }
}
