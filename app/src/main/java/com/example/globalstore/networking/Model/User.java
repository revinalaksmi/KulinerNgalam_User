package com.example.globalstore.networking.Model;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("idUser")
    private String idUser;
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    private String action;

    public User(String idUser, String username, String password, String action) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.action = action;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String id_user) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
