package co.mobiwise.electronrxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import rx.Observable;

/**
 * Created by mertsimsek on 13/11/15.
 */
public class RxJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_rxjava);

        Observable<String> observable = Observable.create(subscriber -> {
            if (!subscriber.isUnsubscribed()) {
                subscriber.onNext("Hello There!");
                subscriber.onCompleted();
            }
        });

        observable
                .map(s -> s + " What's up?")
                .map(s -> s.hashCode())
                .map(i -> Integer.toString(i))
                .subscribe(s -> Log.v("TEST",s));

        Observable.range(0,20)
                .skip(4)
                .take(10)
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .subscribe(i -> Log.v("TEST","Number : " + i));

    }
}
