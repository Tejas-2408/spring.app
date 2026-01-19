package com.autowiring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
public class PersonAssign {
    private String name = "Tejas";
    private final VehicleAssign vehicle;

    @Autowired
    public PersonAssign(VehicleAssign vehicle){
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleAssign getVehicle() {
        return vehicle;
    }

}
