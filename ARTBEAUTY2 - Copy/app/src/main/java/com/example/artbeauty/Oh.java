package com.example.artbeauty;

import java.io.Serializable;

public class Oh implements Serializable {
    private String arestss;
    private String nammm;
    private  String discz;
    private int imkj;

    public String getArestss() {
        return arestss;
    }

    public void setArestss(String arestss) {
        this.arestss = arestss;
    }

    public String getNammm() {
        return nammm;
    }

    public void setNammm(String nammm) {
        this.nammm = nammm;
    }

    public String getDiscz() {
        return discz;
    }

    public void setDiscz(String discz) {
        this.discz = discz;
    }

    public int getImkj() {
        return imkj;
    }

    public void setImkj(int imkj) {
        this.imkj = imkj;
    }

    public Oh(String arestss, String nammm, String discz, int imkj) {
        this.arestss = arestss;
        this.nammm = nammm;
        this.discz = discz;
        this.imkj = imkj;
    }
}
