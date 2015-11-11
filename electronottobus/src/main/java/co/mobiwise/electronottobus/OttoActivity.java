package co.mobiwise.electronottobus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.squareup.otto.Subscribe;

/**
 * Created by mertsimsek on 11/11/15.
 */

public class OttoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_ottobus);

        BusProvider.getInstance().register(this);

        getSupportFragmentManager().beginTransaction().add(R.id.container, new OttoFragment())
                .commit();

    }

    @Subscribe
    public void onLocation(OnLocationEvent onLocationEvent){
        Log.v("TEST","Latitude : " + onLocationEvent.latitude);
        Log.v("TEST","Longitude : " + onLocationEvent.longitude);
    }

}
