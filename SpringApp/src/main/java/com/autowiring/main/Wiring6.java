package com.autowiring.main;

import com.autowiring.bean.PersonConstAutoWireMultBean;
import com.autowiring.bean.Vehicle2;
import com.autowiring.config.ConfigMultVehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Wiring6 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigMultVehicle.class);
        PersonConstAutoWireMultBean p = context.getBean(PersonConstAutoWireMultBean.class);
        Vehicle2 v = context.getBean(Vehicle2.class);
        System.out.println("Person name from Spring Context "+ p.getName());
        System.out.println("Vehicle name from Spring Context is "+ v.getName());
        System.out.println("Vehcile owned by Person is " + p.getVehicle());
    }
}
