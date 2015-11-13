package co.mobiwise.electrondagger;

import android.util.Log;
import javax.inject.Inject;

/**
 * Created by mertsimsek on 14/11/15.
 */
public class BMWCar implements Car {

    Engine engine;

    @Inject
    public BMWCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        Log.v("DaggerExample", "BMW Car is about to start.");
        engine.turnOn();
    }

    @Override
    public void stop() {
        Log.v("DaggerExample", "BMW Car is about to stop.");
        engine.turnOff();
    }
}
