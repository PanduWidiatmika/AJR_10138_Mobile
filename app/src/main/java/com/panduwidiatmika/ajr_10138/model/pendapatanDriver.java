package com.panduwidiatmika.ajr_10138.model;

import com.google.gson.annotations.SerializedName;

public class pendapatanDriver {
    @SerializedName("DRIVER_ID")
    private String DRIVER_ID;

    @SerializedName("NAMA_DRIVER")
    private String NAMA_DRIVER;

    @SerializedName("JUMLAH_TRANSAKSI")
    private int JUMLAH_TRANSAKSI;

    public pendapatanDriver(String DRIVER_ID, String NAMA_DRIVER, int JUMLAH_TRANSAKSI) {
        this.DRIVER_ID = DRIVER_ID;
        this.NAMA_DRIVER = NAMA_DRIVER;
        this.JUMLAH_TRANSAKSI = JUMLAH_TRANSAKSI;
    }

    public String getDRIVER_ID() {
        return DRIVER_ID;
    }

    public void setDRIVER_ID(String DRIVER_ID) {
        this.DRIVER_ID = DRIVER_ID;
    }

    public String getNAMA_DRIVER() {
        return NAMA_DRIVER;
    }

    public void setNAMA_DRIVER(String NAMA_DRIVER) {
        this.NAMA_DRIVER = NAMA_DRIVER;
    }

    public int getJUMLAH_TRANSAKSI() {
        return JUMLAH_TRANSAKSI;
    }

    public void setJUMLAH_TRANSAKSI(int JUMLAH_TRANSAKSI) {
        this.JUMLAH_TRANSAKSI = JUMLAH_TRANSAKSI;
    }
}
