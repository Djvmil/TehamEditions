package com.example.ndiem.tehameditions18.retrofit.datamanager;

import com.example.ndiem.tehameditions18.retrofit.responseapi.ResponsListBook;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BookApi {

    @GET("v1/Api.php?")
     Call<ResponsListBook> getListBook(@Query("apicall") String getlivre);
}
