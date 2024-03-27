package org.example.smallProject.dao;

import org.example.smallProject.entity.City;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class CityDaoImpl implements CityDao{
    List<City> cities;
    @Override
    public void create(City city) {
        if (cities == null) {
            cities = new ArrayList<>();
        }
        cities.add(city);
    }

    @Override
    public List<City> read() {
        return cities;
    }

    public City findCityByName(String name){
        return cities.stream().filter(city -> city.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public void update(String name, City city) {
        City changeCity = findCityByName(name);
        if (changeCity != null) {
            changeCity.setName(city.getName());
            changeCity.setFoundingDate(city.getFoundingDate());
            changeCity.setPopulation(city.getPopulation());
            changeCity.setFoundingDate(city.getFoundingDate());
        }
    }

    @Override
    public void delete(String name) {
        int index = -1;
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getName().equals(name)){
                index = i;
            }
        }
        if (index > -1) {
            cities.remove(index);
        }
    }
}
