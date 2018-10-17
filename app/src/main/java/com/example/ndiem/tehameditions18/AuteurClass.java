package com.example.ndiem.tehameditions18;

public class AuteurClass {

    private String prenomAuteur;
    private String nomAuteur;
    private int imgAuteur;

    public AuteurClass(String prenomAuteur, String nomAuteur, int imgAuteur) {
        this.prenomAuteur = prenomAuteur;
        this.nomAuteur = nomAuteur;
        this.imgAuteur = imgAuteur;
    }

    public String getPrenomAuteur() {
        return prenomAuteur;
    }

    public void setPrenomAuteur(String prenomAuteur) {
        this.prenomAuteur = prenomAuteur;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public int getImgAuteur() {
        return imgAuteur;
    }

    public void setImgAuteur(int imgAuteur) {
        this.imgAuteur = imgAuteur;
    }
}
