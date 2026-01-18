package com.autowiring.bean;

public class Vehicle2 {
    private String name;

    public Vehicle2() {
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
