package co.mobiwise.electronretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.squareup.otto.Subscribe;

import co.mobiwise.electronretrofit.entity.StackQuestions;

/**
 * Created by mertsimsek on 13/11/15.
 */
public class RetrofitActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_retrofit);

        BusProvider.getInstance().register(this);

        ApiSource.getInstance().search("android");
    }

    @Subscribe
    public void onSearchResult(StackQuestions stackQuestions){
        Log.v("TEST","Questions List Size : " + stackQuestions.items.size());
        Log.v("TEST","Question 1 Title: " + stackQuestions.items.get(0).title);
        Log.v("TEST","Question 1 Link: " + stackQuestions.items.get(0).link);
        Log.v("TEST","Question 1 Owner : " + stackQuestions.items.get(0).owner.link);
    }

    @Subscribe
    public void onError(Throwable throwable){
        Log.v("TEST","Error : " + throwable.getMessage());
    }
}
