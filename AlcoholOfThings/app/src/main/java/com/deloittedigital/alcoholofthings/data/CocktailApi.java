package com.deloittedigital.alcoholofthings.data;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

public interface CocktailApi {

	@POST("http://172.20.3.194:3000")
	Observable<Response<String>> sendCocktailItems(@Body String[] selectedItems);

}
