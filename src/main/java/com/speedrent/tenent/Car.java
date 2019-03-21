package com.speedrent.tenent;

import org.springframework.stereotype.Component;

@Component
public class Car
{
    private String manufacturer;
    private String name;

    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Car()
    {
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
