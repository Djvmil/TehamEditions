package com.example.ndiem.tehameditions18.class_livres_auteurs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ndiem.tehameditions18.R;

import java.util.List;

public class RecyclerViewAdapterAuteur extends RecyclerView.Adapter<RecyclerViewAdapterAuteur.MyViewHolder> {


    private Context mContext;
    private List<AuteurClass> mData;

    public RecyclerViewAdapterAuteur(Context mContext, List<AuteurClass> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerViewAdapterAuteur.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_auteurs,viewGroup,false);

        return new RecyclerViewAdapterAuteur.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterAuteur.MyViewHolder myViewHolder, int i) {

        myViewHolder.nom_auteur_id.setText(mData.get(i).getNomAuteur());
        myViewHolder.prenom_auteur_id.setText(mData.get(i).getPrenomAuteur());
        myViewHolder.img_auteur_id.setImageResource(mData.get(i).getImgAuteur());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView img_auteur_id;
        TextView nom_auteur_id;
        TextView prenom_auteur_id;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img_auteur_id =  (ImageView) itemView.findViewById(R.id.img_auteur_id);
            nom_auteur_id = (TextView) itemView.findViewById(R.id.nom_auteur_id);
            prenom_auteur_id = (TextView) itemView.findViewById(R.id.prenom_auteur_id);
        }
    }
}
