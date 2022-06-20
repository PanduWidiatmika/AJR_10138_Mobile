package com.panduwidiatmika.ajr_10138.preferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.panduwidiatmika.ajr_10138.model.customer;

public class CustomerPreferences {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;
    public static final String IS_LOGIN = "IsLogin";
    public static final String KEY_ID_CUSTOMER = "id_customer";

    public CustomerPreferences(Context C){
        context = C;
        sharedPreferences = C.getSharedPreferences("customerPreference", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void setLogin(customer customer) {
        editor.putBoolean(IS_LOGIN, true);
        editor.putLong(KEY_ID_CUSTOMER, customer.getID_CUSTOMER());
        editor.commit();
    }

    public String getIdCustomerLogin()
    {
        return sharedPreferences.getString(KEY_ID_CUSTOMER, null);
    }

    public boolean CheckLogin() {
        return sharedPreferences.getBoolean(IS_LOGIN, false);
    }

    public void logOutCus(){
        editor.clear();
        editor.commit();
    }
}
