package com.example.relaciones_onetoone_y_onetomany.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Race {
    @Id
    private Integer raceId;
    private Integer year;
    private Integer round;
    private Integer circuitId;
    private String name;
    private String date;
    private String time;
    private String url;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JsonIgnoreProperties("race")
    private Circuit circuit;

}
