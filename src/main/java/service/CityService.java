package service;

import model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.CityRepo;

import java.util.List;

@Service
public class CityService {
    private CityRepo cityRepo;

    @Autowired
    public CityService(CityRepo cityRepo){
        this.cityRepo = cityRepo;
    }
    public City addCity(City city){

        return cityRepo.save(city);
    }
    public List<City> findAllCities(City city){

        return cityRepo.findAll();
    }
}
