package com.example.relaciones_onetoone_y_onetomany.model;

import jakarta.persistence.*;

@Entity
public class Circuit {
    @Id
    private Long id;
    private String circuitref;
    private String name;
    private String location;
    private String country;
    private Double lat;
    private Double lng;
    private Integer alt;
    private String url;

    @OneToOne(mappedBy = "raceId")
    private Race race;
}
