package com.example.ndiem.tehameditions18.retrofit.responseapi;

import com.example.ndiem.tehameditions18.retrofit.RetrofitClient;
import com.example.ndiem.tehameditions18.retrofit.datamanager.BookApi;

public class ApiUtils {

    public static final String BASE_URL = "http://waklytech.alwaysdata.net/MyAPI/";


    private ApiUtils() {
    }

    public static BookApi getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(BookApi.class);
    }
}
