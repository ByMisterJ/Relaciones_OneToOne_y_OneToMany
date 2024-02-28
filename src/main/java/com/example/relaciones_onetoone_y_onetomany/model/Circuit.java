package com.example.relaciones_onetoone_y_onetomany.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Table(name = "circuits")

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
