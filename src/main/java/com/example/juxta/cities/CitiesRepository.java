package com.example.juxta.cities;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CitiesRepository extends CrudRepository<City, Integer>
{
    public List<City> findByCountry(String country);
}
