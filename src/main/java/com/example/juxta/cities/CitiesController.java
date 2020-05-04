package com.example.juxta.cities;

import com.example.juxta.priceEntries.PricesController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/cities")
public class CitiesController
{
    @Autowired
    private CitiesService service;

    private final Logger log = LoggerFactory.getLogger(CitiesController.class);


    @GetMapping("/all")
    public @ResponseBody Iterable<City> getCities() {
        log.trace("getting all cities");
        return service.getAllEntries();
    }

    @PostMapping("/add")
    public @ResponseBody int addCity (@RequestBody City city) {
        service.saveEntry(city);
        return city.getId();
    }

    @GetMapping("/nz")
    public @ResponseBody List<City> getNewZealandCities() {
        return service.getByCountry("New Zealand");
    }

}
