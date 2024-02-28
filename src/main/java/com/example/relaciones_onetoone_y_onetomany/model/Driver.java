package com.example.relaciones_onetoone_y_onetomany.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

import java.time.LocalDate;

@Entity
public class Driver {
    @Id
    private Integer driverId;
    private String code;
    private String forename;
    private String surname;
    private LocalDate dob;
    private String nationality;
    @OneToMany(mappedBy = "constructorId", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JsonIgnoreProperties
    private List<Constructor> constructors;
    private String url;



}
