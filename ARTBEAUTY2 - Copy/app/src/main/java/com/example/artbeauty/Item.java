package com.example.artbeauty;

import java.io.Serializable;

public class Item implements Serializable {
    private String namrr;
    private String artss;
    private String desss;
    private int imggg;

    public Item(String namrr, String artss, String desss, int imggg) {
        this.namrr = namrr;
        this.artss = artss;
        this.desss = desss;
        this.imggg = imggg;
    }

    public String getNamrr() {
        return namrr;
    }

    public void setNamrr(String namrr) {
        this.namrr = namrr;
    }

    public String getArtss() {
        return artss;
    }

    public void setArtss(String artss) {
        this.artss = artss;
    }

    public String getDesss() {
        return desss;
    }

    public void setDesss(String desss) {
        this.desss = desss;
    }

    public int getImggg() {
        return imggg;
    }

    public void setImggg(int imggg) {
        this.imggg = imggg;
    }
}

