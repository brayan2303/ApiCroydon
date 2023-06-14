package com.prueba.croydon.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataDto {

    @JsonAlias("_id")
    private Integer id;

    @JsonAlias("films")
    private List<String> films;

    @JsonAlias("shortFilms")
    private List<String> shortFilms;

    @JsonAlias("tvShows")
    private List<String>tvShows;

    @JsonAlias("videoGames")
    private List<String> videoGames;

    @JsonAlias("parkAttractions")
    private List<String> parkAttractions;

    @JsonAlias("allies")
    private List<String> allies;

    @JsonAlias("enemies")
    private List<String> enemies;

    @JsonAlias("sourceUrl")
    private String sourceUrl;

    @JsonAlias("name")
    private String name;

    @JsonAlias("imageUrl")
    private String imageUrl;

    @JsonAlias("createdAt")
    private Date createdAt;

    @JsonAlias("updatedAt")
    private Date updatedAt;

    @JsonAlias("url")
    private String url;

    @JsonAlias("__v")
    private Integer v;
}
