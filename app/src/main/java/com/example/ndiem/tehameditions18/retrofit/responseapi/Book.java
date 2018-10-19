package com.example.ndiem.tehameditions18.retrofit.responseapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Book {
    @SerializedName("id_livre")
    @Expose
    private int id_livre;

    @SerializedName("titre_livre")
    @Expose
    private String titre_livre;

    @SerializedName("editeur_livre")
    @Expose
    private String editeur_livre;

    @SerializedName("nb_mentions_livre")
    @Expose
    private String nb_mentions_livre;

    @SerializedName("description_livre")
    @Expose
    private String description_livre;

    @SerializedName("url_image_livre")
    @Expose
    private String url_image_livre;

    @SerializedName("id_auteur_livre")
    @Expose
    private int id_auteur_livre;

    public Book() {
    }

    public Book(int id_livre, String titre_livre, String editeur_livre, String nb_mentions_livre, String description_livre, String url_image_livre, int id_auteur_livre) {
        this.id_livre = id_livre;
        this.titre_livre = titre_livre;
        this.editeur_livre = editeur_livre;
        this.nb_mentions_livre = nb_mentions_livre;
        this.description_livre = description_livre;
        this.id_auteur_livre = id_auteur_livre;
        this.url_image_livre = url_image_livre;
    }

    public int getId_livre() {
        return id_livre;
    }

    public void setId_livre(int id_livre) {
        this.id_livre = id_livre;
    }

    public String getTitre_livre() {
        return titre_livre;
    }

    public void setTitre_livre(String titre_livre) {
        this.titre_livre = titre_livre;
    }

    public String getEditeur_livre() {
        return editeur_livre;
    }

    public void setEditeur_livre(String editeur_livre) {
        this.editeur_livre = editeur_livre;
    }

    public String getNb_mentions_livre() {
        return nb_mentions_livre;
    }

    public void setNb_mentions_livre(String nb_mentions_livre) {
        this.nb_mentions_livre = nb_mentions_livre;
    }

    public String getDescription_livre() {
        return description_livre;
    }

    public void setDescription_livre(String description_livre) {
        this.description_livre = description_livre;
    }

    public String getUrl_image_livre() {
        return url_image_livre;
    }

    public void setUrl_image_livre(String url_image_livre) {
        this.url_image_livre = url_image_livre;
    }

    public int getId_auteur_livre() {
        return id_auteur_livre;
    }

    public void setId_auteur_livre(int id_auteur_livre) {
        this.id_auteur_livre = id_auteur_livre;
    }
}


