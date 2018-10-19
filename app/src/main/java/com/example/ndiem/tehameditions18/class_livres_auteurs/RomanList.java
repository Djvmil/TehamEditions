package com.example.ndiem.tehameditions18.class_livres_auteurs;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ndiem.tehameditions18.R;
import com.example.ndiem.tehameditions18.retrofit.datamanager.BookApi;
import com.example.ndiem.tehameditions18.retrofit.responseapi.ApiUtils;
import com.example.ndiem.tehameditions18.retrofit.responseapi.Book;
import com.example.ndiem.tehameditions18.retrofit.responseapi.ResponsListBook;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RomanList extends Fragment {
    private BookApi mAPIService;

    private ArrayList<Book> books;
    private Book book;

    private int type_livre;


    public RomanList() {
        // Required empty public constructor

    }

    @SuppressLint("ValidFragment")
    public RomanList(int i) {
        // Required empty public constructor
        this.type_livre = i;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_roman_list, container, false);

        mAPIService = ApiUtils.getAPIService();
        book = new Book();
        books = new ArrayList<>();

        // Log.d("Listge :", books.get(2).getDescription_livre());
        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.container_recycler_view);
        final RecyclerViewAdapterRoman myAdapter = new RecyclerViewAdapterRoman(getContext(),books);
        myrv.setLayoutManager( new GridLayoutManager(getContext(),1));
        myrv.setAdapter(myAdapter);


        mAPIService.getListBook("getlivre").enqueue(new Callback<ResponsListBook>() {

            @Override
            public void onResponse(Call<ResponsListBook> call, Response<ResponsListBook> response) {

                Log.d("Listge :", response.toString());

                for (int i = 0; i < response.body().getLivres().size(); i++) {
                    book = response.body().getLivres().get(i);
                    books.add(book);
                }

                myAdapter.notifyDataSetChanged();
            }


            @Override
            public void onFailure(Call<ResponsListBook> call, Throwable t) {
                Log.e("Liste  error:", t.toString());
            }
        });


        // Inflate the layout for this fragment



        return view;
    }

}