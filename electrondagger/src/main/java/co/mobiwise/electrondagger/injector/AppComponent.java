package co.mobiwise.electrondagger.injector;

import javax.inject.Singleton;

import co.mobiwise.electrondagger.DaggerActivity;
import dagger.Component;

/**
 * Created by mertsimsek on 14/11/15.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(DaggerActivity carActivity);
}
