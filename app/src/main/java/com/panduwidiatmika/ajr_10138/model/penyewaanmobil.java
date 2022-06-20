package com.panduwidiatmika.ajr_10138.model;

import com.google.gson.annotations.SerializedName;

public class penyewaanmobil {
    @SerializedName("TIPE_MOBIL")
    private String TIPE_MOBIL;

    @SerializedName("NAMA_MOBIL")
    private String NAMA_MOBIL;

    @SerializedName("JUMLAH_PEMINJAMAN")
    private int JUMLAH_PEMINJAMAN;

    @SerializedName("PENDAPATAN")
    private int PENDAPATAN;

    public penyewaanmobil(String TIPE_MOBIL, String NAMA_MOBIL, int JUMLAH_PEMINJAMAN, int PENDAPATAN) {
        this.TIPE_MOBIL = TIPE_MOBIL;
        this.NAMA_MOBIL = NAMA_MOBIL;
        this.JUMLAH_PEMINJAMAN = JUMLAH_PEMINJAMAN;
        this.PENDAPATAN = PENDAPATAN;
    }

    public String getTIPE_MOBIL() {
        return TIPE_MOBIL;
    }

    public void setTIPE_MOBIL(String TIPE_MOBIL) {
        this.TIPE_MOBIL = TIPE_MOBIL;
    }

    public String getNAMA_MOBIL() {
        return NAMA_MOBIL;
    }

    public void setNAMA_MOBIL(String NAMA_MOBIL) {
        this.NAMA_MOBIL = NAMA_MOBIL;
    }

    public int getJUMLAH_PEMINJAMAN() {
        return JUMLAH_PEMINJAMAN;
    }

    public void setJUMLAH_PEMINJAMAN(int JUMLAH_PEMINJAMAN) {
        this.JUMLAH_PEMINJAMAN = JUMLAH_PEMINJAMAN;
    }

    public int getPENDAPATAN() {
        return PENDAPATAN;
    }

    public void setPENDAPATAN(int PENDAPATAN) {
        this.PENDAPATAN = PENDAPATAN;
    }
}
