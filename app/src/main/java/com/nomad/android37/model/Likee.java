package com.nomad.android37.model;

public class Likee {
    private Integer imagePerson;
    private Integer imagePhoto;
    private String text;
    private String textHour;

    public Likee(Integer imagePerson, Integer imagePhoto, String text, String textHour) {
        this.imagePerson = imagePerson;
        this.imagePhoto = imagePhoto;
        this.text = text;
        this.textHour = textHour;
    }

    public Integer getImagePerson() {
        return imagePerson;
    }

    public void setImagePerson(Integer imagePerson) {
        this.imagePerson = imagePerson;
    }

    public Integer getImagePhoto() {
        return imagePhoto;
    }

    public void setImagePhoto(Integer imagePhoto) {
        this.imagePhoto = imagePhoto;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextHour() {
        return textHour;
    }

    public void setTextHour(String textHour) {
        this.textHour = textHour;
    }
}
