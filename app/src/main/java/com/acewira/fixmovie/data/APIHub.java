package com.acewira.fixmovie.data;

import com.acewira.fixmovie.detail.ModelDetail;
import com.acewira.fixmovie.detail.NowPlayingModel;
import com.acewira.fixmovie.detail.UpcomingModel;
import com.acewira.fixmovie.function.SearchModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface APIHub {

    @GET("movie/now_playing")
    Call<NowPlayingModel> getNowPlayingMovie(@Query("language") String language);

    @GET("movie/{movie_id}")
    Call<ModelDetail> getDetailMovie(@Path("movie_id") String movie_id, @Query("language") String language);

    @GET("movie/upcoming")
    Call<UpcomingModel> getUpcomingMovie(@Query("language") String language);

    @GET("search/movie")
    Call<SearchModel> getSearchMovie(@Query("query") String query, @Query("language") String language);
}
