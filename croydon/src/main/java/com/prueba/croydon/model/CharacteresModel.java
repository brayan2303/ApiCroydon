package com.prueba.croydon.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity(name = "Characters")
@Table(name = "Characters")
public class CharacteresModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "tvShow")
    private String tvShow;
    @Column(name = "disneyApiId")
    private Integer disneyApiId;
    @Column(name = "url")
    private String url;
}
