package co.mobiwise.electrondagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by mertsimsek on 13/11/15.
 */
public class DaggerActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dagger);

        inject();
        car.start();
        car.stop();
    }


    //onCreate
    private void inject(){
        DaggerApplication app = (DaggerApplication) getApplication();
        app.getAppComponent().inject(this);
    }
}
