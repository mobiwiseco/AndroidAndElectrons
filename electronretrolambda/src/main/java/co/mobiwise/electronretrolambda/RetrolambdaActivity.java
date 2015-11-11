package co.mobiwise.electronretrolambda;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by mertsimsek on 10/11/15.
 */
public class RetrolambdaActivity extends Activity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("TEST","Button clicked.");
            }
        });

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                button.setText("Button");
            }
        });

        /**
         * With retrolambda
         * 1 line of code
         */
        button.setOnClickListener(v -> Log.v("TEST", "Button clicked."));

        /**
         * With retrolambda
         * 1 line of code
         */

        runOnUiThread(() -> button.setText("Button"));
    }
}
