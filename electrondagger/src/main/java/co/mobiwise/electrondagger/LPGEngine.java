package co.mobiwise.electrondagger;

import android.util.Log;

/**
 * Created by mertsimsek on 14/11/15.
 */

public class LPGEngine implements Engine {

    @Override
    public void turnOn() {
        Log.v("DaggerExample", "LPG Engine turned on");
    }

    @Override
    public void turnOff() {
        Log.v("DaggerExample", "LPG Engine turned off.");
    }
}
