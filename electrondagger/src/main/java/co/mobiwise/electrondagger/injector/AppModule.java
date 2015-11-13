package co.mobiwise.electrondagger.injector;

import javax.inject.Singleton;

import co.mobiwise.electrondagger.BMWCar;
import co.mobiwise.electrondagger.Car;
import co.mobiwise.electrondagger.DaggerApplication;
import co.mobiwise.electrondagger.Engine;
import co.mobiwise.electrondagger.LPGEngine;
import dagger.Module;
import dagger.Provides;

/**
 * Created by mertsimsek on 14/11/15.
 */

@Module
public class AppModule {

    private final DaggerApplication daggerApplication;

    public AppModule(DaggerApplication daggerApplication) {
        this.daggerApplication = daggerApplication;
    }

    @Provides@Singleton
    DaggerApplication provideApp(){
        return daggerApplication;
    }

    @Provides @Singleton
    Engine provideEngine(){
        return new LPGEngine();
    }

    @Provides @Singleton
    Car provideCar(Engine engine){
        return new BMWCar(engine);
    }
}
