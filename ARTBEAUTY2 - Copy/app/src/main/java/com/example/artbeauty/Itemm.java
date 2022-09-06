package com.example.artbeauty;

import java.io.Serializable;

public class Itemm implements Serializable {

    private String namr;
    private String arts;
    private String dess;
    private int imgg;

    public Itemm(String namr, String arts, String dess, int imgg) {
        this.namr = namr;
        this.arts = arts;
        this.dess = dess;
        this.imgg = imgg;
    }

    public String getNamr() {
        return namr;
    }

    public void setNamr(String namr) {
        this.namr = namr;
    }

    public String getArts() {
        return arts;
    }

    public void setArts(String arts) {
        this.arts = arts;
    }

    public String getDess() {
        return dess;
    }

    public void setDess(String dess) {
        this.dess = dess;
    }

    public int getImgg() {
        return imgg;
    }

    public void setImgg(int imgg) {
        this.imgg = imgg;
    }
}
