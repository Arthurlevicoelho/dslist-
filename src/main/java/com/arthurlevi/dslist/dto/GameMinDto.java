package com.arthurlevi.dslist.dto;

import com.arthurlevi.dslist.entities.Game;
import com.arthurlevi.dslist.projections.GameMinProjection;

public class GameMinDto {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto(){}

    public GameMinDto(Game entityGame){
        id = entityGame.getId();
        title = entityGame.getTitle();
        year = entityGame.getYear();
        imgUrl = entityGame.getImgUrl();
        shortDescription = entityGame.getShortDescription();
    }
    public GameMinDto(GameMinProjection projection){
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
