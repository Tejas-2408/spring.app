package com.autowiring.main;

import com.autowiring.bean.Person;
import com.autowiring.bean.Vehicle;
import com.autowiring.config.ProjectConif;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Wiring1 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConif.class);
        Person p = context.getBean(Person.class);
        Vehicle v = context.getBean(Vehicle.class);
        System.out.println("Person name from Spring Context my name is " + p.getName());
        System.out.println("Vehicle from Spring Context my vehicle is "+ v.getName());
        System.out.println("Vehicle that Person own from Spring Context my vehicle is " + p.getVehicle());
    }
}
