package com.panduwidiatmika.ajr_10138.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class penyewaanmobilResponse {
    private String message;
    @SerializedName("data")
    private List<penyewaanmobil> penyewaanmobilList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<penyewaanmobil> getPenyewaanmobilList() {
        return penyewaanmobilList;
    }

    public void setPenyewaanmobilList(List<penyewaanmobil> penyewaanmobilList) {
        this.penyewaanmobilList = penyewaanmobilList;
    }
}
