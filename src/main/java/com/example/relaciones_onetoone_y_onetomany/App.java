package com.example.relaciones_onetoone_y_onetomany;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.relaciones_onetoone_y_onetomany.model.*;
import com.example.relaciones_onetoone_y_onetomany.repository.*;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class App {

   /* public static void main(String[] args) {
        ApplicationContext context = (ApplicationContext) SpringApplication.run(App.class, args);

        var CircuitoRepo = context.getBean(CircuitRepo.class);
        var ConstructorRepo = context.getBean(ConstructorRepo.class);
        var DriverRepo = context.getBean(DriverRepo.class);
        var RaceRepo = context.getBean(RaceRepo.class);

        Circuit circuito = new Circuit(null, "Circuito de micasa", "Jerez de la casa", "España");
        CircuitRepo.save(circuito);
    }*/

}
