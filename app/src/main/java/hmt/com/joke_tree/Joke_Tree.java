package hmt.com.joke_tree;

import android.app.Application;
import android.content.Context;

/**
 * Created by Htoo MT on 6/25/2016.
 */
public class Joke_Tree extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
