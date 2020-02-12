package com.danielogbuti.post;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface GitHubClient {

    @POST("user")
    Call<User>createAccount(@Body User user);
}
