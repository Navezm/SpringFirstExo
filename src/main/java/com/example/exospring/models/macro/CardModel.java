package com.example.exospring.models.macro;

public class CardModel {
    private String title;
    private String imgSrc;
    private String genre;

    public CardModel(String title, String imgSrc, String genre) {
        this.title = title;
        this.imgSrc = imgSrc;
        this.genre = genre;
    }

    public CardModel getData(){
        return this;
    }
}
