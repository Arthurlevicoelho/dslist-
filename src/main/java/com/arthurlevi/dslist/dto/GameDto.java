package com.arthurlevi.dslist.dto;

import com.arthurlevi.dslist.entities.Game;
import jakarta.persistence.Column;

public class GameDto {

    private Long id;
    private String title;
    private String year;
    private String imgUrl;
    private String shortDescription;

    public GameDto(){}

    public GameDto(Game entityGame){
        id = entityGame.getId();
        title = entityGame.getTitle();
        year = entityGame.getYear();
        imgUrl = entityGame.getImgUrl();
        shortDescription = entityGame.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
