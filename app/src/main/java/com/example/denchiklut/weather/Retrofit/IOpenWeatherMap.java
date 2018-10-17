package com.example.denchiklut.weather.Retrofit;

import com.example.denchiklut.weather.model.WeatherResult;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherByLng(@Query("lat") String lat,
                                              @Query("lon") String lng,
                                              @Query("appid") String appid,
                                              @Query("units") String unit);
}
