package org.example.smallProject;

import org.example.smallProject.config.MainConfig;
import org.example.smallProject.entity.City;
import org.example.smallProject.entity.Country;
import org.example.smallProject.service.CityService;
import org.example.smallProject.service.CityServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

public class App
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        CityService cityService = context.getBean(CityService.class);

        City rzn = new City("Ryazan", LocalDate.of(1095, 1, 1), 500000l, new Country("Russia"));
        City tula = new City("Tula", LocalDate.of(1146, 1, 1), 479105l, new Country("Russia"));
        City vrn = new City("Voronezh", LocalDate.of(1586, 1, 1), 1048738l, new Country("Russia"));

        cityService.add(rzn);
        cityService.add(tula);
        cityService.add(vrn);

        cityService.getAll().stream().forEach(city -> System.out.println(city));
        System.out.println("-----------------");

        City nRzn = new City("Ryazan", LocalDate.of(1095, 1, 1), 650000l, new Country("Russia"));
        cityService.update("Ryazan", nRzn);
        cityService.delete("Tula");

        cityService.getAll().stream().forEach(city -> System.out.println(city));
    }
}
