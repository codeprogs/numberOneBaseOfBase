package org.example.smallProject.dao;

import org.example.smallProject.entity.City;
import org.example.smallProject.entity.Country;

import java.time.LocalDate;
import java.util.List;

public interface CityDao {
    public void create(City city);

    public List<City> read();

    public void update(String name, City city);

    public void delete(String name);
}
