package com.example.relaciones_onetoone_y_onetomany.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Table(name = "constructors")

@Entity
public class Constructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "constructorId")
    private Integer constructorId;
    @Column(unique = true, nullable = false)
    private String constructorRef;
    @Column(unique = true, nullable = false)
    private String name;
    @Column(nullable = false)
    private String nationality;

    private String url;

    @OneToMany(mappedBy = "constructor")
    @JsonIgnoreProperties("driverId")
    private List<Driver> drivers;
}
