package com.autowiring.main;

import com.autowiring.bean.PersonAssign;
import com.autowiring.bean.VehicleAssign;
import com.autowiring.config.AssignConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Assignment {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AssignConfig.class);

        String[] persons = context.getBeanNamesForType(PersonAssign.class);

        PersonAssign p = context.getBean(PersonAssign.class);

        String[] vehicle = context.getBeanNamesForType(VehicleAssign.class);
        VehicleAssign v = context.getBean(VehicleAssign.class);

        System.out.println(p.getName());
        v.getServices().playMusic();
        v.getServices().moveVehicle();

    }
}
