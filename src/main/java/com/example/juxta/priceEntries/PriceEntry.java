package com.example.juxta.priceEntries;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class PriceEntry
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String city;

    private double taxiPrice;

    private double beerPrice;

    private double gymPrice;

    public double getTaxiPrice()
    {
        return taxiPrice;
    }

    public void setTaxiPrice(double taxiPrice)
    {
        this.taxiPrice = taxiPrice;
    }

    public double getBeerPrice()
    {
        return beerPrice;
    }

    public void setBeerPrice(double beerPrice)
    {
        this.beerPrice = beerPrice;
    }

    public double getGymPrice()
    {
        return gymPrice;
    }

    public void setGymPrice(double gymPrice)
    {
        this.gymPrice = gymPrice;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }
}
