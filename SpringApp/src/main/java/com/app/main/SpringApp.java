package com.app.main;

import com.app.beans.Vehicle;
import com.app.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        System.out.println("Vehicle name from non-spring context is: "+ vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Vehicle veh = context.getBean(Vehicle.class);
//        System.out.println("Vehicle name from Spring Context is: "+ veh.getName());

        /*
        We don't need to do any explicit casting while fetching a bean from Context.
        Spring is smart enough to look for a bean of the type you requested in its context.
        If such a bean doesn't exist, Spring will throw an Exception
         */

        String hello = context.getBean(String.class);
        System.out.println("String value from Spring Context is: "+ hello);
        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is: "+ num);

//        Vehicle v1 = context.getBean("vehicle2",Vehicle.class);
//        System.out.println("Vehicle name from Spring Context is: "+ v1.getName());

        Vehicle v2 = context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: "+ v2.getName());
    }
}
