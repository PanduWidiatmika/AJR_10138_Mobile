package com.panduwidiatmika.ajr_10138;

import static com.android.volley.Request.Method.GET;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.gson.Gson;
import com.panduwidiatmika.ajr_10138.adapters.BrosurAdapter;
import com.panduwidiatmika.ajr_10138.api.promoApi;
import com.panduwidiatmika.ajr_10138.model.BrosurResponse;

import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BrosurActivity extends AppCompatActivity {
    private SwipeRefreshLayout swipeRefreshLayout;
    private BrosurAdapter brosurAdapter;
    private RequestQueue queue;
    private BottomNavigationView bottomNavigationView;
    private SearchView svBrosur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brosur);

        queue = Volley.newRequestQueue(this);
        svBrosur = findViewById(R.id.sv_brosur);
        swipeRefreshLayout = findViewById(R.id.sr_brosur);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.brosur_mobil);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.promo_mobil:
                        startActivity(new Intent(BrosurActivity.this, PromoActivity.class));
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                    case R.id.brosur_mobil:
                        startActivity(new Intent(BrosurActivity.this, BrosurActivity.class));
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                    case R.id.profil_customer:
                        startActivity(new Intent(BrosurActivity.this, CustomerActivity.class));
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                    case R.id.transaksi:
                        return true;
                }
                return false;
            }
        });


        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getallBrosur();
            }
        });

        svBrosur.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String s) {
                brosurAdapter.getFilter().filter(s);
                return false;
            }
        });


        RecyclerView rvBrosur = findViewById(R.id.rv_brosur);
        brosurAdapter = new BrosurAdapter(new ArrayList<>(), this);
        rvBrosur.setLayoutManager(new LinearLayoutManager(BrosurActivity.this,
                LinearLayoutManager.VERTICAL, false));
        rvBrosur.setAdapter(brosurAdapter);
        getallBrosur();
    }

    private void getallBrosur() {
        swipeRefreshLayout.setRefreshing(true);
        StringRequest stringRequest = new StringRequest(GET,
                promoApi.GET_BROSUR, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
 /* Deserialiasai data dari response JSON dari API
 menjadi java object PromoResponse menggunakan Gson */
                BrosurResponse brosurResponse =
                        gson.fromJson(response, BrosurResponse.class);
                brosurAdapter.setBrosurList(brosurResponse.getBrosurList());
                brosurAdapter.getFilter().filter(svBrosur.getQuery());
                Toast.makeText(BrosurActivity.this,
                        brosurResponse.getMessage(), Toast.LENGTH_SHORT).show();
                swipeRefreshLayout.setRefreshing(false);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                swipeRefreshLayout.setRefreshing(false);
                try {
                    String responseBody = new String(error.networkResponse.data,
                            StandardCharsets.UTF_8);
                    JSONObject errors = new JSONObject(responseBody);
                    Toast.makeText(BrosurActivity.this,
                            errors.getString("message"), Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(BrosurActivity.this, e.getMessage(),
                            Toast.LENGTH_SHORT).show();
                }
            }
        }) {
            // Menambahkan header pada request
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("Accept", "application/json");
                return headers;
            }
        };
        // Menambahkan request ke request queue
        queue.add(stringRequest);
    }
}