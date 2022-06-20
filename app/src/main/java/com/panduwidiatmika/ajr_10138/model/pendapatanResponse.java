package com.panduwidiatmika.ajr_10138.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class pendapatanResponse {
    private String message;
    @SerializedName("data")
    private List<pendapatan> pendapatanList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<pendapatan> getPendapatanList() {
        return pendapatanList;
    }

    public void setPendapatanList(List<pendapatan> pendapatanList) {
        this.pendapatanList = pendapatanList;
    }
}
