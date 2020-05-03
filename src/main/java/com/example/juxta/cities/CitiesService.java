package com.example.juxta.cities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Business logic goes into this service. e.g. calculating the median values for return.
 */
@Service
public class CitiesService
{
    @Autowired
    private CitiesRepository repository;

    public void saveEntry(City city) {
        repository.save(city);
    }

    public Iterable<City> getAllEntries() {
        return repository.findAll();
    }
}
