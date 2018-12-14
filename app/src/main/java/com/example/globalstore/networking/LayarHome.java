package com.example.globalstore.networking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.globalstore.networking.Adapter.MakananAdapter;
import com.example.globalstore.networking.Model.GetMakanan;
import com.example.globalstore.networking.Model.Makanan;
import com.example.globalstore.networking.Rest.ApiClient;
import com.example.globalstore.networking.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LayarHome extends AppCompatActivity {
    Button btGet;
    ApiInterface mApiInterface;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layar_home);
        btGet = (Button) findViewById(R.id.btGet);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        btGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<GetMakanan> makananCall = mApiInterface.getMakanan();
                makananCall.enqueue(new Callback<GetMakanan>() {
                    @Override
                    public void onResponse(Call<GetMakanan> call, Response<GetMakanan>
                            response) {
                        List<Makanan> makananList = response.body().getResult();
                        Log.d("Retrofit Get", "Jumlah data makanan: " +
                                String.valueOf(makananList.size()));


                        mAdapter = new MakananAdapter(makananList);
                        mRecyclerView.setAdapter(mAdapter);
                    }
                    @Override
                    public void onFailure(Call<GetMakanan> call, Throwable t) {
// Log error
                        Log.e("Retrofit Get", t.toString());
                    }
                });
            }
        });
    }


}

