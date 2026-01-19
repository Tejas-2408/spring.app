package com.autowiring.bean;

import com.autowiring.services.VehicleServicesAssign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
public class VehicleAssign {
    private String name = "Ferrari";
    private final VehicleServicesAssign services;

    @Autowired
    public VehicleAssign(VehicleServicesAssign vsa){
        this.services = vsa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServicesAssign getServices() {
        return services;
    }

}
