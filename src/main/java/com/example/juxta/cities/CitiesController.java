package com.example.juxta.cities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cities")
public class CitiesController
{
    @Autowired
    private CitiesService service;

    @GetMapping("/all")
    public @ResponseBody Iterable<City> getCities() {
        return service.getAllEntries();
    }

    @PostMapping("/add")
    public @ResponseBody int addCity (@RequestBody City city) {
        service.saveEntry(city);
        return city.getId();
    }

}
