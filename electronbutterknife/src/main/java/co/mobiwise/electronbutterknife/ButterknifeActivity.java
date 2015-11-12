package co.mobiwise.electronbutterknife;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by mertsimsek on 12/11/15.
 */
public class ButterknifeActivity extends Activity{

    @Bind(R.id.button)
    Button button;

    @BindString(R.string.test)
    String injectedString;

    @BindColor(R.color.testColor)
    int injectedColor;

    @BindDrawable(android.R.drawable.btn_plus)
    Drawable injectedDrawable;

    @BindDimen(R.dimen.testDimen)
    float injectedDimen;

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
