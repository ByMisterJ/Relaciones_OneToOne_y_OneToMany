package com.example.relaciones_onetoone_y_onetomany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Constructor {
    @Id
    private Integer constructorId;
    private String constructorRef;
    private String name;
    private String nationality;
    private String url;
}
