package com.example.pas_genap_3_23;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    // Tidak perlu hardcode query langsung di URL!
    @GET("search_all_teams.php")
    Call<TeamResponse> getTeamsByCountry(@Query("s") String sport, @Query("c") String country);

    // Sudah benar: @GET tanpa langsung menulis id di URL
    @GET("lookupplayer.php")
    Call<PlayerResponse> getPlayerDetails(@Query("id") String id);
}