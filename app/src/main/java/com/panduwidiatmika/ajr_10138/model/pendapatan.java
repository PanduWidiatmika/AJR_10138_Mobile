package com.panduwidiatmika.ajr_10138.model;

import com.google.gson.annotations.SerializedName;

public class pendapatan {
    @SerializedName("NAMA_CUSTOMER")
    private String NAMA_CUSTOMER;

    @SerializedName("NAMA_MOBIL")
    private String NAMA_MOBIL;

    @SerializedName("JENIS_TRANSAKSI")
    private String JENIS_TRANSAKSI;

    @SerializedName("JUMLAH_TRANSAKSI")
    private int JUMLAH_TRANSAKSI;

    @SerializedName("PENDAPATAN")
    private int PENDAPATAN;

    public pendapatan(String NAMA_CUSTOMER, String NAMA_MOBIL, String JENIS_TRANSAKSI, int JUMLAH_TRANSAKSI, int PENDAPATAN) {
        this.NAMA_CUSTOMER = NAMA_CUSTOMER;
        this.NAMA_MOBIL = NAMA_MOBIL;
        this.JENIS_TRANSAKSI = JENIS_TRANSAKSI;
        this.JUMLAH_TRANSAKSI = JUMLAH_TRANSAKSI;
        this.PENDAPATAN = PENDAPATAN;
    }

    public String getNAMA_CUSTOMER() {
        return NAMA_CUSTOMER;
    }

    public void setNAMA_CUSTOMER(String NAMA_CUSTOMER) {
        this.NAMA_CUSTOMER = NAMA_CUSTOMER;
    }

    public String getNAMA_MOBIL() {
        return NAMA_MOBIL;
    }

    public void setNAMA_MOBIL(String NAMA_MOBIL) {
        this.NAMA_MOBIL = NAMA_MOBIL;
    }

    public String getJENIS_TRANSAKSI() {
        return JENIS_TRANSAKSI;
    }

    public void setJENIS_TRANSAKSI(String JENIS_TRANSAKSI) {
        this.JENIS_TRANSAKSI = JENIS_TRANSAKSI;
    }

    public int getJUMLAH_TRANSAKSI() {
        return JUMLAH_TRANSAKSI;
    }

    public void setJUMLAH_TRANSAKSI(int JUMLAH_TRANSAKSI) {
        this.JUMLAH_TRANSAKSI = JUMLAH_TRANSAKSI;
    }

    public int getPENDAPATAN() {
        return PENDAPATAN;
    }

    public void setPENDAPATAN(int PENDAPATAN) {
        this.PENDAPATAN = PENDAPATAN;
    }
}
