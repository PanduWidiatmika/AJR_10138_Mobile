package com.panduwidiatmika.ajr_10138.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class customerResponse {
    private String message;
    @SerializedName("data")
    private customer customer;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public com.panduwidiatmika.ajr_10138.model.customer getCustomer() {
        return customer;
    }

    public void setCustomer(com.panduwidiatmika.ajr_10138.model.customer customer) {
        this.customer = customer;
    }
}
