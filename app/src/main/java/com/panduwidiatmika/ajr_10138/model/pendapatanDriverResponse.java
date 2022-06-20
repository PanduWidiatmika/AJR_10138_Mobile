package com.panduwidiatmika.ajr_10138.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class pendapatanDriverResponse {
    private String message;
    @SerializedName("data")
    private List<pendapatanDriver> pendapatanDriverList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<pendapatanDriver> getPendapatanDriverList() {
        return pendapatanDriverList;
    }

    public void setPendapatanDriverList(List<pendapatanDriver> pendapatanDriverList) {
        this.pendapatanDriverList = pendapatanDriverList;
    }
}
