package co.mobiwise.electronretrofit;

import android.util.Log;

import com.squareup.otto.Bus;

import java.io.IOException;

import co.mobiwise.electronretrofit.entity.StackQuestions;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by mertsimsek on 13/11/15.
 */
public class ApiSource {

    private static ApiSource instance = null;

    private static String END_URL = "https://api.stackexchange.com/2.2/";

    private StackoverflowApi stackoverflowApi;

    private ApiSource(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(END_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        stackoverflowApi = retrofit.create(StackoverflowApi.class);

    }

    public static ApiSource getInstance(){
        if(instance == null)
            instance = new ApiSource();
        return instance;
    }

    public void search(String query) {

        Call<StackQuestions> searchCall;
        searchCall = stackoverflowApi.search(query, "desc", "activity", "stackoverflow");

        searchCall.enqueue(new Callback<StackQuestions>() {
            @Override
            public void onResponse(Response<StackQuestions> response, Retrofit retrofit) {
                BusProvider.getInstance().post(response.body());
            }

            @Override
            public void onFailure(Throwable t) {
                BusProvider.getInstance().post(t);
            }
        });

    }


}
