package com.autowiring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonAutowire {
    private String name;

    @Autowired(required = false)
    private Vehicle vehicle;

    private Vehicle vehicle2;

    public PersonAutowire() {
        System.out.println("Person bean has been created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Autowired
    public PersonAutowire(Vehicle vehicle2) {
        this.vehicle2 = vehicle2;
    }
}
