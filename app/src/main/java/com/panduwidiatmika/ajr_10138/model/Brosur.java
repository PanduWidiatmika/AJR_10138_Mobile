package com.panduwidiatmika.ajr_10138.model;

import com.google.gson.annotations.SerializedName;

public class Brosur {
    @SerializedName("NAMA_MOBIL")
    private String NAMA_MOBIL;

    @SerializedName("JENIS_TRANSMISI_MOBIL")
    private String JENIS_TRANSMISI_MOBIL;

    @SerializedName("FASILITAS_MOBIL")
    private String FASILITAS_MOBIL;

    @SerializedName("HARGA_SEWA")
    private int HARGA_SEWA;

    public Brosur(String NAMA_MOBIL, String JENIS_TRANSMISI_MOBIL, String FASILITAS_MOBIL, int HARGA_SEWA) {
        this.NAMA_MOBIL = NAMA_MOBIL;
        this.JENIS_TRANSMISI_MOBIL = JENIS_TRANSMISI_MOBIL;
        this.FASILITAS_MOBIL = FASILITAS_MOBIL;
        this.HARGA_SEWA = HARGA_SEWA;
    }

    public String getNAMA_MOBIL() {
        return NAMA_MOBIL;
    }

    public void setNAMA_MOBIL(String NAMA_MOBIL) {
        this.NAMA_MOBIL = NAMA_MOBIL;
    }

    public String getJENIS_TRANSMISI_MOBIL() {
        return JENIS_TRANSMISI_MOBIL;
    }

    public void setJENIS_TRANSMISI_MOBIL(String JENIS_TRANSMISI_MOBIL) {
        this.JENIS_TRANSMISI_MOBIL = JENIS_TRANSMISI_MOBIL;
    }

    public String getFASILITAS_MOBIL() {
        return FASILITAS_MOBIL;
    }

    public void setFASILITAS_MOBIL(String FASILITAS_MOBIL) {
        this.FASILITAS_MOBIL = FASILITAS_MOBIL;
    }

    public int getHARGA_SEWA() {
        return HARGA_SEWA;
    }

    public void setHARGA_SEWA(int HARGA_SEWA) {
        this.HARGA_SEWA = HARGA_SEWA;
    }
}
