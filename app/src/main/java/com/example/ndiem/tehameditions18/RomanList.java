package com.example.ndiem.tehameditions18;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RomanList extends Fragment {
    List<RomanClass> listRoman;

    public RomanList() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_roman_list, container, false);

        listRoman = new ArrayList<>();
        listRoman.add(new RomanClass("IN-DEPENDANCE", "ZE BELINGA","Teham Editions", "450", R.drawable.livre3));
        listRoman.add(new RomanClass("IN-DEPENDANCE", "ZE BELINGA","Teham Editions", "450", R.drawable.livre3));
        listRoman.add(new RomanClass("IN-DEPENDANCE", "ZE BELINGA","Teham Editions", "450", R.drawable.livre3));
        listRoman.add(new RomanClass("IN-DEPENDANCE", "ZE BELINGA","Teham Editions", "450", R.drawable.livre3));
        listRoman.add(new RomanClass("IN-DEPENDANCE", "ZE BELINGA","Teham Editions", "450", R.drawable.livre3));
        listRoman.add(new RomanClass("IN-DEPENDANCE", "ZE BELINGA","Teham Editions", "450", R.drawable.livre3));
        listRoman.add(new RomanClass("IN-DEPENDANCE", "ZE BELINGA","Teham Editions", "450", R.drawable.livre3));

        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.container_recycler_view);
        RecyclerViewAdapterRoman myAdapter = new RecyclerViewAdapterRoman(getContext(),listRoman);
        myrv.setLayoutManager( new GridLayoutManager(getContext(),1));
        myrv.setAdapter(myAdapter);
        // Inflate the layout for this fragment
        return view;
    }

}
