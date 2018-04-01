package com.example.utkarsh.cricbuzz;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by utkarsh on 31/3/18.
 */

public interface RequestInterface {

    @GET("HkiLHwuAWfXP5aLxrut8uSV3lbm2")

Call<JSONResponse> getJSON();
}
