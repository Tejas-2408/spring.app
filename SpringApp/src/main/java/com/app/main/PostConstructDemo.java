package com.app.main;

import com.app.beans.Vehicle;
import com.app.beans.VehicleComponent;
import com.app.config.ProjectConfigComponent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostConstructDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfigComponent.class);

        VehicleComponent v = context.getBean(VehicleComponent.class);
        System.out.println("Component Vehicle name from Spring context is: " + v.getName());
        v.printHello();
    }
}
