package com.example.juxta.priceEntries;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prices")
public class PricesController
{
    @Autowired
    private PriceRepository repository;

    private final Logger log = LoggerFactory.getLogger(PricesController.class);

    @GetMapping("/entries/all")
    public @ResponseBody Iterable<PriceEntry> getAllEntries() {
        return repository.findAll();
    }

    @GetMapping("/entries")
    public @ResponseBody List<PriceEntry> getEntries(@RequestParam String city) {
        log.info("Received request for entries by city for - " + city);
        return repository.findByCity(city);
    }

    @PostMapping("/update")
    public String addEntry(@RequestBody PriceEntry entry) {
        repository.save(entry);
        return "Success";
    }
}
