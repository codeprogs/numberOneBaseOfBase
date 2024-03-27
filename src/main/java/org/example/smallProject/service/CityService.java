package org.example.smallProject.service;

import org.example.smallProject.entity.City;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CityService {
    public void add(City city);

    public List<City> getAll();

    public void update(String name, City city);

    public void delete(String name);
}
