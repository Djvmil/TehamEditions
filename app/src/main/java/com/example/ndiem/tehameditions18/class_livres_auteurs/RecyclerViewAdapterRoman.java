package com.example.ndiem.tehameditions18.class_livres_auteurs;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ndiem.tehameditions18.R;
import com.example.ndiem.tehameditions18.retrofit.responseapi.Book;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapterRoman  extends RecyclerView.Adapter<RecyclerViewAdapterRoman.MyViewHolder> {


    private Context mContext;
    private ArrayList<Book> mData;

    public RecyclerViewAdapterRoman(Context mContext, ArrayList<Book> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_romans,viewGroup,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {


        myViewHolder.title_book_id.setText(mData.get(i).getTitre_livre());
        myViewHolder.auteur_book_id.setText(mData.get(i).getDescription_livre());
        myViewHolder.editeur_book_id.setText(mData.get(i).getEditeur_livre() );
        myViewHolder.nbMention.setText(mData.get(i).getNb_mentions_livre());

        Picasso.with(mContext).load(mData.get(i).getUrl_image_livre().toString()).into(myViewHolder.img_book_id);


     //   Picasso . get () . charger ( url ) . redimensionner ( 50 , 50 ) . centerCrop () . into ( imageView )

       // "http://waklytech.alwaysdata.net/storage/";


/*
        myViewHolder.title_book_id.setText(mData.get(i).getTitre_livre());
        myViewHolder.auteur_book_id.setText(mData.get(i).getId_auteur_livre());
        myViewHolder.editeur_book_id.setText(mData.get(i).getEditeur_livre() );
        myViewHolder.nbMention.setText(mData.get(i).getNb_mentions_livre());
        myViewHolder.img_book_id.setImageResource(R.drawable.livre3);*/
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView img_book_id;
        TextView title_book_id;
        TextView auteur_book_id;
        TextView editeur_book_id;
        TextView nbMention;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img_book_id =  (ImageView) itemView.findViewById(R.id.img_book_id);
            title_book_id = (TextView) itemView.findViewById(R.id.title_book_id);
            auteur_book_id = (TextView) itemView.findViewById(R.id.auteur_book_id);
            editeur_book_id = (TextView) itemView.findViewById(R.id.editeur_book_id);
            nbMention = (TextView) itemView.findViewById(R.id.nb_book_id);
        }
    }
}
