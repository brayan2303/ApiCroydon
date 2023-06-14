package com.prueba.croydon.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CharacteresDto {

    private Integer id;
    private String name;
    private String tvShow;
    private Integer disneyApiId;
    private String url;
}
