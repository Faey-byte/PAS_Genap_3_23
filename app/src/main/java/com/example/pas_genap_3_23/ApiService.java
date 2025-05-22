package com.example.pas_genap_3_23;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("search_all_teams.php?s=Soccer&c=Spain")
    Call<TeamResponse> getTeamsByCountry(@Query("s") String sport, @Query("c") String country);

    @GET("lookupplayer.php?id=34145937")
    Call<PlayerResponse> getPlayerDetails(@Query("id") String id);
}
