package com.panduwidiatmika.ajr_10138.model;

import com.google.gson.annotations.SerializedName;

public class Promo {
    @SerializedName("KODE_PROMO")
    private String KODE_PROMO;

    @SerializedName("JENIS_PROMO")
    private String JENIS_PROMO;

    @SerializedName("KETERANGAN_PROMO")
    private String KETERANGAN_PROMO;

    @SerializedName("ID_PROMO")
    private int ID_PROMO;

    @SerializedName("STATUS_PROMO")
    private String STATUS_PROMO;

    @SerializedName("DISKON_PROMO")
    private int DISKON_PROMO;

    public Promo(String KODE_PROMO, String JENIS_PROMO, String KETERANGAN_PROMO, int ID_PROMO, String STATUS_PROMO, int DISKON_PROMO) {
        this.KODE_PROMO = KODE_PROMO;
        this.JENIS_PROMO = JENIS_PROMO;
        this.KETERANGAN_PROMO = KETERANGAN_PROMO;
        this.ID_PROMO = ID_PROMO;
        this.STATUS_PROMO = STATUS_PROMO;
        this.DISKON_PROMO = DISKON_PROMO;
    }

    public String getKODE_PROMO() {
        return KODE_PROMO;
    }

    public void setKODE_PROMO(String KODE_PROMO) {
        this.KODE_PROMO = KODE_PROMO;
    }

    public String getJENIS_PROMO() {
        return JENIS_PROMO;
    }

    public void setJENIS_PROMO(String JENIS_PROMO) {
        this.JENIS_PROMO = JENIS_PROMO;
    }

    public String getKETERANGAN_PROMO() {
        return KETERANGAN_PROMO;
    }

    public void setKETERANGAN_PROMO(String KETERANGAN_PROMO) {
        this.KETERANGAN_PROMO = KETERANGAN_PROMO;
    }

    public int getID_PROMO() {
        return ID_PROMO;
    }

    public void setID_PROMO(int ID_PROMO) {
        this.ID_PROMO = ID_PROMO;
    }

    public String getSTATUS_PROMO() {
        return STATUS_PROMO;
    }

    public void setSTATUS_PROMO(String STATUS_PROMO) {
        this.STATUS_PROMO = STATUS_PROMO;
    }

    public int getDISKON_PROMO() {
        return DISKON_PROMO;
    }

    public void setDISKON_PROMO(int DISKON_PROMO) {
        this.DISKON_PROMO = DISKON_PROMO;
    }
}
