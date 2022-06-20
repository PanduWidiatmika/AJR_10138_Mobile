package com.panduwidiatmika.ajr_10138.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class transaksiCustomerResponse {
    private String message;
    @SerializedName("data")
    private List<transaksiCustomer> transaksiCustomerList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<transaksiCustomer> getTransaksiCustomerList() {
        return transaksiCustomerList;
    }

    public void setTransaksiCustomerList(List<transaksiCustomer> transaksiCustomerList) {
        this.transaksiCustomerList = transaksiCustomerList;
    }
}
