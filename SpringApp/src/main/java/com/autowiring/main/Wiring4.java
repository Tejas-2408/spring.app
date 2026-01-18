package com.autowiring.main;

import com.autowiring.bean.Person;
import com.autowiring.bean.PersonAutowire;
import com.autowiring.bean.Vehicle;
import com.autowiring.config.ConfigAutowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Wiring4 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigAutowired.class);
        PersonAutowire p = context.getBean(PersonAutowire.class);
        Vehicle v = context.getBean(Vehicle.class);
        System.out.println("Person name from Spring Context "+ p.getName());
        System.out.println("Vehicle name from Spring Context is "+ v.getName());
        System.out.println("Vehcile owned by Person is " + p.getVehicle());
    }
}
