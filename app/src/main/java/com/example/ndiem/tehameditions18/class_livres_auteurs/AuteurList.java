package com.example.ndiem.tehameditions18.class_livres_auteurs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ndiem.tehameditions18.R;
import com.example.ndiem.tehameditions18.class_livres_auteurs.AuteurClass;
import com.example.ndiem.tehameditions18.class_livres_auteurs.RecyclerViewAdapterAuteur;

import java.util.ArrayList;
import java.util.List;


public class AuteurList extends Fragment {

    List<AuteurClass> listAuteur ;
    public AuteurList() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_auteur_list, container, false);


        listAuteur = new ArrayList<>();
        listAuteur.add(new AuteurClass("Jude", "JOSEPH",R.drawable.jude));
        listAuteur.add(new AuteurClass("Jude", "JOSEPH",R.drawable.jude));
        listAuteur.add(new AuteurClass("Jude", "JOSEPH",R.drawable.jude));
        listAuteur.add(new AuteurClass("Jude", "JOSEPH",R.drawable.jude));
        listAuteur.add(new AuteurClass("Jude", "JOSEPH",R.drawable.jude));
        listAuteur.add(new AuteurClass("Jude", "JOSEPH",R.drawable.jude));
        listAuteur.add(new AuteurClass("Jude", "JOSEPH",R.drawable.jude));
        listAuteur.add(new AuteurClass("Jude", "JOSEPH",R.drawable.jude));

        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.container_recycler_view);
        RecyclerViewAdapterAuteur myAdapter = new RecyclerViewAdapterAuteur(getContext(),listAuteur);
        myrv.setLayoutManager( new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);

        return view;
    }

}
