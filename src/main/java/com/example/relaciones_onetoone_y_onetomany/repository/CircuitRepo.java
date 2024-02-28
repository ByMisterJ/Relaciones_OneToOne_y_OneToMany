package com.example.relaciones_onetoone_y_onetomany.repository;

import com.example.relaciones_onetoone_y_onetomany.model.Circuit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitRepo extends JpaRepository<Circuit, Long>{

}
