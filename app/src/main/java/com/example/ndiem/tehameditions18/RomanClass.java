package com.example.ndiem.tehameditions18;

public class RomanClass {
    private String titreRoman;
    private String nomAuteur;
    private String Editeur;
    private String nbMention;
    private int couverture_roman;

    public RomanClass(String titreRoman, String nomAuteur, String editeur, String nbMention, int couverture_roman) {
        this.titreRoman = titreRoman;
        this.nomAuteur = nomAuteur;
        Editeur = editeur;
        this.nbMention = nbMention;
        this.couverture_roman = couverture_roman;
    }

    public String getTitreRoman() {
        return titreRoman;
    }

    public void setTitreRoman(String titreRoman) {
        this.titreRoman = titreRoman;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public String getEditeur() {
        return Editeur;
    }

    public void setEditeur(String editeur) {
        Editeur = editeur;
    }

    public String getNbMention() {
        return nbMention;
    }

    public void setNbMention(String nbMention) {
        this.nbMention = nbMention;
    }

    public int getCouverture_roman() {
        return couverture_roman;
    }

    public void setCouverture_roman(int couverture_roman) {
        this.couverture_roman = couverture_roman;
    }
}

