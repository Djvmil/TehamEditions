package com.example.ndiem.tehameditions18.retrofit.responseapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ResponsListBook {
    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("livres")
    @Expose
    private ArrayList<Book> livres;

    public ResponsListBook() {
    }

    public ResponsListBook(Boolean error, String message, ArrayList<Book> livres) {
        this.error = error;
        this.message = message;
        this.livres = livres;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<Book> getLivres() {
        return livres;
    }

    public void setLivres(ArrayList<Book> livres) {
        this.livres = livres;
    }
}
