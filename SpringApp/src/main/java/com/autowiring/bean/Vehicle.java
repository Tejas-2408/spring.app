package com.autowiring.bean;

public class Vehicle {
    private String name;

    public Vehicle() {
        System.out.println("Vehcile Bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Vehicle name is " + name;
    }
}
