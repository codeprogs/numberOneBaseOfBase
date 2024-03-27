package org.example.smallProject.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.smallProject.dao.CityDao;
import org.example.smallProject.dao.CityDaoImpl;
import org.example.smallProject.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CityServiceImpl implements CityService {

    CityDao cityDao = new CityDaoImpl();

    @Override
    public void add(City city) {
        cityDao.create(city);
    }

    @Override
    public List<City> getAll() {
        return cityDao.read();
    }

    @Override
    public void update(String name, City city) {
        cityDao.update(name, city);
    }

    @Override
    public void delete(String name) {
        cityDao.delete(name);
    }
}
