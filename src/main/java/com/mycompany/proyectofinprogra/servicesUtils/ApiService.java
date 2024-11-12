/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinprogra.servicesUtils;

import okhttp3.*;
import java.io.IOException;

public class ApiService {
    
    private final OkHttpClient client;
    private final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    public ApiService() {
        this.client = new OkHttpClient();
    }

    public String get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Error en la solicitud: " + response);
            }
            return response.body().string();
        }
    }
    
    public String post(String url, String jsonBody) throws IOException {
        RequestBody body = RequestBody.create(jsonBody, JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Error en la solicitud: " + response);
            }
            return response.body().string();
        }
    }
}
