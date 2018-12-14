package com.example.globalstore.networking.Rest;
import com.example.globalstore.networking.Model.GetLogin;
import com.example.globalstore.networking.Model.GetMakanan;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("user/login")
    Call<GetLogin> loginUser
            (
                    @Field("username") String username,
                    @Field("password") String password);
//    ==========MAKANAN============
    @GET("makanan/all")
    Call<GetMakanan> getMakanan();
    @Multipart
    @POST("makanan/all")
    Call<GetMakanan> postMakanan(
            @Part MultipartBody.Part file,
            @Part("menu") RequestBody menu,
            @Part("kategori") RequestBody kategori,
            @Part("harga") RequestBody harga,
            @Part("alamat") RequestBody alamat,
            @Part("review") RequestBody review,
            @Part("tanggal") RequestBody tanggal,
            @Part("suka") RequestBody suka,
            @Part("komentar") RequestBody komentar,
            @Part("action") RequestBody action
    );
    @Multipart
    @POST("makanan/all")
    Call<GetMakanan> putMakanan(
            @Part MultipartBody.Part file,
            @Part("idMakanan") RequestBody idMakanan,
            @Part("menu") RequestBody menu,
            @Part("kategori") RequestBody kategori,
            @Part("harga") RequestBody harga,
            @Part("alamat") RequestBody alamat,
            @Part("review") RequestBody review,
            @Part("tanggal") RequestBody tanggal,
            @Part("action") RequestBody action
    );
    @Multipart
    @POST("makanan/all")
    Call<GetMakanan> deleteMakanan(
            @Part("idMakanan") RequestBody idMakanan,
            @Part("action") RequestBody action);
}
