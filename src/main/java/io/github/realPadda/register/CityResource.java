package io.github.realPadda.register;

import model.City;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CityService;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CityResource {
    private final CityService cityService;

    public CityResource(CityService cityService){
        this.cityService = cityService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<City>> getAllCity(){
        List<City> cities = cityService.findAllCities();
        return new ResponseEntity<List<City>>(cities, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<City> addCity(@RequestBody City city){
        City newCity = cityService.addCity(city);
        return new ResponseEntity<>(newCity, HttpStatus.CREATED);
    }
}
