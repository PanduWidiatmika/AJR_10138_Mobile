package com.panduwidiatmika.ajr_10138.model;

import com.google.gson.annotations.SerializedName;

public class transaksiCustomer {
    @SerializedName("NAMA_CUSTOMER")
    private String NAMA_CUSTOMER;

    @SerializedName("JUMLAH_TRANSAKSI")
    private int JUMLAH_TRANSAKSI;

    public transaksiCustomer(String NAMA_CUSTOMER, int JUMLAH_TRANSAKSI) {
        this.NAMA_CUSTOMER = NAMA_CUSTOMER;
        this.JUMLAH_TRANSAKSI = JUMLAH_TRANSAKSI;
    }

    public String getNAMA_CUSTOMER() {
        return NAMA_CUSTOMER;
    }

    public void setNAMA_CUSTOMER(String NAMA_CUSTOMER) {
        this.NAMA_CUSTOMER = NAMA_CUSTOMER;
    }

    public int getJUMLAH_TRANSAKSI() {
        return JUMLAH_TRANSAKSI;
    }

    public void setJUMLAH_TRANSAKSI(int JUMLAH_TRANSAKSI) {
        this.JUMLAH_TRANSAKSI = JUMLAH_TRANSAKSI;
    }
}
