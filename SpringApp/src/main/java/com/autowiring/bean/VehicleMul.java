package com.autowiring.bean;

public class VehicleMul {
    private String name;

    public VehicleMul() {
        System.out.println("Vehicle Bean is created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Vehicle name is " + name;
    }
}
