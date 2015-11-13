package co.mobiwise.electrondagger;

import android.app.Application;

import co.mobiwise.electrondagger.injector.AppComponent;
import co.mobiwise.electrondagger.injector.AppModule;
import co.mobiwise.electrondagger.injector.DaggerAppComponent;

/**
 * Created by mertsimsek on 14/11/15.
 */
public class DaggerApplication extends Application{

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector(){
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
