package com.example.relaciones_onetoone_y_onetomany.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import java.time.LocalDate;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Table(name = "drivers")

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driverId")
    private Integer driverId;
    private String code;
    private String forename;
    private String surname;
    private LocalDate dob;
    private String nationality;
    @ManyToOne
    @JoinColumn(name = "constructorId")
    @JsonIgnoreProperties("drivers")
    private Constructor constructor;
    private String url;



}
