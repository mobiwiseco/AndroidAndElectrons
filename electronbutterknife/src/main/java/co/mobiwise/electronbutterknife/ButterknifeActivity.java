package co.mobiwise.electronbutterknife;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by mertsimsek on 12/11/15.
 */
public class ButterknifeActivity extends Activity{

    @Bind(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_butterknife);

        //onCreate
        ButterKnife.bind(this);

    }

    @OnClick(R.id.button)
    public void onClick(){
        Log.v("TEST","Button clicked.");
    }
}
