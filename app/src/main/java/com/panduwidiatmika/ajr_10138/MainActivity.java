package com.panduwidiatmika.ajr_10138;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {
    private EditText emailET, passwordET;
    private Button btnLogin, btnClr;
    private Intent intent;
    private RequestQueue queue;

    private static String URL_LOGIN = "http://192.168.43.171:8000/api/login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queue = Volley.newRequestQueue(this);

        emailET=findViewById(R.id.email);
        passwordET=findViewById(R.id.password);
        btnLogin=findViewById(R.id.btnLogin);
        btnClr=findViewById(R.id.btnClr);

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emailET.getText().clear();
                passwordET.getText().clear();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailET.getText().toString().trim();
                String password = passwordET.getText().toString().trim();

                Login(email, password);
            }
        });

    }

    private void Login(final String email, final String password) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL_LOGIN,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String message = jsonObject.getString("message");
                            /*String user = jsonObject.getString("user");
                            String token_type = jsonObject.getString("token_type");
                            String access_token = jsonObject.getString("access_token");*/



                            if (message.equals("Login sebagai customer")) {
                                Toast.makeText(MainActivity.this, "Login sebagai customer"  ,Toast.LENGTH_SHORT).show();
                                //Intent moveHome = new Intent(MainActivity.this,HomeActivity.class);
                                //startActivity(moveHome);
                                startActivity(new Intent(MainActivity.this, CustomerActivity.class));
                                finish();
                            }else if(message.equals("Login sebagai driver")){
                                Toast.makeText(MainActivity.this, "Login sebagai driver"  ,Toast.LENGTH_SHORT).show();
                            }else if(message.equals("Login sebagai manager")){
                                Toast.makeText(MainActivity.this, "Login sebagai manager"  ,Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(MainActivity.this, ManagerActivity.class));
                                finish();
                            }else{
                                Toast.makeText(MainActivity.this, "Username atau Password Salah"  ,Toast.LENGTH_SHORT).show();
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, "Error! " + error.toString(), Toast.LENGTH_SHORT).show();
                    }
                })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("email", email);
                params.put("password", password);
                return params;
            }
        };

        queue.add(stringRequest);
    }
}