package com.nomad.android37.model;

public class InstaModel {
    private String text;
    private String data;
    private Integer image;


    public InstaModel(String text, String data, Integer image) {
        this.text = text;
        this.data = data;
        this.image = image;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
