package com.example.juxta.priceEntries;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PriceRepository extends CrudRepository<PriceEntry, Integer>
{
    public List<PriceEntry> findByCity(String city);
}
