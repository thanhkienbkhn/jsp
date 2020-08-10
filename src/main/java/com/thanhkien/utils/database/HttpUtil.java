package com.thanhkien.utils.database;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;

public class HttpUtil {
    private String value;

    public HttpUtil (String value){
        this.value = value;
    }

    public <T> T toModel(Class<T> tClass){
        try {
            return new ObjectMapper().readValue(this.value, tClass);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static HttpUtil of(BufferedReader reader){
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null){
                sb.append(line);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        return new HttpUtil(sb.toString());
    }
}
