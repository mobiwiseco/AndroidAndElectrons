package co.mobiwise.electronottobus;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by mertsimsek on 11/11/15.
 */
public class OttoFragment extends Fragment {

    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_ottobus, container, false);
        button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(v -> BusProvider.getInstance().post(new OnLocationEvent(123,123)));
        return view;
    }
}
