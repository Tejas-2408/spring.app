package com.app.main;

import com.app.beans.Vehicle;
import com.app.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryAnnotation {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle v = context.getBean(Vehicle.class);
        System.out.println("My Primary Bean is loading: " + v.getName());
    }
}
