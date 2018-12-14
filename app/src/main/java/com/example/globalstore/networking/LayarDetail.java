package com.example.globalstore.networking;



import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.globalstore.networking.Rest.ApiClient;

public class LayarDetail extends AppCompatActivity {

    ImageView mGambar;
    TextView tvIdMakanan, tvMenu, tvKategori, tvHarga, tvAlamat, tvReview, tvTanggal;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layar_detail);

        mContext = getApplicationContext();

        mGambar = (ImageView) findViewById(R.id.imgMakanan);
        tvIdMakanan = (TextView) findViewById(R.id.tvIdMakanan);
        tvMenu = (TextView) findViewById(R.id.tvNama);
        //tvKategori = (TextView) findViewById(R.id.tvKategori);
        tvHarga = (TextView) findViewById(R.id.tvHarga);
        tvAlamat = (TextView) findViewById(R.id.tvAlamat);
        tvReview = (TextView) findViewById(R.id.tvReview);
        //tvTanggal = (TextView) findViewById(R.id.tvTanggal);

//        btUpdate = (Button) findViewById(R.id.btUpdate);


        Intent mIntent = getIntent();

        tvIdMakanan.setText(mIntent.getStringExtra("idMakanan"));
        tvMenu.setText(mIntent.getStringExtra("menu"));
       // tvKategori.setText(mIntent.getStringExtra("kategori"));
        tvHarga.setText(mIntent.getStringExtra("harga"));
        tvAlamat.setText(mIntent.getStringExtra("alamat"));
        tvReview.setText(mIntent.getStringExtra("review"));
       // tvTanggal.setText(mIntent.getStringExtra("tanggal"));

//        if (mIntent.getStringExtra("photo_url").length()>0) Picasso.with(mContext).load
// (ApiClient.BASE_URL + mIntent.getStringExtra("photo_url")).into(mPhotoUrl);
//        else Picasso.with(mContext).load(R.drawable.photoid).into(mPhotoUrl);
//        if (mIntent.getStringExtra("gambar") != null)
        if (mIntent.getStringExtra("gambar") != null)

            //--tambahan--
            Glide.with(mContext).load(ApiClient.BASE_URL +
                    mIntent.getStringExtra("gambar")).into(mGambar);
        else
            Glide.with(mContext).load(R.drawable.a).into(mGambar);

//        pathImage = mIntent.getStringExtra("gambar");
    }
}
