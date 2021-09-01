package com.example.demo.Model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

public class Pokemon implements Serializable {

    private String name;
    private String url;



    public Pokemon() {
    }

    public Pokemon( String name,String url) {


        this.name = name;
        this.url = url;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }
}
