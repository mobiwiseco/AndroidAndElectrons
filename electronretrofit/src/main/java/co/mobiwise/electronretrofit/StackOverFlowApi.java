package co.mobiwise.electronretrofit;

import co.mobiwise.electronretrofit.entity.StackQuestions;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by mertsimsek on 13/11/15.
 */
public interface StackoverflowApi {

    @GET("search")
    Call<StackQuestions> search(@Query("intitle") String intitle,
                                @Query("order") String order,
                                @Query("sort") String sort,
                                @Query("site") String site);

}
