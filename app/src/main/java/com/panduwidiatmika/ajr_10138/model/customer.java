package com.panduwidiatmika.ajr_10138.model;

import com.google.gson.annotations.SerializedName;

public class customer {
    @SerializedName("ID_CUSTOMER")
    private Long ID_CUSTOMER;

    @SerializedName("NAMA_CUSTOMER")
    private String NAMA_CUSTOMER;

    @SerializedName("EMAIL_CUSTOMER")
    private String EMAIL_CUSTOMER;

    @SerializedName("ALAMAT_LENGKAP_CUSTOMER")
    private String ALAMAT_LENGKAP_CUSTOMER;

    @SerializedName("NO_TELP_CUSTOMER")
    private String NO_TELP_CUSTOMER;

    public customer(String NAMA_CUSTOMER, String EMAIL_CUSTOMER, String ALAMAT_LENGKAP_CUSTOMER, String NO_TELP_CUSTOMER) {
        this.NAMA_CUSTOMER = NAMA_CUSTOMER;
        this.EMAIL_CUSTOMER = EMAIL_CUSTOMER;
        this.ALAMAT_LENGKAP_CUSTOMER = ALAMAT_LENGKAP_CUSTOMER;
        this.NO_TELP_CUSTOMER = NO_TELP_CUSTOMER;
    }

    public customer(Long ID_CUSTOMER){
        this.ID_CUSTOMER = ID_CUSTOMER;
    }

    public String getNAMA_CUSTOMER() {
        return NAMA_CUSTOMER;
    }

    public void setNAMA_CUSTOMER(String NAMA_CUSTOMER) {
        this.NAMA_CUSTOMER = NAMA_CUSTOMER;
    }

    public String getEMAIL_CUSTOMER() {
        return EMAIL_CUSTOMER;
    }

    public void setEMAIL_CUSTOMER(String EMAIL_CUSTOMER) {
        this.EMAIL_CUSTOMER = EMAIL_CUSTOMER;
    }

    public String getALAMAT_LENGKAP_CUSTOMER() {
        return ALAMAT_LENGKAP_CUSTOMER;
    }

    public void setALAMAT_LENGKAP_CUSTOMER(String ALAMAT_LENGKAP_CUSTOMER) {
        this.ALAMAT_LENGKAP_CUSTOMER = ALAMAT_LENGKAP_CUSTOMER;
    }

    public String getNO_TELP_CUSTOMER() {
        return NO_TELP_CUSTOMER;
    }

    public void setNO_TELP_CUSTOMER(String NO_TELP_CUSTOMER) {
        this.NO_TELP_CUSTOMER = NO_TELP_CUSTOMER;
    }

    public Long getID_CUSTOMER() {
        return ID_CUSTOMER;
    }

    public void setID_CUSTOMER(Long ID_CUSTOMER) {
        this.ID_CUSTOMER = ID_CUSTOMER;
    }
}
