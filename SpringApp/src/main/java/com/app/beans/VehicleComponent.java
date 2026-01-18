package com.app.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class VehicleComponent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Hello there from Vehicle Component class");
    }

    @PostConstruct
    public void initialise(){
        this.name = "Honda";
    }
}
