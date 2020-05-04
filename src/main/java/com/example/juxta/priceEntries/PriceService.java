package com.example.juxta.priceEntries;

import com.example.juxta.cities.City;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PriceService
{
    @Autowired
    PriceRepository repository;

    public double getAveragePrice(PricedObject object, City city) {
        return 0.0;
    }

    public List<PriceEntry> getEntries() {
        return null;
    }

    public void saveEntry(PriceEntry entry) {
        repository.save(entry);
    }
}
