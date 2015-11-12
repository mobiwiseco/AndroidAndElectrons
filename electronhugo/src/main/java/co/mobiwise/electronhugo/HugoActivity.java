package co.mobiwise.electronhugo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import hugo.weaving.DebugLog;

/**
 * Created by mertsimsek on 12/11/15.
 */
public class HugoActivity extends AppCompatActivity{

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_hugo);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(v -> {

            String combined = combineNameSurname(getName(), getSurname());

            //Do other things with combined name
        });
    }

    @DebugLog
    private String getName(){
        return "Mert";
    }

    @DebugLog
    private String getSurname(){
        return "SIMSEK";
    }

    @DebugLog
    private String combineNameSurname(String name, String surname){
        return name + " " + surname;
    }

}
