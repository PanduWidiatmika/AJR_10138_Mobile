package com.panduwidiatmika.ajr_10138.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class performaDriverResponse {
    private String message;
    @SerializedName("data")
    private List<performaDriver> performaDriverList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<performaDriver> getPerformaDriverList() {
        return performaDriverList;
    }

    public void setPerformaDriverList(List<performaDriver> performaDriverList) {
        this.performaDriverList = performaDriverList;
    }
}
